import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio01;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para o Exercício 01
 */
public class Exercicio01Test {
    
    @Test
    @DisplayName("Teste 1: Criar array com 3 bandas")
    public void testCriarArrayTresBandas() {
        String[] nomes = {"Queen", "ABBA", "Nirvana"};
        String[] tipos = {"Rock", "Pop", "Grunge"};
        int[] integrantes = {4, 4, 3};
        int[] rankings = {1, 2, 3};
        
        Banda[] bandas = Exercicio01.criarArrayDeBandas(nomes, tipos, integrantes, rankings);
        
        assertNotNull(bandas, "Array de bandas não deve ser null");
        assertEquals(3, bandas.length, "Tamanho do array incorreto");
        
        // Verificar primeira banda
        assertNotNull(bandas[0], "Banda na posição 0 não deve ser null");
        assertEquals("Queen", bandas[0].nome);
        assertEquals("Rock", bandas[0].tipoMusica);
        assertEquals(4, bandas[0].numeroIntegrantes);
        assertEquals(1, bandas[0].posicaoRanking);
        
        // Verificar segunda banda
        assertNotNull(bandas[1]);
        assertEquals("ABBA", bandas[1].nome);
        assertEquals(2, bandas[1].posicaoRanking);
        
        // Verificar terceira banda
        assertNotNull(bandas[2]);
        assertEquals("Nirvana", bandas[2].nome);
        assertEquals("Grunge", bandas[2].tipoMusica);
    }
    
    @Test
    @DisplayName("Teste 2: Criar array com 5 bandas")
    public void testCriarArrayCincoBandas() {
        String[] nomes = {"Metallica", "AC/DC", "Pink Floyd", "Led Zeppelin", "The Beatles"};
        String[] tipos = {"Metal", "Rock", "Progressive", "Rock", "Pop Rock"};
        int[] integrantes = {4, 5, 4, 4, 4};
        int[] rankings = {1, 2, 3, 4, 5};
        
        Banda[] bandas = Exercicio01.criarArrayDeBandas(nomes, tipos, integrantes, rankings);
        
        assertEquals(5, bandas.length);
        
        for (int i = 0; i < 5; i++) {
            assertNotNull(bandas[i], "Banda na posição " + i + " não deve ser null");
            assertEquals(nomes[i], bandas[i].nome);
            assertEquals(tipos[i], bandas[i].tipoMusica);
            assertEquals(integrantes[i], bandas[i].numeroIntegrantes);
            assertEquals(rankings[i], bandas[i].posicaoRanking);
        }
    }
    
    @Test
    @DisplayName("Teste 3: Contar bandas em array")
    public void testContarBandas() {
        String[] nomes = {"Queen", "ABBA"};
        String[] tipos = {"Rock", "Pop"};
        int[] integrantes = {4, 4};
        int[] rankings = {1, 2};
        
        Banda[] bandas = Exercicio01.criarArrayDeBandas(nomes, tipos, integrantes, rankings);
        int count = Exercicio01.contarBandas(bandas);
        
        assertEquals(2, count, "Contagem de bandas incorreta");
    }
    
    @Test
    @DisplayName("Teste 4: Array com uma banda")
    public void testArrayUmaBanda() {
        String[] nomes = {"Solo"};
        String[] tipos = {"Jazz"};
        int[] integrantes = {1};
        int[] rankings = {1};
        
        Banda[] bandas = Exercicio01.criarArrayDeBandas(nomes, tipos, integrantes, rankings);
        
        assertEquals(1, bandas.length);
        assertNotNull(bandas[0]);
        assertEquals("Solo", bandas[0].nome);
    }
    
    @Test
    @DisplayName("Teste 5: Verificar todas as bandas foram criadas")
    public void testTodasBandasCriadas() {
        String[] nomes = {"A", "B", "C", "D"};
        String[] tipos = {"T1", "T2", "T3", "T4"};
        int[] integrantes = {1, 2, 3, 4};
        int[] rankings = {1, 2, 3, 4};
        
        Banda[] bandas = Exercicio01.criarArrayDeBandas(nomes, tipos, integrantes, rankings);
        
        for (Banda banda : bandas) {
            assertNotNull(banda, "Todas as posições do array devem ter bandas criadas");
        }
    }
}
