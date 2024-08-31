package view;

import controller.ThreadSapo;

public class Main {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			ThreadSapo threadSapo = new ThreadSapo(i + 1, 6, 20);
			threadSapo.start();
		}
	}
}
