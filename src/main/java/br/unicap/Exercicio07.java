package br.unicap;

/**
 * EXERCÍCIO 07: Encontrar Máximo e Mínimo
 * 
 * OBJETIVO:
 * Implementar algoritmos para encontrar valores máximos e mínimos em arrays de objetos.
 * 
 * INSTRUÇÕES:
 * Você deve percorrer o array e manter registro do maior/menor valor encontrado.
 * Para objetos, compare o atributo específico (ex: numeroIntegrantes).
 * 
 * Complexidade: O(n) - onde n é o tamanho do array
 */
public class Exercicio07 {
    
    /**
     * Encontra a banda com MAIOR número de integrantes
     * 
     * @param bandas Array de bandas
     * @return Banda com mais integrantes ou null se array vazio
     */
    public static Banda encontrarMaiorBanda(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Inicialize com a primeira banda, depois compare com as demais
        
        return null; // Substitua esta linha
    }
    
    /**
     * Encontra a banda com MENOR número de integrantes
     * 
     * @param bandas Array de bandas
     * @return Banda com menos integrantes ou null se array vazio
     */
    public static Banda encontrarMenorBanda(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        
        return null; // Substitua esta linha
    }
    
    /**
     * Encontra o MAIOR número de integrantes (retorna apenas o número)
     * 
     * @param bandas Array de bandas
     * @return Maior número de integrantes
     */
    public static int encontrarMaximoIntegrantes(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Encontra o MENOR número de integrantes (retorna apenas o número)
     * 
     * @param bandas Array de bandas
     * @return Menor número de integrantes
     */
    public static int encontrarMinimoIntegrantes(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Encontra máximo e mínimo em UMA ÚNICA passada pelo array (otimizado)
     * 
     * @param bandas Array de bandas
     * @return Array com [bandaMenor, bandaMaior]
     */
    public static Banda[] encontrarMinMax(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Mantenha duas variáveis (min e max) e atualize em um único loop
        
        return new Banda[2]; // Substitua esta linha
    }
    
    /**
     * Retorna TODAS as bandas que têm o número máximo de integrantes
     * (pode haver empate)
     * 
     * @param bandas Array de bandas
     * @return Array com todas as bandas que têm o máximo de integrantes
     */
    public static Banda[] encontrarTodasMaiores(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica 1: Primeiro encontre o máximo
        // Dica 2: Depois conte quantas bandas têm esse máximo
        // Dica 3: Por fim, crie o array e preencha
        
        return new Banda[0]; // Substitua esta linha
    }
}

