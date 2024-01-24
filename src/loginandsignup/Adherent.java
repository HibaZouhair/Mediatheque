
package loginandsignup;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
     private static int ID_Adherent;
    private String username;
    private String password;
    private String CNE;
    private List<Document> favoris = new ArrayList<>();
    private List<Document> kindles =new ArrayList<>();
    
      public Adherent(String username, String password, String CNE) {
        this.username = username;
        this.password = password;
        this.CNE = CNE;
    }
    
    @Override
    public String toString() {
        return "Adherent{" + "username=" + username + ", PASSWORD=" + password + ", CNE=" + CNE + '}';
    }
    
    public void addFavoris(Document document) {
        favoris.add(document);
    }
    public void removeFavoris(Document document) {
        favoris.remove(document);
    }
    public void addKindle(Document document) {
        kindles.add(document);
    }
    public void removeKindle(Document document) {
        kindles.remove(document);
    }
    
    public static int getId() {
        return ID_Adherent;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCNE() {
        return CNE;
    }

    public static void setId(int ID_Adherent) {
        Adherent.ID_Adherent= ID_Adherent;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public List<Document> getFavorites() {
        return favoris;
    }

    public List<Document> getKindles() {
        return kindles;
    }
    
}