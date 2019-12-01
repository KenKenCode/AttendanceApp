package attendanceappplusplus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;

/**
 *
 * @author Ken
 */
public class AdminLogIn extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rsa = null;

    /**
     * Creates new form AdminLogIn
     */
    public AdminLogIn() {
        initComponents();
        CurrentDate();
        this.setLocationRelativeTo(null);
    }
    
    public void CurrentDate() {
        //For displaying the date
        Calendar dateandtimeone = new GregorianCalendar();
        int month = dateandtimeone.get(Calendar.MONTH);
        int year = dateandtimeone.get(Calendar.YEAR);
        int day = dateandtimeone.get(Calendar.DAY_OF_MONTH);

        MenuCurrentDate.setText((month + 1) + "/" + day+ "/" + year);
        
        /*
        int second = dateandtimeone.get(Calendar.SECOND);
        int minute = dateandtimeone.get(Calendar.MINUTE);
        int hour = dateandtimeone.get(Calendar.HOUR);
        
        MenuCurrentTime.setText(hour + ":" + minute + ":" + second);
         */
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
        jLabel2 = new javax.swing.JLabel();
        usernameadminlogintext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordadminloginpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuCurrentDate = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(108, 122, 137));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign-in to your admin account");

        usernameadminlogintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameadminlogintextActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        passwordadminloginpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordadminloginpassActionPerformed(evt);
            }
        });
        passwordadminloginpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordadminloginpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordadminloginpassKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        jButton1.setText("Sign-in");
        jButton1.setToolTipText("Sign-in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(240, 248, 255));
        label1.setText("Admin Sign In");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Only view records");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameadminlogintext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordadminloginpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usernameadminlogintext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(passwordadminloginpass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
        );

        jMenu1.setText("Language");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        MenuCurrentDate.setText("Current date");
        MenuCurrentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCurrentDateActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuCurrentDate);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here

        if (usernameadminlogintext.getText().equals("") && passwordadminloginpass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "One or more text fields are empty");
        } else {
             
            try {
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                String sql = "SELECT * FROM adminaccountregistration WHERE UserName = ? AND pass_word = ?";
                pst = con.prepareStatement(sql);
              
                pst.setString(1, usernameadminlogintext.getText());
                pst.setString(2, passwordadminloginpass.getText());
                
                rsa = pst.executeQuery();
               
                
                if (rsa.next()) {
                    JOptionPane.showMessageDialog(null, "Logged in successfully!");
                    new AdminAccountFrame().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed!\nWrong password or username, please try again");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
              
             
        }
        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordadminloginpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordadminloginpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordadminloginpassActionPerformed

    private void usernameadminlogintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameadminlogintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameadminlogintextActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void MenuCurrentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCurrentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCurrentDateActionPerformed

    private void passwordadminloginpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordadminloginpassKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if (usernameadminlogintext.getText().equals("") && passwordadminloginpass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "One or more text fields are empty");
        } else {

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                String sql = "SELECT * FROM adminaccountregistration WHERE UserName = ? AND pass_word = ?";
                pst = con.prepareStatement(sql);
              
                pst.setString(1, usernameadminlogintext.getText());
                pst.setString(2, passwordadminloginpass.getText());
                
                rsa = pst.executeQuery();
               
                
                if (rsa.next()) {
                    JOptionPane.showMessageDialog(null, "Logged in successfully!");
                    new AdminAccountFrame().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
         }
        
    }//GEN-LAST:event_passwordadminloginpassKeyPressed

    private void passwordadminloginpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordadminloginpassKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordadminloginpassKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)) {
            new readOnlyUser().setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCurrentDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JPasswordField passwordadminloginpass;
    private javax.swing.JTextField usernameadminlogintext;
    // End of variables declaration//GEN-END:variables
}
