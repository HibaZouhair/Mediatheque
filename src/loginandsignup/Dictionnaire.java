
package loginandsignup;

import java.util.List;

public class Dictionnaire extends Document {
    private String langue;
    private int nombreDeTomes;

    public Dictionnaire(String ISBN, String titre,List<String>auteurs, String editeur, String anneeEdition, String URL,
                        String langue, int nombreDeTomes) {
        super(ISBN, titre, auteurs, editeur, anneeEdition, URL);
        this.langue = langue;
        this.nombreDeTomes = nombreDeTomes;
    }
  public String getlangue() {
        return langue;
    }

    public void setlangue(String langue) {
        this.langue = langue;
    }

    public int getNombreDeTomes() {
        return nombreDeTomes;
    }

    public void setNombreDeTomes(int nombreDeTomes) {
        this.nombreDeTomes = nombreDeTomes;
    }
    @Override
    public String toString() {
        return"com.org.documents.DictionnaireDAO{" + super.toString() + ", Langue: " + langue +'\'' + ", Nombre de tomes: " + nombreDeTomes+'}';
    }

    @Override
    public Document ajouterDocument() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
