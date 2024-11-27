package controlador;

import modelo.Figuras;
import vista.PValores;

public class Controlador {
	private Figuras figuras;
	private PValores pValores;
	
	@SuppressWarnings("deprecation")
	public Controlador(PValores pValores) {
		this.figuras = new Figuras();
		this.pValores = pValores;
		this.figuras.addObserver(this.pValores.getfFiguras().getplienzo());
	}
	public void insertarCuadrado(int cRojo, int cVerde, int cAzul) throws Exception {
		this.figuras.insertarCuadrado(cRojo, cVerde, cAzul);
	}
	public void insertarCirculo(int cRojo, int cVerde, int cAzul) throws Exception {
		this.figuras.insertarCirculo(cRojo, cVerde, cAzul);
	}

}
