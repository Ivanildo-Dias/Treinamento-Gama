package main;

import java.util.Scanner;

import controller.GerenciaContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciaContas contas = new GerenciaContas();
        int opcao = 0;
        int numero;
        double saldo, limite;
        String entradaDigitada;
        Conta c;

        while (opcao != 6) {
            System.out.println("------------------------------------");
            System.out.println("C A D A S T R O  D E  C O N T A S");
            System.out.println("------------------------------------");
            System.out.println("1 - Nova conta corrente");
            System.out.println("2 - Nova conta especial");
            System.out.println("3 - Procurar conta");
            System.out.println("4 - Alterar conta");
            System.out.println("5 - Apagar conta");
            System.out.println("6 - Sair do programa");
            System.out.println("------------------------------------");
            System.out.print("Informe a opção desejada aqui -> ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:

                    System.out.println("------------------------------------");
                    System.out.println("N O V A  C O N T A  C O R R E N T E");
                    System.out.println("------------------------------------");
                    System.out.println("Digite o número da conta:");
                    numero = teclado.nextInt();
                    System.out.println("Digite o saldo da conta:");
                    saldo = teclado.nextDouble();
                    c = new ContaCorrente(numero, saldo);
                    contas.adicionar(c);
                    break;

                case 2:

                    System.out.println("------------------------------------");
                    System.out.println("N O V A  C O N T A   E S P E C I A L");
                    System.out.println("------------------------------------");
                    System.out.println("Digite o número da conta:");
                    numero = teclado.nextInt();
                    System.out.println("Digite o saldo da conta:");
                    saldo = teclado.nextDouble();
                    System.out.println("Digite o limite da conta:");
                    limite = teclado.nextDouble();
                    c = new ContaEspecial(numero, saldo, limite);
                    contas.adicionar(c);
                    break;

                case 3:

                    System.out.println("------------------------------------");
                    System.out.println("B U S C A R  C O N T A");
                    System.out.println("------------------------------------");
                    System.out.println("Digite o número da conta:");
                    numero = teclado.nextInt();
                    System.out.println("------------------------------------");
                    System.out.println(contas.exibir(numero));
                    break;

                case 4:

                    System.out.println("------------------------------------");
                    System.out.println("A L T E R A R  C O N T A");
                    System.out.println("------------------------------------");
                    System.out.println("Digite o número da conta:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o novo número da conta:");
                    numero = teclado.nextInt();
                    boolean alterou = contas.alterarNumeroConta(numero);
                    if (alterou) {
                        System.out.println("Número de conta alterado com sucesso.");
                    } else {
                        System.out.println("Não foi possível alerar o número da conta.");
                    }
                    break;

                case 5:

                    System.out.println("------------------------------------");
                    System.out.println("A P A G A R  C O N T A");
                    System.out.println("------------------------------------");
                    System.out.println("Digite o número da conta que deseja excluir:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    boolean removeu = contas.remover(numero);
                    if(removeu) {
                        System.out.println("Conta removida com sucesso.");
                    } else {
                        System.out.println("Não foi possível remover a conta.");
                    }
                    break;

                case 6:

                    System.out.println("Fim do programa.");
                    break;

                default:

                    System.out.println("Opção inválida");
                    break;

            }
        }

        teclado.close();
    }

}
