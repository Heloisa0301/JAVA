package org.example;

public class Guerreiro extends Personagem {
    private int forcaExtra;
    private int armadura;

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armadura) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forcaExtra;
        this.armadura = armadura;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = Math.max(0, (this.getATK() + forcaExtra) - inimigo.getDEF());
        inimigo.receberDano(dano);
    }

    @Override
    public void receberDano(int dano) {
        int danoReduzido = Math.max(0, dano - armadura);
        super.receberDano(danoReduzido);
    }

    public int getForcaExtra() {
        return forcaExtra;
    }

    public void setForcaExtra(int forcaExtra) {
        this.forcaExtra = forcaExtra;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public void exibirStatus() {
    }
}
