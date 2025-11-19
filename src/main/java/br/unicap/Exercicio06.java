package br.unicap;

/**
 * EXERCÍCIO 06: Busca Sequencial Otimizada
 * 
 * OBJETIVO:
 * Implementar o algoritmo de busca sequencial (linear search) e suas variações.
 * 
 * INSTRUÇÕES:
 * A busca sequencial percorre o array elemento por elemento até encontrar
 * o valor procurado ou chegar ao final do array.
 * 
 * Complexidade: O(n) - onde n é o tamanho do array
 */
public class Exercicio06 {
    
    /**
     * Busca sequencial que retorna o ÍNDICE da primeira banda com o nome especificado
     * 
     * @param bandas Array de bandas
     * @param nomeBanda Nome da banda a buscar
     * @return Índice da banda encontrada ou -1 se não existir
     */
    public static int buscaSequencial(Banda[] bandas, String nomeBanda) {
        // TODO: Implemente sua solução aqui
        // Dica: Percorra o array e retorne o índice quando encontrar
        
        return -1; // Substitua esta linha
    }
    
    /**
     * Busca sequencial que retorna a BANDA encontrada
     * 
     * @param bandas Array de bandas
     * @param nomeBanda Nome da banda a buscar
     * @return Objeto Banda encontrado ou null se não existir
     */
    public static Banda buscaSequencialRetornaBanda(Banda[] bandas, String nomeBanda) {
        // TODO: Implemente sua solução aqui
        
        return null; // Substitua esta linha
    }
    
    /**
     * Busca sequencial com CONTADOR de comparações
     * Este método conta quantas comparações foram necessárias para encontrar a banda
     * 
     * @param bandas Array de bandas
     * @param nomeBanda Nome da banda a buscar
     * @return Array de int com [índice, número_de_comparações]
     *         Se não encontrar: [-1, número_de_comparações]
     */
    public static int[] buscaSequencialComContador(Banda[] bandas, String nomeBanda) {
        // TODO: Implemente sua solução aqui
        // Dica: Use um contador que incrementa a cada comparação
        // Retorne um array: [índice_encontrado, total_de_comparações]
        
        return new int[]{-1, 0}; // Substitua esta linha
    }
    
    /**
     * Busca todas as ocorrências de bandas com determinado número de integrantes
     * 
     * @param bandas Array de bandas
     * @param numeroIntegrantes Número de integrantes a buscar
     * @return Array com os índices das bandas encontradas
     */
    public static int[] buscaTodasOcorrencias(Banda[] bandas, int numeroIntegrantes) {
        // TODO: Implemente sua solução aqui
        // Dica 1: Primeiro conte quantas bandas têm esse número de integrantes
        // Dica 2: Depois crie um array com esse tamanho e preencha com os índices
        
        return new int[0]; // Substitua esta linha
    }
    
    /**
     * Busca sequencial que para na primeira ocorrência (otimizada)
     * Retorna assim que encontrar, sem percorrer o resto do array
     * 
     * @param bandas Array de bandas
     * @param tipoMusica Tipo de música a buscar
     * @return true se encontrou, false caso contrário
     */
    public static boolean existeTipoMusica(Banda[] bandas, String tipoMusica) {
        // TODO: Implemente sua solução aqui
        // Dica: Use 'return true' assim que encontrar (early return)
        
        return false; // Substitua esta linha
    }
}
