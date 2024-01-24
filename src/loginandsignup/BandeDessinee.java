
package loginandsignup;

import java.util.List;

public class BandeDessinee extends Livre {
    
    private String illustrateur;

    public BandeDessinee(String ISBN, String titre, List<String> auteurs, String editeur, String anneeEdition, String URL, String type , int nombreDePages, int tome, String illustrateur) {
        super(ISBN,titre, auteurs, editeur, anneeEdition,URL,type ,nombreDePages,tome);
        this.illustrateur = illustrateur;
    }

    public String getIllustrateur() {
        return illustrateur;
    }

    public void setIllustrateur(String illustrateur) {
        this.illustrateur = illustrateur;
    }

    @Override
    public String toString() {
        return "com.mycompany.mediatheque.BandeDessineeDAO {"+
                super.toString()+
               ", illustrateur='" + illustrateur + '\''  +'}';
              
    }
}