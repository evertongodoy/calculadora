package br.senac.calculadora;

public class CalculadoraService {

    String recuperaSinalOperacao(String operacao){

        if(operacao.equalsIgnoreCase("SOMAR")){
            return "+";
        } else if(operacao.equalsIgnoreCase("SUBTRAIR")){
            return "-";
        } else if(operacao.equalsIgnoreCase("DIVIDIR")){
            return "/";
        } else if(operacao.equalsIgnoreCase("MULTIPLICAR")){
            return "*";
        } else {
            throw new RuntimeException("OPERACAO INVALIDA");
        }
    }
}
