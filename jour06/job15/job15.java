package jour06.job15;

import java.util.Scanner;

public class job15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        int nb;
        
        do {
            System.out.print("Saisir un nombre de minimum deux chiffres : ");
            nb = input.nextInt();
            
            if (nb < 10) {
                System.out.print("Vous devez saisir un chiffre supérieur à 10 : ");
            }
            
        } while(nb < 10) ;

        
        
        int inverse =  reverseNumber(nb);

        System.out.println(inverse);
        input.close(); 

        
    }


    public static int reverseNumber(int number) {
        int reversedNumber = 0;        
        while (number != 0) {
            int digit = number % 10;  
            reversedNumber = reversedNumber * 10 + digit;  
            number = number / 10;  
        }
        
        return reversedNumber;
    }
    
}
