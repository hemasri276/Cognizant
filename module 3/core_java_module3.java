
// 1. Hello World Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}



// 2. Simple Calculator
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operator"); return;
        }
        System.out.println("Result: " + result);
    }
}



// 3. Even or Odd Checker
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}



// 4. Leap Year Checker
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is " + (isLeap ? "a leap year" : "not a leap year"));
    }
}



// 5. Multiplication Table
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
