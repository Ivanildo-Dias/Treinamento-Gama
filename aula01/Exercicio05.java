package aula01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int valor=1;
		int soma=0;
		
		Scanner teclado = new Scanner(System.in);
		
		while (valor!=0){
			System.out.println("Por favor, insira um número inteiro:");
			valor = teclado.nextInt();
			soma = soma + valor;
		}
		
		System.out.println("Fim do programa.");
		System.out.println("A soma dos valores informados é de: " + soma);
		
		teclado.close();
	}
    
}

