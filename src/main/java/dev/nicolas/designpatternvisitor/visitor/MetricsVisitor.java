package dev.nicolas.designpatternvisitor.visitor;

import dev.nicolas.designpatternvisitor.element.MultipleChoiceQuestion;
import dev.nicolas.designpatternvisitor.element.TrueFalseQuestion;
import dev.nicolas.designpatternvisitor.element.DissertativeQuestion;

public class MetricsVisitor implements QuestionVisitor {
    private int totalDifficultyScore = 0;
    private int questionCount = 0;

    @Override
    public void visit(MultipleChoiceQuestion question) {
        int difficulty = question.getOptions().length;
        totalDifficultyScore += difficulty;
        questionCount++;
        System.out.println("Metrics: Multiple Choice difficulty = " + difficulty);
    }

    @Override
    public void visit(TrueFalseQuestion question) {
        int difficulty = 1;
        totalDifficultyScore += difficulty;
        questionCount++;
        System.out.println("Metrics: True/False difficulty = " + difficulty);
    }

    @Override
    public void visit(DissertativeQuestion question) {
        int difficulty = question.getMaxLength() / 100;
        totalDifficultyScore += difficulty;
        questionCount++;
        System.out.println("Metrics: Dissertative difficulty = " + difficulty);
    }

    public void printMetrics() {
        System.out.println("\n=== Difficulty Metrics ===");
        System.out.println("Total Difficulty Score: " + totalDifficultyScore);
        System.out.println("Question Count: " + questionCount);
        System.out.println("Average Difficulty: " + (questionCount > 0 ? totalDifficultyScore / questionCount : 0));
    }
}
