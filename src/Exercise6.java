import java.util.Arrays;
import java.util.Scanner;
public class Exercise6 {
    
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      int []arr=new int [5];
      arr[0]=a.nextInt();
        arr[1]=a.nextInt();
        arr[2]=a.nextInt();
        arr[3]=a.nextInt();
        arr[4]=a.nextInt();
      Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i++) {
          if(arr[i]==arr[i+1]){
            System.out.println("有相同的");
          }
        }

    }
}
