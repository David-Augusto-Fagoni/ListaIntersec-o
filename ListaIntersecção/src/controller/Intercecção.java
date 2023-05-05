package controller;

import modelInt.IListaInt;
import modelInt.ListaInt;

public class Intercecção {
	public void GeraLista(IListaInt A, IListaInt B) throws Exception {
		A.addFirst(3);
		A.addLast(5);
		A.addLast(8);
		A.addLast(12);
		A.addLast(9);
		A.addLast(7);
		A.addLast(16);
		B.addFirst(9);
		B.addLast(6);
		B.addLast(2);
		B.addLast(3);
		B.addLast(7);
	}
	
	public void Operaçoes(IListaInt A, IListaInt B) throws Exception {
		int TamA = A.size();
		int TamB = B.size();
		IListaInt I = new ListaInt();
		for (int J=0; J<TamB;J++) {
			for (int K = 0;K<TamA;K++) {
				if(A.get(K) == B.get(J)) {
					I.addFirst(A.get(K));
				}
			}
		}
		
		int TamI = I.size();
		System.out.println("Pilha I: ");
		for (int J = 0; J < TamI ;J++) {
			System.out.println(I.get(J));
		}
		
		IListaInt U = new ListaInt();

		for (int J=0;J<TamA;J++) {
			U.addFirst(A.get(J));
			int Cont = 0;
			for (int K=0;K<3;K++) {
				if(J<TamB) {
					if (I.get(K) == B.get(J) && Cont == 0 ) {
						Cont = 1; 
					}
				}
			}
			if(J<TamB) {
				if (Cont == 0) {
					U.addLast(B.get(J));
				}
			}
			
		}
		int TamU = U.size();
		System.out.println("Pilha U: ");
		for (int J = 0; J < TamU ;J++) {
			System.out.println(U.get(J));
		}
	}

}
