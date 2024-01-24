
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class KindleDAO {
    private Connection con;

    public KindleDAO () throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterKindle(Kindle m) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into Kindles(ISBN,titre,auteurs,editeur,URL,type) "
                + "values ('" + m.getISBN()+ "','" + m.getTitre() + "','"
                + m.getAuteursAsString()+ "','" + m.getEditeur()+  "','"
                 + m.getType() +")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Kindle> getAllKindle() throws SQLException {
        LinkedList<Kindle> Kindles = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Kindles");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            Kindle d = new Kindle ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            Kindles.add(d);
        }
        return Kindles;
    }

    public LinkedList<Kindle> getKindleByEditeur(String editeur) throws SQLException {
        LinkedList<Kindle> Kindles = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Kindles where editeur like '%" + editeur + "%'");

          while (rs.next()) {
            Kindle d = new Kindle ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            Kindles.add(d);
        }
        return Kindles;
    }

    public LinkedList<Kindle> getKindleByISBN(String ISBN) throws SQLException {
        LinkedList<Kindle> Kindles = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Kindles where ISBN like '%" + ISBN + "%'");

          while (rs.next()) {
            Kindle d = new Kindle ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            Kindles.add(d);
        }
        return Kindles;
    }

    public LinkedList<Kindle> getKindleByAuteur(String auteur) throws SQLException {
        LinkedList<Kindle> Kindles = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Kindles where auteurs like '%" + auteur + "%'");

        while (rs.next()) {
            Kindle d = new Kindle ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            Kindles.add(d);
        }
        return Kindles;
    }

    public LinkedList<Kindle> getKindleByTitre(String titre) throws SQLException {
        LinkedList<Kindle> Kindles= new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Kindles where titre like '%" + titre + "%'");

        while (rs.next()) {
            Kindle d = new Kindle ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            Kindles.add(d);
        }
        return Kindles;
    }

    public boolean supprimerKindle(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "delete from Kindles where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}