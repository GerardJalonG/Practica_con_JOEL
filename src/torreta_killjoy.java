import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();


        for (int i = 0; i < casos; i++) {
            int n = input.nextInt();
            int[][] matriu = new int[n][n];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matriu[j][k] = input.nextInt();
                }
            }

            int cont = 0;
            boolean torreta = false;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (matriu[j][k] == 2) {
                        for (int l = 0; l < n; l++) {
                            for (int m = k; m < n; m++ ){
                                if(matriu[l][m] == 1){
                                    cont++;
                                }
                            }
                        }
                        torreta = true;
                        break;
                    }
                }
                if(torreta) break;
            }

            System.out.println("Spotted enemies: " + cont);
        }
    }
}
