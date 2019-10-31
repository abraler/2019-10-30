import java.util.Scanner;

public class Exercise24 {
    int fib(int n){
        if(n==0||n==1){
            return 1;
        }
        return  (fib(n-1)+fib(n-2));
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        Exercise24 p=new Exercise24();
        for (int i = 0; i <a ; i++) {
            System.out.print(p.fib(i)+"\t\t");
        }

    }

}
