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
        return "A conta não foi encontrado.";
    }

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

    public String saca(int numero, double valorSaque) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return contas.get(i).saca(valorSaque);
            }
        }
        return "Você não tem saldo suficiente para o saque.";
    }

    public String deposita(int numero, double valorDeposito) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return contas.get(i).deposita(valorDeposito);
            }
        }
        return "Não foi possível realizar o depósito.";
    }

}
