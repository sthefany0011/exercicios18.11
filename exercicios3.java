package Atividades;
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

import java.util.Scanner;

public class exercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner ler = new Scanner(System.in);

		 int idade=0,jovem=0, idoso=0;
		 
	       while(idade!=-99) {
	       
	    	   System.out.println("Informe sua idade :\n");
		       idade=ler.nextInt();
			 
	       if(idade < 0){
	       System.out.println("\nIdade inválida");
	}
	       else if(idade>=0 && idade<=21) {
	    	   jovem++;
	       }
	       else if(idade>50) {
	    	   idoso++;
	       }
	       

	       
}
	       System.out.printf("Total de Jovens:\n %d", jovem);
	       System.out.printf("\nTotal de Idoso:\n %d", idoso);
	}
}