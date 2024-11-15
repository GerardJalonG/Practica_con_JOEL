import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        input.nextLine();

        String[][] matriu = new String[rows][col];
        for (int i = 0; i < rows; i++) {
            String line = input.nextLine();
            matriu[i] = line.split(" ");
        }
        boolean trobat = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matriu[i][j].equals("SPIDERMAN")) {
                    trobat = true;
                    if (i == 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println(matriu[i - 1][j]);
                    }

                    if (i == rows - 1) {
                        System.out.println("NO");
                    } else {
                        System.out.println(matriu[i + 1][j]);
                    }
                    break;
                }
            }
            if (trobat) {
                break;
            }
        }
    }
}
