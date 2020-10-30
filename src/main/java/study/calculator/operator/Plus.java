package study.calculator.operator;

public class Plus extends AbstractOperator {

    @Override
    public boolean isOperator(String expression) {
        return expression.equals("+");
    }

    @Override
    public Integer operate(Operand firstArg, Operand secondArg) {
        return firstArg.getValue() + secondArg.getValue();
    }

}