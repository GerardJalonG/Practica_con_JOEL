import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            int piso = input.nextInt();
            int ferrero = 0;
            for (int j = 1; j <= piso; j++) {
                ferrero += j*(j+1)/2;
            }

            System.out.println(ferrero);
        }
    }
}
