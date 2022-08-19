package br.com.residencia.dominio;

import java.util.Scanner;

//14)	Escreva um algoritmo para ler 15 votos para o candidato A ou B.
//A cada 3 votos no candidato B, altere o 3º. Voto para o candidato A.
//Calcular e escrever o percentual de votos para cada candidato.


public class Exercicio7 {
	
	
	
public static void main(String[] args) {
	
Scanner u =new Scanner(System.in);
double percentcandidatoA=0;
double percentcandidatoB=0;
int votoA =0;
int votoB = 0;
int[]vetorvoto = new int[15];	
	for(int r=0; r<vetorvoto.length; r++) {			
		System.out.println("Comece a votação, digite 1 para o candidato  ou 2 para o candidato B ");
		vetorvoto[r] = u.nextInt();
		if(vetorvoto[r] == 1) {
		votoA++;		
		}else if(vetorvoto[r] == 2) {
			votoB++;
			
		}else {
			System.out.println("Voto inválido");
		}
	
	 
 //A cada tres votos no candidato B , um voto vai para o candidato A
				if(votoB == (3* votoA)){
	                  	votoB =votoB -1;
	                    votoA = votoA +1;
		}else {
			
			
			
			
		}
		}
//	       	
	       	
	       	
	       	
	

	
	
	
	
	
    percentcandidatoA =( votoA * 100 )/vetorvoto.length;
    percentcandidatoB =( votoB * 100 )/vetorvoto.length;
	System.out.println("O número de votos para o candidato A foi de :" + votoA);

	System.out.println("O número de votos para o candidato B foi de : "  + votoB);

	System.out.println("O percentual  de votos para o candidato A foi de : "  + percentcandidatoA);

	System.out.println("O percentual de de votos para o candidato B foi de : "  + percentcandidatoB);







}
}
