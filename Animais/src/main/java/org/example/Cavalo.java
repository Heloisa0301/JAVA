package org.example;

public class Cavalo extends Animal implements Terrestre{
    private String crina;
    public Cavalo(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public void andar() {
        System.out.println(getNome() + " esta andando");
    }
}
