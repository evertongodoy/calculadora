package br.senac.calculadora;

public class Calculadora {

    private final CalculadoraService calculadoraService;

    public Calculadora(final CalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    public Integer calcular(String operacao, Integer x, Integer y){
        String sinal = buscaOperacao(operacao);
        if(sinal.equals("+")){
            return x+y;
        } else if (sinal.equals("-")) {
            return x-y;
        } else if (sinal.equals("*")) {
            return x*y;
        } else {
            return x/y;
        }
    }

    private String buscaOperacao(String operacao){
        return calculadoraService.recuperaSinalOperacao(operacao);
    }

}
