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
    public String saca(double valorSaque) {
        if(valorSaque <= getSaldo()+limite) {
            return super.saca(valorSaque);
        }
        return "Você não tem saldo suficiente para o saque.";
    }

    @Override
    public boolean deposita(double valorDeposito){
        return super.deposita(valorDeposito);
    } 
    
    @Override
    public String toString() {
        return "Número da conta: "+ numero + "\nSaldo em conta: R$ " + saldo + "\nLimite da conta: R$ " + limite;
    }

}
