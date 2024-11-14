import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        ArrayList<String> estudiants = new ArrayList<>();
        int cont = 0;

        while (true) {
            String command = scanner.next();
            if (command.equalsIgnoreCase("C")) {
                total = scanner.nextInt();
            } else if (command.equalsIgnoreCase("I")) {
                String name = scanner.next();
                if (cont < total) {
                    estudiants.add(name);
                    cont++;
                } else {
                    System.out.println("KO " + name);
                }
            } else if (command.equalsIgnoreCase("B")) {
                String name = scanner.next();
                if (estudiants.contains(name)) {
                    estudiants.remove(name);
                    cont--;
                }
            } else if (command.equalsIgnoreCase("A")) {
                total = scanner.nextInt();
            } else if (command.equalsIgnoreCase("N") || command.equalsIgnoreCase("S") || command.equalsIgnoreCase("F")) {
                System.out.println(cont);
                if (command.equalsIgnoreCase("F")) {
                    break;
                }
            }
        }
    }
}
