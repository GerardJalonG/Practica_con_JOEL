import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        int[][] matrix2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        boolean esInversa = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != matrix2[row - i - 1][col - j - 1]) {
                    esInversa = false;
                    break;
                }
            }
            if (!esInversa) {
                break;
            }
        }

        if(esInversa){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
