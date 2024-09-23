package exercicio01;
/*
Observe o trecho de código abaixo: int indice = 13, soma = 0, k =0;
Enquanto K < indice faça {k = k + 1; soma + k;}
imprimir soma;
Ao final do processamento qual sera o valor da variavel soma?
 */

public class Exercicio01 {
    public void exercicio01(){
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("O valor da variavel SOMA é: " + soma);
    }
}
