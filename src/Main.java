import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^ in the format of x + y: ");
        String expression1 = scan.nextLine();

        Calculator calc = new Calculator(expression1);
        if (expression1.contains("*")){
            System.out.println("Answer: " + calc.multiply());
        }
        if (expression1.contains("/")){
            System.out.println("Answer: " + calc.divide());
        }
        if (expression1.contains("+")){
            System.out.println("Answer: " + calc.add());
        }
        if (expression1.contains("-")){
            System.out.println("Answer: " + calc.subtract());
        }
        if (expression1.contains("%")){
            System.out.println("Answer: " + calc.mod());
        }
        if (expression1.contains("^")){
            System.out.println("Answer: " + calc.exponent());
        }
    }
}