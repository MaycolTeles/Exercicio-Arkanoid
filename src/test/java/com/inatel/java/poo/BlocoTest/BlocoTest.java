package com.inatel.java.poo.BlocoTest;

import com.inatel.java.poo.Bloco.Bloco;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


public class BlocoTest{

    // DEFININDO OS MÉTODOS

    // Método para resetar as variáveis estáticas antes de CADA teste
    @Before
    public void reset(){
        Bloco.reset();
    }

    // Método para testar a função de resetar a quantidade de blocos em jogo
    @Test
    public void testReset(){
        assertEquals(0, Bloco.getQtdBlocos());
    }

    // Método para testar a destruição de blocos
    @Test
    public void testDestruirBloco() {
        Bloco bloco = new Bloco();
        assertEquals(1, Bloco.getQtdBlocos());
        bloco.destruirBloco();
    }

    // Método para testar a quantidade de blocos em jogo
    @Test
    public void testGetQtdBlocos() {
        new Bloco();
        assertEquals(1, Bloco.getQtdBlocos());
    }

    
}
