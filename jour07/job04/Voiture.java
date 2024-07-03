package jour07.job04;

public class Voiture extends Vehicules{

    public int cylindree; 
    public int nbPortes; 
    public int puissance; 
    public int kilometrage; 

    public Voiture (String marque, int dateAchat, int prixAchat, int cylindree, int nbPortes, int puissance, int kilometrage){
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree; 
        this.nbPortes = nbPortes ; 
        this.puissance = puissance; 
        this.kilometrage = kilometrage;  
} 

public void affiche() {
    System.out.println("--- Voiture ---");
    super.affiche();
    System.out.println("5. Cylindree: " + cylindree );
    System.out.println("6. Nombre de portes: " + nbPortes);
    System.out.println("7. Puissance: " + puissance );
    System.out.println("8. Kilométrage: " + kilometrage );
    System.out.println("9. Année Actuelle: " + anneeActuelle );
    System.out.println();
}

@Override
public void calculePrix(int annee) {

    anneeActuelle = annee;
    int nbAnnee = anneeActuelle - dateAchat;
    resultat = prixAchat - (nbAnnee * 0.02); 

    if (marque == "Renault" || marque == "Fiat"){
        resultat = resultat - (prixAchat * 0.1);
    }
    else if ( marque == "Ferrari" || marque == "Porsche") {
        resultat = resultat  - (prixAchat* 0.2);
    }

    int nbTrancheKilometrage = kilometrage / 10000; 
    resultat = resultat - (prixAchat*(nbTrancheKilometrage*0.05));

    if (resultat <0){
        resultat = 0;
    }



}    

}
