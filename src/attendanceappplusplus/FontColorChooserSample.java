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
public class FontColorChooserSample extends JFrame implements ActionListener{
    JButton b;
    Container c;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    FontColorChooserSample() {
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
        
        savecolorsql.jPanel1.setBackground(color);
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
         String sqlcopycolorname = "INSERT INTO colorsave" + "(ColorOfApp)" + "VALUES (?)";
         pst = con.prepareStatement(sqlcopycolorname);
         pst.setString(1, savecolorsql.jPanel1.getBackground().toString());
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "color saved!");
         
        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColorChooser ch = new ColorChooser();
        
        ch.setVisible(true);
        ch.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
}




