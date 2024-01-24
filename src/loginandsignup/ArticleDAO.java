
package loginandsignup;



import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ArticleDAO {
    private Connection con;

    public ArticleDAO () throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque ",
                "root", "");
    }

    public boolean ajouterArticle(Article A) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into articles(ISBN,titre,auteurs,editeur,AnneeEdition,URL,journal) "
                + "values ('" + A.getISBN()+ "','" + A.getTitre() + "','"
                + A.getAuteursAsString()+ "','" + A.getEditeur() + "','" + A.getAnneeEdition() + "','"
                + A.getURL() + "','"  + A.getJournal()+ "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Article> getAllArticle() throws SQLException {
        LinkedList<Article> articles = new LinkedList<Article>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from articles");
//        ResultSet rs = stmt.executeQuery("select * from Magazine where modele like '" + modele + "%'");

        while (rs.next()) {
            Article A = new Article(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("journal"));
            articles.add(A);
        }
        return articles;
    }
 
    

    public LinkedList<Article> getArticleByEditeur(String editeur) throws SQLException {
        LinkedList<Article> articles = new LinkedList<Article>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from articles where editeur like '%" + editeur + "%'");

        while (rs.next()) {
            Article A = new Article(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("journal"));
            articles.add(A);
        }
        return articles;
    }

    public LinkedList<Article> getArticleByISBN(String ISBN) throws SQLException {
        LinkedList<Article> articles = new LinkedList<Article>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from articles where ISBN like '%" + ISBN + "%'");

       while (rs.next()) {
            Article A = new Article(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("journal"));
            articles.add(A);
        }
        return articles;
    }

    public LinkedList<Article> getArticleByAuteur (String auteur) throws SQLException {
        LinkedList<Article> articles = new LinkedList<Article>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from articles where auteurs like '%" + auteur + "%'");

        while (rs.next()) {
            Article A = new Article(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("journal"));
            articles.add(A);
        }
        return articles;
    }

    public LinkedList<Article> getArticleByTitre(String titre) throws SQLException {
        LinkedList<Article> articles= new LinkedList<Article>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from articles where titre like '%" + titre + "%'");

        while (rs.next()) {
            Article A = new Article(rs.getString("ISBN"), rs.getString("titre"),
                    List.of(rs.getString("auteurs").split("; ")), rs.getString("editeur"), rs.getString("anneeedition")
                    , rs.getString("URL"),rs.getString("journal"));
            articles.add(A);
        }
        return articles;
    }




    public boolean supprimerArticle (String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "delete from articles where ISBN=" + ISBN + ")";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }
}
