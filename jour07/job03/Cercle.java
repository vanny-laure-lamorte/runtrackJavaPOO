// Job3.1

package jour07.job03;

class Cercle extends Figure {

   protected double x;
   protected double y;
   protected double rayon;

   public Cercle(double x, double y, double rayon, double X, double Y) {
      
      super(X, Y);
      this.rayon = rayon;
      this.x = x;
      this.y = y;
   }

   public void affiche() {
      System.out.println("--- CERCLE ---");
      System.out.println("1. X: " + getX());
      System.out.println("2. Y: " + getY());
      System.out.println("3. Rayon: " + getRayon());
      System.out.println("4. Surface: " + surface());

      double p1 = 10; 
      double p2 = 20;

      if (estInterieur(p1, p2)) {
          System.out.println("5.Voici la position du point : a("+ p1 +") et b(" + p2 +")." );
          System.out.println("Le point est à l'intérieur du cercle.");
      }
      else {
          System.out.println("Le point n'est pas l'intérieur du cercle.");
      }
      System.out.println();
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return x;
   }

   public double getRayon() {
      return rayon;
   }

   public void setCentre(double y, double x) {
      this.y = y;
      this.x = x;
   }

   public void setRayon(double rayon) {
      this.rayon = rayon;
   }

   public double surface() {
      return rayon * rayon * Math.PI;
   }

   public boolean estInterieur(double a, double b) {
      double result = ((a - x) * (a - x)) + ((b - y) * (b - y));
      return result <= rayon * rayon;
   }

}
