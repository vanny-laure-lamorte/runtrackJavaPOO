package jour06.job15;

import java.util.Scanner;

public class job15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        int nb;

        do {
            System.out.print("Saisir un nombre de minimum deux chiffre : ");
            nb = input.nextInt();

            if (nb > 9) {
                System.out.print("Vous devez saisir un chiffre supérieur à 10 : ");
            }

            input.close(); 
        } while(nb > ) ;


        
    }
    
}
