package org.example;

public class Arqueiro extends Personagem {
    private int precisao;
    private int alcance;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
        this.alcance = alcance;
    }

    public void atirarFlecha(Personagem inimigo) {
        int dano = Math.max(0, this.getATK() + precisao - inimigo.getDEF());
        inimigo.receberDano(dano);
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public void exibirStatus() {
    }
}
