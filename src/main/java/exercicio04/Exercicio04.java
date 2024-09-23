package exercicio04;

/* Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação
 que cada estado teve dentro do valor total mensal da distribuidora.
* */

public class Exercicio04 {
    public void faturamentoDistribuidora(){
        // Faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calcula o faturamento total
        double faturamentoTotal = sp + rj + mg + es + outros;

        // Calcula o percentual de cada estado
        double percentualSP = (sp / faturamentoTotal) * 100;
        double percentualRJ = (rj / faturamentoTotal) * 100;
        double percentualMG = (mg / faturamentoTotal) * 100;
        double percentualES = (es / faturamentoTotal) * 100;
        double percentualOutros = (outros / faturamentoTotal) * 100;

        // Exibe os resultados
        System.out.printf("Faturamento total: R$ %.2f%n", faturamentoTotal);
        System.out.printf("Percentual de SP: %.2f%%%n", percentualSP);
        System.out.printf("Percentual de RJ: %.2f%%%n", percentualRJ);
        System.out.printf("Percentual de MG: %.2f%%%n", percentualMG);
        System.out.printf("Percentual de ES: %.2f%%%n", percentualES);
        System.out.printf("Percentual de Outros: %.2f%%%n", percentualOutros);
    }
}
