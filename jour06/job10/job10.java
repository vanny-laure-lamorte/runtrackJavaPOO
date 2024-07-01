package jour06.job10;

import java.util.Scanner;

public class job10 {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
        System.out.print("Veuillez saisir votre age: "); 
        int age = input.nextInt(); 

        if (age < 18) {
            System.out.println("Tu es mineur.");
        }
        else {
            System.out.println("Vous êtes majeur.");
        }

        input.close();

    }
        
    }
    
}
