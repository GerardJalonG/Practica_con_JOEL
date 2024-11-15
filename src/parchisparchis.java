import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            int[] parchis = new int[4];
            for (int j = 0; j < parchis.length; j++) {
                parchis[j] = input.nextInt();
            }
            int base = parchis[0];
            for (int j = 1; j < parchis.length; j++) {
                base += parchis[j];
                if(base == 8){
                    break;
                }
                else if(base > 8){
                    base = 8 - (base - 8);
                }

            }
            System.out.println(base);
        }
    }
}
