package calculadora;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Calculadora extends JFrame {
	
	private JTextField value2;
	private JTextField value1;
	
	public Calculadora() {
		
		this.setSize(280, 380);
		this.setTitle("Calculadora");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(26, 35, 208, 52);
		getContentPane().add(editorPane);
		
		JButton btn_abs = new JButton("abs");
		btn_abs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecived.setText("abs");
				value2.setText(null);
			}
		});
		btn_abs.setBounds(26, 139, 58, 23);
		getContentPane().add(btn_abs);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 9);
			}
		});
		btn_9.setBounds(26, 173, 46, 23);
		getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 6);
			}
		});
		btn_6.setBounds(26, 211, 46, 23);
		getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 3);
			}
		});
		btn_3.setBounds(26, 245, 46, 23);
		getContentPane().add(btn_3);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 8);
			}
		});
		btn_8.setBounds(108, 173, 46, 23);
		getContentPane().add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 5);
			}
		});
		btn_5.setBounds(108, 211, 46, 23);
		getContentPane().add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 2);
			}
		});
		btn_2.setBounds(108, 245, 46, 23);
		getContentPane().add(btn_2);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 7);
			}
		});
		btn_7.setBounds(188, 173, 46, 23);
		getContentPane().add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 4);
			}
		});
		btn_4.setBounds(188, 211, 46, 23);
		getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 1);
			}
		});
		btn_1.setBounds(188, 245, 46, 23);
		getContentPane().add(btn_1);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 0);
			}
		});
		btn_0.setBounds(108, 279, 46, 23);
		getContentPane().add(btn_0);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecived.setText("add");
				value2.setText(null);
			}
		});
		btn_plus.setBounds(108, 139, 46, 23);
		getContentPane().add(btn_plus);
		
		JButton btn_exclamation = new JButton("!");
		btn_exclamation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecived.setText("exclamation");
				value2.setText(null);
			}
		});
		btn_exclamation.setBounds(188, 139, 46, 23);
		getContentPane().add(btn_exclamation);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int one = Integer.parseInt(value1.getText());
				int two = Integer.parseInt(value2.getText());
				
				if(actionRecived.getText().equals("add"))
				{
					int add = one + two;
					value2.setText(String.valueOf(add));
				}
				
				if(actionRecived.getText().equals("abs"))
				{
					int abs = Math.abs(one + two);
					value2.setText(String.valueOf(abs));
				}
				
				if(actionRecived.getText().equals("exclamation"))
				{
					int exclamation = one;
					int fat = 1;
					
					if(exclamation>=0) {
						
						for(int i = 1; i <= exclamation; i++) {
							fat = fat * i;
						}
						value2.setText(String.valueOf(fat));
					}
					else {
						System.out.println("error");
					}
				}
			}
		});
		btn_equal.setBounds(188, 279, 46, 23);
		getContentPane().add(btn_equal);
		
		value2 = new JTextField();
		value2.setBorder(null);
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		value2.setBounds(38, 64, 187, 20);
		getContentPane().add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setBorder(null);
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setBounds(121, 46, 104, 20);
		getContentPane().add(value1);
		value1.setColumns(10);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				actionRecived.setText(null);
			}
		});
		btn_C.setBounds(26, 279, 46, 23);
		getContentPane().add(btn_C);
		
		actionRecived = new JLabel("");
		actionRecived.setForeground(SystemColor.control);
		actionRecived.setFont(new Font("Tahoma", Font.PLAIN, 16));
		actionRecived.setBounds(126, 98, 46, 14);
		getContentPane().add(actionRecived);
		
		this.setVisible(true);
	}
	
	private JLabel actionRecived;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Calculadora();

	}
}
