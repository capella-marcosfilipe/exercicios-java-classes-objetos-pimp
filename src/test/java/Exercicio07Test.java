import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para o Exercício 07 - Máximo e Mínimo
 */
public class Exercicio07Test {
    
    private Banda[] bandas;
    private Banda[] bandasVariadas;
    
    @BeforeEach
    public void setUp() {
        // Dataset padrão
        bandas = new Banda[5];
        bandas[0] = new Banda("Queen", "Rock", 4, 1);
        bandas[1] = new Banda("ABBA", "Pop", 4, 2);
        bandas[2] = new Banda("Nirvana", "Rock", 3, 3);
        bandas[3] = new Banda("Metallica", "Metal", 6, 4);
        bandas[4] = new Banda("Pink Floyd", "Progressive", 5, 5);
        
        // Dataset com valores variados
        bandasVariadas = new Banda[6];
        bandasVariadas[0] = new Banda("Solo Artist", "Jazz", 1, 1);
        bandasVariadas[1] = new Banda("Duo", "Folk", 2, 2);
        bandasVariadas[2] = new Banda("Trio", "Blues", 3, 3);
        bandasVariadas[3] = new Banda("Big Band", "Swing", 15, 4);
        bandasVariadas[4] = new Banda("Orchestra", "Classical", 50, 5);
        bandasVariadas[5] = new Banda("Small Group", "Jazz", 4, 1);
    }
    
    @Test
    @DisplayName("Teste 1: Encontrar maior banda")
    public void testEncontrarMaiorBanda() {
        Banda resultado = Exercicio07.encontrarMaiorBanda(bandas);
        
        assertNotNull(resultado, "Deve retornar uma banda");
        assertEquals("Metallica", resultado.nome, "Metallica tem mais integrantes (6)");
        assertEquals(6, resultado.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 2: Encontrar menor banda")
    public void testEncontrarMenorBanda() {
        Banda resultado = Exercicio07.encontrarMenorBanda(bandas);
        
        assertNotNull(resultado);
        assertEquals("Nirvana", resultado.nome, "Nirvana tem menos integrantes (3)");
        assertEquals(3, resultado.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 3: Encontrar máximo de integrantes")
    public void testEncontrarMaximoIntegrantes() {
        int resultado = Exercicio07.encontrarMaximoIntegrantes(bandas);
        assertEquals(6, resultado, "Máximo de integrantes é 6");
    }
    
    @Test
    @DisplayName("Teste 4: Encontrar mínimo de integrantes")
    public void testEncontrarMinimoIntegrantes() {
        int resultado = Exercicio07.encontrarMinimoIntegrantes(bandas);
        assertEquals(3, resultado, "Mínimo de integrantes é 3");
    }
    
    @Test
    @DisplayName("Teste 5: Encontrar maior em array variado")
    public void testEncontrarMaiorVariado() {
        Banda resultado = Exercicio07.encontrarMaiorBanda(bandasVariadas);
        
        assertEquals("Orchestra", resultado.nome);
        assertEquals(50, resultado.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 6: Encontrar menor em array variado")
    public void testEncontrarMenorVariado() {
        Banda resultado = Exercicio07.encontrarMenorBanda(bandasVariadas);
        
        assertEquals("Solo Artist", resultado.nome);
        assertEquals(1, resultado.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 7: Min e Max em uma passada")
    public void testEncontrarMinMaxUmaPassada() {
        Banda[] resultado = Exercicio07.encontrarMinMax(bandas);
        
        assertNotNull(resultado);
        assertEquals(2, resultado.length, "Deve retornar array com 2 elementos");
        
        // Mínimo
        assertNotNull(resultado[0], "Primeiro elemento é o mínimo");
        assertEquals("Nirvana", resultado[0].nome);
        assertEquals(3, resultado[0].numeroIntegrantes);
        
        // Máximo
        assertNotNull(resultado[1], "Segundo elemento é o máximo");
        assertEquals("Metallica", resultado[1].nome);
        assertEquals(6, resultado[1].numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 8: Todas as maiores (sem empate)")
    public void testTodasMaioresSemEmpate() {
        Banda[] resultado = Exercicio07.encontrarTodasMaiores(bandas);
        
        assertEquals(1, resultado.length, "Apenas Metallica tem 6 integrantes");
        assertEquals("Metallica", resultado[0].nome);
    }
    
    @Test
    @DisplayName("Teste 9: Todas as maiores (com empate)")
    public void testTodasMaioresComEmpate() {
        Banda[] bandasComEmpate = new Banda[4];
        bandasComEmpate[0] = new Banda("A", "Rock", 5, 1);
        bandasComEmpate[1] = new Banda("B", "Pop", 7, 2);
        bandasComEmpate[2] = new Banda("C", "Metal", 7, 3);
        bandasComEmpate[3] = new Banda("D", "Jazz", 3, 4);
        
        Banda[] resultado = Exercicio07.encontrarTodasMaiores(bandasComEmpate);
        
        assertEquals(2, resultado.length, "B e C têm 7 integrantes");
        assertTrue(contemNome(resultado, "B"), "Deve conter banda B");
        assertTrue(contemNome(resultado, "C"), "Deve conter banda C");
    }
    
    @Test
    @DisplayName("Teste 10: Array com uma banda")
    public void testArrayUmaBanda() {
        Banda[] umaBanda = new Banda[1];
        umaBanda[0] = new Banda("Solo", "Rock", 5, 1);
        
        Banda maior = Exercicio07.encontrarMaiorBanda(umaBanda);
        Banda menor = Exercicio07.encontrarMenorBanda(umaBanda);
        
        assertEquals("Solo", maior.nome);
        assertEquals("Solo", menor.nome);
        assertSame(maior, menor, "Com uma banda, maior e menor são a mesma");
    }
    
    @Test
    @DisplayName("Teste 11: Extremos em dataset variado")
    public void testExtremosDatasetVariado() {
        int max = Exercicio07.encontrarMaximoIntegrantes(bandasVariadas);
        int min = Exercicio07.encontrarMinimoIntegrantes(bandasVariadas);
        
        assertEquals(50, max, "Máximo é 50 (Orchestra)");
        assertEquals(1, min, "Mínimo é 1 (Solo Artist)");
    }
    
    @Test
    @DisplayName("Teste 12: Verificar se maior está no final do array")
    public void testMaiorNoFinal() {
        Banda[] bandasOrdenadas = new Banda[3];
        bandasOrdenadas[0] = new Banda("A", "Rock", 2, 1);
        bandasOrdenadas[1] = new Banda("B", "Pop", 3, 2);
        bandasOrdenadas[2] = new Banda("C", "Metal", 5, 3);
        
        Banda resultado = Exercicio07.encontrarMaiorBanda(bandasOrdenadas);
        assertEquals("C", resultado.nome, "Maior deve ser encontrada mesmo estando no final");
    }
    
    @Test
    @DisplayName("Teste 13: Verificar se menor está no final do array")
    public void testMenorNoFinal() {
        Banda[] bandasOrdenadas = new Banda[3];
        bandasOrdenadas[0] = new Banda("A", "Rock", 5, 1);
        bandasOrdenadas[1] = new Banda("B", "Pop", 4, 2);
        bandasOrdenadas[2] = new Banda("C", "Metal", 2, 3);
        
        Banda resultado = Exercicio07.encontrarMenorBanda(bandasOrdenadas);
        assertEquals("C", resultado.nome, "Menor deve ser encontrada mesmo estando no final");
    }
    
    // Método auxiliar
    private boolean contemNome(Banda[] bandas, String nome) {
        for (Banda banda : bandas) {
            if (banda != null && banda.nome.equals(nome)) {
                return true;
            }
        }
        return false;
    }
}
