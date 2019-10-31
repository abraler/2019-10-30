import java.util.*;

import static sun.util.calendar.CalendarUtils.mod;

public class Exercise4 {
    private void function(int i,int j,int k){
        switch (k){
            case 1:add(i,j);break;
            case 2:Subtraction(i,j);break;
            case 3:multiplication(i,j);break;
            case 4:division(i,j);break;
            default:Mod(i,j);break;
        }
    }

    private void Mod(int i, int j) {
        System.out.println(i%j);

    }

    private void  division(int i, int j) {
        System.out.println(i/j);
    }

    private void multiplication(int i, int j) {
        System.out.println(i*j);
    }

    private void Subtraction(int i, int j) {
        System.out.println(i-j);
    }


    private void add(int i,int j){
        System.out.println(i+j);
    }


    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Exercise4 ww=new Exercise4();

        int ff=1;
        while(ff!=0){
            while (ff!=0) {
                System.out.println("输入你要计算的数");
                int b=a.nextInt();
                int c=a.nextInt();
                System.out.println("选择方法，1-加法  2--减法  3--乘法  4--除法   其余--取余");
                int d=a.nextInt();

                ww.function(b, c, d);
                System.out.println("是否退出 0--退出");
                ff=a.nextInt();
                break;
            }
        }

    }

}
