package aula02.exercicio01;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("HB20","Hyundai",10);
		
		veiculo.visualizar();
		veiculo.setConsumo(15);
		System.out.println("Consumo = " + veiculo.getConsumo());
	}

}
