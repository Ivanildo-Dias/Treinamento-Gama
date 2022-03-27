package br.projetoFinal.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_conta_corrente")
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "numero")
    private int numero;   
    
    @Column(name = "saldo")
    private double saldo;

    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

    public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    /*
    public ContaCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void depositar(double valorDeposito){
        if(valorDeposito > 0) {
            saldo += valorDeposito;
        }
    }

    public void  saca(double valorSaque) {
        if(valorSaque >= 0) {
            saldo -= valorSaque;
        }
    }
    */
}
