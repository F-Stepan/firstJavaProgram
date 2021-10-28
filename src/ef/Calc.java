package ef;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a;
        int b;
        double c = 0.0;
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Введите первую цифру");
        a = scanObject.nextInt();
        System.out.println("Введите вторую цифру");
        b = scanObject.nextInt();
        System.out.println("Какое действие?");
        char operator = scanObject.next().charAt(0);

        switch (operator) {
            case '+' -> c = a + b;
            case '-' -> c = a - b;
            case '*' -> c = a * b;
            case '/' -> c = a / b;
            default -> {
            }
        }
        System.out.println(c);
    }
}
