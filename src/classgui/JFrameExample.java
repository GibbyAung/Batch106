package classgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class JFrameExample extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameExample frame = new JFrameExample();
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
	public JFrameExample() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrameExample.class.getResource("/classgui/imgFolder/infomyanmarlogo-removebg-preview.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Your Name");
		lblNewLabel.setFont(new Font("Pyidaungsu", Font.PLAIN, 15));
		lblNewLabel.setBounds(49, 58, 113, 50);
		contentPane.add(lblNewLabel);
		
		textName = new JTextField();
		textName.setBounds(188, 73, 177, 23);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Your Name is " + textName.getText());
			}
		});
		
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Pyidaungsu", Font.PLAIN, 15));
		btnNewButton.setBounds(156, 112, 83, 25);
		contentPane.add(btnNewButton);
	}
}
