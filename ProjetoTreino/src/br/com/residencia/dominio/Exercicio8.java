package br.com.residencia.dominio;

import java.util.Scanner;

//exercico16
//	Fa�a um algoritmo para ler uma sequ�ncia de 50 n�meros, verificar e escrever se existem n�meros repetidos na sequ�ncia e em que posi��es se encontram.

public class Exercicio8 {
public static void main(String[] args) {	
Scanner m = new Scanner(System.in);
		
int[]vetnum  = new int[50];   	
for(int i =0; i<vetnum.length; i ++ ) {
	
		System.out.println("Informe um n�mero: ");	
	    vetnum[i] = m.nextInt();		    
	         	
}

int valor =0; 
for(int i = valor; i < vetnum.length; i++ ) {
	for(int j =i+1; j < vetnum.length; j++) {
		if(i !=j) {
			if(vetnum[i] == vetnum[j]) {
				System.out.println("Estes s�o os valores  repetidos:" + vetnum[i] +"  posi��o do n�mero repetido �   " +  i );	
							}
		}
		
	
	}
	
	
}








}

}
