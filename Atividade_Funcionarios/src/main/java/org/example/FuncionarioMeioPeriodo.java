package org.example;

public class FuncionarioMeioPeriodo extends Funcionario{
    private int horas;
    private double valor;

    public FuncionarioMeioPeriodo(String nome, String cpf, int horas, double valor) {
        super(nome, cpf, 0);
        this.horas = horas;
        this.valor = valor;
    }

    public int getHoras() {
        return horas;
    }

    public double getValor() {
        return valor;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularSalario() {
        return horas * valor;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Horas Trabalhadas: " + horas);
        System.out.println("Valor por Hora: " + valor);
        System.out.println("Salário Calculado: " + calcularSalario());
    }
}
