package jour06.job05;
import java.util.Scanner;

public class job05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Saisir un nombre: ");
        int inputUser = input.nextInt();
        int resultat =  inputUser * inputUser;
        System.out.println(resultat);
        input.close();  
        
    }
    
}
