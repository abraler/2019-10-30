public class Exercise25 {
    public static void main(String[] args) {
        char p='*';
        for (int i = 0; i <5 ; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
