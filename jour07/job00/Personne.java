
public class Personne {

    public String nom; 
    public String prenom; 

    protected String date; 
    protected String lieuNaissance; 

    private String adresse; 
    private String telephone;

    public Personne(String nom, String prenom, String  date, String lieuNaissance, String adresse, String telephone) {     
        this.nom = nom; 
        this.prenom = prenom ; 
        this.date = date; 
        this.lieuNaissance = lieuNaissance; 
        this.adresse = adresse; 
        this.telephone = telephone;
    }

    
    // GETTERS
    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDate() {
        return date;
    }

    public String getLieuNaiss() {
        return lieuNaissance;
    }

    
    // SETTERS
    public void setAdresse(String addresse) {
        this.adresse = addresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLieuNaiss(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }
}



