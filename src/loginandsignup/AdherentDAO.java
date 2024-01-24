
package loginandsignup;





import java.sql.*;
import java.util.LinkedList;

public class AdherentDAO {
     private Connection con;

    public AdherentDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterAdherent(Adherent adherent) throws SQLException 
         {  Statement stmt = con.createStatement();
            String query = "INSERT INTO adherents (Username, PASSWORD, CNE)" 
           
                + "values ('" + adherent.getUsername() + "','" + adherent.getPassword() + "','"
                + adherent.getCNE()+"')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
    
    
       
   
    public LinkedList<Adherent> getAdherentByCNE (String Email) throws SQLException {
        LinkedList<Adherent> adherents = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from  adherents  where CNE like '%\" + cne + \"%'\"");

        while (rs.next()) {
            Adherent adherent = new Adherent(rs.getString("Username"), rs.getString("Password"),
                    rs.getString(" CNE"));
          adherents.add(adherent);
        }
        return adherents;
    }
    public LinkedList<Adherent> getAdherentByUsername(String Telephone) throws SQLException {
        LinkedList<Adherent> adherents = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from  adherents where Username = ?");

         while (rs.next()) {
            Adherent adherent = new Adherent(rs.getString("Username"), rs.getString("Password"),
                    rs.getString(" CNE"));
          adherents.add(adherent);
        }
        return adherents;
    }
   

 

    
 public LinkedList<Adherent> getAllAdherent() throws SQLException {
        LinkedList<Adherent> adherents = new LinkedList<Adherent>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from adherents");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            Adherent adherent = new Adherent(rs.getString("Username"), rs.getString("Password"),
                    rs.getString(" CNE"));
          adherents.add(adherent);
        }
        return adherents;
    }
   public boolean supprimerAdherent(String CNE) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "delete from adherents where CNE=" + CNE + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

   
}