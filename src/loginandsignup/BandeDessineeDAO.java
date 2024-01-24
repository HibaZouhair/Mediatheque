
package loginandsignup;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BandeDessineeDAO {
    private Connection con;

    public BandeDessineeDAO () throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterBandeDessinee(BandeDessinee B) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into bandedessinee(ISBN,titre,auteurs,editeur,AnneeEdition,URL,NombreDePages,type,tome,illustrateur) "
                + "values ('" + B.getISBN()+ "','" + B.getTitre() + "','"
                + B.getAuteursAsString()+ "','" + B.getEditeur() + "','" + B.getAnneeEdition() + "','"
                + B.getURL() + "','"  + B.getNombreDePages()+ "','" + B.getType() + "','" + B.getTome() + "','" + B.getIllustrateur()+ "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<BandeDessinee> getAllBandeDessinee() throws SQLException {
        LinkedList<BandeDessinee> BandeDessinees = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from bandedessinee");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            BandeDessinee B = new BandeDessinee (rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome") ,rs.getString("illustrateur"));
            BandeDessinees.add(B);
        }
        return BandeDessinees;
    }
 
    

    public LinkedList<BandeDessinee> getBandeDessineeeByEditeur(String editeur) throws SQLException {
        LinkedList<BandeDessinee> BandeDessinees = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from bandedessinee where editeur like '%" + editeur + "%'");

        while (rs.next()) {
           BandeDessinee B = new BandeDessinee(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"),rs.getString("illustrateur"));
            BandeDessinees.add(B);
        }
        return BandeDessinees;
    }

    public LinkedList<BandeDessinee> getBandeDessineeByISBN(String ISBN) throws SQLException {
        LinkedList<BandeDessinee> BandeDessinees = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from bandedessinee where ISBN like '%" + ISBN + "%'");

          while (rs.next()) {
           BandeDessinee B = new BandeDessinee(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"),rs.getString("illustrateur"));
            BandeDessinees.add(B);
        }
        return BandeDessinees;
    }

    public LinkedList<BandeDessinee> getBandeDessineeByAuteur (String auteur) throws SQLException {
        LinkedList<BandeDessinee> BandeDessinees = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from bandedessinee where auteurs like '%" + auteur + "%'");

        while (rs.next()) {
           BandeDessinee B = new BandeDessinee(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"),rs.getString("illustrateur"));
            BandeDessinees.add(B);
        }
        return BandeDessinees;
    }

    public LinkedList<BandeDessinee> getBandeDessineeByTitre(String titre) throws SQLException {
        LinkedList<BandeDessinee> BandeDessinees = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from bandedessinee where titre like '%" + titre + "%'");

         while (rs.next()) {
           BandeDessinee B = new BandeDessinee(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"),rs.getString("illustrateur"));
            BandeDessinees.add(B);
        }
        return BandeDessinees;
    }




    public boolean supprimerBandeDessinee(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
  
      String query = "delete from bandedessinee where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}