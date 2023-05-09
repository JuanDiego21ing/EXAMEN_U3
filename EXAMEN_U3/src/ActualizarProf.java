import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActualizarProf {
	
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
					ActualizarProf window = new ActualizarProf();
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
	public ActualizarProf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(225, 215, 138));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Actualizar Datos Profesor");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(67, 25, 444, 43);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(168, 112, 200, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(236, 87, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(236, 143, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 177, 200, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(236, 208, 79, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 241, 200, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(236, 272, 67, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(168, 297, 200, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Actualizar Datos");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton.setBounds(168, 336, 200, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_1.setBounds(10, 336, 119, 31);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 580, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}