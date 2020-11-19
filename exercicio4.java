package Atividades;
//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner ler = new Scanner(System.in);
		 int x=0, soma=0;
		 
		 do {
		 System.out.println("Digite um número inteiro: ");
		 x= ler.nextInt();
		soma+=x ;
		 }
while(x !=0);
System.out.printf("\n O valor da soma dos numeros digitados é %d",soma);
		 }


	}
	
