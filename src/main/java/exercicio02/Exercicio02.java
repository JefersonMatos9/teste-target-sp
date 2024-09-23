package exercicio02;

/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a
 soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um
  programa na linguagem que desejar onde, informado um número, ele calcule a sequência de
   Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */

import java.util.Scanner;

public class Exercicio02 {
    public void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        int numeroAnterior = 0;
        int numeroAtual = 1;
        int novoNumero;

        System.out.println("Digite o número que deseja saber se pertence à sequência de Fibonacci:");
        int numeroInformado = scanner.nextInt();

        if (numeroInformado < 0) {
            System.out.println("Números negativos não entram na sequência de Fibonacci.");
            return;
        }
        // Verifica diretamente se o número é 0 ou 1, que são membros iniciais da sequência
        if (numeroInformado == 0 || numeroInformado == 1) {
            System.out.println("O número informado pertence à sequência de Fibonacci.");
            return; // Saímos do método, já que não precisamos processar mais.
        }

        // Loop para gerar os números da sequência de Fibonacci até atingir ou ultrapassar o número informado
        while (numeroAtual < numeroInformado) {
            novoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = novoNumero;
        }

        // Verificação se o número informado é igual ao último número gerado na sequência
        if (numeroAtual == numeroInformado) {
            System.out.println("O número informado pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número informado NÃO pertence à sequência de Fibonacci.");
        }
    }
}

