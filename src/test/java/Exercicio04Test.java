import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para o Exercício 04
 */
public class Exercicio04Test {
    
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
    @DisplayName("Teste 1: Banda existente")
    public void testBandaExiste() {
        assertTrue(Exercicio04.bandaExiste(bandas, "Queen"), 
                  "Queen deve existir");
        assertTrue(Exercicio04.bandaExiste(bandas, "Nirvana"), 
                  "Nirvana deve existir");
        assertTrue(Exercicio04.bandaExiste(bandas, "Pink Floyd"), 
                  "Pink Floyd deve existir");
    }
    
    @Test
    @DisplayName("Teste 2: Banda inexistente")
    public void testBandaNaoExiste() {
        assertFalse(Exercicio04.bandaExiste(bandas, "The Beatles"), 
                   "The Beatles não deve existir");
        assertFalse(Exercicio04.bandaExiste(bandas, "AC/DC"), 
                   "AC/DC não deve existir");
        assertFalse(Exercicio04.bandaExiste(bandas, ""), 
                   "Nome vazio não deve existir");
    }
    
    @Test
    @DisplayName("Teste 3: Busca case-insensitive")
    public void testBuscaCaseInsensitive() {
        assertTrue(Exercicio04.bandaExiste(bandas, "queen"), 
                  "Deve encontrar 'queen' (minúsculo)");
        assertTrue(Exercicio04.bandaExiste(bandas, "QUEEN"), 
                  "Deve encontrar 'QUEEN' (maiúsculo)");
        assertTrue(Exercicio04.bandaExiste(bandas, "QuEeN"), 
                  "Deve encontrar 'QuEeN' (misto)");
        assertTrue(Exercicio04.bandaExiste(bandas, "pink floyd"), 
                  "Deve encontrar 'pink floyd'");
    }
    
    @Test
    @DisplayName("Teste 4: Encontrar índice da banda")
    public void testEncontrarIndiceBanda() {
        assertEquals(0, Exercicio04.encontrarIndiceBanda(bandas, "Queen"), 
                    "Queen está no índice 0");
        assertEquals(2, Exercicio04.encontrarIndiceBanda(bandas, "Nirvana"), 
                    "Nirvana está no índice 2");
        assertEquals(4, Exercicio04.encontrarIndiceBanda(bandas, "Pink Floyd"), 
                    "Pink Floyd está no índice 4");
        assertEquals(-1, Exercicio04.encontrarIndiceBanda(bandas, "Beatles"), 
                    "Beatles não existe, deve retornar -1");
    }
    
    @Test
    @DisplayName("Teste 5: Existe banda com número de integrantes")
    public void testExisteBandaComIntegrantes() {
        assertTrue(Exercicio04.existeBandaComIntegrantes(bandas, 4), 
                  "Deve existir bandas com 4 integrantes");
        assertTrue(Exercicio04.existeBandaComIntegrantes(bandas, 3), 
                  "Deve existir banda com 3 integrantes");
        assertTrue(Exercicio04.existeBandaComIntegrantes(bandas, 5), 
                  "Deve existir banda com 5 integrantes");
        assertFalse(Exercicio04.existeBandaComIntegrantes(bandas, 10), 
                   "Não deve existir banda com 10 integrantes");
        assertFalse(Exercicio04.existeBandaComIntegrantes(bandas, 0), 
                   "Não deve existir banda com 0 integrantes");
    }
    
    @Test
    @DisplayName("Teste 6: Ranking completo")
    public void testRankingCompleto() {
        assertTrue(Exercicio04.rankingCompleto(bandas), 
                  "Ranking deve estar completo (1-5)");
    }
    
    @Test
    @DisplayName("Teste 7: Ranking incompleto")
    public void testRankingIncompleto() {
        Banda[] bandasIncompletas = new Banda[3];
        bandasIncompletas[0] = new Banda("A", "Rock", 4, 1);
        bandasIncompletas[1] = new Banda("B", "Pop", 3, 3);
        bandasIncompletas[2] = new Banda("C", "Metal", 5, 5);
        
        assertFalse(Exercicio04.rankingCompleto(bandasIncompletas), 
                   "Ranking incompleto (faltam posições 2 e 4)");
    }
    
    @Test
    @DisplayName("Teste 8: Verificar primeira e última banda")
    public void testPrimeiraUltimaBanda() {
        assertTrue(Exercicio04.bandaExiste(bandas, bandas[0].nome), 
                  "Primeira banda deve existir");
        assertTrue(Exercicio04.bandaExiste(bandas, bandas[bandas.length - 1].nome), 
                  "Última banda deve existir");
    }
}
