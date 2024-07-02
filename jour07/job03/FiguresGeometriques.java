// Job 3.0

package jour07.job03;

public class FiguresGeometriques{

    public int surface; 
    private double longueur; 
    private double largeur; 

    public FiguresGeometriques(double largeur, double longueur) {
        this.largeur = largeur; 
        this.longueur = longueur; 
    }


    // GETTERS
    public double getLargeur() {
        return largeur;
    }   
    
    public double getLongueur() {
        return longueur;
    }

    
    // SETTERS
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}
    

