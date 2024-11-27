package modelo;

import java.util.ArrayList;
import java.util.Observable;

public class Figuras extends Observable{

	public void insertarCuadrado(int cRojo, int cVerde, int cAzul) throws Exception {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		if (cRojo <0 || cRojo >255 || cVerde<0 ||cVerde>255 || cAzul<0 || cAzul>255) {
		throw new Exception("Valor indefinido");
		}
		valores.add(cRojo);
		valores.add(cVerde);
		valores.add(cAzul);
		notificar(valores);
	}

	public void insertarCirculo(int cRojo, int cVerde, int cAzul) throws Exception {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		if (cRojo <0 || cRojo >255 || cVerde<0 ||cVerde>255 || cAzul<0 || cAzul>255) {
			throw new Exception("Valor indefinido");
			}
		valores.add(cRojo);
		valores.add(cVerde);
		valores.add(cAzul);
		notificar(valores);
	}

	private void notificar(ArrayList<Integer> valores) {
		this.setChanged();
		this.notifyObservers(valores);
	}
	
}
