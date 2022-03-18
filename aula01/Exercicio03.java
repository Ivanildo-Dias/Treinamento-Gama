package Aula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor");
		valor = teclado.nextInt();
		
		for(int cont = 1; cont <= valor; cont++) {
			System.out.print(cont + " ");
		}

		teclado.close();

	}
	
}

