package jour07.job04;

public class Avion extends Vehicules {
    public String typeMoteur; 
    public int heureVol; 

    public Avion (String marque, String dateAchat, int prixAchat, String typeMoteur, int heureVol) {

        super(marque, dateAchat, prixAchat); 
        this.typeMoteur = typeMoteur; 
        this.heureVol = heureVol; 
    }

    public void affiche() {
        System.out.println();
        System.out.println("--- Avion ---");
        super.affiche();
        System.out.println("4. Type de Moteur: " + typeMoteur );
        System.out.println("5. Heure de vol: " + heureVol);    
        System.out.println();
    }    
    
}
