package br.com.residencia.dominio;
//Uma cidade deseja fazer uma pesquisa entre seus habitante
//Fa�a um algoritmos para coletar dados sobre o sal�rio e n�mero
//de filhos de cada habitante e ap�s as leituras, escrever: a) 
//M�dia de sal�rio da popula��o b) M�dia do n�mero de filhos c) 
//Maior sal�rio dos habitantes d) Percentual de pessoas com sal�rio menor que R$ 150,00.


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
	
	System.out.println("Informe o n�mero de filhos : ");	
		vettot[cont] = sc.nextInt();
		numerodefilhos =numerodefilhos+vettot[cont];
		


	
}



int[]vettotsal = new int[3];
int maiorsal = Integer.MIN_VALUE;
for(int contar =0; contar< vettotsal.length; contar ++ ) {
		System.out.println("Informe o seu sal�rio : ");		
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
System.out.println("A quantidade de filhos  total dos entrevistados  � : "  + numerodefilhos);		
System.out.println("O somat�rio do sal�rio dos entrevistados  � : "  + totalsalario);		
System.out.println("A m�dia do filhos dos  dos entrevistados  � : "  + medianumfilhos);	
System.out.println("A m�dia dos salarios dos  � : "  + medianumsalarios);	
System.out.println("O maior salario encontrado foi de   : "  + maiorsal);	
System.out.println("A quantidade  de pessoas com salario menor que 150 �   : "  + salmenor);	
System.out.println("O percentual de pessoas com salario menor que 150 �   : "  + percentsal);	


}
}






			