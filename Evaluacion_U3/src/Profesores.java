import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Profesores {
	
	private JFrame frame;
	private JTextField txt_Nombre;
	private JTextField txt_Apellidos;
	private JTextField txt_FecNac;
	private JTextField txt_Mail;
	private JTextField txt_Telefono;
	private JTextField txt_Grado_Est;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profesores window = new Profesores();
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
	public Profesores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(225, 215, 138));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agregar Profesor");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(159, 28, 289, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 85, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos: ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(50, 120, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de  Nacimiento: ");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(50, 150, 190, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo electronico: ");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(50, 182, 165, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono: ");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(50, 223, 95, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Grado de estudios: ");
		lblNewLabel_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(50, 264, 165, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Foto: ");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(49, 306, 58, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(134, 84, 268, 20);
		frame.getContentPane().add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		txt_Apellidos = new JTextField();
		txt_Apellidos.setBounds(134, 119, 268, 20);
		frame.getContentPane().add(txt_Apellidos);
		txt_Apellidos.setColumns(10);
		
		txt_FecNac = new JTextField();
		txt_FecNac.setBounds(250, 150, 153, 20);
		frame.getContentPane().add(txt_FecNac);
		txt_FecNac.setColumns(10);
		
		txt_Mail = new JTextField();
		txt_Mail.setBounds(220, 181, 182, 20);
		frame.getContentPane().add(txt_Mail);
		txt_Mail.setColumns(10);
		
		txt_Telefono = new JTextField();
		txt_Telefono.setBounds(137, 222, 265, 20);
		frame.getContentPane().add(txt_Telefono);
		txt_Telefono.setColumns(10);
		
		txt_Grado_Est = new JTextField();
		txt_Grado_Est.setBounds(213, 263, 189, 20);
		frame.getContentPane().add(txt_Grado_Est);
		txt_Grado_Est.setColumns(10);
		frame.setBounds(100, 100, 608, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Subir");
		btnNewButton.setBounds(105, 304, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton saveUser = new JButton("Agregar Profesor");
		saveUser.setFont(new Font("Arial Black", Font.PLAIN, 18));
		saveUser.setBounds(344, 317, 220, 37);
		frame.getContentPane().add(saveUser);
		
		saveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter writer;

				String n = txt_Nombre.getText();
				String a = txt_Apellidos.getText();
				String fn = txt_FecNac.getText();
				String m = txt_Mail.getText();
				String t = txt_Telefono.getText();
				String ge= txt_Grado_Est.getText();

				try {

					 writer = new BufferedWriter(new FileWriter("profesores.txt",true));

					 writer.newLine();
					 writer.append(n+","+a+","+fn+","+ m+","+t+","+ge);

					 writer.close();


				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Usuario creado");
			
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_2.setBounds(22, 346, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
	}
}
