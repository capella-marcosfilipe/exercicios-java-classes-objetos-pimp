package br.unicap;

/**
 * EXERCÍCIO 02: Buscar Banda por Posição no Ranking
 * 
 * OBJETIVO:
 * Você deve encontrar e retornar a banda que está em uma determinada 
 * posição do ranking.
 * 
 * INSTRUÇÕES:
 * 1. Complete o método buscarPorRanking() abaixo
 * 2. Percorra o array de bandas
 * 3. Encontre a banda cuja posicaoRanking é igual à posição buscada
 * 4. Retorne essa banda
 * 5. Se não encontrar, retorne null
 * 
 * EXEMPLO:
 * Input: bandas = [Queen(ranking=1), ABBA(ranking=2)], posicao = 1
 * Output: Banda Queen
 */
public class Exercicio02 {
    
    /**
     * Busca uma banda pela sua posição no ranking
     * 
     * @param bandas Array de bandas
     * @param posicao Posição no ranking desejada (1 a 5)
     * @return A banda encontrada ou null se não existir
     */
    public static Banda buscarPorRanking(Banda[] bandas, int posicao) {
        // TODO: Implemente sua solução aqui
        // Dica: Use um loop e compare banda.posicaoRanking com posicao
        for (int i = 0; i < bandas.length; i++) {
            if (bandas[i].posicaoRanking == posicao) {
                return bandas[i];
            }
        }
        return null;
    } 
    
    /**
     * Verifica se existe uma banda em determinada posição do ranking
     * 
     * @param bandas Array de bandas
     * @param posicao Posição a verificar
     * @return true se existe, false caso contrário
     */
    public static boolean existeRanking(Banda[] bandas, int posicao) {
        // TODO: Implemente sua solução aqui
        for (int i = 0; i < bandas.length; i++) {
            if (bandas[i].posicaoRanking == posicao) {
                return true;
            }
        }
        return false;
    }
}

