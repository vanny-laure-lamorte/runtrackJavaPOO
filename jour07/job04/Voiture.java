package jour07.job04;

public class Voiture extends Vehicules{

    public int cylindree; 
    public int nbPortes; 
    public int puissance; 
    public int kilometrage; 

    public Voiture (String marque, String dateAchat, int prixAchat, int cylindree, int nbPortes, int puissance, int kilometrage){
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree; 
        this.nbPortes = nbPortes ; 
        this.puissance = puissance; 
        this.kilometrage = kilometrage;        
} 

public void affiche() {
    System.out.println("--- Voiture ---");
    super.affiche();
    System.out.println("4. Cylindree: " + cylindree );
    System.out.println("5. Nombre de portes: " + nbPortes);
    System.out.println("6. Puissance: " + puissance );
    System.out.println("7. Kilométrage: " + kilometrage );
    System.out.println();
}
}
