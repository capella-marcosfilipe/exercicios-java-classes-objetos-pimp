package br.unicap;

import java.util.Scanner;

/**
 * EXERCÍCIO 05: Sistema Completo com Menu
 * 
 * OBJETIVO:
 * Criar um sistema interativo que integre todas as funcionalidades anteriores.
 * 
 * INSTRUÇÕES:
 * Este exercício integra todos os anteriores. Implemente cada método separadamente.
 * O menu principal já está implementado como referência.
 * 
 * FUNCIONALIDADES:
 * 1. Cadastrar bandas
 * 2. Exibir todas as bandas
 * 3. Buscar banda por ranking
 * 4. Buscar bandas por tipo
 * 5. Verificar se banda existe
 * 6. Sair
 */
public class Exercicio05 {
    
    private static final int TOTAL_BANDAS = 5;
    
    /**
     * Cadastra todas as bandas solicitando dados ao usuário
     * 
     * @param scanner Scanner para ler entrada do usuário
     * @return Array de bandas preenchido
     */
    public static Banda[] cadastrarBandas(Scanner scanner) {
        // TODO: Implemente sua solução aqui
        // Dica: Crie um array de 5 bandas e peça os dados de cada uma
        
        return null; // Substitua esta linha
    }
    
    /**
     * Exibe todas as bandas formatadas
     * 
     * @param bandas Array de bandas
     * @return String com todas as bandas formatadas
     */
    public static String exibirTodasBandas(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Formato sugerido: "Posição X: [Nome] - [Tipo] - [Integrantes] integrantes"
        
        return null; // Substitua esta linha
    }
    
    /**
     * Formata uma banda para exibição
     * 
     * @param banda Banda a formatar
     * @return String formatada com dados da banda
     */
    public static String formatarBanda(Banda banda) {
        // TODO: Implemente sua solução aqui
        // Exemplo: "Queen - Rock - 4 integrantes - Posição: 1"
        
        return null; // Substitua esta linha
    }
    
    /**
     * Valida se o ranking está entre 1 e 5
     * 
     * @param ranking Posição a validar
     * @return true se válido, false caso contrário
     */
    public static boolean validarRanking(int ranking) {
        // TODO: Implemente sua solução aqui
        
        return false; // Substitua esta linha
    }
    
    /**
     * Valida se o número de integrantes é positivo
     * 
     * @param numeroIntegrantes Número a validar
     * @return true se válido, false caso contrário
     */
    public static boolean validarIntegrantes(int numeroIntegrantes) {
        // TODO: Implemente sua solução aqui
        
        return false; // Substitua esta linha
    }
    
    /**
     * Método principal com menu interativo (IMPLEMENTADO COMO EXEMPLO)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banda[] bandas = null;
        int opcao;
        
        do {
            System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE BANDAS =====");
            System.out.println("1. Cadastrar bandas");
            System.out.println("2. Exibir todas as bandas");
            System.out.println("3. Buscar banda por ranking");
            System.out.println("4. Buscar bandas por tipo");
            System.out.println("5. Verificar se banda existe");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    bandas = cadastrarBandas(scanner);
                    System.out.println("Bandas cadastradas com sucesso!");
                    break;
                    
                case 2:
                    if (bandas != null) {
                        System.out.println(exibirTodasBandas(bandas));
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;
                    
                case 3:
                    if (bandas != null) {
                        System.out.print("Digite a posição do ranking (1-5): ");
                        int pos = scanner.nextInt();
                        Banda encontrada = Exercicio02.buscarPorRanking(bandas, pos);
                        if (encontrada != null) {
                            System.out.println(formatarBanda(encontrada));
                        } else {
                            System.out.println("Banda não encontrada nessa posição.");
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;
                    
                case 4:
                    if (bandas != null) {
                        System.out.print("Digite o tipo de música: ");
                        String tipo = scanner.nextLine();
                        var resultado = Exercicio03.buscarPorTipo(bandas, tipo);
                        if (resultado.isEmpty()) {
                            System.out.println("Nenhuma banda encontrada desse tipo.");
                        } else {
                            resultado.forEach(b -> System.out.println(formatarBanda(b)));
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;
                    
                case 5:
                    if (bandas != null) {
                        System.out.print("Digite o nome da banda: ");
                        String nome = scanner.nextLine();
                        if (Exercicio04.bandaExiste(bandas, nome)) {
                            System.out.println("A banda '" + nome + "' está no seu ranking!");
                        } else {
                            System.out.println("A banda '" + nome + "' não está no seu ranking.");
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;
                    
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 6);
        
        scanner.close();
    }
}
