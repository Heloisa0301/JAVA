package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonus;

    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        double percentual = getSalarioBase() * (bonus/100);
        return getSalarioBase() + percentual;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Salário com Bônus: " + calcularSalario());
    }

}
