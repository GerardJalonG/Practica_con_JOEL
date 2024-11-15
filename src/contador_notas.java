import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int notes = 0;
        float total = 0;
        int excelents = 0;
        int notables = 0;
        int bes = 0;
        int suficients = 0;
        int insuficients = 0;
        int deficients = 0;


        float nota;
        do {
            nota = input.nextInt();
            if (nota >= 0 && nota <= 10){
                notes ++;
                total += nota;
                if(nota>=9){
                    excelents++;
                }
                if(nota>=7 && nota <= 8){
                    notables++;
                }
                if(nota==6){
                    bes++;
                }
                if(nota==5){
                    suficients++;
                }
                if(nota > 3 && nota < 5){
                    insuficients++;
                }
                if (nota <= 3){
                    deficients++;
                }

            }

        } while (nota != -1);
        float mitja = (float) total / notes;
        System.out.println("NOTES: "+notes+" MITJANA: "+mitja+" E: "+excelents+" N: "+notables+" B: "+bes+" S: "+suficients+" I: "+insuficients+" MD: "+deficients);
    }
}
