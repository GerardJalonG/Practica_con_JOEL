import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            int total = input.nextInt();
            int[] parelles = new int[total];
            for (int j = 0; j < total; j++) {
                parelles[j] = input.nextInt();
            }
            int min = parelles[0];
            int max = parelles[0];

            for (int j = 0; j < total; j++) {
                if(parelles[j]> max){
                    max = parelles[j];
                } else if (parelles[j] < min) {
                    min = parelles[j];
                }
            }
            System.out.println(max - min);
        }
    }
}
