import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            int t = 0;
            do {
                int b = a % 10;

                t = t * 10 + b;
                a /= 10;
            } while (a != 0);
            System.out.println(t);
        }
    }
}
