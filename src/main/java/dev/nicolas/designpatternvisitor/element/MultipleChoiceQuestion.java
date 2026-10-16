package dev.nicolas.designpatternvisitor.element;

import dev.nicolas.designpatternvisitor.visitor.QuestionVisitor;

public class MultipleChoiceQuestion implements Question {
    private String questionText;
    private String[] options;
    private int correctOption;

    public MultipleChoiceQuestion(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    @Override
    public void accept(QuestionVisitor visitor) {
        visitor.visit(this);
    }
}
