package dev.nicolas.designpatternvisitor.element;

import dev.nicolas.designpatternvisitor.visitor.QuestionVisitor;

public class DissertativeQuestion implements Question {
    private String questionText;
    private int maxLength;

    public DissertativeQuestion(String questionText, int maxLength) {
        this.questionText = questionText;
        this.maxLength = maxLength;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void accept(QuestionVisitor visitor) {
        visitor.visit(this);
    }
}
