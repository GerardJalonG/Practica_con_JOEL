import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        int[][] matriu = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matriu[i][j] = input.nextInt();
            }
        }

        int cont = 0;
        boolean tetris = false;
        for (int i = 0; i < rows; i++) {
            cont++;
            for (int j = 0; j < col; j++) {
                if(matriu[i][j]==0){
                    cont--;
                    break;
                }
            }
            if(cont==4){
                tetris = true;
                System.out.println("TETRIS");
                break;
            }
        }
        if(cont < 4){
            System.out.println(cont);
        }
    }
}
