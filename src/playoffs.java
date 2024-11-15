import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            int equips = input.nextInt();
            int victories = input.nextInt();
            int minim = (equips-1)*victories;
            int mejor = victories  + (victories-1);
            int maxim =  (equips-1)*mejor;
            System.out.println(minim);
            System.out.println(maxim);
        }
    }
}
