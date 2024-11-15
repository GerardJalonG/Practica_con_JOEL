import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        String cadena = "";

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i ; j++) {
                cadena += i;
            }
        }

        System.out.println(cadena);
    }
}
