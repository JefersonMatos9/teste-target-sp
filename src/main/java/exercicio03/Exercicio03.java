package exercicio03;

/*Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa,
na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

        IMPORTANTE:
 Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
 Podem existir dias sem faturamento, como nos finais de semana e feriados.
Estes dias devem ser ignorados no cálculo da média;
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Exercicio03 {
    public static void main(String[] args) {
        try {
            // Carrega os dados do arquivo JSON
            JSONParser parser = new JSONParser();
            JSONArray dadosFaturamento = (JSONArray) parser.parse(new FileReader("src/resources/faturamento.json"));

            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            // Primeira passagem: calcula menor, maior e soma do faturamento
            for (Object obj : dadosFaturamento) {
                JSONObject dia = (JSONObject) obj;
                double valor = ((Number) dia.get("faturamento")).doubleValue();

                if (valor > 0) {
                    if (valor < menorValor) menorValor = valor;
                    if (valor > maiorValor) maiorValor = valor;
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            // Calcula a média
            double mediaMensal = somaFaturamento / diasComFaturamento;

            // Segunda passagem: conta dias acima da média
            int diasAcimaMedia = 0;
            for (Object obj : dadosFaturamento) {
                JSONObject dia = (JSONObject) obj;
                double valor = ((Number) dia.get("faturamento")).doubleValue();
                if (valor > mediaMensal) diasAcimaMedia++;
            }

            // Imprime os resultados
            System.out.printf("Menor valor de faturamento: R$ %.2f%n", menorValor);
            System.out.printf("Maior valor de faturamento: R$ %.2f%n", maiorValor);
            System.out.printf("Número de dias acima da média mensal: %d%n", diasAcimaMedia);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

