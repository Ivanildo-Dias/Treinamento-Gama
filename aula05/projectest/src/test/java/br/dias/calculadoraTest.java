package br.dias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calculadoraTest {

    private calculadora c;

    @BeforeEach
    public void setup(){
        c = new calculadora();
    }

    @Test
    public void DeveRetornarASomaDosValores(){

        double resultado = c.somar(10, 20);
        assertEquals(30, resultado);
    }

    @Test
    public void deveRetornarASubtracaoDosNumeros(){

       double resultado = c.subtrair(20, 10);
       assertEquals(10, resultado);
    }

    @Test
    public void deveRetornarAMultiplicacaoDosNumeros(){

       double resultado = c.multiplicar(10, 10);
       assertEquals(100, resultado);
    }

    @Test
    public void deveRetornarADivisaoQuandoDenominadorDiferenteDeZero(){

       double resultado = c.dividir(10, 2);
       assertEquals(5, resultado);
    }

    /*
    @Test
    public void deveRetornarNegativoQuandoDenominadorZero(){

       double resultado = c.dividir(10, 0);
       assertEquals(-1, resultado);
    } 
    */

    
}