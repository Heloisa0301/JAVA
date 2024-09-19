package org.example;

public class Gaviao extends Animal implements Voador{
    private int garra;
    public Gaviao(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " esta voando");
    }
}
