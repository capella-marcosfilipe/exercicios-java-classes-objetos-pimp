package br.unicap;

/**
 * EXERCÍCIO 09: Ordenação com Selection Sort
 * 
 * OBJETIVO:
 * Implementar o algoritmo Selection Sort para ordenar arrays de objetos.
 * 
 * INSTRUÇÕES:
 * Selection Sort funciona da seguinte forma:
 * 1. Para cada posição i do array (do início ao penúltimo)
 * 2. Encontre o índice do menor elemento de i até o final
 * 3. Troque o elemento na posição i com o menor encontrado
 * 
 * Complexidade: O(n²) - melhor, médio e pior caso
 * Vantagem: Simples de implementar, faz poucas trocas
 */
public class Exercicio09 {
    
    /**
     * Ordena o array de bandas em ordem CRESCENTE por número de integrantes
     * usando Selection Sort
     * 
     * @param bandas Array de bandas a ordenar (modificado in-place)
     */
    public static void selectionSort(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica 1: Loop externo de i=0 até n-1
        // Dica 2: Para cada i, encontre o índice do menor elemento de i até n
        // Dica 3: Troque bandas[i] com bandas[indiceMinimo]
    }
    
    /**
     * Ordena o array de bandas em ordem DECRESCENTE por número de integrantes
     * 
     * @param bandas Array de bandas a ordenar
     */
    public static void selectionSortDecrescente(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Similar ao crescente, mas procure o MAIOR elemento
    }
    
    /**
     * Ordena o array de bandas por NOME (ordem alfabética) usando Selection Sort
     * 
     * @param bandas Array de bandas a ordenar
     */
    public static void selectionSortPorNome(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Use compareTo() para comparar strings
        // exemplo: if (bandas[j].nome.compareTo(bandas[indiceMinimo].nome) < 0)
    }
    
    /**
     * Ordena por posição no ranking usando Selection Sort
     * 
     * @param bandas Array de bandas a ordenar
     */
    public static void selectionSortPorRanking(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
    }
    
    /**
     * Selection Sort com CONTADOR de comparações e trocas
     * 
     * @param bandas Array de bandas a ordenar
     * @return Array com [número_de_comparações, número_de_trocas]
     */
    public static int[] selectionSortComContador(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Mantenha dois contadores: comparacoes e trocas
        
        return new int[]{0, 0}; // Substitua esta linha
    }
    
    /**
     * Verifica se o array está ordenado em ordem CRESCENTE por número de integrantes
     * 
     * @param bandas Array a verificar
     * @return true se está ordenado, false caso contrário
     */
    public static boolean estaOrdenado(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Percorra o array verificando se cada elemento é <= ao próximo
        
        return false; // Substitua esta linha
    }
    
    /**
     * Encontra a posição onde deveria estar uma banda com determinado
     * número de integrantes em um array JÁ ORDENADO
     * (Útil para inserção ordenada)
     * 
     * @param bandas Array ordenado de bandas
     * @param numeroIntegrantes Número a buscar
     * @return Índice onde deveria estar
     */
    public static int encontrarPosicaoOrdenada(Banda[] bandas, int numeroIntegrantes) {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Método auxiliar para trocar dois elementos do array
     * 
     * @param bandas Array de bandas
     * @param i Índice do primeiro elemento
     * @param j Índice do segundo elemento
     */
    private static void trocar(Banda[] bandas, int i, int j) {
        Banda temp = bandas[i];
        bandas[i] = bandas[j];
        bandas[j] = temp;
    }
}