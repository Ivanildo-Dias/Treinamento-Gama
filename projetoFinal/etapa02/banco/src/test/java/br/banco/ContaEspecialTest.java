package br.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaEspecialTest {
    private Conta ce;

    @BeforeEach
    public void setup(){
        ce = new ContaEspecial(123, 500, 500); 
    }

    @Test
    public void deveDevolverOSaldoMenosOSaqueELimite(){
            ce.saca(1000);
            assertEquals(-500, ce.getSaldo());
    }

    @Test
    public void deveDevolverOSaldoMaisOValorDoDeposito(){
            ce.deposita(100);
            assertEquals(600, ce.getSaldo());
    }
}
