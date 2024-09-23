package exercicio05;
/*Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
Essa string pode ser informada através de qualquer entrada de sua preferência
ou pode ser previamente definida no código;
Evite usar funções prontas, como, por exemplo, reverse;
 */

import java.util.Scanner;

public class Exercicio05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a String a ser invertida: ");
            String str = scanner.nextLine();

            String strInvertida = inverterString(str); // chama o metodo de inverter a string
            System.out.println("String original: " + str);
            System.out.println("String invertida: " + strInvertida);
        }
        public static String inverterString(String str) {
            // Cria um StringBuilder para construir a string invertida
            StringBuilder strInvertida = new StringBuilder();

            // Percorre a string original do final para o início
            for (int i = str.length() - 1; i >= 0; i--) {
                // Adiciona o caractere atual ao final do StringBuilder
                strInvertida.append(str.charAt(i));
            }

            // Converte o StringBuilder em uma string e retorna
            return strInvertida.toString();
        }
    }




