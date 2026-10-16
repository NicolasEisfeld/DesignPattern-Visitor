package dev.nicolas.designpatternvisitor.visitor;

import dev.nicolas.designpatternvisitor.element.MultipleChoiceQuestion;
import dev.nicolas.designpatternvisitor.element.TrueFalseQuestion;
import dev.nicolas.designpatternvisitor.element.DissertativeQuestion;

public interface QuestionVisitor {
    void visit(MultipleChoiceQuestion question);
    void visit(TrueFalseQuestion question);
    void visit(DissertativeQuestion question);
}
