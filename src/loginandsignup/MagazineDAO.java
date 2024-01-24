/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class MagazineDAO {
    private Connection con;

    public MagazineDAO () throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterMagazine(Magazine M) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into magazines (ISBN,titre,auteurs,editeur,AnneeEdition,URL,periodicite,numeroEdition,day) "
                + "values ('" + M.getISBN()+ "','" + M.getTitre() + "','"
                + M.getAuteursAsString()+ "','" + M.getEditeur() + "','" + M.getAnneeEdition() + "','"
                + M.getURL() + "','"  + "','" + M.getPeriodicite() + "','" + M.getNumeroEdition() + M.getDay()+ "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Magazine> getAllMagazine() throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from magazines");
//       

        while (rs.next()) {
            Magazine M = new Magazine(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("periodicite") , rs.getString("NumeroEdition"),rs.getString("day"));
            magazines.add(M);
        }
        return magazines;
    }
 
    

    public LinkedList<Magazine> getMagazineByEditeur(String editeur) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from magazines where editeur like '%" + editeur + "%'");

       while (rs.next()) {
            Magazine M = new Magazine(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("periodicite") , rs.getString("NumeroEdition"),rs.getString("day"));
           magazines.add(M);
        }
        return magazines;
    }

    public LinkedList<Magazine> getMagazineByISBN(String ISBN) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from magazines where ISBN like '%" + ISBN + "%'");

       while (rs.next()) {
            Magazine M = new Magazine(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("periodicite") , rs.getString("NumeroEdition"),rs.getString("day"));
           magazines.add(M);
        }
        return magazines;
    }

    public LinkedList<Magazine> getMagazineByAuteur (String auteur) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from magazines where auteurs like '%" + auteur + "%'");

  while (rs.next()) {
            Magazine M = new Magazine(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("periodicite") , rs.getString("NumeroEdition"),rs.getString("day"));
            magazines.add(M);
        }
        return magazines;
    }

    public LinkedList<Magazine> getMagazineByTitre(String titre) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from magazines where titre like '%" + titre + "%'");

        while (rs.next()) {
            Magazine M = new Magazine(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("periodicite") , rs.getString("NumeroEdition"),rs.getString("day"));
            magazines.add(M);
        }
        return magazines;
    }




    public boolean supprimerMagazine(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
  
      String query = "delete from magazines where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}