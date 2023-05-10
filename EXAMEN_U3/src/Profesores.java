import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Profesores {
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	

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
		
		JLabel lblNewLabel_6 = new JLabel("Foto: ");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(49, 306, 58, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(134, 84, 268, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 119, 268, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 150, 153, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(220, 181, 182, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(137, 222, 265, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Subir");
		btnNewButton.setBounds(105, 304, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Agregar Profesor");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1.setBounds(344, 317, 220, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_2.setBounds(22, 346, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("Grado de estudios: ");
		lblNewLabel_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(50, 264, 165, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(213, 263, 189, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		frame.setBounds(100, 100, 608, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
