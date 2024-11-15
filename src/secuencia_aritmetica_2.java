import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            int n = input.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = input.nextInt();
            }
            int d = array[1] - array[0];
            boolean arit = true;
            for (int j = 0; j < n; j++) {
                if(j!=n-1 && array[j + 1] - array[j] != d){
                    arit = false;
                }
            }
            if(arit){
                System.out.println("si");
            }else{
                System.out.println("no");
            }
        }

    }
}
