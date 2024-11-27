package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FFiguras extends JFrame{
	private PValores pValores;
	private PLienzo plienzo;
	public PLienzo getplienzo() {
		return plienzo;
	}


	
	public FFiguras() {
		this.setTitle("Giovani Andres Valencia Borja");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1280, 720);
		this.setLayout(new BorderLayout());
		this.pValores = new PValores(this);
		this.plienzo = new PLienzo();
		
		this.add(this.pValores, BorderLayout.PAGE_START);
		this.add(this.plienzo, BorderLayout.CENTER);
		this.setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new FFiguras();
	}
	
}
