import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int weed=b/7;
        int end=b%7;
        System.out.println("周数"+weed+"剩余天数"+end);
    }
}
