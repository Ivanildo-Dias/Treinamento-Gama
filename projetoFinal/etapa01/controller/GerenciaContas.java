package controller;

import java.util.ArrayList;

import model.Conta;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void adicionar(Conta c) {
        contas.add(c);
    }

    public String exibir(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return contas.get(i).toString();
            }
        }
        return "Não encontrado";
    }

    /*
    public boolean alterarNumeroConta(int numero, int novoNumero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                contas.get(i).getNumero(novoNumero);
                ;
                return true;
            }
        }
        return false;
    */

    private int posicao(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    public boolean remover(int numero) {
        int posicao = posicao(numero);
        if (posicao >= 0) {
            if (contas.remove(posicao) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean alterarNumeroConta(int numero) {
        return false;
    }

}
