package jour06.job12;

import java.util.Scanner;

public class job12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Saisir un nombre entier : ");
        int n = input.nextInt();

        int somme =1 ;

        for (int i = 1; i <= n; i++ ) {
            somme = somme * i;
        }

        System.out.println(somme);
        

        input.close();
    }
    
}
