import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть x: ");
        double x = scan.nextDouble();
        double y = (1 / Math.abs(x + 2)) + 1;

        if (x < 1) {
            y -= 7 * x * x + x - 8;
        } else if (x <= 4) {
            y -= (1 / (Math.tan((x + 4) / Math.sqrt(11)))) + 3;
        } else {
            y -= Math.sqrt(1 + (Math.abs(Math.pow(Math.cos(x), 2))));
        }
        System.out.println("y = " + y);
    }
}
