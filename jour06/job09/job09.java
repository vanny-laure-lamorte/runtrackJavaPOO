package jour06.job09;

import java.util.Scanner;

public class job09 {

    public static void main(String[] args) {

        int sommeC =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Saisir un nombre :  "); 
        int n = input.nextInt(); 

       for (int i =0; i <= n; i++) {
        sommeC = sommeC + i*i*i;
       }

       System.out.println(sommeC);

        input.close();

    }
       
    
}
