public class Exercise23 {
    public static void main(String[] args) {
        int t=1;
        for (int i = 97; i <=97+'Z'-'A' ; i++) {
            char p=(char)i;
            System.out.print(p+"\t");

            if(t%7==0){
                System.out.println();
            }
            t++;
        }
    }
}
