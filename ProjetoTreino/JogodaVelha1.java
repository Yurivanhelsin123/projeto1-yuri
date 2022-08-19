package br.com.residencia.dominio;

import java.util.Scanner;

public class JogodaVelha1 {
	  
private int jogo[][]= new int[3][3];
	  
 public void JogoDaVelha(){
	  		for(int i = 0; i < 3; i++) {
	  			for(int j = 0; j < 3; j++) {
	  				jogo[i][j] = 0;
	 			}
	 		}
	  		
	  		
 
}
	 
 
	 	public static void main(String[] argumentos) {
	 	Scanner teclado = new Scanner(System.in);
	 	Jogodavelha2 jogo = new Jogodavelha2();
	 	int jogador = 1;
	 	int vencedor = jogo.verificarVencedor();
	 	jogo.mostrar();
	 		while (vencedor == 0) {
	 		System.out.println("Jogador " + jogador);
	 		System.out.print("Linha: ");
	 		int linha = teclado.nextInt();
	 		System.out.print("Coluna: ");
	 		int coluna = teclado.nextInt();
	 			if (!jogo.efetuarJogada(jogador, linha-1, coluna-1)) {
	 				System.out.println("Jogada inválida...");
			} else {
	 			jogador = (jogador == 1) ? 2 : 1;
	 			}
	 			jogo.mostrar();
	 			vencedor = jogo.verificarVencedor();
	 		}
	 		switch (vencedor) {
	 	case 1 :
	 		System.out.println("Vencedor jogador 1");
	 		break;
	 	case 2:
	 		System.out.println("Vencedor jogador 2");
	 		break;
		case 3:
			System.out.println("Empate");
			break;
			}
		}
	}
	
	
	
	
	
	
	
