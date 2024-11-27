package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PLienzo extends JPanel implements Observer{
	private ArrayList<Integer> valores;

	@Override
	public void paint(Graphics g) {
		int rojo= 0;
		int verde= 0;
		int azul= 0;
				
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		
		
		for (int i  = 0; i< this.valores.size(); i++) {
			rojo = valores.get(i);
			
			
		}
		g2d.setColor(new Color(255, 255, 255));
	
		int[] unaRespuesta = {100, 200};
		int[] dosRespuestas = {100, 200};
		g2d.fillPolygon(unaRespuesta, dosRespuestas, 2);
		
		
}

	@Override
	public void update(Observable o, Object arg) {
		this.valores = (ArrayList<Integer>)arg;
		this.repaint();
		
	}

}
