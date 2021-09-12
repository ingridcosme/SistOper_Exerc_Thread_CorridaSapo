/*
 * Fazer uma aplicação de uma corrida de sapos, com 5 Threads, cada Thread con_
 * trolando 1 sapo. Deve haver um tamanho máximo para cada pulo do sapo (em 
 * metros) e a distância máxima para que os sapos percorram. A cada salto, um 
 * sapo pode dar uma salto de 0 até o tamanho máximo do salto (valor aleatório). 
 * Após dar um salto, a Thread, para cada sapo, deve mostrar no console, qual 
 * foi o tamanho do salto e quanto o sapo percorreu. Assim que o sapo percorrer 
 * a distância máxima, a Thread deve apresentar que o sapo chegou e qual sua co_
 * locação. O exercício deve ser resolvido todo em console, ou seja, como se es_
 * tivesse sendo narrado. Atenção para a forma de definir a ordem de chegada.
 */

package controller;

public class ThreadCorrida extends Thread {

	private int idSapo;  
	private int distanciaMax = 121;
	private int tamanhoSalto;  //De 0 a X (valor aleatório) metros
	private static int colocacao;
	
	public ThreadCorrida(int idSapo) {
		this.idSapo = idSapo;
	}
	
	@Override
	public void run() {
		corridaSapo();
	}

	private void corridaSapo() {
		int distanciaPercorrida = 0;
		while(distanciaPercorrida < distanciaMax) {
			tamanhoSalto = (int)(Math.random() * 12);  //Salto de 0 a 11 metros
			distanciaPercorrida += tamanhoSalto;
			System.out.println("Sapo " + idSapo + " deu um salto de " 
					+ tamanhoSalto + "m e percorreu " + distanciaPercorrida
					+ " metros.");
		}
		colocacao++;
		System.out.println("Sapo " + idSapo + " chegou. Sua colocação é " 
				+ colocacao + "!");
	}

}
