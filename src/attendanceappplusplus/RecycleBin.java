/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceappplusplus;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import java.net.InetAddress;
import javax.swing.*;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;
import java.awt.*;

/**
 *
 * @author Ken
 */
public class RecycleBin extends javax.swing.JFrame {
Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form RecycleBin
     */
    public RecycleBin() {
        initComponents();
        CurrentDate();
        dataOfRecycleBin();
    }
    public void CurrentDate() {
        //For displaying the date
        Calendar dateandtimeone = new GregorianCalendar();
        int month = dateandtimeone.get(Calendar.MONTH);
        int year = dateandtimeone.get(Calendar.YEAR);
        int day = dateandtimeone.get(Calendar.DAY_OF_MONTH);

        menuCurrentDateRecycleBin.setText((month + 1) + "/" + day + "/" + year);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        recycleBinRecord = new javax.swing.JTable();
        restoreSelectedRecordButton = new javax.swing.JButton();
        permanentlyDeleteSelectedRecordButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCurrentDateRecycleBin = new javax.swing.JMenu();

        recycleBinRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(recycleBinRecord);

        restoreSelectedRecordButton.setText("Restore selected record");
        restoreSelectedRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreSelectedRecordButtonActionPerformed(evt);
            }
        });

        permanentlyDeleteSelectedRecordButton.setText("Permanently delete selected record");
        permanentlyDeleteSelectedRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permanentlyDeleteSelectedRecordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(restoreSelectedRecordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(permanentlyDeleteSelectedRecordButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restoreSelectedRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(permanentlyDeleteSelectedRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        menuCurrentDateRecycleBin.setText("Current Date");
        jMenuBar1.add(menuCurrentDateRecycleBin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restoreSelectedRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreSelectedRecordButtonActionPerformed
        // TODO add your handling code here:
        //TableModel and getSelectedRow() is much more efficient in getting the data
        int irecyclebinRestore = recycleBinRecord.getSelectedRow();

            TableModel modelrecyclebinRestore = recycleBinRecord.getModel();
        //Move the record to recyclebin
        try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
             String queryForMovingTorecyclebin = "INSERT INTO database_rec"
                    + "(No, FirstName, LastName, Status, Calendar, Time, USN, Section)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
             pst = con.prepareStatement(queryForMovingTorecyclebin);
             
             pst.setString(1, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 0).toString());
             pst.setString(2, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 1).toString());
             pst.setString(3, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 2).toString());
             pst.setString(4, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 3).toString());
             pst.setString(5, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 4).toString());
             pst.setString(6, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 5).toString());
             pst.setString(7, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 6).toString());
             pst.setString(8, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 7).toString());
             
             
             JOptionPane.showMessageDialog(null, "Restored successfully");
             pst.executeUpdate();
             
             String queryForDeletingIndatabase_rec = "DELETE FROM recyclebin WHERE No = ?";
             pst = con.prepareStatement(queryForDeletingIndatabase_rec);
             pst.setString(1, modelrecyclebinRestore.getValueAt(irecyclebinRestore, 0).toString());
             
             pst.executeUpdate();
             
             dataOfRecycleBin(); //Execute Data() to refresh the table recycleBinRecord
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_restoreSelectedRecordButtonActionPerformed

    private void permanentlyDeleteSelectedRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permanentlyDeleteSelectedRecordButtonActionPerformed
        // TODO add your handling code here:
        int irecyclebinDeletePermanent = recycleBinRecord.getSelectedRow();

            TableModel modelrecyclebinDeletePermanent = recycleBinRecord.getModel();
        try {
            String queryForDeletingIndatabase_rec = "DELETE FROM recyclebin WHERE No = ?";
             pst = con.prepareStatement(queryForDeletingIndatabase_rec);
             pst.setString(1, modelrecyclebinDeletePermanent.getValueAt(irecyclebinDeletePermanent, 0).toString());
             
             pst.executeUpdate();
             
             dataOfRecycleBin(); //Execute Data() to refresh the table recycleBinRecord
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_permanentlyDeleteSelectedRecordButtonActionPerformed

    public void dataOfRecycleBin() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
        String sqlRecycleBin = "SELECT * FROM recyclebin";
        pst = con.prepareStatement(sqlRecycleBin);
        rs = pst.executeQuery(sqlRecycleBin);
        recycleBinRecord.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
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
            java.util.logging.Logger.getLogger(RecycleBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecycleBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecycleBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecycleBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecycleBin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuCurrentDateRecycleBin;
    private javax.swing.JButton permanentlyDeleteSelectedRecordButton;
    private javax.swing.JTable recycleBinRecord;
    private javax.swing.JButton restoreSelectedRecordButton;
    // End of variables declaration//GEN-END:variables
}

