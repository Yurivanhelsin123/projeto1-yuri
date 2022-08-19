package br.com.residencia.dominio;

import java.util.Scanner;

//Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
public class Exercicio5 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Entre com o primeiro número");		
		Scanner p = new Scanner(System.in);
		int n1 = p.nextInt();		
		
		System.out.println("Entre com o segundo número");			
		int n2 = p.nextInt();		
		
		if( n2 == 0) {			
			System.out.println("Número inválido, Digite um número diferente de 0");	
			int n3 = p.nextInt();	
			System.out.println("Os números digitados foram:"  + n3 + " e " + n1);			
			System.out.println("A divisão dos numeros é "  +  n1/n3 );
		}else {
			
			System.out.println("Os números digitados foram:"  + n2 + " e " + n1);
			System.out.println("A divisão dos numeros é "  +  n1/n2 );
			
		}
			
			
	}
	
	

}





