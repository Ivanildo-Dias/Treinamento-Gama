package Aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a primeiro nota");
		nota1 = teclado.nextDouble();
		
		System.out.println("Insira a segundo nota");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2) / 2;
		System.out.println("_________________________________________________");
		System.out.println("A média entre os valores é: " + media);
		
		teclado.close();
	}

}