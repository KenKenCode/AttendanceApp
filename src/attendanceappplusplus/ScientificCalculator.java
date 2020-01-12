/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceappplusplus;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ScientificCalculator extends JFrame implements ActionListener {  //extends JFrame parent Class and ActionListener Interface
	JTextField tfield;                    //tfield is reference variable of JTextField
	double temp, temp1, result, a;
	static double m1, m2;
	int k = 1, x = 0, y = 0, z = 0;
	char ch;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp,
			fac, plus, min, div, ln, rev, mul, eq, addSub, dot, mr, mc, mp,
			mm, sqrt, sin, cos, tan, addToCurrentNoteButton;
	Container cont;                        //cont is reference variable of container class
	JPanel textPanel, buttonpanel;

	ScientificCalculator() {                                //constructor
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		JPanel textpanel = new JPanel();
		tfield = new JTextField(25);                         //TextField area is added to frame
		tfield.setHorizontalAlignment(SwingConstants.RIGHT);
		tfield.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent keyevent) {
				char c = keyevent.getKeyChar();
				if (c >= '0' && c <= '9') {
				} else {
					keyevent.consume();
				}
			}
		});
		textpanel.add(tfield);
		buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(8, 4, 2, 2));
		boolean t = true;
		
		mr = new JButton("MR");           
		buttonpanel.add(mr);                //Buttons are added to the frame
		mr.setForeground(Color.red);        //foreground color is given to the button
		mr.addActionListener(this);         //registered with Actionlistener
		
		mc = new JButton("MC");
		buttonpanel.add(mc);
		mc.setForeground(Color.red);
		mc.addActionListener(this);

		mp = new JButton("M+");
		buttonpanel.add(mp);
		mp.setForeground(Color.red);
		mp.addActionListener(this);

		mm = new JButton("M-");
		buttonpanel.add(mm);
		mm.setForeground(Color.red);
		mm.addActionListener(this);

		b1 = new JButton("1");
		buttonpanel.add(b1);
		b1.setForeground(Color.blue);
		b1.addActionListener(this);
		
		b2 = new JButton("2");
		buttonpanel.add(b2);
		b2.setForeground(Color.blue);
		b2.addActionListener(this);
		
		b3 = new JButton("3");
		buttonpanel.add(b3);
		b3.setForeground(Color.blue);
		b3.addActionListener(this);

		b4 = new JButton("4");
		buttonpanel.add(b4);
		b4.setForeground(Color.blue);
		b4.addActionListener(this);
		
		b5 = new JButton("5");
		buttonpanel.add(b5);
		b5.setForeground(Color.blue);
		b5.addActionListener(this);
		
		b6 = new JButton("6");
		buttonpanel.add(b6);
		b6.setForeground(Color.blue);
		b6.addActionListener(this);

		b7 = new JButton("7");
		buttonpanel.add(b7);
		b7.setForeground(Color.blue);
		b7.addActionListener(this);
		
		b8 = new JButton("8");
		buttonpanel.add(b8);
		b8.setForeground(Color.blue);
		b8.addActionListener(this);
		
		b9 = new JButton("9");
		buttonpanel.add(b9);
		b9.setForeground(Color.blue);
		b9.addActionListener(this);

		zero = new JButton("0");
		buttonpanel.add(zero);
		zero.setForeground(Color.blue);
		zero.addActionListener(this);

		plus = new JButton("+");
		buttonpanel.add(plus);
		plus.setForeground(Color.red);
		plus.addActionListener(this);

		min = new JButton("-");
		buttonpanel.add(min);
		min.setForeground(Color.red);
		min.addActionListener(this);

		mul = new JButton("*");
		buttonpanel.add(mul);
		mul.setForeground(Color.red);
		mul.addActionListener(this);

		div = new JButton("/");
		buttonpanel.add(div);
		div.setForeground(Color.red);
		div.addActionListener(this);
		
		addSub = new JButton("+/-");
		buttonpanel.add(addSub);
		addSub.setForeground(Color.red);
		addSub.addActionListener(this);

		dot = new JButton(".");
		buttonpanel.add(dot);
		dot.setForeground(Color.red);
		dot.addActionListener(this);

		eq = new JButton("=");
		buttonpanel.add(eq);
		eq.setForeground(Color.red);
		eq.addActionListener(this);

		rev = new JButton("1/x");
		buttonpanel.add(rev);
		rev.setForeground(Color.red);
		rev.addActionListener(this);
		
		sqrt = new JButton("Sqrt");
		buttonpanel.add(sqrt);
		sqrt.setForeground(Color.red);
		sqrt.addActionListener(this);
		
		ln = new JButton("ln");
		buttonpanel.add(ln);
		ln.setForeground(Color.red);
		ln.addActionListener(this);

		sin = new JButton("SIN");
		buttonpanel.add(sin);
		sin.setForeground(Color.red);
		sin.addActionListener(this);
		
		cos = new JButton("COS");
		buttonpanel.add(cos);
		cos.setForeground(Color.red);
		cos.addActionListener(this);
		
		tan = new JButton("TAN");
		buttonpanel.add(tan);
		tan.setForeground(Color.red);
		tan.addActionListener(this);
		
		pow2 = new JButton("x^2");
		buttonpanel.add(pow2);
		pow2.setForeground(Color.red);
		pow2.addActionListener(this);
		
		pow3 = new JButton("x^3");
		buttonpanel.add(pow3);
		pow3.setForeground(Color.red);
		pow3.addActionListener(this);
		
		exp = new JButton("Exp");
		buttonpanel.add(exp);
		exp.setForeground(Color.red);
		exp.addActionListener(this);
		
		fac = new JButton("n!");
		buttonpanel.add(fac);
		fac.setForeground(Color.red);
		fac.addActionListener(this);
		
		clr = new JButton("AC");
		buttonpanel.add(clr);
		clr.setForeground(Color.red);
		clr.addActionListener(this);
                
                addToCurrentNoteButton = new JButton("Add to current note");
                buttonpanel.add(addToCurrentNoteButton);
                addToCurrentNoteButton.setForeground(Color.black);
                addToCurrentNoteButton.addActionListener(this);
		
		cont.add("Center", buttonpanel);
		cont.add("North", textpanel);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("1")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "1");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "1");
				z = 0;
			}
		}
		if (s.equals("2")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "2");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "2");
				z = 0;
			}
		}
		if (s.equals("3")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "3");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "3");
				z = 0;
			}
		}
		if (s.equals("4")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "4");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "4");
				z = 0;
			}
		}
		if (s.equals("5")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "5");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "5");
				z = 0;
			}
		}
		if (s.equals("6")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "6");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "6");
				z = 0;
			}
		}
		if (s.equals("7")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "7");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "7");
				z = 0;
			}
		}
		if (s.equals("8")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "8");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "8");
				z = 0;
			}
		}
		if (s.equals("9")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "9");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "9");
				z = 0;
			}
		}
		if (s.equals("0")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "0");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "0");
				z = 0;
			}
		}
		if (s.equals("AC")) {                                            //CLEAR DATA OPERATION
			try{
			tfield.setText("");
			x = 0;
			y = 0;
			z = 0;
		}catch(NullPointerException ex){}
		}
		if (s.equals("ln")) {                                            //NATURAL LOG OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.log(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("1/x")) {                                           //REVERSE OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = 1 / Double.parseDouble(tfield.getText());
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("Exp")) {                                            //EXPONENT OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.exp(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("x^2")) {                                             //SQUARE OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.pow(Double.parseDouble(tfield.getText()), 2);
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("x^3")) {                                              //CUBE OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.pow(Double.parseDouble(tfield.getText()), 3);
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("+/-")) {                                               //POSTONEG OPERATION
			if (x == 0) {
				tfield.setText("-" + tfield.getText());
				x = 1;
			} else {
				tfield.setText(tfield.getText());
			}
		}
		if (s.equals(".")) {
			if (y == 0) {
				tfield.setText(tfield.getText() + ".");
				y = 1;
			} else {
				tfield.setText(tfield.getText());
			}
		}
		if (s.equals("+")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp = 0;
				ch = '+';
			} else {
				temp = Double.parseDouble(tfield.getText());
				tfield.setText("");
				ch = '+';
				y = 0;
				x = 0;
			}
			tfield.requestFocus();
		}
		if (s.equals("-")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp = 0;
				ch = '-';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(tfield.getText());
				tfield.setText("");
				ch = '-';
			}
			tfield.requestFocus();
		}
		if (s.equals("/")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp = 1;
				ch = '/';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(tfield.getText());
				ch = '/';
				tfield.setText("");
			}
			tfield.requestFocus();
		}
		if (s.equals("*")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp = 1;
				ch = '*';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(tfield.getText());
				ch = '*';
				tfield.setText("");
			}
			tfield.requestFocus();
		}
		if (s.equals("MC")) {                             //CLEAR EXISTNG MEMORY OPERATION
			m1 = 0;
			tfield.setText("");
		}
		if (s.equals("MR")) {                             //MEMORY RECALL OPERATION
			tfield.setText("");
			tfield.setText(tfield.getText() + m1);
		}
		if (s.equals("M+")) {                                // ADD MEMORY OPERATION
			if (k == 1) {
				m1 = Double.parseDouble(tfield.getText());
				k++;
			} else {
				m1 += Double.parseDouble(tfield.getText());
				tfield.setText("" + m1);
			}
		}
		if (s.equals("M-")) {                                // SUBTRACT MEMORY OPERATION
			if (k == 1) {
				m1 = Double.parseDouble(tfield.getText());
				k++;
			} else {
				m1 -= Double.parseDouble(tfield.getText());
				tfield.setText("" + m1);
			}
		}
		if (s.equals("Sqrt")) {                       //SQUARE ROOT OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.sqrt(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("SIN")) {                         //SINE OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.sin(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("COS")) {                          //COSINE OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.cos(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
	    }
		if (s.equals("TAN")) {                           //TANGENT OPERATION
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.tan(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("=")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				temp1 = Double.parseDouble(tfield.getText());
				switch (ch) {
				case '+':
					result = temp + temp1;       //ADDITION
					break;
				case '-':                         
					result = temp - temp1;       //SUBTRACTION
					break;
				case '/':
					result = temp / temp1;       //DIVISION
					break;
				case '*':
					result = temp * temp1;       //MULTIPLICATION
					break;
				}
				tfield.setText("");
				tfield.setText(tfield.getText() + result);
				z = 1;
			}
		}
		if (s.equals("n!")) {                                    //FACTORIAL
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = fact(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		tfield.requestFocus();
                
                if (s.equals("Add to current note")) {
                    Student_Register.NotesForThisSection.append("Calculator: ");
        Student_Register.NotesForThisSection.append(tfield.getText());
                }
                
                
	}
        
        
        
    double fact(double x) {
		int er = 0;
		if (x < 0) {
			er = 20;
			return 0;
		}
		double i, s = 1;
		for (i = 2; i <= x; i += 1.0)
			s *= i;
		return s;
	}

	public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); /* Giving the current OS look 
					                                                                and feel to the calculator*/
		} catch (Exception e) {
		}
		ScientificCalculator f = new ScientificCalculator();
                f.setSize(400, 400);
		f.setTitle("Scientific Calculator");
		f.pack();
		f.setVisible(true);
	}
}





