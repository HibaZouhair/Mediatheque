/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;

/**
 *
 * @author Admin
 */
public class AjouterDictionnaire extends javax.swing.JFrame {

    /**
     * Creates new form AjouterDictionnaire
     */
    public AjouterDictionnaire() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        ajouterDictionnaire = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        URL = new javax.swing.JTextField();
        ISBN = new javax.swing.JTextField();
        titre = new javax.swing.JTextField();
        auteurs = new javax.swing.JTextField();
        editeur = new javax.swing.JTextField();
        AnneeEdition = new javax.swing.JTextField();
        NombreDeTomes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Langue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 50, 110, 50);

        ajouterDictionnaire.setBackground(new java.awt.Color(51, 51, 51));
        ajouterDictionnaire.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ajouterDictionnaire.setForeground(new java.awt.Color(255, 255, 255));
        ajouterDictionnaire.setText("Ajouter");
        jPanel1.add(ajouterDictionnaire);
        ajouterDictionnaire.setBounds(620, 50, 130, 50);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ajouter dictionnaire");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(230, 40, 330, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginandsignup/bookshelf.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, -40, 740, 160);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("URL");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 140, 100, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ISBN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 200, 100, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("titre");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 260, 100, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("auteurs");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 310, 100, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("editeur");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 140, 100, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AnneeEdition");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(380, 190, 100, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NombreDeTomes");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(380, 240, 130, 40);
        jPanel1.add(URL);
        URL.setBounds(160, 150, 180, 22);
        jPanel1.add(ISBN);
        ISBN.setBounds(160, 210, 180, 22);
        jPanel1.add(titre);
        titre.setBounds(160, 270, 180, 22);
        jPanel1.add(auteurs);
        auteurs.setBounds(160, 320, 180, 22);
        jPanel1.add(editeur);
        editeur.setBounds(510, 150, 190, 22);
        jPanel1.add(AnneeEdition);
        AnneeEdition.setBounds(510, 200, 190, 22);
        jPanel1.add(NombreDeTomes);
        NombreDeTomes.setBounds(510, 250, 190, 22);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Langue");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(420, 290, 110, 40);
        jPanel1.add(Langue);
        Langue.setBounds(510, 300, 190, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dictionnaire DictionnaireFrame = new Dictionnaire();
        DictionnaireFrame.setVisible(true);
        DictionnaireFrame.pack();
        DictionnaireFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjouterDictionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterDictionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterDictionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterDictionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterDictionnaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnneeEdition;
    private javax.swing.JTextField ISBN;
    private javax.swing.JTextField Langue;
    private javax.swing.JTextField NombreDeTomes;
    private javax.swing.JTextField URL;
    private javax.swing.JButton ajouterDictionnaire;
    private javax.swing.JTextField auteurs;
    private javax.swing.JTextField editeur;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField titre;
    // End of variables declaration//GEN-END:variables
}
