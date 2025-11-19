import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import br.unicap.Banda;
import br.unicap.Exercicio06;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para o Exercício 06 - Busca Sequencial
 */
public class Exercicio06Test {
    
    private Banda[] bandas;
    
    @BeforeEach
    public void setUp() {
        bandas = new Banda[7];
        bandas[0] = new Banda("Queen", "Rock", 4, 1);
        bandas[1] = new Banda("ABBA", "Pop", 4, 2);
        bandas[2] = new Banda("Nirvana", "Rock", 3, 3);
        bandas[3] = new Banda("Metallica", "Metal", 4, 4);
        bandas[4] = new Banda("Pink Floyd", "Progressive", 5, 5);
        bandas[5] = new Banda("The Beatles", "Rock", 4, 1);
        bandas[6] = new Banda("Led Zeppelin", "Rock", 4, 2);
    }
    
    @Test
    @DisplayName("Teste 1: Busca sequencial - elemento no início")
    public void testBuscaInicio() {
        int resultado = Exercicio06.buscaSequencial(bandas, "Queen");
        assertEquals(0, resultado, "Queen está no índice 0");
    }
    
    @Test
    @DisplayName("Teste 2: Busca sequencial - elemento no meio")
    public void testBuscaMeio() {
        int resultado = Exercicio06.buscaSequencial(bandas, "Nirvana");
        assertEquals(2, resultado, "Nirvana está no índice 2");
    }
    
    @Test
    @DisplayName("Teste 3: Busca sequencial - elemento no final")
    public void testBuscaFinal() {
        int resultado = Exercicio06.buscaSequencial(bandas, "Led Zeppelin");
        assertEquals(6, resultado, "Led Zeppelin está no índice 6");
    }
    
    @Test
    @DisplayName("Teste 4: Busca sequencial - elemento inexistente")
    public void testBuscaInexistente() {
        int resultado = Exercicio06.buscaSequencial(bandas, "AC/DC");
        assertEquals(-1, resultado, "Deve retornar -1 para banda inexistente");
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"Queen", "ABBA", "Nirvana", "Metallica", "Pink Floyd"})
    @DisplayName("Teste 5: Busca parametrizada - várias bandas")
    public void testBuscaParametrizada(String nomeBanda) {
        int resultado = Exercicio06.buscaSequencial(bandas, nomeBanda);
        assertTrue(resultado >= 0, nomeBanda + " deve ser encontrada");
    }
    
    @Test
    @DisplayName("Teste 6: Busca retorna banda - sucesso")
    public void testBuscaRetornaBanda() {
        Banda resultado = Exercicio06.buscaSequencialRetornaBanda(bandas, "Metallica");
        
        assertNotNull(resultado, "Deve retornar uma banda");
        assertEquals("Metallica", resultado.nome);
        assertEquals("Metal", resultado.tipoMusica);
        assertEquals(4, resultado.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 7: Busca retorna banda - não encontrado")
    public void testBuscaRetornaBandaNull() {
        Banda resultado = Exercicio06.buscaSequencialRetornaBanda(bandas, "Inexistente");
        assertNull(resultado, "Deve retornar null para banda inexistente");
    }
    
    @Test
    @DisplayName("Teste 8: Busca com contador - primeiro elemento")
    public void testBuscaComContadorPrimeiro() {
        int[] resultado = Exercicio06.buscaSequencialComContador(bandas, "Queen");
        
        assertEquals(0, resultado[0], "Índice deve ser 0");
        assertEquals(1, resultado[1], "Deve fazer 1 comparação");
    }
    
    @Test
    @DisplayName("Teste 9: Busca com contador - último elemento")
    public void testBuscaComContadorUltimo() {
        int[] resultado = Exercicio06.buscaSequencialComContador(bandas, "Led Zeppelin");
        
        assertEquals(6, resultado[0], "Índice deve ser 6");
        assertEquals(7, resultado[1], "Deve fazer 7 comparações (0 a 6)");
    }
    
    @Test
    @DisplayName("Teste 10: Busca com contador - não encontrado")
    public void testBuscaComContadorNaoEncontrado() {
        int[] resultado = Exercicio06.buscaSequencialComContador(bandas, "Inexistente");
        
        assertEquals(-1, resultado[0], "Índice deve ser -1");
        assertEquals(7, resultado[1], "Deve fazer 7 comparações (todo o array)");
    }
    
    @Test
    @DisplayName("Teste 11: Buscar todas ocorrências - 4 integrantes")
    public void testBuscaTodasOcorrencias() {
        int[] resultado = Exercicio06.buscaTodasOcorrencias(bandas, 4);
        
        assertEquals(5, resultado.length, "Deve encontrar 5 bandas com 4 integrantes");
        assertArrayEquals(new int[]{0, 1, 3, 5, 6}, resultado, 
                         "Índices corretos das bandas com 4 integrantes");
    }
    
    @Test
    @DisplayName("Teste 12: Buscar todas ocorrências - 3 integrantes")
    public void testBuscaTodasOcorrenciasTres() {
        int[] resultado = Exercicio06.buscaTodasOcorrencias(bandas, 3);
        
        assertEquals(1, resultado.length, "Deve encontrar 1 banda com 3 integrantes");
        assertEquals(2, resultado[0], "Nirvana está no índice 2");
    }
    
    @Test
    @DisplayName("Teste 13: Buscar todas ocorrências - nenhuma")
    public void testBuscaTodasOcorrenciasNenhuma() {
        int[] resultado = Exercicio06.buscaTodasOcorrencias(bandas, 10);
        
        assertEquals(0, resultado.length, "Não deve encontrar bandas com 10 integrantes");
    }
    
    @Test
    @DisplayName("Teste 14: Existe tipo música - true")
    public void testExisteTipoMusicaTrue() {
        assertTrue(Exercicio06.existeTipoMusica(bandas, "Rock"), 
                  "Rock deve existir");
        assertTrue(Exercicio06.existeTipoMusica(bandas, "Metal"), 
                  "Metal deve existir");
    }
    
    @Test
    @DisplayName("Teste 15: Existe tipo música - false")
    public void testExisteTipoMusicaFalse() {
        assertFalse(Exercicio06.existeTipoMusica(bandas, "Jazz"), 
                   "Jazz não deve existir");
        assertFalse(Exercicio06.existeTipoMusica(bandas, "Country"), 
                   "Country não deve existir");
    }
}
