package br.com.residencia.dominio;

import java.util.Scanner;


public class Exercicio11 {
public static void main(String[] args) {	
Scanner in= new Scanner(System.in);	
double percentA =0;
double percentB =0;
int votoA =0;
int votoB=0;
int nulos=0;
int branco=0;
int votacao=0;
int totaldevotos=0;



do {
	
	System.out.println("Digite seu voto");
	
	votacao  =in.nextInt();
	switch(votacao) {
	
	case 1:
		votoA++;
		System.out.println("Candidato A teve:"  + votoA + "votos");
		break;
	
	case 2:
		votoB++;
		System.out.println("Candidato B teve:"  + votoB + "votos");
		break;
	case 3:
		branco++;
		System.out.println("A quantidade de votos em branco foi de " + branco);
		break;
		
	default:
       if(votacao !=0)	{
    	   System.out.println("voto nulo");
    	   
       }

	}
	
    }while(votacao!=0);
System.out.println("FIM");
totaldevotos = votoA +votoB + branco +nulos;
if(totaldevotos > 0) {
	
}



	percentA =(votoA * 100)/totaldevotos;
	percentB=(votoB * 100)/totaldevotos;
	System.out.println("O percentual de votos que o candidato A obteve foi de "  + percentA);
	System.out.println("O percentual de votos que o candidato A obteve foi de "  + percentB);
	
}


























	  
		 









	
		
		
		
		
		
		
		
		
		
		
		
		
}	
		
		
	
		
		
		

		
		
		
		
	
	
	
	
	
	
	

