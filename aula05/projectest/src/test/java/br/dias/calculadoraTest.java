package br.dias;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calculadoraTest {
    @Test
    public void DeveRetornarASomaDosValores(){
        
        calculadora c = new calculadora();

        double resultado = c.somar(10, 20);
        assertEquals("soma", 30, resultado, 0);
    }
}