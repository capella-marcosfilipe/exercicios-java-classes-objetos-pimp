import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import br.unicap.Banda;
import br.unicap.Exercicio08;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para o Exercício 08 - Estatísticas
 */
public class Exercicio08Test {
    
    private Banda[] bandas;
    private Banda[] bandasPequenas;
    
    @BeforeEach
    public void setUp() {
        bandas = new Banda[5];
        bandas[0] = new Banda("Queen", "Rock", 4, 1);
        bandas[1] = new Banda("ABBA", "Pop", 4, 2);
        bandas[2] = new Banda("Nirvana", "Rock", 3, 3);
        bandas[3] = new Banda("Metallica", "Metal", 6, 4);
        bandas[4] = new Banda("Pink Floyd", "Progressive", 5, 5);
        // Total: 4+4+3+6+5 = 22, Média: 4.4
        
        bandasPequenas = new Banda[3];
        bandasPequenas[0] = new Banda("A", "Rock", 2, 1);
        bandasPequenas[1] = new Banda("B", "Pop", 4, 2);
        bandasPequenas[2] = new Banda("C", "Metal", 6, 3);
        // Total: 2+4+6 = 12, Média: 4.0
    }
    
    @Test
    @DisplayName("Teste 1: Calcular média de integrantes")
    public void testCalcularMedia() {
        double resultado = Exercicio08.calcularMediaIntegrantes(bandas);
        assertEquals(4.4, resultado, 0.01, "Média deve ser 4.4");
    }
    
    @Test
    @DisplayName("Teste 2: Calcular total de integrantes")
    public void testCalcularTotal() {
        int resultado = Exercicio08.calcularTotalIntegrantes(bandas);
        assertEquals(22, resultado, "Total deve ser 22 (4+4+3+6+5)");
    }
    
    @Test
    @DisplayName("Teste 3: Encontrar banda mais próxima da média")
    public void testBandaMaisProximaDaMedia() {
        Banda resultado = Exercicio08.encontrarBandaMaisProximaDaMedia(bandas);
        
        assertNotNull(resultado);
        // Média é 4.4, então banda com 4 integrantes está mais próxima
        assertTrue(resultado.numeroIntegrantes == 4 || resultado.numeroIntegrantes == 5,
                  "Banda mais próxima deve ter 4 ou 5 integrantes");
    }
    
    @Test
    @DisplayName("Teste 4: Contar bandas acima da média")
    public void testContarAcimaDaMedia() {
        int resultado = Exercicio08.contarBandasAcimaDaMedia(bandas);
        // Média: 4.4, Acima: Metallica(6) e Pink Floyd(5) = 2 bandas
        assertEquals(2, resultado, "Deve ter 2 bandas acima da média");
    }
    
    @Test
    @DisplayName("Teste 5: Contar bandas abaixo da média")
    public void testContarAbaixoDaMedia() {
        int resultado = Exercicio08.contarBandasAbaixoDaMedia(bandas);
        // Média: 4.4, Abaixo: Queen(4), ABBA(4), Nirvana(3) = 3 bandas
        assertEquals(3, resultado, "Deve ter 3 bandas abaixo da média");
    }
    
    @Test
    @DisplayName("Teste 6: Calcular mediana (quantidade ímpar)")
    public void testMedianaImpar() {
        double resultado = Exercicio08.calcularMedianaIntegrantes(bandas);
        // Ordenado: [3, 4, 4, 5, 6], mediana = 4
        assertEquals(4.0, resultado, 0.01, "Mediana deve ser 4.0");
    }
    
    @Test
    @DisplayName("Teste 7: Calcular mediana (quantidade par)")
    public void testMedianaPar() {
        Banda[] bandasPar = new Banda[4];
        bandasPar[0] = new Banda("A", "Rock", 2, 1);
        bandasPar[1] = new Banda("B", "Pop", 4, 2);
        bandasPar[2] = new Banda("C", "Metal", 6, 3);
        bandasPar[3] = new Banda("D", "Jazz", 8, 4);
        
        double resultado = Exercicio08.calcularMedianaIntegrantes(bandasPar);
        // Ordenado: [2, 4, 6, 8], mediana = (4+6)/2 = 5.0
        assertEquals(5.0, resultado, 0.01, "Mediana deve ser 5.0");
    }
    
    @Test
    @DisplayName("Teste 8: Média com dataset pequeno")
    public void testMediaDatasetPequeno() {
        double resultado = Exercicio08.calcularMediaIntegrantes(bandasPequenas);
        assertEquals(4.0, resultado, 0.01, "Média deve ser 4.0");
    }
    
    @Test
    @DisplayName("Teste 9: Total com dataset pequeno")
    public void testTotalDatasetPequeno() {
        int resultado = Exercicio08.calcularTotalIntegrantes(bandasPequenas);
        assertEquals(12, resultado, "Total deve ser 12");
    }
    
    @Test
    @DisplayName("Teste 10: Gerar relatório estatístico")
    public void testGerarRelatorio() {
        String resultado = Exercicio08.gerarRelatorioEstatistico(bandas);
        
        assertNotNull(resultado, "Relatório não deve ser null");
        assertFalse(resultado.isEmpty(), "Relatório não deve estar vazio");
        
        // Verificar se contém informações essenciais
        assertTrue(resultado.contains("5") || resultado.contains("cinco"), 
                  "Deve mencionar 5 bandas");
        assertTrue(resultado.contains("22"), "Deve mencionar total 22");
        assertTrue(resultado.contains("4.4") || resultado.contains("4,4"), 
                  "Deve mencionar média 4.4");
    }
    
    @Test
    @DisplayName("Teste 11: Banda mais próxima - dataset pequeno")
    public void testBandaProximaDatasetPequeno() {
        Banda resultado = Exercicio08.encontrarBandaMaisProximaDaMedia(bandasPequenas);
        
        assertNotNull(resultado);
        assertEquals("B", resultado.nome, "B tem 4 integrantes, exatamente a média");
        assertEquals(4, resultado.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 12: Array com uma banda")
    public void testEstatisticasUmaBanda() {
        Banda[] umaBanda = new Banda[1];
        umaBanda[0] = new Banda("Solo", "Rock", 5, 1);
        
        double media = Exercicio08.calcularMediaIntegrantes(umaBanda);
        int total = Exercicio08.calcularTotalIntegrantes(umaBanda);
        double mediana = Exercicio08.calcularMedianaIntegrantes(umaBanda);
        
        assertEquals(5.0, media, 0.01);
        assertEquals(5, total);
        assertEquals(5.0, mediana, 0.01);
    }
    
    @Test
    @DisplayName("Teste 13: Desvio padrão (DESAFIO)")
    public void testDesvioPadrao() {
        double resultado = Exercicio08.calcularDesvioPadrao(bandas);
        
        // Cálculo esperado:
        // Valores: [4, 4, 3, 6, 5], Média: 4.4
        // Desvios²: [(4-4.4)², (4-4.4)², (3-4.4)², (6-4.4)², (5-4.4)²]
        //         = [0.16, 0.16, 1.96, 2.56, 0.36]
        // Variância = (0.16+0.16+1.96+2.56+0.36)/5 = 5.2/5 = 1.04
        // Desvio padrão = √1.04 ≈ 1.02
        
        assertEquals(1.02, resultado, 0.05, 
                    "Desvio padrão deve ser aproximadamente 1.02");
    }
    
    @ParameterizedTest
    @CsvSource({
        "2, 4, 6, 4.0",      // Média exata
        "1, 2, 3, 2.0",      // Valores pequenos
        "10, 20, 30, 20.0"   // Valores grandes
    })
    @DisplayName("Teste 14: Médias parametrizadas")
    public void testMediasParametrizadas(int val1, int val2, int val3, double mediaEsperada) {
        Banda[] teste = new Banda[3];
        teste[0] = new Banda("A", "Rock", val1, 1);
        teste[1] = new Banda("B", "Pop", val2, 2);
        teste[2] = new Banda("C", "Metal", val3, 3);
        
        double resultado = Exercicio08.calcularMediaIntegrantes(teste);
        assertEquals(mediaEsperada, resultado, 0.01);
    }
    
    @Test
    @DisplayName("Teste 15: Relatório completo contém todas informações")
    public void testRelatorioCompleto() {
        String resultado = Exercicio08.gerarRelatorioEstatistico(bandas);
        
        // Verificar seções principais
        assertTrue(resultado.toLowerCase().contains("total"), 
                  "Deve ter informação de total");
        assertTrue(resultado.toLowerCase().contains("média") || 
                  resultado.toLowerCase().contains("media"), 
                  "Deve ter informação de média");
        assertTrue(resultado.toLowerCase().contains("mediana"), 
                  "Deve ter informação de mediana");
    }
}
