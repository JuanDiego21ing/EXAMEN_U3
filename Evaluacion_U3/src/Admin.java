import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Admin {

	private JFrame frame;
	private JTextField txt_Nombre;
	private JTextField txt_Correo;
	private JPasswordField txt_Contra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(225, 215, 138));
		frame.getContentPane().setLayout(null);
		
		JLabel cuentaAdmin = new JLabel("Crear cuenta Admin");
		cuentaAdmin.setFont(new Font("Arial Black", Font.PLAIN, 30));
		cuentaAdmin.setBounds(78, 44, 340, 43);
		frame.getContentPane().add(cuentaAdmin);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(69, 124, 81, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Correo: ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(69, 167, 81, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña: ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(69, 213, 105, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(160, 123, 183, 32);
		frame.getContentPane().add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		txt_Correo = new JTextField();
		txt_Correo.setBounds(161, 166, 182, 32);
		frame.getContentPane().add(txt_Correo);
		txt_Correo.setColumns(10);
		
		txt_Contra = new JPasswordField();
		txt_Contra.setBounds(184, 212, 159, 32);
		frame.getContentPane().add(txt_Contra);
		
		JButton saveUser = new JButton("Crear Cuenta");
		saveUser.setFont(new Font("Arial Black", Font.PLAIN, 15));
		saveUser.setBounds(160, 273, 165, 23);
		frame.getContentPane().add(saveUser);
		
		saveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter writer;

				String n = txt_Nombre.getText();
				String m = txt_Correo.getText();
				String p = new String(txt_Contra.getPassword());

				try {

					 writer = new BufferedWriter(new FileWriter("Admin.txt",true));

					 writer.newLine();
					 writer.append(n+","+m+","+p);

					 writer.close();


				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Usuario creado");
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_1.setBounds(205, 326, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBackground(new Color(225, 215, 138));
		frame.setBounds(100, 100, 502, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
