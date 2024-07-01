package jour06.job00;

/**
 * job00
 */

public class job00 {
    public static void main(String[] args) {

        // Déclarer les variables
        char variable1 = 'A'; 
        String variable2 = "String";
        int variable3 = 3;
        long variable4 = 123456 ; 
        float variable5 = 0.45f; 
        boolean variable6 = true;
        
        //Afficher les valeurs stockées        
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(variable6);

        /* Pour int TOTO, stockez 3.817 puis affichez la valeur de TOTO. Que constatez-vous ? 
         * Il n'est pas possible d'attribuer un nombre decimal à un int.  
        */          
        
        int TOTO; 
        //TOTO = 3.3817;      
        TOTO = (int) 3.3817;

        System.out.println(TOTO);
    }        
    
}    

