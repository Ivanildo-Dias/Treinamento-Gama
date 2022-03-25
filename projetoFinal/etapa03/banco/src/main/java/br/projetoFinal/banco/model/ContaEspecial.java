package br.projetoFinal.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_conta_especial")
public class ContaEspecial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "numero")
    private int numero;   
    
    @Column(name = "saldo")
    private double saldo;

    @Column(name = "limite")
    private double limite;

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

    public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
