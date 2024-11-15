import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        do {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            if(a==0 && b== 0 & c==0){
                break;
            }
            if(a*a+b*b==c*c){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        } while (a != 0 && b != 0 && c != 0);
    }
}
