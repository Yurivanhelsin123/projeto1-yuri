package br.com.residencia.dominio;

import java.util.Scanner;

//exercico16
//	Faça um algoritmo para ler uma sequência de 50 números, verificar e escrever se existem números repetidos na sequência e em que posições se encontram.

public class Exercicio8 {
public static void main(String[] args) {	
Scanner m = new Scanner(System.in);
		
int[]vetnum  = new int[50];   	
for(int i =0; i<vetnum.length; i ++ ) {
	
		System.out.println("Informe um número: ");	
	    vetnum[i] = m.nextInt();		    
	         	
}

int valor =0; 
for(int i = valor; i < vetnum.length; i++ ) {
	for(int j =i+1; j < vetnum.length; j++) {
		if(i !=j) {
			if(vetnum[i] == vetnum[j]) {
				System.out.println("Estes são os valores  repetidos:" + vetnum[i] +"  posição do número repetido é   " +  i );	
							}
		}
		
	
	}
	
	
}








}

}
