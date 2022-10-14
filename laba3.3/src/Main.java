import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть x: ");
        double x = scan.nextDouble();
        System.out.print("Введіть R: ");
        double R = scan.nextDouble();
        double y;

        if (x <= -2) {
            y = x + 3;
        } else if (x <= 4) {
            y = (4 - x*R - x - 2*R) / 6;
        } else if (x <= 8 - R) {
            y = -R;
        } else if (x <= 8 + R) {
            y = Math.sqrt(R*R - Math.pow((x - 8), 2)) - R * R;
        } else {
            y = -R;
        }
        System.out.println("y = " + y);
    }
}

