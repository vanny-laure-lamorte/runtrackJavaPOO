package jour07.job03;

public class Figure {
    public double X; 
    public double Y; 

    public Figure(Double X, double Y) {
        this.X = X; 
        this.Y = Y;        
    }

    public void affiche() {
        System.out.println("--- FIGURE ---");
        System.out.println("1. Le centre de la figure a pour valeur x =" + X + " et y =" + Y);
        System.out.println();
    }
    
}
