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
        
    public String  saca(double valorSaque) {
        if(valorSaque >= 0) {
            saldo -= valorSaque;
            return "Saque realizado com sucesso!\nVocê acaba de sacar R$ " + valorSaque;
        }
        return "Você não tem saldo suficiente para o saque.";
    }

    public String deposita(double valorDeposito){
        if(valorDeposito > 0) {
            saldo += valorDeposito;
            return "O depósito de R$ " + valorDeposito + ", foi realizado com sucesso!";
        }
        return "Não foi possível realizar o depósito.";
    }

    @Override
    public String toString() {
        return "Número da conta: "+ numero + "\nSaldo em conta: R$" + saldo;
    }

}
