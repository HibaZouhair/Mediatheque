
package loginandsignup;

import java.sql.*;
import java.util.LinkedList;

public class EmpruntDAO {
    private Connection con;

    public EmpruntDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterEmprunt(Emprunt e) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into emprunts(document,adherent) "
                + "values ('" + e.getDocumentIsbn() + "','" + e.getEmprunteurId() + "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Emprunt> getAllEmprunt() throws SQLException {
        LinkedList<Emprunt> emprunts = new LinkedList<Emprunt>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from emprunts");

        while (rs.next()) {
            Emprunt e = new Emprunt(rs.getString("document"), rs.getString("adherent"));
            emprunts.add(e);
        }
        return emprunts;
    }
      public boolean supprimerEmprunt(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "delete from emprunts where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}