package jour07.job04;

public class Vehicules {

    public String marque; 
    public int dateAchat; 
    public int prixAchat; 
    public int prixCourant; 
    public int anneeActuelle; 
    public double resultat; 

    public Vehicules(String marque, int dateAchat, int prixAchat) {
        this.marque = marque; 
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
     
    }

    public void affiche() {
        System.out.println("1. Marque: " + marque);
        System.out.println("2. Date d'achat: " + dateAchat);
        System.out.println("3. Prix d'achat: " + prixAchat);
        System.out.println("4. Le prix d'achat de la voiture pour l'année " + anneeActuelle + " est de : " + resultat + " Euros"); 
    }
    
    public void calculePrix(int annee) {
        anneeActuelle = annee;
        int nbAnnee = anneeActuelle - dateAchat;
        resultat = prixAchat - (nbAnnee * 0.01);   
}    

}
