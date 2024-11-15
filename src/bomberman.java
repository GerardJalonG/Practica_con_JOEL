import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int files = input.nextInt();
        int columnes = input.nextInt();
        int[][] matriu = new int[files][columnes];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt();
        int y = input.nextInt();
        int cont = 0;

        for (int j = 0; j < columnes; j++) {
            cont += matriu[x][j];
        }

        for (int i = 0; i < files; i++) {
            if (i != x) {
                cont += matriu[i][y];
            }
        }
        System.out.println(cont);
    }
}
