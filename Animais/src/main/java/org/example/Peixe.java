package org.example;

public class Peixe extends Animal implements Aquaticos {
    private String scama;
    public Peixe(String especie, String nome) {
        super(especie, nome);
    }

    public String getScama() {
        return scama;
    }

    public void setScama(String scama) {
        this.scama = scama;
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " esta nadando");
    }
}
