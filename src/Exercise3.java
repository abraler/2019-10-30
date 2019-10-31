import java.util.*;
public class Exercise3 {
    public boolean function(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        Exercise3 qq=new Exercise3();

        boolean e=  qq.function(b);
        System.out.println(e);
    }
}
