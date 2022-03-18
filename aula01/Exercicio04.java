package aula01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor");
		valor = teclado.nextInt();
		
		for(int cont = 0; cont <= 10; cont++) {
			System.out.println(valor + " X " + cont + " = " + (valor*cont));
		}
		teclado.close();
	}

}

