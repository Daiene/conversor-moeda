package br.com.alura.conversor.modelos;

import br.com.alura.conversor.calculos.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.11;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println(valorReal);
    }
}