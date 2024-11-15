import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            int numeros = input.nextInt();
            int[] cadena = new int[numeros];
            for (int j = 0; j < numeros; j++) {
                cadena[j] = input.nextInt();
            }
            Arrays.sort(cadena);

            for (int j = 0; j < numeros / 2; j++) {
                int primer = cadena[j];
                int ultim = cadena[numeros - 1 - j];
                int suma = primer + ultim;
                System.out.println(suma);

            }
        }
    }
}
