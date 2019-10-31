import java.util.Arrays;
import java.util.Scanner;
public class Exercise5 {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[]arr=new int [3];
        arr[0]=a.nextInt();
        arr[1]=a.nextInt();
        arr[2]=a.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("  "+arr[i]);
        }
    }
}
