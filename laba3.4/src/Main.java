import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть R:");
        double R = scan.nextDouble();
        System.out.print("Введіть x:");
        double x = scan.nextDouble();
        System.out.print("Введіть y:");
        double y = scan.nextDouble();

        if (x > 0 && y >= 0 && y <= Math.sqrt(R*R - x*x) ||
                x <= 0 && y <= x + R && y <= Math.sqrt(R*R - x*x)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}


