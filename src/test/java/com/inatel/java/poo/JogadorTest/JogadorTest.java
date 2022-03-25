package com.inatel.java.poo.JogadorTest;

import com.inatel.java.poo.Bloco.Bloco;
import com.inatel.java.poo.Jogador.Jogador;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class JogadorTest {

    // DEFININDO OS MÉTODOS

    // Método para testar a pontuação do jogador
    @Test
    public void testGetPontuacao(){
        Bloco bloco = new Bloco();
        Jogador jogador = new Jogador();
        jogador.destruirBloco(bloco);
        assertEquals(1, jogador.getPontuacao());

    }
    
}
