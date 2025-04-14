/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import application_java_mysql.controller.NoteController;
import java.sql.Statement;  // Utilisez java.sql.Statement


import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;



public class Gestion_des_notes extends javax.swing.JFrame {

    NoteController controller = new NoteController();

    Statement stm;
    ResultSet RS ;
    DefaultTableModel model = new DefaultTableModel();
    public Gestion_des_notes() {
        initComponents();
        model.addColumn("id");
        model.addColumn("nom");
         model.addColumn("prenom");
          model.addColumn("branche");
           model.addColumn("note");
           try {
           stm = controller.getStatement();

            ResultSet RS=stm.executeQuery("select * from etudient");
            while(RS.next()){
            model.addRow(new Object[]{RS.getString("id"),RS.getString("nom"),RS.getString("prenom"),RS.getString("branche"),RS.getString("note")});}
            
        } catch (Exception e) {System.err.println(e);
        }tble.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void afficher(){ try {
                 model.setRowCount(0);
           stm = controller.getStatement();

            ResultSet RS=stm.executeQuery("select * from etudient");
            while(RS.next()){
            model.addRow(new Object[]{RS.getString("id"),RS.getString("nom"),RS.getString("prenom"),RS.getString("branche"),RS.getString("note")});}
            
        } catch (Exception e) {System.err.println(e);
        }tble.setModel(model);}
    private void deplacer (int i){
        try {
            txtid.setText(model.getValueAt(i, 0).toString());
              txtno.setText(model.getValueAt(i, 1).toString());
                txtpr.setText(model.getValueAt(i, 2).toString());
                  txtbr.setSelectedItem(model.getValueAt(i, 3).toString());
                    txtnot.setText(model.getValueAt(i, 4).toString());
            
        } catch (Exception e) {System.err.println(e);
        JOptionPane.showMessageDialog(null, "erreur de deplacement"+e.getLocalizedMessage());
        }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnot = new javax.swing.JTextField();
        txtbr = new javax.swing.JComboBox<>();
        txtpr = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tble);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 100, 300, 210);

        jButton1.setBackground(new java.awt.Color(140, 140, 140));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_java_mysql/icone/recherche2.jpg"))); // NOI18N
        jButton1.setText("Recherche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 370, 170, 30);

        jButton2.setBackground(new java.awt.Color(140, 140, 140));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_java_mysql/icone/supprimer.jpg"))); // NOI18N
        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 370, 140, 30);

        jButton3.setBackground(new java.awt.Color(140, 140, 140));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_java_mysql/icone/ajouter.jpg"))); // NOI18N
        jButton3.setText("Ajouter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 330, 140, 30);

        jButton4.setBackground(new java.awt.Color(140, 140, 140));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(170, 370, 130, 30);

        jButton5.setBackground(new java.awt.Color(140, 140, 140));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_java_mysql/icone/actualiser.jpg"))); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(170, 330, 140, 30);
        getContentPane().add(txtre);
        txtre.setBounds(490, 360, 120, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Gestion des notes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 10, 360, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 57, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nom:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 140, 57, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Prenom:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 57, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Branche:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 57, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Note:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 230, 57, 16);

        txtnot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtnot);
        txtnot.setBounds(90, 230, 110, 20);

        txtbr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DSI", "SE", "CPI", "PME" }));
        getContentPane().add(txtbr);
        txtbr.setBounds(110, 200, 72, 22);

        txtpr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtpr);
        txtpr.setBounds(80, 170, 120, 20);

        txtno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtno);
        txtno.setBounds(90, 140, 120, 20);

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtid);
        txtid.setBounds(80, 100, 120, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_java_mysql/icone/w2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 630, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
    model.setRowCount(0); // vider le tableau

    String recherche = txtre.getText();
    String query = "SELECT * FROM etudient WHERE "
                 + "id LIKE '%" + recherche + "%' OR "
                 + "nom LIKE '%" + recherche + "%' OR "
                 + "prenom LIKE '%" + recherche + "%' OR "
                 + "branche LIKE '%" + recherche + "%' OR "
                 + "note LIKE '%" + recherche + "%'";

    RS = stm.executeQuery(query);

    while (RS.next()) {
        Object[] etudient = {
            RS.getString("id"),
            RS.getString("nom"),
            RS.getString("prenom"),
            RS.getString("branche"),
            RS.getString("note")
        };
        model.addRow(etudient);
    }

    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Aucun étudiant trouvé");
    } else {
        int i = 0;
        deplacer(i);
    }

}  catch (Exception e) {  JOptionPane.showMessageDialog(null, "Erreur de recherche : " + e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if(JOptionPane.showConfirmDialog(null,"Voulez-vous supprimer l'etudient",
                    "supprimer etudient",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if (txtid.getText().length()!=0){
                stm.executeUpdate("Delete From etudient where id="+txtid.getText());afficher();}
                else{JOptionPane.showMessageDialog(null, "Veuillez remplir le champs id");}
                
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "erreur de suppression"+e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleMouseClicked
        try {
            int i =tble.getSelectedRow();deplacer(i);
            
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Erreur de deplacement"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_tbleMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String id =txtid.getText();
String nom =txtno.getText();
String prenom =txtpr.getText();
String branche =txtbr.getSelectedItem().toString();
String note =txtnot.getText();
String requete="insert into etudient(id,Nom,prenom,branche,note)Values('"+id+"','"+nom+"','"+prenom+"','"+branche+"','"+note+"')";
        try {
            stm.executeUpdate(requete);
            JOptionPane.showMessageDialog(null,"l'etudient est bien ajoute");
            txtno.setText("");
            txtpr.setText("");
            txtbr.setSelectedItem(2);
            txtnot.setText("");afficher();
            
        } catch (Exception ex) {JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            afficher();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if(JOptionPane.showConfirmDialog(null, "Confirmer la modification","modification",JOptionPane.YES_NO_CANCEL_OPTION)
                    ==JOptionPane.OK_OPTION){
            stm.executeUpdate("Update etudient Set nom ='"+txtpr.getText()+"',branche='"+txtbr.getSelectedItem().toString()
                    +"',note='"+txtnot.getText()+"'where id="+txtid.getText());afficher();}
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur de modifier"+e.getMessage());
      System.err.println(e);  }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_des_notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tble;
    private javax.swing.JComboBox<String> txtbr;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtnot;
    private javax.swing.JTextField txtpr;
    private javax.swing.JTextField txtre;
    // End of variables declaration//GEN-END:variables
}
