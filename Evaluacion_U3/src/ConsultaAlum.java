import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ConsultaAlum {

	private JFrame frame;
	private JTable tbl_Alumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaAlum window = new ConsultaAlum();
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
	public ConsultaAlum() {
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
		
		JLabel lblNewLabel = new JLabel("Consultar Alumno");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(164, 41, 316, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Descargar Informacion");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton.setBounds(202, 363, 234, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_1.setBounds(63, 103, 89, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar Alumno");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_2.setBounds(184, 103, 180, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar Alumno");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_3.setBounds(394, 103, 180, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		
		String[] columnNames = { "Nombre", "Apellidos","Fecha_Nac","Correo", "Telefono" };

		String[][] data = new String[10][5];
		int i = 0;
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader("alumnos.txt"));

			String line = reader.readLine();
			JScrollPane sp = null;

			while (line != null) {

				data[i] = line.split(",");

				JTable tbl_Alumnos = new JTable(data, columnNames);
				sp = new JScrollPane(tbl_Alumnos);
				sp.setSize(450,200);
				sp.setLocation(70, 150); 

				line = reader.readLine();
				i++;
			} 

			frame.getContentPane().add(sp);


		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


		
		JButton btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_4.setBounds(47, 377, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
