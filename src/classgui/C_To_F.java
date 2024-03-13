package classgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class C_To_F extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C_To_F frame = new C_To_F();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public C_To_F() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(46, 41, 107, 35);
		contentPane.add(textCelsius);
		textCelsius.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setFont(new Font("Pyidaungsu", Font.PLAIN, 17));
		lblNewLabel.setBounds(182, 50, 64, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fahrenheit");
		lblNewLabel_1.setFont(new Font("Pyidaungsu", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(182, 125, 89, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double F = (Double.parseDouble(textCelsius.getText()) * 9/5)+32;
				JOptionPane.showMessageDialog(null, "Fahrenheit " + F);
			}
		});
		btnNewButton.setFont(new Font("Pyidaungsu", Font.PLAIN, 18));
		btnNewButton.setBounds(55, 123, 98, 25);
		contentPane.add(btnNewButton);
	}

}
