package br.com.residencia.dominio;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	System.out.println("Informe quanto vc ganha por hora trabalhada : ");
	double salariohora = x.nextDouble();
	System.out.println("Eu ganho  � por hora  " + salariohora );
	
	
	
	System.out.println("Quantas horas vc trabalhou no m�s : ");
	double horastrabalhadas = x.nextDouble();
	System.out.println("total de horas no mes   " + horastrabalhadas );
	
	//CONSIDERANDO O M�S COM 28 DIAS 
	

	
    //double horaregular= 0;
	//double horaextra =0;
	double valorremuneracao = salariohora * 160;
	
	
	
	if(horastrabalhadas <=160 ) {
		System.out.println("Este mes minha remunera��o foi de : "+  valorremuneracao);
	}else {
		salariohora =(salariohora* 50 /100);
		valorremuneracao = valorremuneracao + (horastrabalhadas - 160  ) * salariohora;
		
		
	}
	System.out.println("Minha remunera��o este m�s foi de : " + valorremuneracao);
	
	
	
	
	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

