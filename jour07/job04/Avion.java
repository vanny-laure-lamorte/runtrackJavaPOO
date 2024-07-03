package jour07.job04;

public class Avion extends Vehicules {
    public String typeMoteur;
    public int heureVol;

    public Avion(String marque, int dateAchat, int prixAchat, String typeMoteur, int heureVol) {

        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heureVol = heureVol;
    }

    public void affiche() {
        System.out.println();
        System.out.println("--- Avion ---");
        super.affiche();
        System.out.println("5. Type de Moteur: " + typeMoteur);
        System.out.println("6. Heure de vol: " + heureVol);
        System.out.println("7. Année Actuelle: " + anneeActuelle);
        System.out.println("8. Année Actuelle: " + anneeActuelle);

        System.out.println();
    }

    @Override
    public void calculePrix(int annee) {

        anneeActuelle = annee;
        int nbAnnee = anneeActuelle - dateAchat;
        resultat = prixAchat - (nbAnnee * 0.1);

    }

}
