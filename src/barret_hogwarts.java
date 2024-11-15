import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        if(entrada.equals("Coratge")){
            System.out.println("Gryffindor");
        } else if (entrada.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (entrada.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else{
            System.out.println("Hufflepuff");
        }
    }
}
