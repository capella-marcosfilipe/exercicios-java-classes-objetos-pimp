import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

/**
 * Testes unitários para o Exercício 09 - Selection Sort
 */
public class Exercicio09Test {
    
    private Banda[] bandas;
    private Banda[] bandasDesordenadas;
    
    @BeforeEach
    public void setUp() {
        // Array já ordenado
        bandas = new Banda[5];
        bandas[0] = new Banda("Nirvana", "Rock", 3, 3);
        bandas[1] = new Banda("Queen", "Rock", 4, 1);
        bandas[2] = new Banda("ABBA", "Pop", 4, 2);
        bandas[3] = new Banda("Pink Floyd", "Progressive", 5, 5);
        bandas[4] = new Banda("Metallica", "Metal", 6, 4);
        
        // Array desordenado
        bandasDesordenadas = new Banda[5];
        bandasDesordenadas[0] = new Banda("Metallica", "Metal", 6, 4);
        bandasDesordenadas[1] = new Banda("Nirvana", "Rock", 3, 3);
        bandasDesordenadas[2] = new Banda("Pink Floyd", "Progressive", 5, 5);
        bandasDesordenadas[3] = new Banda("ABBA", "Pop", 4, 2);
        bandasDesordenadas[4] = new Banda("Queen", "Rock", 4, 1);
    }
    
    @Test
    @DisplayName("Teste 1: Selection Sort ordem crescente")
    public void testSelectionSortCrescente() {
        Exercicio09.selectionSort(bandasDesordenadas);
        
        // Verificar ordem crescente
        assertEquals(3, bandasDesordenadas[0].numeroIntegrantes, "Primeiro deve ter 3");
        assertEquals(4, bandasDesordenadas[1].numeroIntegrantes, "Segundo deve ter 4");
        assertEquals(4, bandasDesordenadas[2].numeroIntegrantes, "Terceiro deve ter 4");
        assertEquals(5, bandasDesordenadas[3].numeroIntegrantes, "Quarto deve ter 5");
        assertEquals(6, bandasDesordenadas[4].numeroIntegrantes, "Quinto deve ter 6");
        
        assertTrue(Exercicio09.estaOrdenado(bandasDesordenadas), 
                  "Array deve estar ordenado");
    }
    
    @Test
    @DisplayName("Teste 2: Selection Sort ordem decrescente")
    public void testSelectionSortDecrescente() {
        Exercicio09.selectionSortDecrescente(bandasDesordenadas);
        
        // Verificar ordem decrescente
        assertEquals(6, bandasDesordenadas[0].numeroIntegrantes);
        assertEquals(5, bandasDesordenadas[1].numeroIntegrantes);
        assertEquals(4, bandasDesordenadas[2].numeroIntegrantes);
        assertEquals(4, bandasDesordenadas[3].numeroIntegrantes);
        assertEquals(3, bandasDesordenadas[4].numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 3: Ordenar array já ordenado")
    public void testOrdenarJaOrdenado() {
        Banda[] copia = Arrays.copyOf(bandas, bandas.length);
        Exercicio09.selectionSort(bandas);
        
        // Deve permanecer na mesma ordem
        for (int i = 0; i < bandas.length; i++) {
            assertEquals(copia[i].nome, bandas[i].nome);
        }
    }
    
    @Test
    @DisplayName("Teste 4: Ordenar por nome (alfabética)")
    public void testOrdenarPorNome() {
        Exercicio09.selectionSortPorNome(bandasDesordenadas);
        
        // Ordem alfabética esperada: ABBA, Metallica, Nirvana, Pink Floyd, Queen
        assertEquals("ABBA", bandasDesordenadas[0].nome);
        assertEquals("Metallica", bandasDesordenadas[1].nome);
        assertEquals("Nirvana", bandasDesordenadas[2].nome);
        assertEquals("Pink Floyd", bandasDesordenadas[3].nome);
        assertEquals("Queen", bandasDesordenadas[4].nome);
    }
    
    @Test
    @DisplayName("Teste 5: Ordenar por ranking")
    public void testOrdenarPorRanking() {
        Exercicio09.selectionSortPorRanking(bandasDesordenadas);
        
        assertEquals(1, bandasDesordenadas[0].posicaoRanking);
        assertEquals(2, bandasDesordenadas[1].posicaoRanking);
        assertEquals(3, bandasDesordenadas[2].posicaoRanking);
        assertEquals(4, bandasDesordenadas[3].posicaoRanking);
        assertEquals(5, bandasDesordenadas[4].posicaoRanking);
    }
    
    @Test
    @DisplayName("Teste 6: Contador de comparações e trocas")
    public void testContadorComparacoesTrocas() {
        int[] resultado = Exercicio09.selectionSortComContador(bandasDesordenadas);
        
        int comparacoes = resultado[0];
        int trocas = resultado[1];
        
        // Para array de 5 elementos:
        // Comparações: 4 + 3 + 2 + 1 = 10
        assertEquals(10, comparacoes, "Deve fazer 10 comparações");
        
        // Trocas: varia, mas deve ser <= 5
        assertTrue(trocas <= 5, "Deve fazer no máximo 5 trocas");
        assertTrue(trocas >= 0, "Número de trocas deve ser >= 0");
    }
    
    @Test
    @DisplayName("Teste 7: Verificar se está ordenado - true")
    public void testEstaOrdenadoTrue() {
        assertTrue(Exercicio09.estaOrdenado(bandas), 
                  "Array ordenado deve retornar true");
    }
    
    @Test
    @DisplayName("Teste 8: Verificar se está ordenado - false")
    public void testEstaOrdenadoFalse() {
        assertFalse(Exercicio09.estaOrdenado(bandasDesordenadas), 
                   "Array desordenado deve retornar false");
    }
    
    @Test
    @DisplayName("Teste 9: Array com dois elementos")
    public void testArrayDoisElementos() {
        Banda[] duas = new Banda[2];
        duas[0] = new Banda("B", "Rock", 5, 2);
        duas[1] = new Banda("A", "Pop", 3, 1);
        
        Exercicio09.selectionSort(duas);
        
        assertEquals(3, duas[0].numeroIntegrantes);
        assertEquals(5, duas[1].numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 10: Array com um elemento")
    public void testArrayUmElemento() {
        Banda[] uma = new Banda[1];
        uma[0] = new Banda("Solo", "Rock", 5, 1);
        
        Exercicio09.selectionSort(uma);
        
        assertEquals("Solo", uma[0].nome);
        assertEquals(5, uma[0].numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 11: Encontrar posição ordenada")
    public void testEncontrarPosicaoOrdenada() {
        // bandas está ordenado: [3, 4, 4, 5, 6]
        
        assertEquals(0, Exercicio09.encontrarPosicaoOrdenada(bandas, 2), 
                    "2 deveria estar na posição 0");
        assertEquals(3, Exercicio09.encontrarPosicaoOrdenada(bandas, 5), 
                    "5 deveria estar na posição 3");
        assertEquals(5, Exercicio09.encontrarPosicaoOrdenada(bandas, 10), 
                    "10 deveria estar após o último");
    }
    
    @Test
    @DisplayName("Teste 12: Ordenar array com valores duplicados")
    public void testOrdenarComDuplicados() {
        Banda[] duplicados = new Banda[6];
        duplicados[0] = new Banda("A", "Rock", 4, 1);
        duplicados[1] = new Banda("B", "Pop", 3, 2);
        duplicados[2] = new Banda("C", "Metal", 4, 3);
        duplicados[3] = new Banda("D", "Jazz", 3, 4);
        duplicados[4] = new Banda("E", "Blues", 5, 5);
        duplicados[5] = new Banda("F", "Rock", 3, 1);
        
        Exercicio09.selectionSort(duplicados);
        
        // Verificar se está ordenado
        for (int i = 0; i < duplicados.length - 1; i++) {
            assertTrue(duplicados[i].numeroIntegrantes <= duplicados[i + 1].numeroIntegrantes,
                      "Elementos devem estar em ordem crescente");
        }
    }
    
    @Test
    @DisplayName("Teste 13: Ordenar preserva dados das bandas")
    public void testOrdenarPreservaDados() {
        Banda[] original = Arrays.copyOf(bandasDesordenadas, bandasDesordenadas.length);
        
        Exercicio09.selectionSort(bandasDesordenadas);
        
        // Verificar que todas as bandas ainda existem
        for (Banda bandaOriginal : original) {
            boolean encontrada = false;
            for (Banda bandaOrdenada : bandasDesordenadas) {
                if (bandaOriginal.nome.equals(bandaOrdenada.nome) &&
                    bandaOriginal.tipoMusica.equals(bandaOrdenada.tipoMusica) &&
                    bandaOriginal.numeroIntegrantes == bandaOrdenada.numeroIntegrantes) {
                    encontrada = true;
                    break;
                }
            }
            assertTrue(encontrada, "Banda " + bandaOriginal.nome + " deve estar presente");
        }
    }
    
    @Test
    @DisplayName("Teste 14: Array em ordem inversa")
    public void testArrayOrdemInversa() {
        Banda[] inverso = new Banda[5];
        inverso[0] = new Banda("A", "Rock", 10, 1);
        inverso[1] = new Banda("B", "Pop", 8, 2);
        inverso[2] = new Banda("C", "Metal", 6, 3);
        inverso[3] = new Banda("D", "Jazz", 4, 4);
        inverso[4] = new Banda("E", "Blues", 2, 5);
        
        Exercicio09.selectionSort(inverso);
        
        assertEquals(2, inverso[0].numeroIntegrantes);
        assertEquals(4, inverso[1].numeroIntegrantes);
        assertEquals(6, inverso[2].numeroIntegrantes);
        assertEquals(8, inverso[3].numeroIntegrantes);
        assertEquals(10, inverso[4].numeroIntegrantes);
    }
    
    @RepeatedTest(3)
    @DisplayName("Teste 15: Ordenação é determinística (repetido)")
    public void testOrdenacaoDeterministica() {
        Banda[] teste = Arrays.copyOf(bandasDesordenadas, bandasDesordenadas.length);
        Exercicio09.selectionSort(teste);
        
        assertTrue(Exercicio09.estaOrdenado(teste), 
                  "Deve estar ordenado em todas as execuções");
    }
}
