package jour06.job01;
import java.util.Scanner;


public class job01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Ecrivez un mot: ");
        String inputUser = input.nextLine();
        System.out.println("Vous avez saisi : " + inputUser);
        input.close();        
    }
}
