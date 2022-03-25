package com.inatel.java.poo.ConversorTest;

import com.inatel.java.poo.Conversor.Conversor;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversorTest {

    // DEFININDO OS MÉTODOS

    @Test
    public void testConvertePontuacaoParaMoedas(){
        assertEquals(200, Conversor.convertePontuacaoParaMoedas(2));

    }
    
}
