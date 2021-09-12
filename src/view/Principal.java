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

package view;

import controller.ThreadCorrida;

public class Principal {

	public static void main(String[] args) {
		for(int idSapo = 1; idSapo <= 5; idSapo++) {
			Thread tCorrida = new ThreadCorrida(idSapo);
			tCorrida.start();
		}

	}

}
