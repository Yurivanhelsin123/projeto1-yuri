package br.com.residencia.dominio;

import java.util.Scanner;

//18)	O cardápio de uma lancheria é o seguinte:
//Especificação	Código	Preço
//Cachorro quente	100	1,20
//Bauru simples	101	1,30
//Bauru com ovo	102	1,50
//Hambúrger	103	1,20
//Cheeseburguer	104	1,30
//Refrigerante	105	1,00
//Escrever um algoritmo que leia o código do item pedido, a quantidade 
//e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.

public class Exercicio9 {
public static void main(String[] args) {
	
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o seu código");
	
	//int quantlanche =0;
	double valorpago =0;
	int pedido =sc.nextInt();
	System.out.println("Digite a quantidade ");
	int quantlanche =sc.nextInt();
	switch(pedido) {
	
	case 100:
		
		valorpago =quantlanche * 1.20 ; 
		System.out.println("A quantidade de lanche foi de: "  + quantlanche +  "   O valor pago foi de:"  + valorpago );
		break;
	
	case 101:
	
		valorpago =quantlanche * 1.30 ; 
		System.out.println("A quantidade de lanche foi de  "  + quantlanche +  "  O valor pago foi de:"  + valorpago );
		break;
	case 102:
		quantlanche++;
		valorpago =quantlanche * 1.50 ; 
		System.out.println("A quantidade de lanche foi de "  + quantlanche +  "   O valor pago foi de:"  + valorpago );
		break;
		
	case 103:
		
		valorpago =quantlanche * 1.20 ; 
		System.out.println("A quantidade de lanche foi de "  + quantlanche +  "   O valor pago foi de:"  + valorpago );
		break;
	case 104:
		
		valorpago =quantlanche * 1.30 ; 
		System.out.println("A quantidade de lanche foi de "  + quantlanche +  "   O valor pago foi de:"  + valorpago );
		break;
	case 105:
	
		valorpago =quantlanche * 1.00 ; 
		System.out.println("A quantidade de lanche foi de "  + quantlanche +  "  O valor pago foi de:"  + valorpago );
		break;
					
		
		
		
	default:
       if( pedido!=0)	{
    	   System.out.println("Não houve pedidos");
       }
       
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
