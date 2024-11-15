import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segons = input.nextInt();
        int dia = segons/86400 + 1;
        int hora = segons/43200;
        if(hora%2==0) {System.out.println("mati del dia " +dia);
        }
        else{System.out.println("nit del dia " +dia);
        }
    }
}
