import java.util.Random;
import java.util.Scanner;

public class Exercise19 {
    Scanner i=new Scanner(System.in);
    Random a=new Random();
    int cs=0;

    private int Game1(){
        int d=0;//保存下限
        int e=9;//保存上限
        int  send=a.nextInt(10);
    System.out.println("范围在"+d+"~"+e);
        for (int j = 0; j <10 ; j++) {
            System.out.println("请输入");
            int q=i.nextInt();
            if(q==send){
                System.out.println("恭喜通过");
                return cs++;
            }
            if(q>send) {
                System.out.println(d + "~" + q);
                e=q;
            }else {
                System.out.println(q+"~"+e);
                d=q;
            }
        }

        return cs;
    }
    public static void main(String[] args) {
        Exercise19 a = new Exercise19();
        int t=1;
        switch (t) {
            case 1:
                 t=a.Game1();break;
        }
    }
}
