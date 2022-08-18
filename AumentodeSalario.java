package br.com.modelo.impulsotec;
import java.util.Scanner;

public class AumentodeSalario {
public static void main(String[] args) {
	
	System.out.println("Qual o valor do seu salario? ");		
	Scanner  d = new Scanner(System.in);
	double salario = d.nextDouble();	
	System.out.println("Se voc� teve promo��o de cargo digite 1, "
	+ "se teve aumento de salario por diss�dio digite 2,se n�o teve aumento digite 3 ");
	
	int opcao = d.nextInt();
	double salariofinal;
	if(opcao ==1) {
		double aumento = 0.3;
		salariofinal = (salario * aumento)+ salario;		
	}else if(opcao == 2){
		
		salariofinal =salario + 100;
	}else {		
		
		salariofinal = salario;			
	}
			
	System.out.println("Seu sal�rio este ano ser� de "   +  salariofinal);			
System.out.printl("");
		//instru��o switch
	

   
}


}

	
	















