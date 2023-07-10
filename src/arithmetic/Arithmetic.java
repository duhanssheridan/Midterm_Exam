/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;



import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */


public class Arithmetic {
    public enum ArithmeticOperation {
        PLUS("+"),
        MINUS("-"),
        TIMES("*"),
        DIVIDES("/");

        private final String symbol;

        ArithmeticOperation(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for (ArithmeticOperation operation : ArithmeticOperation.values()) {
            double result = calculate(operation, n, m);
            System.out.println(operation.getSymbol() + " result: " + result);
        }
    }

    public static double calculate(ArithmeticOperation operation, int n, int m) {
        switch (operation) {
            case PLUS:
                return n + m;
            case MINUS:
                return n - m;
            case TIMES:
                return n * m;
            case DIVIDES:
                return (double) n / m;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
