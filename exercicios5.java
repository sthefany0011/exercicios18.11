package Atividades;

import java.util.Scanner;

//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
public class exercicios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner ler = new Scanner(System.in);
		 int contador=0, numero, soma=0;
		 float media=0;
				 
		 do {
		 System.out.println("Entre com um numero inteiro : ");
		 numero= ler.nextInt();
		 if(numero %3 ==0) {
		contador++;
		 }
		 }
while(numero !=0);
		 contador --;
		 media =soma/contador;
System.out.printf("\n M�dia dos n�meros multiplos de 3: %f", media);
		 }

}

