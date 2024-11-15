import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posicio = input.nextInt();
        int torneos = input.nextInt();
        for (int i = 0; i < torneos ; i++) {
            posicio/=2;
        }
        System.out.println(posicio);
    }
}
