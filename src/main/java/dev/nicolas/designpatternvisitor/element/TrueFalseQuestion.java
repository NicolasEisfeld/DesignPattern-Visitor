package dev.nicolas.designpatternvisitor.element;

import dev.nicolas.designpatternvisitor.visitor.QuestionVisitor;

public class TrueFalseQuestion implements Question {
    private String questionText;
    private boolean correctAnswer;

    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public void accept(QuestionVisitor visitor) {
        visitor.visit(this);
    }
}
