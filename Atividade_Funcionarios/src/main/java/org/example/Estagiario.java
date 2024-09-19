package org.example;

public class Estagiario extends Funcionario{
    private String InstituicaoEnsino;
    private double bolsa;

    public Estagiario(String nome, String cpf, String InstituicaoEnsino, double bolsa) {
        super(nome, cpf, 0);
        this.InstituicaoEnsino = InstituicaoEnsino;
        this.bolsa = bolsa;
    }

    public String getInstituicaoEnsino() {
        return InstituicaoEnsino;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setInstituicao(String InstituicaoEnsino) {
        this.InstituicaoEnsino = InstituicaoEnsino;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public double calcularSalario() {
        return bolsa;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Bolsa Auxilio: "+getBolsa());
        System.out.println("Instituição de Ensino: "+getInstituicaoEnsino());
    }

}
