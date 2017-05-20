package test;

import calculator.BasicCalculator.OperationTypes;
import static calculator.BasicCalculator.calculate;


public class ModulePatternDemo
{
    public static void main(String[] args)
    {
        System.out.println("2 + 5 = " +
            calculate(2,OperationTypes.PLUS,5) + "\n");

        System.out.println("2 - 5 = " +
            calculate(2,OperationTypes.MINUS,5) + "\n");

        System.out.println("2 * 5 = " +
            calculate(2,OperationTypes.TIMES,5) + "\n");

        System.out.println("2 / 5 = " +
            calculate(2,OperationTypes.DIV,5) + "\n");
    }
}
