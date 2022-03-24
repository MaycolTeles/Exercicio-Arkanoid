package com.inatel.java.poo.Jogador;

import com.inatel.java.poo.Bloco.Bloco;

public class Jogador {

    // DECLARANDO OS ATRIBUTOS
    private int pontuacao = 0;


    // DEFININDO OS MÉTODOS
    // Método para aumentar a pontuação do jogador
    public void destruirBloco(Bloco bloco) {
        bloco.destruirBloco();
        this.pontuacao++;
    }

    // Método para retornar a pontuação do jogador
    public int getPontuacao() {
        return this.pontuacao;
    }
    
}
