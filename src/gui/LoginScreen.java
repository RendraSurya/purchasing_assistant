/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;

/**
 *
 * @author Windows 10
 */
public class LoginScreen extends javax.swing.JFrame {
    Connection connection;
    Statement stmt;
    ResultSet rsEmployee;
    
    public LoginScreen() {
        initComponents();
        getContentPane().requestFocusInWindow();
        this.setIconImage(new ImageIcon(getClass().getResource("/image/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noPgwTxt = new javax.swing.JTextField();
        passPgwTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchasing Assistant");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noPgwTxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        noPgwTxt.setForeground(new java.awt.Color(153, 153, 153));
        noPgwTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        noPgwTxt.setText("Nomor Pegawai");
        noPgwTxt.setBorder(null);
        noPgwTxt.setName("noPgwTxt"); // NOI18N
        noPgwTxt.setOpaque(false);
        noPgwTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noPgwTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                noPgwTxtFocusLost(evt);
            }
        });
        getContentPane().add(noPgwTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 340, 265, 40));

        passPgwTxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        passPgwTxt.setForeground(new java.awt.Color(153, 153, 153));
        passPgwTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passPgwTxt.setText("Password");
        passPgwTxt.setToolTipText("");
        passPgwTxt.setBorder(null);
        passPgwTxt.setName("passPgwTxt"); // NOI18N
        passPgwTxt.setOpaque(false);
        passPgwTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passPgwTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passPgwTxtFocusLost(evt);
            }
        });
        getContentPane().add(passPgwTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 410, 265, 40));

        loginBtn.setBackground(new java.awt.Color(0, 153, 51));
        loginBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginBtn.setBorder(null);
        loginBtn.setLabel("Login");
        loginBtn.setName("loginBtn"); // NOI18N
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 120, 38));

        BG.setForeground(new java.awt.Color(153, 153, 153));
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }
    
    private void noPgwTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noPgwTxtFocusGained
        // TODO add your handling code here:
        if(noPgwTxt.getText().equalsIgnoreCase("Nomor Pegawai")){
            noPgwTxt.setText("");
        }
    }//GEN-LAST:event_noPgwTxtFocusGained

    private void noPgwTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noPgwTxtFocusLost
        // TODO add your handling code here:
        if(noPgwTxt.getText().equals("")){
            noPgwTxt.setText("Nomor Pegawai");
        }
    }//GEN-LAST:event_noPgwTxtFocusLost

    private void passPgwTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passPgwTxtFocusGained
        // TODO add your handling code here:
        if(passPgwTxt.getText().equalsIgnoreCase("Password")){
            passPgwTxt.setText("");
        }
    }//GEN-LAST:event_passPgwTxtFocusGained

    private void passPgwTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passPgwTxtFocusLost
        // TODO add your handling code here:
        if(passPgwTxt.getText().equals("")){
            passPgwTxt.setText("Password");
        }
    }//GEN-LAST:event_passPgwTxtFocusLost

    public boolean validateUser(String username, String password){
        try{
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + "D:/PurchasingAssistant.accdb;","", "");
            System.out.println("Berhasil konek");
                    stmt = connection.createStatement();
            rsEmployee = stmt.executeQuery("SELECT * FROM Employee");
            while(rsEmployee.next()){
                if((rsEmployee.getString("employeeID").equals(username)&&rsEmployee.getString("password").equals(password))){
                    return true;
                }
            } 
        }
        catch(SQLException errMsg)
        {
            System.out.println(errMsg.getMessage());
        }
        return false;
        //this.dispose();
    }
    
    public boolean isNumeric(String s){
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField noPgwTxt;
    private javax.swing.JPasswordField passPgwTxt;
    // End of variables declaration//GEN-END:variables
}
