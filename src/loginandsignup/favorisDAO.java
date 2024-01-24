/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class favorisDAO {
    private Connection con;

    public favorisDAO () throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterfavoris(favoris m) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into favoris(ISBN,titre,auteurs,editeur,URL,type) "
                + "values ('" + m.getISBN()+ "','" + m.getTitre() + "','"
                + m.getAuteursAsString()+ "','" + m.getEditeur()+  "','"
                 + m.getType() +")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<favoris> getAllfavoris() throws SQLException {
        LinkedList<favoris> favoris = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from favoris");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            favoris d = new favoris ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            favoris.add(d);
        }
        return favoris;
    }

    public LinkedList<favoris> getfavorisByEditeur(String editeur) throws SQLException {
        LinkedList<favoris> favoris = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from favoris where editeur like '%" + editeur + "%'");

          while (rs.next()) {
            favoris d = new favoris ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            favoris.add(d);
        }
        return favoris;
    }

    public LinkedList<favoris> getfavorisByISBN(String ISBN) throws SQLException {
        LinkedList<favoris> favoris = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from favoris where ISBN like '%" + ISBN + "%'");

          while (rs.next()) {
            favoris d = new favoris ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            favoris.add(d);
        }
        return favoris;
    }

    public LinkedList<favoris> getfavorisByAuteur(String auteur) throws SQLException {
        LinkedList<favoris> favoris = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from favoris where auteurs like '%" + auteur + "%'");

        while (rs.next()) {
           favoris d = new favoris ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            favoris.add(d);
        }
        return favoris;
    }

    public LinkedList<favoris> getfavorisByTitre(String titre) throws SQLException {
        LinkedList<favoris> favoris= new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from favoris where titre like '%" + titre + "%'");

        while (rs.next()) {
            favoris d = new favoris ( rs.getString("type"),rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur")
                     );
            favoris.add(d);
        }
        return favoris;
    }

    public boolean supprimerfavoris(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "delete from favoris where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}
