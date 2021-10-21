import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 5 + 5
        // 10

        Scanner scanner = new Scanner(System.in);

        say("What's your first number?");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();

        say("What operation do you want to use?");
        String operation = scanner.nextLine();

        say("What's your second number?");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();

        // Addition
        if (operation.equals("+")) {
            say("Result: " + (firstNumber + secondNumber));
        }
        // Subtraction
        else if (operation.equals("-")) {
            say("Result: " + (firstNumber - secondNumber));
        }
        // Multiplication
        else if (operation.equals("*")) {
            say("Result: " + (firstNumber * secondNumber));
        }
        // Division
        else if (operation.equals("/")) {
            say("Result: " + (firstNumber / secondNumber));
        }
        // Exponent
        else if (operation.equals("^")) {
            double result = Math.pow(firstNumber, secondNumber);
            say("Result: " + result);
        }
        // Root of index
        else if (operation.equals("rt")) {
            double result = Math.pow(firstNumber, 1 / secondNumber);
            say("Result: " + result);
        }

        // Don't touch anything below here.
    }






    private static final Scanner scanner = new Scanner(System.in);

    public static String getLine() {
        return scanner.nextLine();
    }

    public static boolean isEqual(Object object1, Object object2) {
        String object1String;
        String object2String;

        if (!(object1 instanceof String))
            object1String = String.valueOf(object1);
        else
            object1String = (String) object1;

        if (!(object2 instanceof String))
            object2String = String.valueOf(object2);
        else
            object2String = (String) object2;


        return object1String.equals(object2String);
    }

    public static void say(String message) {
        System.out.println(message);
    }
}
