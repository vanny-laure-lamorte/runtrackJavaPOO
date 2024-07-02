

package jour07.job03;

public class Rectangle {

    public static void main(String[] args) {

        FiguresGeometriques Rect = new FiguresGeometriques(50.30, 60.50);

        System.out.println("Avant : " + Rect.getLargeur());
        System.out.println("Avant : " + Rect.getLongueur());

        Rect.setLargeur(30.20);
        Rect.setLongueur(25.64);

        System.out.println("Après : " + Rect.getLargeur());
        System.out.println("Après : " + Rect.getLongueur());

    }

}
