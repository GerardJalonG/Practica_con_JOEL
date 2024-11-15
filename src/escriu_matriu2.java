import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int files = input.nextInt();
        int columnes = input.nextInt();
        int[][] matriu = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriu[i][j] = input.nextInt();
            }
        }
        int i = input.nextInt();
        int j = input.nextInt();


        for (int k = 0; k < matriu.length; k++) {
            for (int m = 0; m < matriu[k].length; m++) {
                if(matriu[k][m] == i){
                    matriu[k][m] = j;
                }
                System.out.print(matriu[k][m] + " ");
            }
            System.out.println();
        }
    }
}
