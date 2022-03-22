package model;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite){
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void saca(double valorSaque) {
        if (valorSaque < saldo+limite) {
            System.out.println("Não há saldo o suficiente para o saque.");
            System.out.println("Você só pode sacar no máximo R$ " + (saldo + limite));
        } else {
            saldo = (saldo + limite) - valorSaque;
            System.err.println("Você sacou R$ " + valorSaque + ", e seu saldo atual é de R$ " + (saldo + limite));
        }
    }  
    
}
