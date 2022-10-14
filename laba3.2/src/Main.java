import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = scan.nextDouble();
        System.out.print("Введіть b: ");
        double b = scan.nextDouble();
        System.out.print("Введіть c: ");
        double c = scan.nextDouble();
        System.out.print("Введіть x: ");
        double x = scan.nextDouble();
        double F;

        if (x < 0 && b != 0) {
            F = a - x / 10 + b;
        } else if (x > 0 && b == 0) {
            F = (x - a) / (x - c);
        } else {
            F = 3 * x + 2 / c;
        }
        System.out.println("F = " + F);
    }
}


