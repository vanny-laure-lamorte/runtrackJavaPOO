package jour06.job02;

import java.util.Scanner;

public class job02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Saisir votre prénom: ");
        String inputUser = input.nextLine();
        System.out.println("Bonjour " + inputUser);
        input.close();   
        
    }
    
}
