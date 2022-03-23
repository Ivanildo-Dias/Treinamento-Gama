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
        if(valorSaque <= saldo) {
            saldo -= valorSaque;
            return "Saque realizado com sucesso!\nVocê acaba de sacar R$ " + valorSaque;
        }
        return "Você não tem saldo suficiente para o saque.";
    }

    public boolean deposita(double valorDeposito){
        if(valorDeposito > 0) {
            saldo += valorDeposito;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Número da conta: "+ numero + "\nSaldo em conta: R$" + saldo;
    }

}
