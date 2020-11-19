package Atividades;

import java.util.Scanner;

//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
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
System.out.printf("\n Média dos números multiplos de 3: %f", media);
		 }

}

