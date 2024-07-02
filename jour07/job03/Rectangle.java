// Job 3.0

package jour07.job03;

public class Rectangle extends Figure{

    public int surface; 
    private double longueur; 
    private double largeur; 

    public Rectangle(double largeur, double longueur, double X, double Y) {
        super (X,Y);
        this.largeur = largeur; 
        this.longueur = longueur; 
    }

    public void affiche (){
        System.out.println("--- RECTANGLE ---");
        System.out.println("1.Avant : " + getLargeur());
        System.out.println("1.Avant : " + getLongueur());
        setLargeur(30.20);
        setLongueur(25.64);
        System.out.println("2.Après : " + getLargeur());
        System.out.println("2.Après : " + getLongueur());
        System.out.println();
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
    

