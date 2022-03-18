package Aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double salarioBruto;
		double prestacao;
		double porcentual = 0.3;
		double limite;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor do sálario bruto:");
		salarioBruto = teclado.nextDouble();
		
		System.out.println("Quanto deseja de emprestimo:");
		prestacao = teclado.nextDouble();
		
		limite = salarioBruto * porcentual;
		
		if(prestacao > limite){
			System.out.println("O valor ultrapassou o limite maximo permitido que é " + limite);
		} else {
			System.out.println("Parabéns seu emprestimo está liberado");
		}
		
		teclado.close();
	}

}
