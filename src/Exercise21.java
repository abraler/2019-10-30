public class Exercise21 {
    public static void main(String[] args) {
        int a=1;
        for (int i = 0; i <1001 ; i++) {
            if(i%9==0){
                System.out.print(i+"\t\t");
                if(a%5==0){
                    System.out.println();
                }
                a++;
            }
        }
    }
}
