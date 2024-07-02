

package jour07.job03;

public class Main {

    public static void main(String[] args) {

        // Rectangle
        Rectangle Rect = new Rectangle(50.30, 60.50, 10.10, 16.15);
        Rect.affiche();  

        // Cercle
        Cercle Cer = new Cercle(20.2, 30.3, 50.2, 20.30, 20.10); 
        Cer.affiche();      
       
        // RectangleColore
        RectangleColore RectC = new RectangleColore(20.2, 10.1, 4.5, 40.5, 69);
        RectC.affiche();     
      
        // Figure
        Figure fig = new Figure(10.0, 20.0);
        fig.affiche();



    }
}
