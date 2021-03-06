package appBookelandia.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 654, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 311, 408);
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 381, 226);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/appBookelandia/view/image/livros.jpeg")));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bookelandia\n");
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(88, 261, 135, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("A leitura abre as janelas do conhecimento ");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(22, 315, 283, 30);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("e desperta do sono asabedoria");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(54, 336, 208, 30);
		panel.add(lblNewLabel_2_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(345, 335, 159, 51);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(241,57,83));
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(345, 50, 229, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(345, 102, 229, 4);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setBounds(355, 35, 130, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(345, 118, 229, 43);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(345, 267, 229, 43);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(345, 188, 229, 43);
		frame.getContentPane().add(textField_3);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(355, 105, 130, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(355, 174, 130, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblRepeatPassword = new JLabel("REPEAT PASSWORD");
		lblRepeatPassword.setBounds(355, 253, 130, 16);
		frame.getContentPane().add(lblRepeatPassword);
		
		JLabel lblNewLabel_2_1 = new JLabel("A leitura abre as janelas do conhecimento e desperta do sono a sabedoria");
		lblNewLabel_2_1.setBounds(31, 300, 502, 65);
		frame.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	}
}
