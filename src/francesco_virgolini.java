import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        input.nextLine();
        for (int i = 0; i < casos ; i++) {
            int n = input.nextInt();
            input.nextLine();
            String[] vector = new String[n];
            for (int j = 0; j < vector.length ; j++) {
                vector[j] = input.nextLine();
            }
            for (int j = 0; j < vector.length; j++) {
                if (vector[j].equals("Francesco Virgolini")) {
                    String extra = vector[j-1];
                    vector[j-1] = vector[j];
                    vector[j] = extra;
                }
            }
            System.out.println(Arrays.toString(vector));
        }
    }
 }
