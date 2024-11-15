import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos ; i++) {
            int total = input.nextInt();
            int[] notes_abans = new int[total];
            int[] notes_despres = new int[total];

            for (int j = 0; j < total; j++) {
                notes_abans[j] = input.nextInt();
            }input.nextLine();

            for (int j = 0; j < total; j++) {
                notes_despres[j] = input.nextInt();
            }input.nextLine();

            int max_dif = notes_despres[0] - notes_abans[0];
            int cont = 0;
            for (int j = 0; j < total; j++) {
                if(notes_despres[j] - notes_abans[j] >= max_dif){
                    max_dif = notes_despres[j] - notes_abans[j];
                    cont++;
                }
            }
            System.out.println(max_dif);
            System.out.println(cont);
        }
    }
 }
