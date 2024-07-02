

package jour07.job03;

public class Main {

    public static void main(String[] args) {

        // Rectangle
        System.out.println("--- RECTANGLE ---");
        FiguresGeometriques Rect = new FiguresGeometriques(50.30, 60.50);

        System.out.println("Avant : " + Rect.getLargeur());
        System.out.println("Avant : " + Rect.getLongueur());

        Rect.setLargeur(30.20);
        Rect.setLongueur(25.64);

        System.out.println("Après : " + Rect.getLargeur());
        System.out.println("Après : " + Rect.getLongueur());


        // Cercle
        System.out.println("--- CERCLE ---");

        Cercle Cer = new Cercle(20, 30, 5);
         
        Cer.affiche();

        double p1 = 10; 
        double p2 = 20; 

        if (Cer.estInterieur(p1, p2)) {
            System.out.println("Voici la position du point : a("+ p1 +") et b(" + p2 +")." );
            System.out.println("5. Le point est à l'intérieur du cercle.");
        }
        else {
            System.out.println("5. Le point n'est pas l'intérieur du cercle.");

        }


    }

}
