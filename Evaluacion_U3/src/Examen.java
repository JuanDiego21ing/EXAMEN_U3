import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Examen {

	private JFrame frame;
	private JTextField jtext1;
	private JPasswordField pwd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
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
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial Black", Font.PLAIN, 20));
		frame.getContentPane().setBackground(new Color(225, 215, 138));
		frame.setTitle("SISTEMA ESCOLAR");
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel Login = new JPanel();
		Login.setBackground(new Color(253, 222, 130));
		frame.getContentPane().add(Login, BorderLayout.CENTER);
		Login.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCEDER");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(196, 63, 174, 77);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CORREO:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(107, 189, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONTRASEÑA:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(57, 231, 137, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		jtext1 = new JTextField();
		jtext1.setBounds(196, 182, 204, 24);
		frame.getContentPane().add(jtext1);
		jtext1.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(196, 229, 204, 24);
		frame.getContentPane().add(pwd);
		
		JButton jbuttonIniciar = new JButton("Iniciar Sesion");
		jbuttonIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave = pwd.getPassword();
				String claveFinal = new String(clave);
				
				if(jtext1.getText().equals("admin") && claveFinal.equals("123")) {
					
					JOptionPane.showMessageDialog(null,"Bienvenido al Sistema Admin","Ingresaste" ,JOptionPane.INFORMATION_MESSAGE);
					
					
					
				}else {
					
					JOptionPane.showMessageDialog(null,"Correo o Contraseña Incorrectos","ERROR" ,JOptionPane.ERROR_MESSAGE);
					
					jtext1.setText(null);
					pwd.setText(null);
					jtext1.requestFocus();
					
				}
				
				
			}
		});
		jbuttonIniciar.setFont(new Font("Arial Black", Font.PLAIN, 14));
		jbuttonIniciar.setBounds(209, 339, 145, 24);
		frame.getContentPane().add(jbuttonIniciar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(57, 295, 433, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(57, 142, 433, 7);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("Crear Cuenta");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.setBounds(39, 340, 133, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_2.setBounds(396, 340, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		frame.setBounds(100, 100, 575, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
