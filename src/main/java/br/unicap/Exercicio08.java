package br.unicap;

/**
 * EXERCÍCIO 08: Calculando Estatísticas
 * 
 * OBJETIVO:
 * Implementar cálculos estatísticos sobre arrays de objetos.
 * 
 * INSTRUÇÕES:
 * Você deve calcular média, soma, mediana e outras estatísticas
 * baseadas nos atributos dos objetos.
 */
public class Exercicio08 {
    
    /**
     * Calcula a MÉDIA do número de integrantes de todas as bandas
     * 
     * @param bandas Array de bandas
     * @return Média de integrantes (double)
     */
    public static double calcularMediaIntegrantes(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Soma todos os integrantes e divide pelo número de bandas
        
        return 0.0; // Substitua esta linha
    }
    
    /**
     * Calcula o TOTAL de integrantes somando todas as bandas
     * 
     * @param bandas Array de bandas
     * @return Soma total de integrantes
     */
    public static int calcularTotalIntegrantes(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Encontra a banda cujo número de integrantes está MAIS PRÓXIMO da média
     * 
     * @param bandas Array de bandas
     * @return Banda mais próxima da média
     */
    public static Banda encontrarBandaMaisProximaDaMedia(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica 1: Calcule a média primeiro
        // Dica 2: Para cada banda, calcule a distância absoluta da média
        // Dica 3: Retorne a banda com menor distância
        
        return null; // Substitua esta linha
    }
    
    /**
     * Conta quantas bandas têm número de integrantes ACIMA da média
     * 
     * @param bandas Array de bandas
     * @return Quantidade de bandas acima da média
     */
    public static int contarBandasAcimaDaMedia(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Conta quantas bandas têm número de integrantes ABAIXO da média
     * 
     * @param bandas Array de bandas
     * @return Quantidade de bandas abaixo da média
     */
    public static int contarBandasAbaixoDaMedia(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Calcula a MEDIANA do número de integrantes
     * A mediana é o valor do meio quando os dados estão ordenados
     * 
     * @param bandas Array de bandas
     * @return Mediana do número de integrantes
     */
    public static double calcularMedianaIntegrantes(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica 1: Extraia os números de integrantes para um array separado
        // Dica 2: Ordene esse array (pode usar Arrays.sort())
        // Dica 3: Se tamanho é ímpar, retorne o elemento do meio
        // Dica 4: Se tamanho é par, retorne a média dos dois elementos centrais
        
        return 0.0; // Substitua esta linha
    }
    
    /**
     * Retorna um relatório estatístico completo em formato String
     * 
     * @param bandas Array de bandas
     * @return String formatada com todas as estatísticas
     */
    public static String gerarRelatorioEstatistico(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Exemplo de formato:
        // === RELATÓRIO ESTATÍSTICO ===
        // Total de bandas: 5
        // Total de integrantes: 22
        // Média de integrantes: 4.4
        // Mediana: 4.0
        // Mínimo: 3 (Nirvana)
        // Máximo: 6 (Metallica)
        // Acima da média: 2 bandas
        // Abaixo da média: 1 banda
        
        return ""; // Substitua esta linha
    }
    
    /**
     * Calcula o DESVIO PADRÃO do número de integrantes
     * (Exercício desafio - conceito estatístico mais avançado)
     * 
     * @param bandas Array de bandas
     * @return Desvio padrão
     */
    public static double calcularDesvioPadrao(Banda[] bandas) {
        // TODO: Implemente sua solução aqui (DESAFIO!)
        // Fórmula: √(Σ(xi - média)² / n)
        
        return 0.0; // Substitua esta linha
    }
}

