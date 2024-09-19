package org.example;

public class Pato extends Animal implements Terrestre,Aquaticos,Voador {
    public Pato(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public void nadar() {
        System.out.println(getNome()+" esta nadando");
    }

    @Override
    public void andar() {
        System.out.println(getNome()+" esta andando");
    }

    @Override
    public void voar() {
        System.out.println(getNome()+" esta voando");
    }
}
