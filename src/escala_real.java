import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int casos = input.nextInt();
    for (int i = 0; i < casos; i++) {
        int[] mano = new int[7];
        for (int j = 0; j < mano.length; j++) {
            mano[j] = input.nextInt();
        }
        Arrays.sort(mano);
        boolean escalera = false;

        boolean reial = false;
        boolean diez = false;
        boolean once = false;
        boolean doce = false;
        boolean trece = false;
        boolean as = false;

        int cont = 1;

        for (int valor : mano) {
            if (valor == 10) diez = true;
            if (valor == 11) once = true;
            if (valor == 12) doce = true;
            if (valor == 13) trece = true;
            if (valor == 1 || valor == 14) as = true;
        }

        if (diez && once && doce && trece && as) {
            reial = true;
        }

        for (int j = 0; j < mano.length - 1; j++) {
            if (mano[j] + 1 == mano[j + 1]) {
                cont++;
                if (cont >= 5) {
                    escalera = true;
                    break;
                }
            } else if (mano[j] != mano[j + 1]) {
                cont = 1;
            }
        }

        if (reial) {
            System.out.println("ESCALA REIAL");
        } else if (escalera) {
            System.out.println("ESCALA");
        } else {
            System.out.println("NO");
        }

        }
    }
}
