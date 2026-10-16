package dev.nicolas.designpatternvisitor.visitor;

import dev.nicolas.designpatternvisitor.element.MultipleChoiceQuestion;
import dev.nicolas.designpatternvisitor.element.TrueFalseQuestion;
import dev.nicolas.designpatternvisitor.element.DissertativeQuestion;

public class StatisticsVisitor implements QuestionVisitor {
    private int multipleChoiceCount = 0;
    private int trueFalseCount = 0;
    private int dissertativeCount = 0;

    @Override
    public void visit(MultipleChoiceQuestion question) {
        multipleChoiceCount++;
        System.out.println("Statistics: Multiple Choice Question - " + question.getQuestionText());
    }

    @Override
    public void visit(TrueFalseQuestion question) {
        trueFalseCount++;
        System.out.println("Statistics: True/False Question - " + question.getQuestionText());
    }

    @Override
    public void visit(DissertativeQuestion question) {
        dissertativeCount++;
        System.out.println("Statistics: Dissertative Question - " + question.getQuestionText());
    }

    public void printStatistics() {
        System.out.println("\n=== Question Statistics ===");
        System.out.println("Multiple Choice: " + multipleChoiceCount);
        System.out.println("True/False: " + trueFalseCount);
        System.out.println("Dissertative: " + dissertativeCount);
        System.out.println("Total: " + (multipleChoiceCount + trueFalseCount + dissertativeCount));
    }
}
