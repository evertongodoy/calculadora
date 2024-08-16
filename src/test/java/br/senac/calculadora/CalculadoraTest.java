package br.senac.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculadoraTest {

    @Mock
    private CalculadoraService mockCalculadoraService;
    @InjectMocks
    private Calculadora calculadora;

    @BeforeEach
    void init(){
//        MockitoAnnotations.openMocks(this);
        calculadora = new Calculadora(mockCalculadoraService);
    }


    @Test
    void calcularTestQuandoSomar(){

        when(mockCalculadoraService.recuperaSinalOperacao("SOMAR")).thenReturn("+");

        Integer resultado = calculadora.calcular("SOMAR", 10, 10);
        Assertions.assertEquals(20, resultado, "O resultado de 10 + 10 nao foi igual a 20");
    }

    @Test
    void calcularTestQuandoMultiplicar(){

        when(mockCalculadoraService.recuperaSinalOperacao("MULTIPLICAR")).thenReturn("*");

        Integer resultado = calculadora.calcular("MULTIPLICAR", 10, 10);
        Assertions.assertEquals(100, resultado, "O resultado de 10 + 10 nao foi igual a 20");
    }

    @Test
    void calcularTestQuandoSubtrair(){

        when(mockCalculadoraService.recuperaSinalOperacao("SUBTRAIR")).thenReturn("-");

        Integer resultado = calculadora.calcular("SUBTRAIR", 10, 10);
        Assertions.assertEquals(0, resultado, "O resultado de 10 + 10 nao foi igual a 20");
    }

    @Test
    void calcularTestQuandoDividir(){

        when(mockCalculadoraService.recuperaSinalOperacao("DIVIDIR")).thenReturn("/");

        Integer resultado = calculadora.calcular("DIVIDIR", 10, 10);
        Assertions.assertEquals(1, resultado, "O resultado de 10 + 10 nao foi igual a 20");
    }
}
