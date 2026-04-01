package TemperaturaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {

    @Test
    public void testeConversaoCorreta() {
        double resultado = Temperatura.celsiusParaFahrenheit(0);
        assertEquals(32, resultado);
    }

    // Teste propositalmente errado (vai falhar)
    @Test
    public void testeFalhaProposital() {
        double resultado = Temperatura.celsiusParaFahrenheit(10);
        assertEquals(100, resultado); // valor errado de propósito
    }
}