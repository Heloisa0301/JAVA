package org.example;

public class Bicicleta implements Transporte {
    private int marchas;
    private int passageiros;

    @Override
    public void calcularTempoTrajeto(double distancia) {
        double tempo = distancia * 1.15;
        System.out.println("O tempo de bike = "+tempo);
    }
}
