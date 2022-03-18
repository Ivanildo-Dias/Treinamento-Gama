package Aula03.Exercicio01;

public class FuncionarioSenior extends Funcionario {
	private Double bonus;
	
	public FuncionarioSenior(String nome, double horasTrabalhadas, double valorHora, double bonus) {
		super(nome, horasTrabalhadas, valorHora);
		this.bonus = bonus;
	}
	
	@Override
	public double salario() {
		return super.salario() + (getHorasTrabalhadas() / 10) * bonus;
	}
	
	@Override
	public String mostrar() {
		return super.mostrar() + ", Bonus: " + bonus;
	}	
}

