package br.com.residencia.dominio;

import java.util.Scanner;

//Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor n�o pode ser aceito o valor zero e imprimir o resultado da divis�o do primeiro valor lido pelo segundo valor lido.
public class Exercicio5 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Entre com o primeiro n�mero");		
		Scanner p = new Scanner(System.in);
		int n1 = p.nextInt();		
		
		System.out.println("Entre com o segundo n�mero");			
		int n2 = p.nextInt();		
		
		if( n2 == 0) {			
			System.out.println("N�mero inv�lido, Digite um n�mero diferente de 0");	
			int n3 = p.nextInt();	
			System.out.println("Os n�meros digitados foram:"  + n3 + " e " + n1);			
			System.out.println("A divis�o dos numeros � "  +  n1/n3 );
		}else {
			
			System.out.println("Os n�meros digitados foram:"  + n2 + " e " + n1);
			System.out.println("A divis�o dos numeros � "  +  n1/n2 );
			
		}
			
			
	}
	
	

}





