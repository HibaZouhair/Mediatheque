
package loginandsignup;

public class Emprunt {
    private String document_isbn;
    private String emprunteur_id;
    
    public Emprunt(String document_isbn, String emprunteur_id) {
       this.document_isbn = document_isbn;
        this.emprunteur_id = emprunteur_id;
       
        
    }

    public String getDocumentIsbn() {
        return document_isbn;
    }

    public void setDocumentIsbn(String document_isbn) {
        this.document_isbn = document_isbn;
    }

    public String getEmprunteurId() {
        return emprunteur_id;
    }

    public void setEmprunteurId(String emprunteur_id) {
        this.emprunteur_id = emprunteur_id;
    }

 
     @Override
    public String toString() {
        return "Emprunt {" +
                "document_isbn='" + document_isbn + '\'' +
                ", emprunteur_id='" + emprunteur_id + '\'' +
                
                '}';
    }
}
