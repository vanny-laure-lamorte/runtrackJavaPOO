//Job

package jour07.job03;

class RectangleColore extends Rectangle {

    protected int couleur;

    public RectangleColore(double largeur, double longueur, double X, double Y, int couleur) {
        super(largeur, longueur, X, Y);
        this.couleur = couleur;
    }

    public double getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void affiche(){

        System.out.println("--- RECT COLORES ---");
        System.out.println("1. La largeur du rect: " + getLargeur());
        System.out.println("2. La longueur du rect: " + getLongueur());
        System.out.println("3. La couleur du rect: " + getCouleur());
        System.out.println();
 

    }

}
