package br.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
    private Conta cc;

    @BeforeEach
    public void setup(){
        cc = new ContaCorrente(123, 500); 
    }

    @Test
    public void deveDevolverOSaldoMenosOSaque(){
            cc.saca(100);
            assertEquals(400, cc.getSaldo());
    }

    @Test
    public void deveDevolverOSaldoMaisOValorDoDeposito(){
            cc.deposita(100);
            assertEquals(600, cc.getSaldo());
    }
}
