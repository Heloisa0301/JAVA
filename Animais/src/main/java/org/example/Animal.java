package org.example;

public class Animal {
    private String especie;
    private String nome;
    private String idade;

    public Animal(String especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void dormir() {
        System.out.println(nome + " esta dormindo");
    }

    public void comer(){
        System.out.println(nome + " esta comendo");
    }
}
