import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 * Testes unitários para o Exercício 03
 */
public class Exercicio03Test {
    
    private Banda[] bandas;
    
    @BeforeEach
    public void setUp() {
        bandas = new Banda[6];
        bandas[0] = new Banda("Queen", "Rock", 4, 1);
        bandas[1] = new Banda("ABBA", "Pop", 4, 2);
        bandas[2] = new Banda("Nirvana", "Rock", 3, 3);
        bandas[3] = new Banda("Metallica", "Metal", 4, 4);
        bandas[4] = new Banda("The Beatles", "Rock", 4, 5);
        bandas[5] = new Banda("Madonna", "Pop", 1, 1);
    }
    
    @Test
    @DisplayName("Teste 1: Buscar bandas de Rock")
    public void testBuscarBandasRock() {
        ArrayList<Banda> resultado = Exercicio03.buscarPorTipo(bandas, "Rock");
        
        assertNotNull(resultado, "Resultado não deve ser null");
        assertEquals(3, resultado.size(), "Deve encontrar 3 bandas de Rock");
        
        // Verificar se todas são de Rock
        for (Banda banda : resultado) {
            assertTrue(banda.tipoMusica.equalsIgnoreCase("Rock"), 
                      "Todas devem ser do tipo Rock");
        }
        
        // Verificar nomes específicos
        assertTrue(contemNome(resultado, "Queen"), "Deve conter Queen");
        assertTrue(contemNome(resultado, "Nirvana"), "Deve conter Nirvana");
        assertTrue(contemNome(resultado, "The Beatles"), "Deve conter The Beatles");
    }
    
    @Test
    @DisplayName("Teste 2: Buscar bandas de Pop")
    public void testBuscarBandasPop() {
        ArrayList<Banda> resultado = Exercicio03.buscarPorTipo(bandas, "Pop");
        
        assertEquals(2, resultado.size(), "Deve encontrar 2 bandas de Pop");
        assertTrue(contemNome(resultado, "ABBA"));
        assertTrue(contemNome(resultado, "Madonna"));
    }
    
    @Test
    @DisplayName("Teste 3: Buscar tipo inexistente")
    public void testBuscarTipoInexistente() {
        ArrayList<Banda> resultado = Exercicio03.buscarPorTipo(bandas, "Jazz");
        
        assertNotNull(resultado, "Deve retornar lista vazia, não null");
        assertEquals(0, resultado.size(), "Deve retornar lista vazia");
    }
    
    @Test
    @DisplayName("Teste 4: Buscar ignorando maiúsculas/minúsculas")
    public void testBuscarCaseInsensitive() {
        ArrayList<Banda> resultado1 = Exercicio03.buscarPorTipo(bandas, "rock");
        ArrayList<Banda> resultado2 = Exercicio03.buscarPorTipo(bandas, "ROCK");
        ArrayList<Banda> resultado3 = Exercicio03.buscarPorTipo(bandas, "Rock");
        
        assertEquals(3, resultado1.size(), "Deve funcionar com minúsculas");
        assertEquals(3, resultado2.size(), "Deve funcionar com maiúsculas");
        assertEquals(3, resultado3.size(), "Deve funcionar com primeira maiúscula");
    }
    
    @Test
    @DisplayName("Teste 5: Contar bandas por tipo")
    public void testContarPorTipo() {
        assertEquals(3, Exercicio03.contarPorTipo(bandas, "Rock"));
        assertEquals(2, Exercicio03.contarPorTipo(bandas, "Pop"));
        assertEquals(1, Exercicio03.contarPorTipo(bandas, "Metal"));
        assertEquals(0, Exercicio03.contarPorTipo(bandas, "Jazz"));
    }
    
    @Test
    @DisplayName("Teste 6: Listar tipos únicos")
    public void testListarTiposUnicos() {
        ArrayList<String> tipos = Exercicio03.listarTiposUnicos(bandas);
        
        assertNotNull(tipos);
        assertEquals(3, tipos.size(), "Deve ter 3 tipos únicos: Rock, Pop, Metal");
        assertTrue(tipos.contains("Rock") || tipos.contains("rock"));
        assertTrue(tipos.contains("Pop") || tipos.contains("pop"));
        assertTrue(tipos.contains("Metal") || tipos.contains("metal"));
    }
    
    @Test
    @DisplayName("Teste 7: Buscar em array com uma banda")
    public void testBuscarArrayUnico() {
        Banda[] bandasUnico = new Banda[1];
        bandasUnico[0] = new Banda("Solo", "Jazz", 1, 1);
        
        ArrayList<Banda> resultado = Exercicio03.buscarPorTipo(bandasUnico, "Jazz");
        assertEquals(1, resultado.size());
        assertEquals("Solo", resultado.get(0).nome);
    }
    
    // Método auxiliar para verificar se lista contém banda com determinado nome
    private boolean contemNome(ArrayList<Banda> lista, String nome) {
        for (Banda banda : lista) {
            if (banda.nome.equals(nome)) {
                return true;
            }
        }
        return false;
    }
}
