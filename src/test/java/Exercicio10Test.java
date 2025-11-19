import org.junit.jupiter.api.Test;

import br.unicap.Banda;
import br.unicap.Exercicio10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 * Testes unitários para o Exercício 10 - Sistema Completo
 */
public class Exercicio10Test {
    
    @BeforeEach
    public void setUp() {
        Exercicio10.inicializarSistema();
    }
    
    @AfterEach
    public void tearDown() {
        // Limpar sistema após cada teste
        Exercicio10.inicializarSistema();
    }
    
    @Test
    @DisplayName("Teste 1: Inicializar sistema")
    public void testInicializarSistema() {
        Exercicio10.inicializarSistema();
        assertEquals(0, Exercicio10.contarBandasCadastradas(), 
                    "Sistema deve iniciar vazio");
        assertFalse(Exercicio10.sistemaEstaChei(), 
                   "Sistema não deve estar cheio ao iniciar");
    }
    
    @Test
    @DisplayName("Teste 2: Cadastrar banda com sucesso")
    public void testCadastrarBanda() {
        Banda banda = new Banda("Queen", "Rock", 4, 1);
        assertTrue(Exercicio10.cadastrarBanda(banda), 
                  "Deve cadastrar banda com sucesso");
        assertEquals(1, Exercicio10.contarBandasCadastradas());
    }
    
    @Test
    @DisplayName("Teste 3: Cadastrar múltiplas bandas")
    public void testCadastrarMultiplasBandas() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        Exercicio10.cadastrarBanda(new Banda("Nirvana", "Rock", 3, 3));
        
        assertEquals(3, Exercicio10.contarBandasCadastradas());
    }
    
    @Test
    @DisplayName("Teste 4: Sistema fica cheio")
    public void testSistemaFicaCheio() {
        // Cadastrar 10 bandas (MAX_BANDAS)
        for (int i = 0; i < 10; i++) {
            Exercicio10.cadastrarBanda(new Banda("Banda" + i, "Rock", 4, i + 1));
        }
        
        assertTrue(Exercicio10.sistemaEstaChei(), 
                  "Sistema deve estar cheio após 10 bandas");
        
        // Tentar cadastrar mais uma
        assertFalse(Exercicio10.cadastrarBanda(new Banda("Extra", "Pop", 3, 1)),
                   "Não deve conseguir cadastrar quando cheio");
    }
    
    @Test
    @DisplayName("Teste 5: Buscar banda por nome")
    public void testBuscarPorNome() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        
        Banda encontrada = Exercicio10.buscarPorNome("Queen");
        assertNotNull(encontrada);
        assertEquals("Queen", encontrada.nome);
    }
    
    @Test
    @DisplayName("Teste 6: Buscar banda inexistente")
    public void testBuscarBandaInexistente() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        
        Banda encontrada = Exercicio10.buscarPorNome("Beatles");
        assertNull(encontrada, "Deve retornar null para banda inexistente");
    }
    
    @Test
    @DisplayName("Teste 7: Buscar por tipo de música")
    public void testBuscarPorTipo() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        Exercicio10.cadastrarBanda(new Banda("Nirvana", "Rock", 3, 3));
        
        ArrayList<Banda> rock = Exercicio10.buscarPorTipo("Rock");
        assertEquals(2, rock.size(), "Deve encontrar 2 bandas de Rock");
    }
    
    @Test
    @DisplayName("Teste 8: Remover banda")
    public void testRemoverBanda() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        
        assertTrue(Exercicio10.removerBanda("Queen"), 
                  "Deve remover Queen com sucesso");
        assertEquals(1, Exercicio10.contarBandasCadastradas());
        
        assertNull(Exercicio10.buscarPorNome("Queen"), 
                  "Queen não deve mais existir");
    }
    
    @Test
    @DisplayName("Teste 9: Remover banda inexistente")
    public void testRemoverBandaInexistente() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        
        assertFalse(Exercicio10.removerBanda("Beatles"), 
                   "Não deve remover banda inexistente");
        assertEquals(1, Exercicio10.contarBandasCadastradas());
    }
    
    @Test
    @DisplayName("Teste 10: Obter bandas cadastradas")
    public void testObterBandasCadastradas() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        
        Banda[] cadastradas = Exercicio10.obterBandasCadastradas();
        
        assertEquals(2, cadastradas.length);
        assertNotNull(cadastradas[0]);
        assertNotNull(cadastradas[1]);
    }
    
    @Test
    @DisplayName("Teste 11: Ordenar bandas por integrantes")
    public void testOrdenarPorIntegrantes() {
        Exercicio10.cadastrarBanda(new Banda("A", "Rock", 6, 1));
        Exercicio10.cadastrarBanda(new Banda("B", "Pop", 3, 2));
        Exercicio10.cadastrarBanda(new Banda("C", "Metal", 5, 3));
        
        Exercicio10.ordenarBandas("integrantes");
        
        Banda[] ordenadas = Exercicio10.obterBandasCadastradas();
        assertEquals(3, ordenadas[0].numeroIntegrantes);
        assertEquals(5, ordenadas[1].numeroIntegrantes);
        assertEquals(6, ordenadas[2].numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 12: Ordenar por nome")
    public void testOrdenarPorNome() {
        Exercicio10.cadastrarBanda(new Banda("Zebra", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        Exercicio10.cadastrarBanda(new Banda("Queen", "Metal", 4, 3));
        
        Exercicio10.ordenarBandas("nome");
        
        Banda[] ordenadas = Exercicio10.obterBandasCadastradas();
        assertEquals("ABBA", ordenadas[0].nome);
        assertEquals("Queen", ordenadas[1].nome);
        assertEquals("Zebra", ordenadas[2].nome);
    }
    
    @Test
    @DisplayName("Teste 13: Validar banda válida")
    public void testValidarBandaValida() {
        Banda valida = new Banda("Queen", "Rock", 4, 5);
        assertTrue(Exercicio10.validarBanda(valida), 
                  "Banda válida deve passar na validação");
    }
    
    @Test
    @DisplayName("Teste 14: Validar banda inválida")
    public void testValidarBandaInvalida() {
        Banda invalida1 = new Banda("", "Rock", 4, 5);
        assertFalse(Exercicio10.validarBanda(invalida1), 
                   "Nome vazio deve ser inválido");
        
        Banda invalida2 = new Banda("Queen", "Rock", 0, 5);
        assertFalse(Exercicio10.validarBanda(invalida2), 
                   "Integrantes <= 0 deve ser inválido");
        
        Banda invalida3 = new Banda("Queen", "Rock", 4, 15);
        assertFalse(Exercicio10.validarBanda(invalida3), 
                   "Ranking > 10 deve ser inválido");
    }
    
    @Test
    @DisplayName("Teste 15: Gerar relatório completo")
    public void testGerarRelatorioCompleto() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        Exercicio10.cadastrarBanda(new Banda("Nirvana", "Rock", 3, 3));
        
        String relatorio = Exercicio10.gerarRelatorioCompleto();
        
        assertNotNull(relatorio);
        assertFalse(relatorio.isEmpty());
        assertTrue(relatorio.contains("3") || relatorio.contains("três"), 
                  "Deve mencionar 3 bandas");
    }
    
    @Test
    @DisplayName("Teste 16: Exportar para CSV")
    public void testExportarParaCSV() {
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 1));
        Exercicio10.cadastrarBanda(new Banda("ABBA", "Pop", 4, 2));
        
        String csv = Exercicio10.exportarParaCSV();
        
        assertNotNull(csv);
        assertTrue(csv.contains("Queen"), "CSV deve conter Queen");
        assertTrue(csv.contains("ABBA"), "CSV deve conter ABBA");
        assertTrue(csv.contains("Rock"), "CSV deve conter Rock");
        assertTrue(csv.contains("Pop"), "CSV deve conter Pop");
    }
    
    @Test
    @DisplayName("Teste 17: Obter maior banda")
    public void testObterMaiorBanda() {
        Exercicio10.cadastrarBanda(new Banda("A", "Rock", 3, 1));
        Exercicio10.cadastrarBanda(new Banda("B", "Pop", 7, 2));
        Exercicio10.cadastrarBanda(new Banda("C", "Metal", 5, 3));
        
        Banda maior = Exercicio10.obterMaiorBanda();
        
        assertNotNull(maior);
        assertEquals("B", maior.nome);
        assertEquals(7, maior.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 18: Obter menor banda")
    public void testObterMenorBanda() {
        Exercicio10.cadastrarBanda(new Banda("A", "Rock", 3, 1));
        Exercicio10.cadastrarBanda(new Banda("B", "Pop", 7, 2));
        Exercicio10.cadastrarBanda(new Banda("C", "Metal", 5, 3));
        
        Banda menor = Exercicio10.obterMenorBanda();
        
        assertNotNull(menor);
        assertEquals("A", menor.nome);
        assertEquals(3, menor.numeroIntegrantes);
    }
    
    @Test
    @DisplayName("Teste 19: Sistema vazio")
    public void testSistemaVazio() {
        assertEquals(0, Exercicio10.contarBandasCadastradas());
        
        Banda[] vazias = Exercicio10.obterBandasCadastradas();
        assertEquals(0, vazias.length);
        
        assertNull(Exercicio10.obterMaiorBanda());
        assertNull(Exercicio10.obterMenorBanda());
    }
    
    @Test
    @DisplayName("Teste 20: Integração completa")
    public void testIntegracaoCompleta() {
        // Cadastrar
        Exercicio10.cadastrarBanda(new Banda("Metallica", "Metal", 6, 1));
        Exercicio10.cadastrarBanda(new Banda("Nirvana", "Rock", 3, 2));
        Exercicio10.cadastrarBanda(new Banda("Queen", "Rock", 4, 3));
        
        // Buscar
        assertNotNull(Exercicio10.buscarPorNome("Queen"));
        assertEquals(2, Exercicio10.buscarPorTipo("Rock").size());
        
        // Ordenar
        Exercicio10.ordenarBandas("integrantes");
        Banda[] ordenadas = Exercicio10.obterBandasCadastradas();
        assertEquals("Nirvana", ordenadas[0].nome);
        
        // Remover
        Exercicio10.removerBanda("Nirvana");
        assertEquals(2, Exercicio10.contarBandasCadastradas());
        
        // Estatísticas
        Banda maior = Exercicio10.obterMaiorBanda();
        assertEquals("Metallica", maior.nome);
    }
}
