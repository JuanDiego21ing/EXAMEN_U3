import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

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
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.getContentPane().setFont(new Font("Arial Black", Font.PLAIN, 20));
		frame.getContentPane().setBackground(new Color(225, 215, 138));
		frame.setTitle("SISTEMA ESCOLAR");
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido ADMIN");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(180, 10, 240, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Consultar");
		lblNewLabel2.setFont(new Font("", Font.PLAIN, 25));
		lblNewLabel2.setBounds(230, 60, 160, 30);
		frame.getContentPane().add(lblNewLabel2);
		
		ImageIcon imagen =new ImageIcon("Estudiante.jpg");
		JButton im1=new JButton(imagen);
		im1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		im1.setSize(130,130);
		im1.setLocation(103,123);
		
		Image esc = imagen.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im1.setIcon(ices);
		frame.getContentPane().add(im1);
		
		ImageIcon imagen2 =new ImageIcon("Docente.jpg");
		JButton im2=new JButton(imagen2);
		im2.setSize(130,130);
		im2.setLocation(336,123);
		
		Image jpg = imagen2.getImage().getScaledInstance(im2.getWidth(), im2.getHeight(),Image.SCALE_SMOOTH);
		Icon img=new ImageIcon(jpg);
		im2.setIcon(img);
		frame.getContentPane().add(im2);
		
		JButton btn1=new JButton("Estudiantes");
		btn1.setSize(114,30);
		btn1.setLocation(119,293);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Docentes");
		btn2.setBounds(351, 297, 100, 30);
		frame.getContentPane().add(btn2);

		JButton btn3=new JButton("Cerrar sesion");
		btn3.setSize(120,30);
		btn3.setLocation(226,359);
		frame.getContentPane().add(btn3);
	}

	

}
