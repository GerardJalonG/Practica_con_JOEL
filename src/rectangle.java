import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        int f1 = input.nextInt();
        int c1 = input.nextInt();
        int f2 = input.nextInt();
        int c2 = input.nextInt();
        String[][] matriz = new String[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if(i >= f1 && i <= f2 && j >= c1 && j <= c2){
                    matriz[i][j] = "X";
                }
                else{
                    matriz[i][j] = ".";
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
