package br.com.residencia.dominio;

import java.util.Scanner;



public class Exercicio10 {
public static void main(String[] args) {
	Scanner q = new Scanner(System.in);	
	String conceito;
	double nota1;
	double nota2;
	double nota3;	
	double mediaexercicios =0;
	double mediaaproveitamento=0;
	
System.out.println("Entre com sua identificação");
int matricula = q.nextInt();
System.out.println("O número da sua identificação é : " +matricula);
	
System.out.println("Entre com a nota1 ");
nota1 = q.nextInt();
System.out.println("A sua primeira nota foi  : " + nota1);	
	
System.out.println("Entre com a nota2 ");
nota2 = q.nextInt();
System.out.println("A sua segunda nota foi   : " + nota2);
	
System.out.println("Entre com a nota3");
nota3 = q.nextInt();
System.out.println("A sua terceira nota foi : " + nota3);
	
	
mediaexercicios=( nota1+nota2+nota3)/3;
mediaaproveitamento =(nota1  + nota2 * 2 + nota3 * 3 + mediaexercicios)/7;

System.out.println("A sua média nos exercícios foi de: "    + mediaexercicios);	
System.out.println("A sua média do seu aproveitamento foi de: "    + mediaaproveitamento);	

	
if(mediaaproveitamento == 9) {
		conceito ="A";
		System.out.println("Parabéns ,você foi ,em sua avaliação você tirou " + conceito);	
   }else if((mediaaproveitamento >=7.5 )&& (mediaaproveitamento <9.0) ){			
			conceito ="B";
			System.out.println("Parabéns ,você foi aprovado,pois em sua valiação você tirou  " + conceito);	
		}else  if(mediaaproveitamento >= 6.0 && mediaaproveitamento <=7.5){
				    conceito ="C";
				    System.out.println("Parabéns ,você foi aprovado, pois em sua valiação você tirou  " + conceito);	
		    	}else if(mediaaproveitamento >=4.0 && mediaaproveitamento <=6.0) {
			     	    conceito ="D";
				        System.out.println("Que pena , você está reprovado, pois em sua valiação você tirou  " + conceito);
			            }else if(mediaaproveitamento<4) {
				             conceito ="E";
				             System.out.println("Que pena , você está reprovado,pois em sua valiação você tirou  " + conceito);
			}





		}	
		

				
				

		
		
}
	
		
		
		
		
		

	
	
	
	
	


