package br.banco;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    } 
    
    @Override
    public String saca(double valorSaque) {
        if(valorSaque <= getSaldo()) {
            return super.saca(valorSaque);
        }
        return "Você não tem saldo suficiente para o saque.";
    }

    @Override
    public String deposita(double valorDeposito) {
        return super.deposita(valorDeposito);
    }

    @Override
    public String toString() {
        return "Número da conta: "+ numero + "\nSaldo em conta: R$ " + saldo;
    }
    
}
