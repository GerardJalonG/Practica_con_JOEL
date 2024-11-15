import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caramels = input.nextInt();
        int nens = input.nextInt();

        System.out.println(caramels%nens);
    }
}
