import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            int size = input.nextInt();
            int[] zapatos = new int[size];
            for (int j = 0; j < size; j++) {
                zapatos[j] = input.nextInt();
            }
            int mida = input.nextInt();
            int marge = input.nextInt();
            int cont = 0;
            for (int j = 0; j < size; j++) {
                if(zapatos[j] <= mida + marge && zapatos[j] >= mida - marge ){
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}
