package jour07.job04;

public class Main {

    public static void main(String[] args) {
        
        Vehicules V1 =  new Vehicules("BMW", 1958, 10800);     
        V1.affiche();

        Avion Av = new Avion("KLM", 1993, 20000000,"Hélice", 15); 
        Av.calculePrix(2024);
        Av.affiche();

        Voiture Vo = new Voiture("BMW", 1995, 10800, 5, 4, 250, 178000);
        Vo.calculePrix(2024);
        Vo.affiche();

        Voiture Vo2 = new Voiture("Renault", 1995, 1000, 5, 4, 250, 1780000000);
        Vo2.calculePrix(2024);
        Vo2.affiche();
    }
   
}
