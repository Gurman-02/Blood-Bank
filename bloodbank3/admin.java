/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbank3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gurmanjit
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    void table_update(){
     int c;
      DefaultTableModel tm=(DefaultTableModel) jTable1.getModel();
      tm.setRowCount(0);
        try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://"
                        + "localhost:3307/bloodbank", "root", "gurman");//Establishing connection
                System.out.println("Connected With the database successfully"); //Message after successful connection
                //System.out.println("DRIVER LOADED SUCCESSFULLYyyyyyyyy");
                PreparedStatement preparedStatement =connection.prepareStatement("select name, phone_no,address,email,bloodType,date from infoblood ");
                ResultSet resultSet=preparedStatement.executeQuery();

                while(resultSet.next()){
                             String name=resultSet.getString("name");
                             String phone=resultSet.getString("phone_no");
                             String address=resultSet.getString("address");
                             String email=resultSet.getString("email");
                             String bloodgp=resultSet.getString("bloodType");
                             String date=resultSet.getString("date");

                             
                             Object rec[]={name,phone,address,email,bloodgp,date};
                             tm.addRow(rec);
           }
           }
           catch(SQLException e) {
            System.out.println("DRIVER FAILED TO LOAD ");
            System.out.println(e.getMessage());
        }
         }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("SHOW ALL THE STOCK AVAILABLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 340, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PHONE NO.", "ADDRESS", "EMAIL", "BLOOD GROUP", "DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 560, 402));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 60, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("EMAIL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 60, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 190, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 190, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("DELETE THIS RECORD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 240, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("                 BACK");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 740, 240, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank3/FOR ADMIN (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm=(DefaultTableModel) jTable1.getModel();
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bloodbank", "root", "gurman");//Establishing connection
            System.out.println("Connected With the database successfully"); //Message after successful connection
           // System.out.println("DRIVER LOADED SUCCESSFULLYyyyyyyyy");
            PreparedStatement preparedStatement =connection.prepareStatement("select name, phone_no,address,email,bloodType,date from infoblood ");
            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                String name=resultSet.getString("name");
                String phone=resultSet.getString("phone_no");
                String address=resultSet.getString("address");
                String email=resultSet.getString("email");
                String bloodgp=resultSet.getString("bloodType");
                String date=resultSet.getString("date");
            
                Object rec[]={name,phone,address,email,bloodgp,date};
                tm.addRow(rec);
            }
        }
        catch(SQLException e) {
            System.out.println("DRIVER FAILED TO LOAD ");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tm=(DefaultTableModel) jTable1.getModel();
        int index=jTable1.getSelectedRow();

        jTextField1.setText(tm.getValueAt(index,0).toString());
        jTextField2.setText(tm.getValueAt(index,3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm=(DefaultTableModel) jTable1.getModel();
        int index=jTable1.getSelectedRow();
        try{
            String email=tm.getValueAt(index,3).toString();
            int dialogResult=JOptionPane.showConfirmDialog(null, "DO YOU WANT TO DELETE THIS RECORD?","Warning",JOptionPane.YES_NO_CANCEL_OPTION);
            if(dialogResult==JOptionPane.YES_OPTION){
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bloodbank", "root", "gurman");
                PreparedStatement preparedStatement =connection.prepareStatement("delete from infoblood where email=?");
                preparedStatement.setString(1,email);

                preparedStatement.executeUpdate();
                table_update();
                JOptionPane.showMessageDialog(null,"record deleted");
                
            }
        }
        catch(SQLException e) {
            System.out.println("DRIVER FAILED TO LOAD ");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        welcome2 wc2=new welcome2();
        wc2.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}