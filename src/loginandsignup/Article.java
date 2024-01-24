
package loginandsignup;


 import java.util.List;

public class Article extends Document {
    private String journal;

    
    public Article(String ISBN, String titre, List<String> auteurs, String editeur, String anneeEdition, String URL, String journal) {
        super(ISBN, titre, auteurs, editeur, anneeEdition, URL);
        this.journal = journal;
    }

    
    public String getJournal() {
        return journal;
    }

    
    public void setJournal(String journal) {
        this.journal = journal;
    }

    
    @Override
    public String toString() {
        return "com.mycompany.mediatheque.ArticleDAO {" +
                super.toString() +"Article{" +
               "journal='" + journal + '\'' +'}';
              
    }

    @Override
    public Document ajouterDocument() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}