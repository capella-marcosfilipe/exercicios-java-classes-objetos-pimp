package br.unicap;

import java.util.ArrayList;

/**
 * EXERCÍCIO 03: Buscar Bandas por Tipo de Música
 * 
 * OBJETIVO:
 * Você deve encontrar todas as bandas que tocam um determinado tipo de música.
 * 
 * INSTRUÇÕES:
 * 1. Complete o método buscarPorTipo() abaixo
 * 2. Percorra o array de bandas
 * 3. Compare o tipo de música (use equalsIgnoreCase para ignorar maiúsculas/minúsculas)
 * 4. Adicione as bandas encontradas em um ArrayList
 * 5. Retorne o ArrayList com os resultados
 * 
 * EXEMPLO:
 * Input: bandas = [Queen(Rock), ABBA(Pop), Nirvana(Rock)], tipo = "Rock"
 * Output: ArrayList com [Queen, Nirvana]
 */
public class Exercicio03 {
    
    /**
     * Busca todas as bandas que tocam um determinado tipo de música
     * 
     * @param bandas Array de bandas
     * @param tipo Tipo de música a buscar
     * @return ArrayList com as bandas encontradas (pode estar vazio)
     */
    public static ArrayList<Banda> buscarPorTipo(Banda[] bandas, String tipo) {
        // TODO: Implemente sua solução aqui
        // Dica: Crie um ArrayList<Banda>, percorra o array e adicione as bandas que correspondem
        
        return null; // Substitua esta linha
    }
    
    /**
     * Conta quantas bandas tocam um determinado tipo de música
     * 
     * @param bandas Array de bandas
     * @param tipo Tipo de música
     * @return Quantidade de bandas desse tipo
     */
    public static int contarPorTipo(Banda[] bandas, String tipo) {
        // TODO: Implemente sua solução aqui
        
        return 0; // Substitua esta linha
    }
    
    /**
     * Retorna um array com todos os tipos de música únicos (sem repetição)
     * 
     * @param bandas Array de bandas
     * @return ArrayList com tipos únicos
     */
    public static ArrayList<String> listarTiposUnicos(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Antes de adicionar, verifique se o tipo já está na lista
        
        return null; // Substitua esta linha
    }
}
