/*
 * Fazer uma aplica��o de uma corrida de sapos, com 5 Threads, cada Thread con_
 * trolando 1 sapo. Deve haver um tamanho m�ximo para cada pulo do sapo (em 
 * metros) e a dist�ncia m�xima para que os sapos percorram. A cada salto, um 
 * sapo pode dar uma salto de 0 at� o tamanho m�ximo do salto (valor aleat�rio). 
 * Ap�s dar um salto, a Thread, para cada sapo, deve mostrar no console, qual 
 * foi o tamanho do salto e quanto o sapo percorreu. Assim que o sapo percorrer 
 * a dist�ncia m�xima, a Thread deve apresentar que o sapo chegou e qual sua co_
 * loca��o. O exerc�cio deve ser resolvido todo em console, ou seja, como se es_
 * tivesse sendo narrado. Aten��o para a forma de definir a ordem de chegada.
 */

package controller;

public class ThreadCorrida extends Thread {

	private int idSapo;  
	private int distanciaMax = 121;
	private int tamanhoSalto;  //De 0 a X (valor aleat�rio) metros
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
		System.out.println("Sapo " + idSapo + " chegou. Sua coloca��o � " 
				+ colocacao + "!");
	}

}
