import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para o Exercício 02
 */
public class Exercicio02Test {
    
    private Banda[] bandas;
    
    @BeforeEach
    public void setUp() {
        // Preparar dados de teste antes de cada teste
        bandas = new Banda[5];
        bandas[0] = new Banda("Queen", "Rock", 4, 1);
        bandas[1] = new Banda("ABBA", "Pop", 4, 2);
        bandas[2] = new Banda("Nirvana", "Grunge", 3, 3);
        bandas[3] = new Banda("Metallica", "Metal", 4, 4);
        bandas[4] = new Banda("Pink Floyd", "Progressive", 4, 5);
    }
    
    @Test
    @DisplayName("Teste 1: Buscar banda na posição 1")
    public void testBuscarPrimeiraPosicao() {
        Banda resultado = Exercicio02.buscarPorRanking(bandas, 1);
        
        assertNotNull(resultado, "Deve encontrar uma banda");
        assertEquals("Queen", resultado.nome);
        assertEquals(1, resultado.posicaoRanking);
    }
    
    @Test
    @DisplayName("Teste 2: Buscar banda na posição 3")
    public void testBuscarTerceiraPosicao() {
        Banda resultado = Exercicio02.buscarPorRanking(bandas, 3);
        
        assertNotNull(resultado);
        assertEquals("Nirvana", resultado.nome);
        assertEquals("Grunge", resultado.tipoMusica);
        assertEquals(3, resultado.posicaoRanking);
    }
    
    @Test
    @DisplayName("Teste 3: Buscar banda na última posição")
    public void testBuscarUltimaPosicao() {
        Banda resultado = Exercicio02.buscarPorRanking(bandas, 5);
        
        assertNotNull(resultado);
        assertEquals("Pink Floyd", resultado.nome);
        assertEquals(5, resultado.posicaoRanking);
    }
    
    @Test
    @DisplayName("Teste 4: Buscar posição inexistente")
    public void testBuscarPosicaoInexistente() {
        Banda resultado = Exercicio02.buscarPorRanking(bandas, 10);
        
        assertNull(resultado, "Deve retornar null para posição inexistente");
    }
    
    @Test
    @DisplayName("Teste 5: Verificar existência de ranking")
    public void testExisteRanking() {
        assertTrue(Exercicio02.existeRanking(bandas, 1), "Ranking 1 deve existir");
        assertTrue(Exercicio02.existeRanking(bandas, 3), "Ranking 3 deve existir");
        assertTrue(Exercicio02.existeRanking(bandas, 5), "Ranking 5 deve existir");
        assertFalse(Exercicio02.existeRanking(bandas, 6), "Ranking 6 não deve existir");
        assertFalse(Exercicio02.existeRanking(bandas, 0), "Ranking 0 não deve existir");
    }
    
    @Test
    @DisplayName("Teste 6: Buscar em array parcialmente preenchido")
    public void testBuscarArrayParcial() {
        Banda[] bandasParcial = new Banda[3];
        bandasParcial[0] = new Banda("A", "Rock", 4, 2);
        bandasParcial[1] = new Banda("B", "Pop", 3, 4);
        bandasParcial[2] = new Banda("C", "Jazz", 5, 1);
        
        Banda resultado = Exercicio02.buscarPorRanking(bandasParcial, 1);
        assertNotNull(resultado);
        assertEquals("C", resultado.nome);
    }
}
