package br.unicap;

/**
 * Classe que representa uma banda de música.
 * Esta classe será usada em todos os exercícios.
 */
public class Banda {
    public String nome;
    public String tipoMusica;
    public int numeroIntegrantes;
    public int posicaoRanking;
    
    /**
     * Construtor padrão (necessário para alguns testes)
     */
    public Banda() {
    }
    
    /**
     * Construtor com todos os parâmetros
     */
    public Banda(String nome, String tipoMusica, int numeroIntegrantes, int posicaoRanking) {
        this.nome = nome;
        this.tipoMusica = tipoMusica;
        this.numeroIntegrantes = numeroIntegrantes;
        this.posicaoRanking = posicaoRanking;
    }
    
    @Override
    public String toString() {
        return "Banda{" +
                "nome='" + nome + '\'' +
                ", tipoMusica='" + tipoMusica + '\'' +
                ", numeroIntegrantes=" + numeroIntegrantes +
                ", posicaoRanking=" + posicaoRanking +
                '}';
    }
}

