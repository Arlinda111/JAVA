/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.delete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sun.org.mozilla.javascript.internal.ScriptRuntime.delete;

/**
 *
 * @author user
 */
public class admin extends javax.swing.JFrame {
class shfaq{
    public void delete(){
              try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/project","root","");
            Statement statement=con.createStatement();
            statement.executeUpdate("delete from pacienti WHERE Emer=("+"\""+ jTextField1.getText()
    +"\""+")");
            JOptionPane.showMessageDialog(null,"pacienti u fshi");
            statement.close();
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void filljtable2()
        {
          try {
      int c;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/project", "root", "");  //projekti=database name;
     PreparedStatement pst;
   
       pst=con1.prepareStatement("select * from pacienti");
        ResultSet rs = pst.executeQuery();
       
        ResultSetMetaData rsd = rs.getMetaData();
        c=rsd.getColumnCount();
       
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        while(rs.next()){
      //data will be added until finish
     String stuemer=rs.getString("pacient_ID");
      String stumbiemer=rs.getString("Emer");
      String stunrmartikullimi=rs.getString("Nr_dhomes");
      String studega=rs.getString("Emri_doktorit");
     
     
  String tbData[] = {stuemer,stumbiemer,stunrmartikullimi,studega};
 
      //tblModel.setRowCount(0);
      tblModel.addRow(tbData);
     }
       con1.close();


        } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);      

        }
        }
    
    public void search() {
              try {
      int c;
      int k=0;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/project", "root", "");  //projekti=database name;
     PreparedStatement pst;
   
       pst=con1.prepareStatement("select * from pacienti WHERE Emer="+"\""+ jTextField1.getText() +"\""+"");
        ResultSet rs = pst.executeQuery();
       
        ResultSetMetaData rsd = rs.getMetaData();
        c=rsd.getColumnCount();
       
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        while(rs.next()){
      String stuemer=rs.getString("pacient_ID");
      String stumbiemer=rs.getString("Emer");
      String stunrmartikullimi=rs.getString("Nr_dhomes");
      String studega=rs.getString("Emri_doktorit");
            k=1;
     
     
     
  String tbData[] = {stuemer,stumbiemer,stunrmartikullimi,studega};
 
      //tblModel.setRowCount(0);
      tblModel.addRow(tbData);
     }
    if(k!=1)
    {
         shfaq w=new shfaq();
        w.filljtable2();
         JOptionPane.showMessageDialog(null, "NUK KA PACIENT ME KETE EMER");  
    }
       
       con1.close();
              
              
        } 
              catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);      

        }
    }   
        }
    public admin() {
        initComponents();
    
 try {
      int c;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/project", "root", "");  //projekti=database name;
     PreparedStatement pst;
   
       pst=con1.prepareStatement("select * from pacienti");
        ResultSet rs = pst.executeQuery();
       
        ResultSetMetaData rsd = rs.getMetaData();
        c=rsd.getColumnCount();
       
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        while(rs.next()){
      //data will be added until finish
      String stuemer=rs.getString("pacient_ID");
      String stumbiemer=rs.getString("Emer");
      String stunrmartikullimi=rs.getString("Nr_dhomes");
      String studega=rs.getString("Emri_doktorit");
     
     
  String tbData[] = {stuemer,stumbiemer,stunrmartikullimi,studega};
 
      //tblModel.setRowCount(0);
      tblModel.addRow(tbData);
     }
       con1.close();


        } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);      

        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_pacientit", "Emri_pacientit", "Nr_dhomes", "Emri_doktorit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("SHkruaj emrin e pacientit:");

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      setVisible(false);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        shfaq w=new shfaq();
        w.search();
            
       try {
      FileWriter emri = new FileWriter("pacienti.txt");
    emri.write("Pacienti:");
    emri.write(jTextField1.getText());
     

      emri.close();
   
      System.out.println("Te dhenat u ruajten.");
    }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
shfaq d=new shfaq();
d.delete();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
