package br.com.residencia.dominio;
//Uma cidade deseja fazer uma pesquisa entre seus habitante
//Faça um algoritmos para coletar dados sobre o salário e número
//de filhos de cada habitante e após as leituras, escrever: a) 
//Média de salário da população b) Média do número de filhos c) 
//Maior salário dos habitantes d) Percentual de pessoas com salário menor que R$ 150,00.


import java.util.Scanner;

public class Exercicio6 {
	
	
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


double percentsal =0;
int  salmenor=0;
double medianumfilhos=0;
double medianumsalarios=0;
int quantfilhos =0; 
double totalsalario=0;	
int salario= 0;
int numerodefilhos = 0;
int[]vettot  = new int[3];

for(int cont =0; cont<vettot.length; cont ++ ) {
	
	System.out.println("Informe o número de filhos : ");	
		vettot[cont] = sc.nextInt();
		numerodefilhos =numerodefilhos+vettot[cont];
		


	
}



int[]vettotsal = new int[3];
int maiorsal = Integer.MIN_VALUE;
for(int contar =0; contar< vettotsal.length; contar ++ ) {
		System.out.println("Informe o seu salário : ");		
		vettotsal[contar] = sc.nextInt();
		totalsalario =totalsalario+vettotsal[contar];
		if(vettotsal[contar] > maiorsal) {
			maiorsal =vettotsal[contar];
			
		}
		
		
if(vettotsal[contar] < 150) {
salmenor = salmenor + 1;
	
}


medianumfilhos= numerodefilhos/vettot.length;
medianumsalarios = totalsalario/vettotsal.length;
percentsal = (salmenor * 100 )/ vettotsal.length;

}
System.out.println("A quantidade de filhos  total dos entrevistados  é : "  + numerodefilhos);		
System.out.println("O somatório do salário dos entrevistados  é : "  + totalsalario);		
System.out.println("A média do filhos dos  dos entrevistados  é : "  + medianumfilhos);	
System.out.println("A média dos salarios dos  é : "  + medianumsalarios);	
System.out.println("O maior salario encontrado foi de   : "  + maiorsal);	
System.out.println("A quantidade  de pessoas com salario menor que 150 é   : "  + salmenor);	
System.out.println("O percentual de pessoas com salario menor que 150 é   : "  + percentsal);	


}
}






			