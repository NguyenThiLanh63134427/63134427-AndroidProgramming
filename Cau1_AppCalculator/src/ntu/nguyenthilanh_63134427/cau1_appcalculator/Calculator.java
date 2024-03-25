package ntu.nguyenthilanh_63134427.cau1_appcalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.UIManager;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 386, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(109, 26, 142, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(10, 67, 352, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnMuTrux = new JButton("1/x");
		btnMuTrux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnMuTrux.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMuTrux.setBounds(10, 219, 63, 60);
		frame.getContentPane().add(btnMuTrux);
		
		JButton btn = new JButton("()");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="()";
			}
		});
		btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn.setBounds(10, 277, 63, 60);
		frame.getContentPane().add(btn);
		
		JButton btnMun = new JButton("x^n");
		btnMun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^n";
			}
		});
		btnMun.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMun.setBounds(10, 336, 63, 60);
		frame.getContentPane().add(btnMun);
		
		JButton btnmu2 = new JButton("x^2");
		btnmu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnmu2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnmu2.setBounds(10, 395, 63, 60);
		frame.getContentPane().add(btnmu2);
		
		JButton btnGiaiThua = new JButton("n!");
		btnGiaiThua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a != 0)
				{
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnGiaiThua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGiaiThua.setBounds(10, 457, 63, 60);
		frame.getContentPane().add(btnGiaiThua);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlusMinus.setBounds(10, 522, 63, 60);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEMux = new JButton("e^x");
		btnEMux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEMux.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEMux.setBounds(83, 161, 63, 60);
		frame.getContentPane().add(btnEMux);
		
		JButton btnlog = new JButton("log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnlog.setBounds(229, 279, 63, 60);
		frame.getContentPane().add(btnlog);
		
		JButton btnPesent = new JButton("%");
		btnPesent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPesent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPesent.setBounds(83, 277, 63, 60);
		frame.getContentPane().add(btnPesent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(83, 334, 63, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(83, 393, 63, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(83, 457, 63, 60);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSin.setBounds(156, 161, 63, 60);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSinh.setBounds(83, 219, 63, 60);
		frame.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(10, 159, 63, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(156, 334, 63, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(156, 393, 63, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(156, 457, 63, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(83, 522, 136, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCos.setBounds(229, 161, 63, 60);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCosh.setBounds(156, 219, 63, 60);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnBackSpace.setBounds(302, 160, 63, 60);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(229, 334, 63, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(229, 393, 63, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(229, 457, 63, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnpoint = new JButton(".");
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnpoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpoint.setBounds(229, 522, 63, 60);
		frame.getContentPane().add(btnpoint);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTan.setBounds(229, 219, 63, 60);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTanh.setBounds(302, 219, 63, 60);
		frame.getContentPane().add(btnTanh);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCong.setBounds(302, 277, 63, 60);
		frame.getContentPane().add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTru.setBounds(302, 334, 63, 60);
		frame.getContentPane().add(btnTru);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNhan.setBounds(302, 393, 63, 60);
		frame.getContentPane().add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChia.setBounds(302, 457, 63, 60);
		frame.getContentPane().add(btnChia);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second  = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "x^n") {
					double result = 1;
					for(int i = 0; i < second; i++)
					{
						result = first * result;
					}
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(302, 522, 63, 60);
		frame.getContentPane().add(btnequal);
		
		JButton btnCan = new JButton("\u221A");
		btnCan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnCan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCan.setBounds(156, 277, 63, 60);
		frame.getContentPane().add(btnCan);
		
	
	}
}
