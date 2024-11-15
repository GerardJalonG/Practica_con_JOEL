import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        int buscat = input.nextInt();
        int[][] matriz = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        boolean trobat = false;
        int sol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < col - 1; j++) {
                if(matriz[i][j-1] == buscat && matriz[i][j+1] == buscat){
                    trobat = true;
                    sol = matriz[i][j];
                }
            }
        }
        if(trobat){
            System.out.println(sol);
        }else{
            System.out.println("NO");
        }

    }
}
