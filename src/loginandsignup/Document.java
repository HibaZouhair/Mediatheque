
package loginandsignup;

import java.util.List;

public abstract class Document {
  private  String ISBN;
    private  String titre;
    private List<String> auteurs ;
    private  String editeur;
    private String anneeEdition;
    private  String URL;
    
   
     public Document(String ISBN, String titre, List<String> auteurs, String editeur, String anneeEdition, String URL) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteurs=auteurs;
        this.editeur = editeur;
        this.anneeEdition = anneeEdition;
        this.URL = URL;
    
}
    public abstract Document ajouterDocument();
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

  
    public String getAnneeEdition() {
        return anneeEdition;
    }
     public void setAnneeEdition(String anneeEdition) {
        this.anneeEdition=anneeEdition;
    }

   

    
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
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
    
     public void detruireDocument() {
    System.out.println("Le document avec le titre " + titre + " a été détruit.");
    }
    @Override
    public String toString() {
        return "Document{" +
               "ISBN='" + ISBN + '\'' +
               ", titre='" + titre + '\'' +
               ", auteurs=" +auteurs+
               ", editeur='" + editeur + '\'' +
               ", anneeEdition=" + anneeEdition +
               ", URL='" + URL + '\'' +
               '}';
    }

    
}