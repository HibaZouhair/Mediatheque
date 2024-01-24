/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class LivreDAO {
    private Connection con;

    public LivreDAO () throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterLivre(Livre l) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into livres(ISBN,titre,auteurs,editeur,AnneeEdition,URL,NombreDePages,type,tome) "
                + "values ('" + l.getISBN()+ "','" + l.getTitre() + "','"
                + l.getAuteursAsString()+ "','" + l.getEditeur() + "','" + l.getAnneeEdition() + "','"
                + l.getURL() + "','"  + l.getNombreDePages()+ "','" + l.getType() + "','" + l.getTome() + "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Livre> getAllLivre() throws SQLException {
        LinkedList<Livre> dictionnaires = new LinkedList<Livre>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from livres");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"));
            dictionnaires.add(l);
        }
        return dictionnaires;
    }
 
    

    public LinkedList<Livre> getLivreByEditeur(String editeur) throws SQLException {
        LinkedList<Livre> dictionnaires = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from livres where editeur like '%" + editeur + "%'");

        while (rs.next()) {
            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"));
            dictionnaires.add(l);
        }
        return dictionnaires;
    }

    public LinkedList<Livre> getLivreByISBN(String ISBN) throws SQLException {
        LinkedList<Livre> Livres = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from livres where ISBN like '%" + ISBN + "%'");

         while (rs.next()) {
            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"));
            Livres.add(l);
        }
        return Livres;
    }

    public LinkedList<Livre> getLivreByAuteur (String auteur) throws SQLException {
        LinkedList<Livre> Livres = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from livres where auteurs like '%" + auteur + "%'");

         while (rs.next()) {
            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"));
            Livres.add(l);
        }
        return Livres;
    }

    public LinkedList<Livre> getLivreByTitre(String titre) throws SQLException {
        LinkedList<Livre> Livres = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select* from livres where titre like '%" + titre + "%'");

        while (rs.next()) {
            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("type") , rs.getInt("NombreDePages"),rs.getInt("tome"));
            Livres.add(l);
        }
        return Livres;
    }




    public boolean supprimerLivre(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
  
      String query = "delete from livres where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}