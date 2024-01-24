/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;



 import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class MangasDAO {
    private Connection con;

    public MangasDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterManga(Manga B) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into Mangas(ISBN,titre,auteurs,editeur,AnneeEdition,URL,NombreDePages,type,tome,illustrateur) "
                + "values ('" + B.getISBN()+ "','" + B.getTitre() + "','"
                + B.getAuteursAsString()+ "','" + B.getEditeur() + "','" + B.getAnneeEdition() + "','"
                + B.getURL() + "','"  + B.getNombreDePages()+ "','" + B.getType() + "','" + B.getTome() + "','" + B.getIllustrateur()+ "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Manga> getAllManga() throws SQLException {
        LinkedList<Manga> Mangas = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Manga");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            Manga B = new Manga(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome") ,rs.getString("illustrateur"));
            Mangas.add(B);
        }
        return Mangas;
    }
 
    

    public LinkedList<Manga> getMangaByEditeur(String editeur) throws SQLException {
        LinkedList<Manga> Mangas = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Mangas where editeur like '%" + editeur + "%'");

         while (rs.next()) {
            Manga B = new Manga(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome") ,rs.getString("illustrateur"));
            Mangas.add(B);
        }
        return Mangas;
    }

    public LinkedList<Manga> getMangaByISBN(String ISBN) throws SQLException {
        LinkedList<Manga> Mangas = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Mangas where ISBN like '%" + ISBN + "%'");

        while (rs.next()) {
            Manga B = new Manga(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome") ,rs.getString("illustrateur"));
            Mangas.add(B);
        }
        return Mangas;
    }

    public LinkedList<Manga> getMangaByAuteur (String auteur) throws SQLException {
        LinkedList<Manga> Mangas = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from mangas where auteurs like '%" + auteur + "%'");

        while (rs.next()) {
            Manga B = new Manga(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome") ,rs.getString("illustrateur"));
            Mangas.add(B);
        }
        return Mangas;
    }

    public LinkedList<Manga> getMangaByTitre(String titre) throws SQLException {
        LinkedList<Manga> Mangas = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from mangas where titre like '%" + titre + "%'");

        while (rs.next()) {
            Manga B = new Manga(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome") ,rs.getString("illustrateur"));
            Mangas.add(B);
        }
        return Mangas;
    }




    public boolean supprimerManga(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
  
      String query = "delete from mangas where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}
