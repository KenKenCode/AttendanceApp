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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Student_Data extends javax.swing.JFrame {

    DefaultTableModel dm;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Student_Data() {
        initComponents();
        Data();
        SectionCombo();
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
    
    private void SectionCombo () {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM sections";
            pst = con.prepareStatement(sql);
            
            while (rs.next()) {
                String nameone = rs.getString("sectionname");
                SectionBox.addItem(nameone);
                
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        nolbl = new javax.swing.JLabel();
        No_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTB = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Clear = new java.awt.Button();
        srchtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fnametf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lnametf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        statstf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SectionBox = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuCurrentDate = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(34, 167, 240));

        Close.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Close.setText(" x");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });

        Minimize.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Minimize.setText(" -");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Minimize)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        nolbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nolbl.setText("No");

        No_txt.setEditable(false);
        No_txt.setText("AUTO_INCREMENT");
        No_txt.setEnabled(false);
        No_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No_txtMouseClicked(evt);
            }
        });
        No_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_txtActionPerformed(evt);
            }
        });
        No_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                No_txtKeyTyped(evt);
            }
        });

        myTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        myTB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myTB.setEditingColumn(0);
        myTB.setEditingRow(0);
        myTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTBMouseClicked(evt);
            }
        });
        myTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                myTBKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(myTB);

        jLabel2.setText("Search :");

        Clear.setActionCommand("Clear");
        Clear.setBackground(new java.awt.Color(204, 0, 255));
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Clear.setLabel("Back");
        Clear.setName("Clear"); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        srchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchtfActionPerformed(evt);
            }
        });
        srchtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                srchtfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srchtfKeyTyped(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("No");

        fnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametfActionPerformed(evt);
            }
        });
        fnametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnametfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnametfKeyTyped(evt);
            }
        });

        jLabel4.setText("First Name");

        lnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnametfActionPerformed(evt);
            }
        });
        lnametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnametfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnametfKeyTyped(evt);
            }
        });

        jLabel5.setText("Last Name");

        statstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statstfActionPerformed(evt);
            }
        });
        statstf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                statstfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                statstfKeyTyped(evt);
            }
        });

        jLabel6.setText("Status");

        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Section");

        SectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select sections" }));
        SectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(SectionBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(statstf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6)))))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(No_txt)
                                    .addComponent(srchtf, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jLabel1)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nolbl)
                            .addComponent(No_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(srchtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(lnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(statstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(SectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(207, 207, 207)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jMenu1.setText("Languages");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        int confirmationtoexit = JOptionPane.showConfirmDialog(null, "Are you sure you to exit?", "Notice", JOptionPane.YES_NO_OPTION);

        if (confirmationtoexit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        Close.setForeground(Color.WHITE);
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        Close.setForeground(Color.BLACK);
    }//GEN-LAST:event_CloseMouseExited

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        Minimize.setForeground(Color.WHITE);

    }//GEN-LAST:event_MinimizeMouseEntered

    private void MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseExited
        Minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_MinimizeMouseExited

    private void No_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_txtActionPerformed
        // TODO add your handling code here:

        try {
            String query = "UPDATE `database_rec` SET StudentName = ?, USN= ?, Status = ? WHERE No = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(query);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_No_txtActionPerformed

    private void myTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTBMouseClicked
        int i = myTB.getSelectedRow();

        TableModel model = myTB.getModel();

        // Display Slected Row In JTexteFields
        No_txt.setText(model.getValueAt(i, 0).toString());

        


    }//GEN-LAST:event_myTBMouseClicked

    private void No_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_No_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isDigit(c)) {
            No_txt.setEditable(true);

        } else {
            No_txt.setEditable(false);
        }


    }//GEN-LAST:event_No_txtKeyTyped

    private void No_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_No_txtMouseClicked

    private void myTBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myTBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_myTBKeyPressed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        AdminAccountFrame f = new AdminAccountFrame();
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ClearActionPerformed

    private void srchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchtfActionPerformed

    }//GEN-LAST:event_srchtfActionPerformed

    private void srchtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchtfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String no = "SELECT * FROM `database_rec` WHERE `No` ='" + srchtf.getText() + "' ";
           

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_srchtfKeyPressed

    private void srchtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchtfKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_srchtfKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Data();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametfActionPerformed
      
    }//GEN-LAST:event_fnametfActionPerformed

    private void fnametfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnametfKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String no = "SELECT * FROM `database_rec` WHERE `First Name` LIKE '" + fnametf.getText() + "%' ";
           

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_fnametfKeyPressed

    private void fnametfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnametfKeyTyped
  char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            fnametf.setEditable(true);
        } else {
            fnametf.setEditable(false);
        }
    }//GEN-LAST:event_fnametfKeyTyped

    private void lnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnametfActionPerformed

    private void lnametfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnametfKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String no = "SELECT * FROM `database_rec` WHERE `Last Name` LIKE '" + lnametf.getText() + "%' ";
           

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_lnametfKeyPressed

    private void lnametfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnametfKeyTyped
           char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            lnametf.setEditable(true);
        } else {
            lnametf.setEditable(false);
        }
    }//GEN-LAST:event_lnametfKeyTyped

    private void statstfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statstfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statstfActionPerformed

    private void statstfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statstfKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String no = "SELECT * FROM `database_rec` WHERE `Status` LIKE '" + statstf.getText() + "%' ";
           

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_statstfKeyPressed

    private void statstfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statstfKeyTyped
         char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
           statstf.setEditable(true);
        } else {
           statstf.setEditable(false);
        }
    }//GEN-LAST:event_statstfKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String no = "SELECT * FROM `database_rec` WHERE `No` ='" + srchtf.getText() + "' ";
           

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  String no = "SELECT * FROM `database_rec` WHERE `First Name` LIKE '" + fnametf.getText() + "%' ";
           
        

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String no = "SELECT * FROM `database_rec` WHERE `Last Name` LIKE '" + lnametf.getText() + "%' ";
           

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         String no = "SELECT * FROM `database_rec` WHERE `Status` LIKE '" + statstf.getText() + "%' ";
           

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(no);
               
                rs = pst.executeQuery();
                myTB.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void SectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionBoxActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM sections";
            pst = con.prepareStatement(sql);
            
            
                String nameone = rs.getString("sectionname");
                SectionBox.addItem(nameone);
                return;
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SectionBoxActionPerformed

    private void MenuCurrentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCurrentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCurrentDateActionPerformed

    public void Data() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM `database_rec`";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    
        public void StatusUpdate() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM `database_rec` WHERE `No` ='" + srchtf.getText() + "' ";

          
            
            pst = con.prepareStatement(sql);
            pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
        }
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
            java.util.logging.Logger.getLogger(Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Clear;
    private javax.swing.JLabel Close;
    private javax.swing.JMenu MenuCurrentDate;
    private javax.swing.JLabel Minimize;
    private javax.swing.JTextField No_txt;
    private javax.swing.JComboBox<String> SectionBox;
    private javax.swing.JTextField fnametf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnametf;
    private javax.swing.JTable myTB;
    private javax.swing.JLabel nolbl;
    private javax.swing.JTextField srchtf;
    private javax.swing.JTextField statstf;
    // End of variables declaration//GEN-END:variables
}
