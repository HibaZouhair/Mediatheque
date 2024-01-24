/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

import java.util.List;

public class Magazine extends Document {
    private String  periodicite;
    private String numeroEdition; 
    private String day;

   
    public Magazine(String ISBN, String titre, List<String>auteurs, String editeur, String anneeEdition, String URL,String periodicite, String  numeroEdition,String day) {
        super(ISBN, titre, auteurs, editeur, anneeEdition, URL);
        this.periodicite = periodicite;
        this.numeroEdition = numeroEdition;
        this.day=day;
    }

  
    public String getPeriodicite() {
        return periodicite;
    }

   
    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    
    public String getNumeroEdition() {
        return numeroEdition;
    }

   
    public void setNumeroEdition(String numeroEdition) {
        this.numeroEdition = numeroEdition;
    }
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    @Override
    public String toString() {
        return "com.mycompany.mediatheque.MagazineDAO {" +
                super.toString() +
                "Periodicite='" + periodicite + '\'' +
                ", numeroEdition='" + numeroEdition + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    @Override
    public Document ajouterDocument() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}