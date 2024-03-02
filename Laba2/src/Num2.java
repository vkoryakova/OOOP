import java.util.Scanner;
public class Num2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();// заданное значение x
        double sum = 0;
        int n = 1; // начальное значение n
        int iterations = 0; // счетчик итераций

        while (true) {
            double a = calculateA(n, x);
            sum += a;
            iterations++;
            // Условие завершения цикла
            if (Math.abs(a) < 0.0001) {
                break;
            }
            n++;
        }
        double result = 2 * sum;
        System.out.println("Значение функции: " + result);
        System.out.println("Количество итераций: " + iterations);
    }
    public static double calculateA(int n, double x) {
        double a = 0;
        for (int i = 1; i <= n; i++) {
            a += 1.0 / i;
        }
        a *= Math.pow(x, n + 1) / (n + 1);
        return a;
    }
}