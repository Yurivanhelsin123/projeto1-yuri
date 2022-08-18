package br.com.residencia.dominio;

import java.util.Scanner;

public class VendaIngressos {
public static void main(String[] args) {
	Scanner y = new Scanner(System.in);
	
	
double vendasA =0;
double vendasB =0;
double vendasC =0;	
double rendaA=0;
double rendaB=0;
double rendaC=0;
double arrecadacaototal;

int[]vetingresso = new int[4];
for(int p=0; p< vetingresso.length; p++) {			
	System.out.println("Escolha sua categoria,digite 1 para A,2 para B e 3 para C ");
	vetingresso[p] = y.nextInt();
	if(vetingresso[p] == 1) {
	vendasA++;	
	rendaA =(vendasA * 50);
	}else if(vetingresso[p] == 2) {
		vendasB++;	
		rendaB =(vendasB * 30);
	}else if(vetingresso[p]==3) {
		vendasC++;
		rendaC =(vendasC* 20);
	}else {
		System.out.println("categoria inválida");
	}

	
	
	
	
		
	
	
	
	
	
	
	}
	
arrecadacaototal = rendaA +rendaB +rendaC;
	System.out.println(rendaA);
	System.out.println(rendaB);
	System.out.println(rendaC);
	System.out.println(arrecadacaototal);
	
	
	
	
}
}
