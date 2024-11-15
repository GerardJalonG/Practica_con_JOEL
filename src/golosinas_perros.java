import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int m = input.nextInt();
        int l = input.nextInt();

        int promedio = s + 2 * m + 3 * l;
        if(promedio > 10){
            System.out.println("happy");
        }else{
            System.out.println("sad");
        }

    }
}
