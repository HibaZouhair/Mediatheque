
package loginandsignup;

import java.util.List;

public class Kindle {
  private  String ISBN;
    private  String titre;
    private List<String> auteurs ;
    private  String editeur;
    private String type;
    private Adherent adherent;    
   
     public Kindle(String type, String ISBN, String titre, List<String> auteurs, String editeur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteurs=auteurs;
        this.editeur = editeur;
        this.type=type;
    
}
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN (String ISBN) {
        this.ISBN = ISBN;
    }
   
    
    public String getTitre() {
        return titre;
    }
 public void setTitre(String titre) {
        this.titre = titre;
    }
   

   
    public List<String> getAuteurs() {
        return auteurs;
    }
 public void setAuteurs(List<String> auteurs) {
        this.auteurs = auteurs;
    }
    

    
    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

  
    public String getType() {
        return type;
    }
     public void setType(String type) {
        this.type=type;
    }

     public String getAuteursAsString() {
        String Auteurs = "";
        for (int i = 0; i < this.getAuteurs().size() - 1; i++) {
            Auteurs += this.getAuteurs().get(i) + "; ";
        }
         Auteurs+= this.getAuteurs().get(this.getAuteurs().size() - 1);
        return Auteurs;
    }
     public List<String> getAuteursListFromString(String auteurs) {
        return List.of(auteurs.split("; "));
    }
    
     
    
    @Override
    public String toString() {
        return "Kindles{" +
               "ISBN='" + ISBN + '\'' +
               ", titre='" + titre + '\'' +
               ", auteurs=" +auteurs+
               ", editeur='" + editeur + '\'' +
               ", type=" + type +
               
               '}';
    }

 
    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }
}