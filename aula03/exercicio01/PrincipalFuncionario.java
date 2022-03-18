package Aula03.Exercicio01;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Ivanildo", 42, 55);
		System.out.println(funcionario.mostrar());
		System.out.println(funcionario.salario());
		FuncionarioSenior senior = new FuncionarioSenior("Juliana", 42, 55, 20);
		System.out.println(senior.mostrar());
		System.out.println(senior.salario());
	}

}
