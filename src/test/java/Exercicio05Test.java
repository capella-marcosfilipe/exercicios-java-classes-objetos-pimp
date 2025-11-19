import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * Testes unitários para o Exercício 05
 */
public class Exercicio05Test {
    
    private Banda[] bandas;
    
    @BeforeEach
    public void setUp() {
        bandas = new Banda[5];
        bandas[0] = new Banda("Queen", "Rock", 4, 1);
        bandas[1] = new Banda("ABBA", "Pop", 4, 2);
        bandas[2] = new Banda("Nirvana", "Rock", 3, 3);
        bandas[3] = new Banda("Metallica", "Metal", 4, 4);
        bandas[4] = new Banda("Pink Floyd", "Progressive", 5, 5);
    }
    
    @Test
    @DisplayName("Teste 1: Formatar banda corretamente")
    public void testFormatarBanda() {
        String resultado = Exercicio05.formatarBanda(bandas[0]);
        
        assertNotNull(resultado, "Resultado não deve ser null");
        assertTrue(resultado.contains("Queen"), "Deve conter o nome da banda");
        assertTrue(resultado.contains("Rock"), "Deve conter o tipo de música");
        assertTrue(resultado.contains("4"), "Deve conter o número de integrantes");
        assertTrue(resultado.contains("1"), "Deve conter a posição no ranking");
    }
    
    @Test
    @DisplayName("Teste 2: Exibir todas as bandas")
    public void testExibirTodasBandas() {
        String resultado = Exercicio05.exibirTodasBandas(bandas);
        
        assertNotNull(resultado);
        assertTrue(resultado.contains("Queen"), "Deve conter Queen");
        assertTrue(resultado.contains("ABBA"), "Deve conter ABBA");
        assertTrue(resultado.contains("Nirvana"), "Deve conter Nirvana");
        assertTrue(resultado.contains("Metallica"), "Deve conter Metallica");
        assertTrue(resultado.contains("Pink Floyd"), "Deve conter Pink Floyd");
    }
    
    @Test
    @DisplayName("Teste 3: Validar ranking válido")
    public void testValidarRankingValido() {
        assertTrue(Exercicio05.validarRanking(1), "1 é válido");
        assertTrue(Exercicio05.validarRanking(3), "3 é válido");
        assertTrue(Exercicio05.validarRanking(5), "5 é válido");
    }
    
    @Test
    @DisplayName("Teste 4: Validar ranking inválido")
    public void testValidarRankingInvalido() {
        assertFalse(Exercicio05.validarRanking(0), "0 é inválido");
        assertFalse(Exercicio05.validarRanking(6), "6 é inválido");
        assertFalse(Exercicio05.validarRanking(-1), "-1 é inválido");
        assertFalse(Exercicio05.validarRanking(100), "100 é inválido");
    }
    
    @Test
    @DisplayName("Teste 5: Validar integrantes válido")
    public void testValidarIntegrantesValido() {
        assertTrue(Exercicio05.validarIntegrantes(1), "1 integrante é válido");
        assertTrue(Exercicio05.validarIntegrantes(4), "4 integrantes é válido");
        assertTrue(Exercicio05.validarIntegrantes(100), "100 integrantes é válido");
    }
    
    @Test
    @DisplayName("Teste 6: Validar integrantes inválido")
    public void testValidarIntegrantesInvalido() {
        assertFalse(Exercicio05.validarIntegrantes(0), "0 integrantes é inválido");
        assertFalse(Exercicio05.validarIntegrantes(-1), "-1 integrantes é inválido");
        assertFalse(Exercicio05.validarIntegrantes(-100), "-100 integrantes é inválido");
    }
    
    @Test
    @DisplayName("Teste 7: Formatar múltiplas bandas")
    public void testFormatarMultiplasBandas() {
        for (Banda banda : bandas) {
            String formatado = Exercicio05.formatarBanda(banda);
            assertNotNull(formatado);
            assertFalse(formatado.isEmpty(), "String formatada não deve estar vazia");
        }
    }
    
    @Test
    @DisplayName("Teste 8: Cadastrar bandas via Scanner simulado")
    public void testCadastrarBandas() {
        // Simular entrada do usuário
        String input = "Queen\nRock\n4\n1\n" +
                       "ABBA\nPop\n4\n2\n" +
                       "Nirvana\nRock\n3\n3\n" +
                       "Metallica\nMetal\n4\n4\n" +
                       "Pink Floyd\nProgressive\n5\n5\n";
        
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        
        Banda[] resultado = Exercicio05.cadastrarBandas(scanner);
        
        assertNotNull(resultado, "Array não deve ser null");
        assertEquals(5, resultado.length, "Deve ter 5 bandas");
        
        // Verificar primeira banda
        assertNotNull(resultado[0]);
        assertEquals("Queen", resultado[0].nome);
        assertEquals("Rock", resultado[0].tipoMusica);
        assertEquals(4, resultado[0].numeroIntegrantes);
        assertEquals(1, resultado[0].posicaoRanking);
    }
    
    @Test
    @DisplayName("Teste 9: Exibir bandas ordenadas por ranking")
    public void testExibirBandasOrdenadas() {
        String resultado = Exercicio05.exibirTodasBandas(bandas);
        
        // Verificar se a ordem de aparição está correta
        int posQueen = resultado.indexOf("Queen");
        int posABBA = resultado.indexOf("ABBA");
        int posPink = resultado.indexOf("Pink Floyd");
        
        assertTrue(posQueen < posABBA, "Queen deve aparecer antes de ABBA");
        assertTrue(posABBA < posPink, "ABBA deve aparecer antes de Pink Floyd");
    }
}
