package jour06.job06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.xml.transform.Result;

public class job06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.println("Saisir 3 chiffres : ");
        int nombre1 = input.nextInt(); 
        int nombre2 = input.nextInt(); 
        int nombre3 = input.nextInt();

        List<Integer> listNb = new ArrayList<>(); 

        listNb.add(nombre1);
        listNb.add(nombre2);
        listNb.add(nombre3);

        int maxNombre = Collections.max(listNb);

        System.out.println(maxNombre);

        input.close();

        

  
        
    }
    
}
