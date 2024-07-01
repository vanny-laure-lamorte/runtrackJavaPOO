package jour06.job04;

import java.util.Scanner;

public class job04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Ecrivez votre nom: ");
        String inputUser = input.nextLine();
        System.out.println("Bienvenue Mr/Mrs " + inputUser);
        input.close();   
        

    }
    
}
