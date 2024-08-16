package br.senac.calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new CalculadoraService());
        Integer result = calculadora.calcular("SOMAR", 40, 40);
        System.out.printf("RESULTADO = " + result);
    }

}