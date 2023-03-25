package HomeWork_1;

import java.util.Scanner;

/*
 * Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
 */
public class Example_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double number1 = scanner.nextDouble();
        System.out.print("op:");
        String operator = scanner.next();
        System.out.print("b: ");
        double number2 = scanner.nextDouble();
        System.out.print("res: ");      
        System.out.println(calc(number1, number2, operator));


    }

    static double calc(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            case "*":
                return num1 * num2;
        }
        return 0;
    }
}
