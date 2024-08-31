package controller;

public class ThreadSapo extends Thread {

	int numero;
	int puloMax;
	int distanciaMax;
	int distanciaPercorrida = 0;
	
	public ThreadSapo(int numero, int puloMax, int distanciaMax) {
		this.numero = numero;
		this.puloMax = puloMax;
		this.distanciaMax = distanciaMax;
	}

	@Override
	public void run() {
		while (distanciaPercorrida <= distanciaMax ) {
			int pulo = (int) (Math.random() * (puloMax + 1));
			distanciaPercorrida += pulo;
			System.out.println(String.format("Sapo #%d - Tamanho do salto: %d m. Distância percorrida: %d m.", numero, pulo, distanciaPercorrida));
		}
		System.out.println(String.format("Sapo #%d chegou ao final.", numero));
	}
}
