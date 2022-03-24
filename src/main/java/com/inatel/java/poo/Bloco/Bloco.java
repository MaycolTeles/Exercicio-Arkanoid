package com.inatel.java.poo.Bloco;

public class Bloco {

    // DECLARANDO OS ATRIBUTOS
    private static int qtdBlocos = 0;           // Quantidade de blocos em jogo

    // DEFININDO OS MÉTODOS
    // Construtor
    public Bloco() {
        qtdBlocos++;
    }

    // Método para retornar a quantidade de blocos em jogo
    public static int getQtdBlocos() {
        return qtdBlocos;
    }

    // Método para destruir um bloco, decrementando a quantidade de blocos em jogo
    public void destruirBloco() {
        qtdBlocos--;
    }


    
}
