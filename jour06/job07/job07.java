package jour06.job07;

import java.util.Scanner;

public class job07 {
    public static void main(String[] args) {

        double moyenne = 0;

        Scanner input = new Scanner(System.in);

        System.err.println("Saisir 5 notes");
        for (int i= 1; i<6; i++) {

            System.out.print("note " + i + ": ");
            moyenne = moyenne + input.nextInt();
        }

        System.out.println("Voici la moyenne : " + moyenne/5);

        input.close();
        
    }
    
}
