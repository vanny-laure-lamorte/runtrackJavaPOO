package jour07.job04;

public class Main {

    public static void main(String[] args) {
        
        Vehicules V1 =  new Vehicules("BMW", "24/12/1995", 10800);     
        V1.affiche();

        Avion Av = new Avion("KLM", "25/12/1993", 20000000,"Hélice", 15); 
        Av.affiche();

        Voiture Vo = new Voiture("BMW", "24/12/1995", 10800, 5, 4, 250, 178000);
        Vo.affiche();

    }
    
    
}
