import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;

public class ConsultaProf {

	private JFrame frame;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaProf window = new ConsultaProf();
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
	public ConsultaProf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(225, 215, 138));
		frame.setBounds(100, 100, 664, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar Profesor");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(164, 41, 316, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Descargar Informacion");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton.setBounds(202, 348, 234, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_1.setBounds(63, 103, 89, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar Profesor");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_2.setBounds(184, 103, 180, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar Profesor");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_3.setBounds(394, 103, 180, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		table = new JTable();
		table.setBounds(68, 163, 478, 174);
		frame.getContentPane().add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(557, 163, 17, 174);
		frame.getContentPane().add(scrollBar);
		
		JButton btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_4.setBounds(47, 377, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
