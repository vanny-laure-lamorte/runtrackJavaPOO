package jour07.job04;

public class GestionVehicules {

    public String marque; 
    public String dateAchat; 
    public int prixAchat; 
    public int prixCourant; 

    public GestionVehicules(String marque, String dateAchat, int prixAchat) {
        this.marque = marque; 
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public void affiche() {
        System.out.println("--- Gestion Vehicules ---");
        System.out.println("1. Marque: " + marque);
        System.out.println("2. Date d'achat: " + dateAchat);
        System.out.println("3. Prix d'achat: " + prixAchat);
        System.out.println();

    }
    

}
