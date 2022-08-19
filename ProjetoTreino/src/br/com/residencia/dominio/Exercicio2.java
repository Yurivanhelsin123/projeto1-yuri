package br.com.residencia.dominio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner g = new Scanner(System.in);
		System.out.println("Quantas maçãs vc comprou");
		int maca = g.nextInt();
		System.out.println("Essa foi a quantidade que comprei " + maca );
		
		
		
		
		double precomaca = 0;
		if(maca<12) {
			precomaca = maca * 1.30;
		}else {
			
		precomaca = maca * 1;
		}
		System.out.println("O total que paguei foi de: " + precomaca );
	}
	
	
	
	
	
}
