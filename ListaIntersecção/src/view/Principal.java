package view;

import controller.Intercecção;

import modelInt.IListaInt;
import modelInt.ListaInt;

public class Principal {
	public static void main(String[] args) {
		IListaInt A = new ListaInt();
		IListaInt B = new ListaInt();
		Intercecção Inter = new Intercecção();
		try {
			Inter.GeraLista(A,B);
			Inter.Operaçoes(A,B);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
