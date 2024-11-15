import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Ihicio creacion variables
        Scanner input = new Scanner(System.in);

        //Final creacion variables
        //casos
        int casos = input.nextInt();
        input.nextLine();
        for (int i = 0; i < casos; i++) {

            int distancia = input.nextInt();
            int velTortuga = input.nextInt();
            int velLiebre = input.nextInt();
            int minLiebre = input.nextInt();
            input.nextLine();

            int posTortuga = 0;
            int posLiebre = 0;
            int tiempo = 0;
            int descansLiebre = 0;

            boolean meta = false;

            while(!meta){
                tiempo++;

                //movimiento tortuga
                posTortuga += velTortuga;
                if(tiempo%10==0 && velTortuga>5){
                    velTortuga--;
                }

                if (descansLiebre > 0) {
                    descansLiebre--;
                } else {
                    posLiebre += velLiebre;
                    if (tiempo % (minLiebre+1) == 0) {
                        if (posLiebre > posTortuga) {
                            descansLiebre = 5;
                        } else {
                            descansLiebre = 3;
                        }
                    }
                }

                //verificar victoria
                if(posLiebre>=distancia && posTortuga >= distancia){
                    System.out.println("EMPAT");
                    meta = true;
                }else if(posTortuga>=distancia){
                    System.out.println("TORTUGA");
                    meta = true;
                } else if (posLiebre>=distancia) {
                    System.out.println("LLEBRE");
                    meta = true;
                }
            }


        }
    }
}
