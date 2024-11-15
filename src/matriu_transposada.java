import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] matriu = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matriu[i][j]= input.nextInt();
            }
        }
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++) {
                System.out.print(matriu[j][i] + " ");
            }
            System.out.println();
        }

    }
}
