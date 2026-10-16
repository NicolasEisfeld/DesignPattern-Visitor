package dev.nicolas.designpatternvisitor.element;

import dev.nicolas.designpatternvisitor.visitor.QuestionVisitor;

public interface Question {
    void accept(QuestionVisitor visitor);
}
