
package loginandsignup;

import java.util.List;
    public class Livre extends Document {
    private int nombreDePages;
    private String type;
    private int tome;

   
    public Livre(String ISBN, String titre, List<String> auteurs, String editeur, String anneeEdition, String URL, String type , int nombreDePages, int tome) {
        super(ISBN, titre, auteurs, editeur, anneeEdition, URL);
        this.type = type;
        this.nombreDePages = nombreDePages;
        this.tome = tome;
    }

   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }
      public int getTome() {
        return tome;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }
@Override
 public String toString() {
        return "com.mycompany.mediatheque.LivreDAO" +
                super.toString() +
                "nombreDePages=" + nombreDePages +
                ", type='" + type + '\'' +
                ", tome=" + tome +
                '}';
    }

    @Override
    public Document ajouterDocument() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}