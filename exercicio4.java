package Atividades;
//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner ler = new Scanner(System.in);
		 int x=0, soma=0;
		 
		 do {
		 System.out.println("Digite um n�mero inteiro: ");
		 x= ler.nextInt();
		soma+=x ;
		 }
while(x !=0);
System.out.printf("\n O valor da soma dos numeros digitados � %d",soma);
		 }


	}
	
