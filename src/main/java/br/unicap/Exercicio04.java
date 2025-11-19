package br.unicap;

/**
 * EXERCÍCIO 04: Validar se Banda Existe
 * 
 * OBJETIVO:
 * Você deve verificar se uma banda com determinado nome existe no array.
 * 
 * INSTRUÇÕES:
 * 1. Complete o método bandaExiste() abaixo
 * 2. Percorra o array de bandas
 * 3. Compare os nomes (use equalsIgnoreCase para ignorar maiúsculas/minúsculas)
 * 4. Retorne true se encontrar, false se não encontrar
 * 
 * EXEMPLO:
 * Input: bandas = [Queen, ABBA, Nirvana], nomeBusca = "Queen"
 * Output: true
 */
public class Exercicio04 {
    
    /**
     * Verifica se existe uma banda com o nome especificado
     * 
     * @param bandas Array de bandas
     * @param nomeBusca Nome da banda a buscar
     * @return true se existe, false caso contrário
     */
    public static boolean bandaExiste(Banda[] bandas, String nomeBusca) {
        // TODO: Implemente sua solução aqui
        // Dica: Use equalsIgnoreCase para comparar strings
        
        return false; // Substitua esta linha
    }
    
    /**
     * Retorna a posição (índice) da banda no array, ou -1 se não existir
     * 
     * @param bandas Array de bandas
     * @param nomeBusca Nome da banda
     * @return Índice da banda ou -1 se não encontrada
     */
    public static int encontrarIndiceBanda(Banda[] bandas, String nomeBusca) {
        // TODO: Implemente sua solução aqui
        
        return -1; // Substitua esta linha
    }
    
    /**
     * Verifica se existe uma banda com determinado número exato de integrantes
     * 
     * @param bandas Array de bandas
     * @param numeroIntegrantes Número de integrantes a buscar
     * @return true se existe pelo menos uma banda com esse número
     */
    public static boolean existeBandaComIntegrantes(Banda[] bandas, int numeroIntegrantes) {
        // TODO: Implemente sua solução aqui
        
        return false; // Substitua esta linha
    }
    
    /**
     * Verifica se todas as posições do ranking de 1 a 5 estão preenchidas
     * 
     * @param bandas Array de bandas
     * @return true se todas as 5 posições existem
     */
    public static boolean rankingCompleto(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Verifique se existe banda com posição 1, 2, 3, 4 e 5
        
        return false; // Substitua esta linha
    }
}
