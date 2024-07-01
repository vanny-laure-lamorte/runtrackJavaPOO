package jour06.job14;

import java.util.Scanner;

public class job14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        int nb;

        do {
            System.out.print("Saisir un nombre entre 0 et 9: ");
            nb = input.nextInt();

            if (nb < 0 || nb > 9) {
                System.out.print("Vous devez saisir un chiffre inférieur à 10 : ");
            }  

        } while (nb < 0 || nb > 9) ;

        for (int i= 0 ; i < 11; i++) {
            System.out.println(i + " x " + nb + " = " + (i*nb));
        }

        input.close(); 
        
    }
    
}
