package br.unicap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * EXERCÍCIO 10: Sistema Completo de Gerenciamento de Bandas
 * 
 * OBJETIVO:
 * Integrar TODOS os exercícios anteriores em um sistema funcional completo.
 * 
 * FUNCIONALIDADES:
 * 1. Cadastrar bandas
 * 2. Exibir todas as bandas
 * 3. Buscar banda por nome (Exercício 06)
 * 4. Buscar bandas por tipo de música (Exercício 03)
 * 5. Ordenar bandas (Exercício 09)
 * 6. Exibir estatísticas (Exercício 08)
 * 7. Encontrar maior/menor banda (Exercício 07)
 * 8. Relatório completo
 */
public class Exercicio10 {
    
    private static Banda[] bandas;
    private static final int MAX_BANDAS = 10;
    
    /**
     * Inicializa o sistema criando o array de bandas
     */
    public static void inicializarSistema() {
        // TODO: Implemente sua solução aqui
        // Crie o array com tamanho MAX_BANDAS
    }
    
    /**
     * Cadastra uma nova banda no sistema
     * 
     * @param banda Banda a cadastrar
     * @return true se cadastrou com sucesso, false se array está cheio
     */
    public static boolean cadastrarBanda(Banda banda) {
        // TODO: Implemente sua solução aqui
        // Encontre a primeira posição null e adicione a banda
        
        return false; // Substitua esta linha
    }
    
    /**
     * Remove uma banda do sistema pelo nome
     * 
     * @param nomeBanda Nome da banda a remover
     * @return true se removeu, false se não encontrou
     */
    public static boolean removerBanda(String nomeBanda) {
        // TODO: Implemente sua solução aqui
        // Encontre a banda e set como null
        
        return false; // Substitua esta linha
    }
    
    /**
     * Retorna apenas as bandas cadastradas (não-null)
     * 
     * @return Array com apenas bandas válidas
     */
    public static Banda[] obterBandasCadastradas() {
        // TODO: Implemente sua solução aqui
        // Conte quantas bandas não são null, crie array desse tamanho e preencha
        
        return new Banda[0]; // Substitua esta linha
    }
    
    /**
     * Busca banda por nome usando busca sequencial (Exercício 06)
     * 
     * @param nome Nome a buscar
     * @return Banda encontrada ou null
     */
    public static Banda buscarPorNome(String nome) {
        // TODO: Implemente sua solução aqui
        // Reutilize o método do Exercício 06
        
        return null; // Substitua esta linha
    }
    
    /**
     * Busca bandas por tipo de música (Exercício 03)
     * 
     * @param tipo Tipo de música
     * @return Lista de bandas desse tipo
     */
    public static ArrayList<Banda> buscarPorTipo(String tipo) {
        // TODO: Implemente sua solução aqui
        // Reutilize o método do Exercício 03
        
        return new ArrayList<>(); // Substitua esta linha
    }
    
    /**
     * Ordena as bandas usando Selection Sort (Exercício 09)
     * 
     * @param criterio "integrantes", "nome" ou "ranking"
     */
    public static void ordenarBandas(String criterio) {
        // TODO: Implemente sua solução aqui
        // Use switch/case para chamar o método correto do Exercício 09
    }
    
    /**
     * Gera relatório estatístico completo (Exercício 08)
     * 
     * @return String com o relatório
     */
    public static String gerarRelatorioCompleto() {
        // TODO: Implemente sua solução aqui
        // Use os métodos do Exercício 08
        
        return ""; // Substitua esta linha
    }
    
    /**
     * Retorna a banda com mais integrantes (Exercício 07)
     * 
     * @return Banda maior ou null se vazio
     */
    public static Banda obterMaiorBanda() {
        // TODO: Implemente sua solução aqui
        
        return null; // Substitua esta linha
    }
    
    /**
     * Retorna a banda com menos integrantes (Exercício 07)
     * 
     * @return Banda menor ou null se vazio
     */
    public static Banda obterMenorBanda() {
        // TODO: Implemente sua solução aqui
        
        return null; // Substitua esta linha
    }
    
    /**
     * Exporta as bandas para formato CSV
     * 
     * @return String no formato CSV
     */
    public static String exportarParaCSV() {
        // TODO: Implemente sua solução aqui
        // Formato: "nome,tipoMusica,numeroIntegrantes,posicaoRanking"
        
        return ""; // Substitua esta linha
    }
    
    /**
     * Valida se uma banda pode ser cadastrada
     * 
     * @param banda Banda a validar
     * @return true se válida, false caso contrário
     */
    public static boolean validarBanda(Banda banda) {
        // TODO: Implemente sua solução aqui
        // Verificações:
        // - Nome não vazio
        // - Tipo de música não vazio
        // - Número de integrantes > 0
        // - Ranking entre 1 e 10
        
        return false; // Substitua esta linha
    }
    
    /**
     * Conta total de bandas cadastradas
     * 
     * @return Número de bandas não-null
     */
    public static int contarBandasCadastradas() {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Verifica se o sistema está cheio
     * 
     * @return true se não há mais espaço
     */
    public static boolean sistemaEstaChei() {
        // TODO: Implemente sua solução aqui
        
        return false; // Substitua esta linha
    }
    
    /**
     * Menu principal do sistema (IMPLEMENTADO COMO EXEMPLO)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarSistema();
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    cadastrarBandaInterativo(scanner);
                    break;
                case 2:
                    exibirTodasBandas();
                    break;
                case 3:
                    buscarBandaInterativo(scanner);
                    break;
                case 4:
                    buscarPorTipoInterativo(scanner);
                    break;
                case 5:
                    ordenarBandasInterativo(scanner);
                    break;
                case 6:
                    exibirEstatisticas();
                    break;
                case 7:
                    exibirExtremal();
                    break;
                case 8:
                    System.out.println(gerarRelatorioCompleto());
                    break;
                case 9:
                    removerBandaInterativo(scanner);
                    break;
                case 10:
                    exportarDados();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SISTEMA DE GERENCIAMENTO DE BANDAS     ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║ 1. Cadastrar banda                       ║");
        System.out.println("║ 2. Exibir todas as bandas                ║");
        System.out.println("║ 3. Buscar banda por nome                 ║");
        System.out.println("║ 4. Buscar por tipo de música             ║");
        System.out.println("║ 5. Ordenar bandas                        ║");
        System.out.println("║ 6. Exibir estatísticas                   ║");
        System.out.println("║ 7. Maior e menor banda                   ║");
        System.out.println("║ 8. Relatório completo                    ║");
        System.out.println("║ 9. Remover banda                         ║");
        System.out.println("║ 10. Exportar dados (CSV)                 ║");
        System.out.println("║ 0. Sair                                  ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.print("Opção: ");
    }
    
    private static void cadastrarBandaInterativo(Scanner scanner) {
        // Implementação auxiliar
        if (sistemaEstaChei()) {
            System.out.println("Sistema cheio! Não é possível cadastrar mais bandas.");
            return;
        }
        
        System.out.print("Nome da banda: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo de música: ");
        String tipo = scanner.nextLine();
        System.out.print("Número de integrantes: ");
        int integrantes = scanner.nextInt();
        System.out.print("Posição no ranking (1-10): ");
        int ranking = scanner.nextInt();
        
        Banda novaBanda = new Banda(nome, tipo, integrantes, ranking);
        
        if (validarBanda(novaBanda)) {
            if (cadastrarBanda(novaBanda)) {
                System.out.println("✓ Banda cadastrada com sucesso!");
            } else {
                System.out.println("✗ Erro ao cadastrar banda.");
            }
        } else {
            System.out.println("✗ Dados inválidos!");
        }
    }
    
    private static void exibirTodasBandas() {
        Banda[] cadastradas = obterBandasCadastradas();
        if (cadastradas.length == 0) {
            System.out.println("Nenhuma banda cadastrada.");
            return;
        }
        
        System.out.println("\n=== BANDAS CADASTRADAS ===");
        for (int i = 0; i < cadastradas.length; i++) {
            System.out.printf("%d. %s\n", i + 1, Exercicio05.formatarBanda(cadastradas[i]));
        }
    }
    
    private static void buscarBandaInterativo(Scanner scanner) {
        System.out.print("Nome da banda: ");
        String nome = scanner.nextLine();
        Banda encontrada = buscarPorNome(nome);
        
        if (encontrada != null) {
            System.out.println("✓ Banda encontrada: " + Exercicio05.formatarBanda(encontrada));
        } else {
            System.out.println("✗ Banda não encontrada.");
        }
    }
    
    private static void buscarPorTipoInterativo(Scanner scanner) {
        System.out.print("Tipo de música: ");
        String tipo = scanner.nextLine();
        ArrayList<Banda> resultado = buscarPorTipo(tipo);
        
        if (resultado.isEmpty()) {
            System.out.println("✗ Nenhuma banda encontrada desse tipo.");
        } else {
            System.out.println("✓ Bandas encontradas:");
            resultado.forEach(b -> System.out.println("  - " + Exercicio05.formatarBanda(b)));
        }
    }
    
    private static void ordenarBandasInterativo(Scanner scanner) {
        System.out.println("Ordenar por:");
        System.out.println("1. Número de integrantes");
        System.out.println("2. Nome");
        System.out.println("3. Ranking");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1: ordenarBandas("integrantes"); break;
            case 2: ordenarBandas("nome"); break;
            case 3: ordenarBandas("ranking"); break;
            default: System.out.println("Opção inválida!"); return;
        }
        
        System.out.println("✓ Bandas ordenadas com sucesso!");
    }
    
    private static void exibirEstatisticas() {
        Banda[] cadastradas = obterBandasCadastradas();
        if (cadastradas.length == 0) {
            System.out.println("Nenhuma banda cadastrada.");
            return;
        }
        
        System.out.println("\n=== ESTATÍSTICAS ===");
        System.out.printf("Média de integrantes: %.2f\n", 
                         Exercicio08.calcularMediaIntegrantes(cadastradas));
        System.out.printf("Total de integrantes: %d\n", 
                         Exercicio08.calcularTotalIntegrantes(cadastradas));
    }
    
    private static void exibirExtremal() {
        Banda maior = obterMaiorBanda();
        Banda menor = obterMenorBanda();
        
        if (maior != null) {
            System.out.println("Maior banda: " + Exercicio05.formatarBanda(maior));
        }
        if (menor != null) {
            System.out.println("Menor banda: " + Exercicio05.formatarBanda(menor));
        }
    }
    
    private static void removerBandaInterativo(Scanner scanner) {
        System.out.print("Nome da banda a remover: ");
        String nome = scanner.nextLine();
        
        if (removerBanda(nome)) {
            System.out.println("✓ Banda removida com sucesso!");
        } else {
            System.out.println("✗ Banda não encontrada.");
        }
    }
    
    private static void exportarDados() {
        String csv = exportarParaCSV();
        System.out.println("\n=== DADOS EM CSV ===");
        System.out.println(csv);
    }
}

