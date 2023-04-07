import java.io.IOException;
import java.util.Scanner;

public class 一元二次方程 {

        public static void main(String[] args) throws IOException {
            int a, b, c;
            Scanner reader = new Scanner(System.in);
            a = reader.nextInt();
            b = reader.nextInt();
            c = reader.nextInt();
            int delta;
            double x1, x2;
            delta = b * b - 4 * a * c;
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / 2.0 / a;
                x2 = (-b - Math.sqrt(delta)) / 2.0 / a;
                System.out.println("x1,x2");
            }
            if (delta == 0) {
                x1 = x2 = b / -2.0 / a;
                System.out.println("x");
            }
            if (delta < 0) {
                double s, x;
                s = -b / 2.0 / a;
                x = Math.sqrt(-delta) / 2.0 / a;
                System.out.println("方程无实根");
            }
        }
    }

