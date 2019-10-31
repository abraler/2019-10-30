import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int i = 2;
        for (; i <a/2 ; i++) {
            if(a%i==0){
                System.out.println("不是素数");
                break;
            }
        }
        if(i==a/2){
            System.out.println("是素数");
        }
    }
}
