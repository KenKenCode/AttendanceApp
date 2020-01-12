/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceappplusplus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
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

/**
 *
 * @author Ken
 */
public class FontColorChooser extends JFrame implements ActionListener {

    JButton b;
    Container c;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    FontColorChooser() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Color");
        b.addActionListener(this);
        c.add(b);

    }
    

    public void actionPerformed(ActionEvent e) {
        
        try {
            
        Color initialColor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialColor);
        c.setBackground(color);
        Student_Register.findLabel.setForeground(color);
        Student_Register.findSectionsLabel.setForeground(color);
        Student_Register.statusFindLabel.setForeground(color);
        Student_Register.findCalendarLabel.setForeground(color);
        Student_Register.addOrEditLabel.setForeground(color);
        Student_Register.numberLabel.setForeground(color);
        Student_Register.sectionLabel.setForeground(color);
        Student_Register.firstNameLabel.setForeground(color);
        Student_Register.lastNameLabel.setForeground(color);
        Student_Register.USNLabel.setForeground(color);
        Student_Register.statusLabel.setForeground(color);
        Student_Register.markedRecordsLabel.setForeground(color);
        Student_Register.noteTitleLabel.setForeground(color);
        Student_Register.findwordLabel.setForeground(color);
        AdminAccountFrame.adminAccountFrameTitleNote.setForeground(color);
        } catch (Exception error){
            JOptionPane.showMessageDialog(null, error);
           
        }
    }
    
    
        
        
        
        
        

    public static void main(String[] args) {
        // TODO code application logic here
        FontColorChooser fontColorChange = new FontColorChooser();
        fontColorChange.setSize(400, 400);
        fontColorChange.setVisible(true);
        fontColorChange.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }

}











