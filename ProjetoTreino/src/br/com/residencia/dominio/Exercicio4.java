package br.com.residencia.dominio;
import java.util.Scanner;
//Ler dez valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente ao final imprima a soma de todos os números lidos e subtraindo o 8º. Valor lido.
public class Exercicio4 {
public static void main(String[] args) {
	
Scanner p = new Scanner(System.in);

int temp=0;
int somanumeros = 0;
int[]vetnum = new int[11];


for(int i = 0; i< vetnum.length; i++) {		
	System.out.println("Entre com um valor:  ");	
	vetnum[i] = p.nextInt();
	somanumeros = somanumeros + vetnum[i];	
	
}


for(int i=0; i<vetnum.length-1 ; i++){

   for(int l=0; l<vetnum.length-1-i; l++){
     
      if(vetnum[l] > vetnum[l+1]){
      
         temp = vetnum [l];
         vetnum[l] = vetnum [l+1];
         vetnum [l+1] = temp;
       
 }
     
         } 
                }
for(int i=0; i<vetnum.length-1 ; i++){

     System.out.println("Os valor Ordenados são:" + vetnum[i]);
            }






for(int i = 0; i< vetnum.length; i++)	{
   for(int l =i+1; l < vetnum.length; l++) {
	  if(i !=l) {
		if(vetnum[i] == vetnum[l]) {			
			System.out.println("");
			break;
               }else {
    	          System.out.println("números que não se repetem:  "+ vetnum[l]);	
                    break;
     }
			
	
           }
	              }
		
	

                              }
 

if(vetnum[7] > 0) {
	somanumeros = somanumeros -vetnum[7];
}
System.out.println("a soma dos numeros digitados é " + somanumeros);		
	

	




}
}

