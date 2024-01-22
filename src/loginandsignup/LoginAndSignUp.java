
package loginandsignup;

import loginandsignup.adherents.model.Adherent;
import loginandsignup.documents.model.Dictionnaire;
import loginandsignup.documents.model.Document;
import loginandsignup.documents.model.Livre;
import loginandsignup.documents.model.Magazine;
import loginandsignup.emprunts.model.Emprunt;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginAndSignUp extends javax.swing.JFrame{
    LoginAndSignUP mediatheque;

   
    public static void main(String[] args) {
      
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        
    }
    
}   
