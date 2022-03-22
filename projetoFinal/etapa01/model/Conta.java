package model;

public abstract class Conta {
    int numero;
    protected double saldo;

    public Conta (int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }
        
    public void saca(double valorSaque) {
        if (valorSaque < saldo) {
            System.out.println("Não há saldo o suficiente para o saque.");
            System.out.println("Você só pode sacar no máximo R$ " + saldo);
        } else {
            saldo = saldo - valorSaque;
            System.err.println("Você sacou R$ " + valorSaque + ", e seu saldo atual é de R$ " + saldo);
        }
    }

}
