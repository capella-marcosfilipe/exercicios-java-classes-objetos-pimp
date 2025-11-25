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
        ArrayList<Banda> bandasBuscadas = new ArrayList<Banda>();

        for (int i = 0; i < bandas.length; i++) {
            if (bandas[i].tipoMusica.equalsIgnoreCase(tipo)) {
                bandasBuscadas.add(bandas[i]);
            }
        }
        return bandasBuscadas; // Substitua esta linha
    }

    public static Banda[] buscaPorTipoArray(Banda[] bandas, String tipo) {
        Banda[] bandasBuscadas = new Banda[bandas.length];

        int insertionIndex = 0;

        for (int i = 0; i < bandas.length; i++) {
            if (bandas[i].tipoMusica.equalsIgnoreCase(tipo)) {
                bandasBuscadas[insertionIndex] = bandas[i];
                insertionIndex++;
            }
        }

        Banda[] rightSizedBands = new Banda[insertionIndex];

        insertionIndex = 0;
        for (int i = 0; i < bandasBuscadas.length; i++) {
            if (bandasBuscadas[i] != null) {
                rightSizedBands[insertionIndex] = bandasBuscadas[i];
                insertionIndex++;
            }
        }

        return rightSizedBands;
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
        int count = 0;
        for (int i = 0; i < bandas.length; i++) {
            if (bandas[i].tipoMusica.equalsIgnoreCase(tipo)) {
                count++;
            }
        }

        return count; // Substitua esta linha
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
