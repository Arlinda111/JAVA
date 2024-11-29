/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.admin.shfaq;

/**
 *
 * @author user
 */
public class dhoma extends javax.swing.JFrame {
class shfaq{
    public void search() {
        
              try {
      int c;
      int k=0;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/project", "root", "");  //projekti=database name;
     PreparedStatement pst;
   
       pst=con1.prepareStatement("select * from pacienti WHERE Emri_doktorit="+"\""+ jTextField1.getText() +"\""+"");
        ResultSet rs = pst.executeQuery();
       
        ResultSetMetaData rsd = rs.getMetaData();
        c=rsd.getColumnCount();
       
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        while(rs.next()){
      
            k=1;
       String stuemer=rs.getString("Emer");
      String stumbiemer=rs.getString("Gr_gjakut");
      String stunrmartikullimi=rs.getString("Diagnostikuar");
      String studega=rs.getString("Nr_dhomes");
     
     
  String tbData[] = {stuemer,stumbiemer,stunrmartikullimi,studega};
 
      //tblModel.setRowCount(0);
      tblModel.addRow(tbData);
     }
    if(k!=1)
    {
         shfaq w=new shfaq();
        w.filljtable2();
         JOptionPane.showMessageDialog(null, "nuk ke asnje pacient");  
    }
       
       con1.close();
              
              
        } 
              catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);      

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
      String stuemer=rs.getString("Emer");
      String stumbiemer=rs.getString("Gr_gjakut");
      String stunrmartikullimi=rs.getString("Diagnostikuar");
      String studega=rs.getString("Nr_dhomes");
     
     
  String tbData[] = {stuemer,stumbiemer,stunrmartikullimi,studega};
 
      //tblModel.setRowCount(0);
      tblModel.addRow(tbData);
     }
       con1.close();


        } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);      

        }
        
    }
}
    public dhoma() {
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
      
      String stuemer=rs.getString("Emer");
      String stumbiemer=rs.getString("Gr_gjakut");
      String stunrmartikullimi=rs.getString("Diagnostikuar");
      String studega=rs.getString("Nr_dhomes");
     
     
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

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        panel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Shkruaj emrin tend:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Emrat_pacienteve", "Gr_gjakut", "Diagnostikuar", "Nr_dhomes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(113, 113, 113))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         shfaq w=new shfaq();
        w.search();
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
            java.util.logging.Logger.getLogger(dhoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dhoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dhoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dhoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dhoma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
