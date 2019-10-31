import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int t=1;
        for (int i = 0; i <a ; i++) {
            t*=10;
        }
        System.out.println(t);
    }
}
