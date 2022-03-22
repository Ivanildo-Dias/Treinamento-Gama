package model;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    } 
    
    @Override
    public String toString() {
        return "Número da conta: "+ numero + "\nSaldo em conta: R$ " + saldo;
    }
    
}
