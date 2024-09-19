package org.example;

public class Carro implements Transporte {
    private String marca;
    private int passageiros;
    @Override
    public void calcularTempoTrajeto(double distancia) {
        double tempo = distancia * 0.55;
        System.out.println("O tempo de carro = "+tempo);
    }
}
