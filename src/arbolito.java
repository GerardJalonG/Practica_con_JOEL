import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cont = 0;
        double c1 = input.nextDouble();
        double c2 = input.nextDouble();
        double k1 = input.nextDouble();
        double k2 = input.nextDouble();
        double k3 = input.nextDouble();
        if(k1 > c1 && k1 < c2){
            cont++;
        }
        if (k2 > c1 && k2 < c2) {
            cont++;
        }
        if (k3 > c1 && k3 < c2) {
            cont++;
        }
        System.out.println(cont);
    }
}
