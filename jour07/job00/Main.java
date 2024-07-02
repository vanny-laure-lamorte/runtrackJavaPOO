public class Main {
    public static void main(String[] args) {
        Personne P1 = new Personne("Martinie", "Lucas", "24/12/1995", "Nantes", "Salon de Provence","0652311381");

        System.out.println(P1.prenom);
        System.out.println(P1.nom);        
        
        System.out.println(P1.getTelephone());
        P1.setTelephone("0685198720");
        System.out.println(P1.getTelephone());

        // Public: Toujours accessible 
        // Protected: Accessible dans la classe et les sous classes
        // Private: Accessible que dans la classe

        // Getter: Pour leAffichier la nouvelle valeur
        // Setter: Modifier la valeur

    }    
    
    
}
