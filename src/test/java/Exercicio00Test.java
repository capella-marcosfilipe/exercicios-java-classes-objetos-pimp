import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio00;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para o Exercício 00
 */
public class Exercicio00Test {
    
    @Test
    @DisplayName("Teste 1: Criar banda de Rock")
    public void testCriarBandaRock() {
        Banda banda = Exercicio00.criarBanda("Queen", "Rock", 4, 1);
        
        assertNotNull(banda, "A banda não deve ser null");
        assertEquals("Queen", banda.nome, "Nome da banda incorreto");
        assertEquals("Rock", banda.tipoMusica, "Tipo de música incorreto");
        assertEquals(4, banda.numeroIntegrantes, "Número de integrantes incorreto");
        assertEquals(1, banda.posicaoRanking, "Posição no ranking incorreta");
    }
    
    @Test
    @DisplayName("Teste 2: Criar banda de Heavy Metal")
    public void testCriarBandaHeavyMetal() {
        Banda banda = Exercicio00.criarBanda("Iron Maiden", "Heavy Metal", 6, 2);
        
        assertNotNull(banda, "A banda não deve ser null");
        assertEquals("Iron Maiden", banda.nome);
        assertEquals("Heavy Metal", banda.tipoMusica);
        assertEquals(6, banda.numeroIntegrantes);
        assertEquals(2, banda.posicaoRanking);
    }
    
    @Test
    @DisplayName("Teste 3: Criar banda de Pop")
    public void testCriarBandaPop() {
        Banda banda = Exercicio00.criarBanda("ABBA", "Pop", 4, 3);
        
        assertNotNull(banda);
        assertEquals("ABBA", banda.nome);
        assertEquals("Pop", banda.tipoMusica);
        assertEquals(4, banda.numeroIntegrantes);
        assertEquals(3, banda.posicaoRanking);
    }
    
    @Test
    @DisplayName("Teste 4: Criar banda com 1 integrante")
    public void testCriarBandaUmIntegrante() {
        Banda banda = Exercicio00.criarBanda("Solo Artist", "Jazz", 1, 5);
        
        assertNotNull(banda);
        assertEquals(1, banda.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 5: Criar banda com nome composto")
    public void testCriarBandaNomeComposto() {
        Banda banda = Exercicio00.criarBanda("The Rolling Stones", "Rock and Roll", 4, 1);
        
        assertNotNull(banda);
        assertEquals("The Rolling Stones", banda.nome);
        assertEquals("Rock and Roll", banda.tipoMusica);
    }
}
