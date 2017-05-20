package calculator;

public final class BasicCalculator
{
    public static double calculate(double num1, OperationTypes op, double num2)
    {
        switch(op)
        {
            case PLUS:
                return num1 + num2;
            case MINUS:
                return num1 - num2;
            case TIMES:
                return num1 * num2;
            case DIV:
                return num1 / num2;
        }
        throw new IllegalArgumentException();
    }

    public static enum OperationTypes
    {
        PLUS, MINUS, TIMES, DIV;
    }
}
