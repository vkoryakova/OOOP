import java.util.Scanner;

public class var9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение х: ");
        double x = input.nextDouble();

        double a = 1.53;
        double b = 5.14;
        double c = 3.97;

        double y = (a * x + 3.8 * Math.tan(x)) / Math.sqrt(Math.exp(Math.pow(x, 3)) + c * b);

        System.out.println("Значение функции  y = f(x) равно: "+ y);

    }
}
