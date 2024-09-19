package org.example;

public class Personagem {
    private String nome;
    private int nivel;
    public int hp;
    private int atk;
    private int def;

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void atacar(Personagem inimigo) {
        int dano = Math.max(0, this.atk - inimigo.getDEF());
        inimigo.receberDano(dano);
    }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getHP() {
        return hp;
    }

    public int getATK() {
        return atk;
    }

    public int getDEF() {
        return def;
    }

    public void exibirStatus() {
        System.out.println(nome + " - HP: " + hp + ", ATK: " + atk + ", DEF: " + def);
    }
}
