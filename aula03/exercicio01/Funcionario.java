package aula03.exercicio01;

public class Funcionario {
	private String nome;
	private double horasTrabalhadas;
	private double valorHora;
	
	public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
		this.nome = nome;
		setHorasTrabalhadas(horasTrabalhadas);
		setValorHora(valorHora);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		if(horasTrabalhadas > 0) {
		this.horasTrabalhadas = horasTrabalhadas;
		}
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		if(valorHora > 0) {
		this.valorHora = valorHora;
		}
	}
	
	public double salario() {
		return horasTrabalhadas * valorHora;
	}
	
	public String mostrar() {
		return "Nome: " + nome + ", Horas trabalhadas: " + horasTrabalhadas + ", Valor hora: " + valorHora;
	}
}

