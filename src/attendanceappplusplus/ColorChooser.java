/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceappplusplus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ken
 */
public class ColorChooser extends JFrame implements ActionListener {
JButton b;
Container c;

ColorChooser() {
c = getContentPane();
c.setLayout(new FlowLayout());
b = new JButton("Color");
b.addActionListener(this);
c.add(b);

}
public void actionPerformed(ActionEvent e) {
    Color initialColor = Color.RED;
    Color color = JColorChooser.showDialog(this, "Select a color", initialColor);
    c.setBackground(color);
    Student_Register.jPanel1.setBackground(color);
}
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
        
        ColorChooser ch = new ColorChooser();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
}


