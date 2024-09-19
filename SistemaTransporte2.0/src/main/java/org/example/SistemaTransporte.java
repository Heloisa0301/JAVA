package org.example;

public class SistemaTransporte {
    public static void main(String[] args){
        Transporte bicicleta = new Bicicleta();
        Transporte carro = new Carro();

        bicicleta.calcularTempoTrajeto(100);
        carro.calcularTempoTrajeto(12);

        executar(bicicleta, 100);
        executar(carro, 12);
    }

    public static void executar(Transporte t, double distancia){
        t.calcularTempoTrajeto(distancia);
    }
}
