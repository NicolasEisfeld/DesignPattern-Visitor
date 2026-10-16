package dev.nicolas.designpatternvisitor;

import dev.nicolas.designpatternvisitor.element.DissertativeQuestion;
import dev.nicolas.designpatternvisitor.element.MultipleChoiceQuestion;
import dev.nicolas.designpatternvisitor.element.Question;
import dev.nicolas.designpatternvisitor.element.TrueFalseQuestion;
import dev.nicolas.designpatternvisitor.visitor.MetricsVisitor;
import dev.nicolas.designpatternvisitor.visitor.StatisticsVisitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesignpatternVisitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternVisitorApplication.class, args);
        
        // Create different types of questions
        List<Question> questions = new ArrayList<>();
        
        questions.add(new MultipleChoiceQuestion(
            "Qual é a capital do Brasil?",
            new String[]{"São Paulo", "Rio de Janeiro", "Brasília", "Salvador"},
            2
        ));
        
        questions.add(new TrueFalseQuestion(
            "O Java é uma linguagem compilada e interpretada.",
            true
        ));
        
        questions.add(new DissertativeQuestion(
            "Explique o padrão Visitor em suas próprias palavras.",
            500
        ));
        
        questions.add(new MultipleChoiceQuestion(
            "Qual design pattern separa algoritmos das estruturas de dados?",
            new String[]{"Singleton", "Factory", "Visitor", "Observer"},
            2
        ));
        
        questions.add(new TrueFalseQuestion(
            "O padrão Visitor permite adicionar novas operações sem modificar as classes dos elementos.",
            true
        ));
        
        // Use StatisticsVisitor
        System.out.println("=== Running StatisticsVisitor ===");
        StatisticsVisitor statisticsVisitor = new StatisticsVisitor();
        for (Question question : questions) {
            question.accept(statisticsVisitor);
        }
        statisticsVisitor.printStatistics();
        
        // Use ExportVisitor
        System.out.println("\n=== Running ExportVisitor ===");
        ExportVisitor exportVisitor = new ExportVisitor();
        for (Question question : questions) {
            question.accept(exportVisitor);
        }
        System.out.println(exportVisitor.getExportData());
        
        // Use MetricsVisitor
        System.out.println("=== Running MetricsVisitor ===");
        MetricsVisitor metricsVisitor = new MetricsVisitor();
        for (Question question : questions) {
            question.accept(metricsVisitor);
        }
        metricsVisitor.printMetrics();
    }

}
