
package loginandsignup;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DictionnaireDAO {
    private Connection con;

    public DictionnaireDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterDictionnaire(Dictionnaire m) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into dictionnaire(ISBN,titre,auteurs,editeur,AnneeEdition,URL,langue,NombreDeTomes) "
                + "values ('" + m.getISBN()+ "','" + m.getTitre() + "','"
                + m.getAuteursAsString()+ "','" + m.getEditeur()+ "','" + m.getAnneeEdition() + "','"
                + m.getURL() + "','"  + m.getlangue() + "','" + m.getNombreDeTomes()+ "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Dictionnaire> getAllDictionnaire() throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from dictionnaire");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            Dictionnaire d = new Dictionnaire(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"), rs.getString("langue"), rs.getInt("nombreDeTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByEditeur(String editeur) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from dictionnaire where editeur like '%" + editeur + "%'");

        while (rs.next()) {
            Dictionnaire d = new Dictionnaire(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"), rs.getString("langue"), rs.getInt("nombreDeTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByISBN(String ISBN) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from dictionnaire where ISBN like '%" + ISBN + "%'");

        while (rs.next()) {
            Dictionnaire d = new Dictionnaire(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"), rs.getString("langue"), rs.getInt("nombreDeTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByAuteur(String auteur) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from dictionnaire where auteurs like '%" + auteur + "%'");

      while (rs.next()) {
            Dictionnaire d = new Dictionnaire(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"), rs.getString("langue"), rs.getInt("nombreDeTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByTitre(String titre) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from dictionnaire where titre like '%" + titre + "%'");

      while (rs.next()) {
            Dictionnaire d = new Dictionnaire(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"), rs.getString("langue"), rs.getInt("nombreDeTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public boolean supprimerDictionnaire(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "delete from dictionnaire where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}