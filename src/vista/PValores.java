package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;


public class PValores extends JPanel{
	private JTextField cRojo;
	private JTextField cVerde;
	private JTextField cAzul;
	private JButton bInsertarCuadrado;
	private JButton bInsertarCirculo;
	
	private FFiguras fFiguras;
	private Controlador controlador;
	
	public FFiguras getfFiguras() {
		return fFiguras;
	}

	public PValores( FFiguras fFiguras) {
		this.fFiguras = fFiguras;
		this.cRojo = new JTextField();
		this.cVerde = new JTextField();
		this.cAzul = new JTextField();
		this.controlador = new Controlador(this);
		this.bInsertarCuadrado = new JButton("Cuadrado");
		this.bInsertarCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertarCuadrado();
				
			}
		});

		this.bInsertarCirculo = new JButton("Circulo");
		this.bInsertarCirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertarCirculo();
				
			}
		});
		
		this.setLayout(new GridLayout(4, 2, 2, 2));
		this.setLayout(new GridLayout(4, 2, 10, 10));
		this.add(new JLabel("R"));
		this.add(this.cRojo);
		this.add(new JLabel("G"));
		this.add(this.cVerde);
		this.add(new JLabel("B"));
		this.add(this.cAzul);
		this.add(this.bInsertarCuadrado);
		this.add(this.bInsertarCirculo);
	}
	
	public void insertarCuadrado(){
	try {
		this.controlador.insertarCuadrado(Integer.parseInt(this.cRojo.getText()), Integer.parseInt(this.cVerde.getText()),Integer.parseInt(this.cAzul.getText()));
	} catch (Exception e) {
		JOptionPane.showMessageDialog(this.fFiguras, "Valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
	} //catch (Exception e) {
		//JOptionPane.showMessageDialog(this.fFiguras, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	//}
	
}
	
	public void insertarCirculo(){
		try {
			this.controlador.insertarCirculo(Integer.parseInt(this.cRojo.getText()), Integer.parseInt(this.cVerde.getText()),Integer.parseInt(this.cAzul.getText()));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this.fFiguras, "Valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
		} //catch (Exception e) {
			//JOptionPane.showMessageDialog(this.fFiguras, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		//}
		
	}
}
