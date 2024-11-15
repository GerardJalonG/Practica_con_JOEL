import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        if(A%4==0){
            if (A%100!=0 || A%400==0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");}
    }
}
