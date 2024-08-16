package br.senac.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculaoraServiceTest {

    @InjectMocks
    private CalculadoraService calculadoraService;

    @Test
    void testRecuperaSinalOperacaoSomar() {
        String sinalRetornado = calculadoraService.recuperaSinalOperacao("somar");
        Assertions.assertEquals("+", sinalRetornado);
    }

    @Test
    void testRecuperaSinalOperacaoSubtrair() {
        String sinalRetornado = calculadoraService.recuperaSinalOperacao("subtrair");
        Assertions.assertEquals("-", sinalRetornado);
    }

    @Test
    void testRecuperaSinalOperacaoMultiplicar() {
        String sinalRetornado = calculadoraService.recuperaSinalOperacao("multiplicar");
        Assertions.assertEquals("*", sinalRetornado);
    }

    @Test
    void testRecuperaSinalOperacaoDividir() {
        String sinalRetornado = calculadoraService.recuperaSinalOperacao("dividir");
        Assertions.assertEquals("/", sinalRetornado);
    }

    @Test
    void testLancarErroRecuperaSinalOperacao() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class,
                () -> calculadoraService.recuperaSinalOperacao("mega-soma"));
        Assertions.assertEquals("OPERACAO INVALIDA", exception.getMessage());
    }
}
