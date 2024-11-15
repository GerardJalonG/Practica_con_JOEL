import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        for (int i = 0; i < casos ; i++) {
            int n = input.nextInt();
            int[] vector = new int[n];
            for (int j = 0; j < vector.length ; j++) {
                vector[j] = input.nextInt();
            }

            boolean repetido=false;
            for (int j = 0; j < vector.length-1; j++) {
                if(vector[j]==vector[j+1]){
                    repetido = true;
                    break;
                }
            }
            if(repetido){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
 }
