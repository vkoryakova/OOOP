import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение коэффициента a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение коэффициента b: ");
        double b = scanner.nextDouble();

        double y;

        if (x >= 2) {
            y = Math.sqrt(1 + x * Math.sqrt(a * x));
        } else {
            y = a * Math.sin(b * x) + 3;
        }

        System.out.println("Значение функции для x = " + x + " : " + y);
    }
}
