// Job3.1

package jour07.job03;

class Cercle{

   private double x; 
   private double y; 
   private double rayon; 

   public Cercle(double x, double y, double rayon){
    this.rayon = rayon; 
    this.x = x;
    this.y = y; 
   }
   
   public void affiche(){
    System.out.println("1. X: " + getX());
    System.out.println("2. Y: " + getY());
    System.out.println("3. Rayon: " + getRayon());
    System.out.println("4. Surface: " + surface());
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
    return rayon*rayon*Math.PI;
   }

   public boolean estInterieur (double a, double b){
    double result = ((a-x)*(a-x)) +((b-y) *(b-y));
    return result <= rayon * rayon;
   }    
}
