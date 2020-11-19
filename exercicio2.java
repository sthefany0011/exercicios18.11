package Atividades;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x, num1,par=0, impar=0;
	
       Scanner ler = new Scanner(System.in);
       
       for(x=1;x<=10;x++) {
    	   
        System.out.println("Digite o numero inteiro:");
       num1=ler.nextInt();
    
        if(num1 %2 ==0) {
           par++;
       }
        else {
        	impar++;
        	
        }
       }
       
        System.out.printf("Quantidades de par: %d",par);
        System.out.printf("Quantidades de impar: %d",impar);
	}
	


}