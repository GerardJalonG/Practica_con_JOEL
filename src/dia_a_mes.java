import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();
        if(1 <= dia && dia <= 31){
            System.out.println("1");
        } else if (32<=dia && dia <= 50) {
            System.out.println("2");
        }else if (51<=dia && dia <= 82) {
            System.out.println("3");
        }else if (83<=dia && dia <= 113) {
            System.out.println("4");
        }else if (114<=dia && dia <= 145) {
            System.out.println("5");
        }else if (146<=dia && dia <= 176) {
            System.out.println("6");
        }else if (177<=dia && dia <= 208) {
            System.out.println("7");
        }else if (209<=dia && dia <= 240) {
            System.out.println("8");
        }else if (241<=dia && dia <= 271) {
            System.out.println("9");
        }else if (272<=dia && dia <= 303) {
            System.out.println("10");
        }else if (304<=dia && dia <= 334) {
            System.out.println("11");
        }else if (335<=dia && dia <= 336) {
            System.out.println("12");
        }
    }
}
