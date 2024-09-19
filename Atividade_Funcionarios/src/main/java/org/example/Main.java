package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("1. Tempo Integral\n2. Meio Período\n3. Estagiário\n0. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) break;

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Salário base: ");
                    double salarioBase = scanner.nextDouble();
                    System.out.print("Bônus (%): ");
                    double bonus = scanner.nextDouble();
                    funcionarios.add(new FuncionarioTempoIntegral(nome, cpf, salarioBase, bonus));
                }
                case 2 -> {
                    System.out.print("Horas trabalhadas: ");
                    int horas = scanner.nextInt();
                    System.out.print("Valor por hora: ");
                    double valorHora = scanner.nextDouble();
                    funcionarios.add(new FuncionarioMeioPeriodo(nome, cpf, horas, valorHora));
                }
                case 3 -> {
                    System.out.print("Instituição de Ensino: ");
                    String instituicao = scanner.nextLine();
                    System.out.print("Bolsa: ");
                    double bolsa = scanner.nextDouble();
                    funcionarios.add(new Estagiario(nome, cpf, instituicao, bolsa));
                }
                default -> System.out.println("Opção inválida.");
            }
        }

        for (Funcionario f : funcionarios) {
            f.exibirInformacoes();
            System.out.println("Salário: " + f.calcularSalario());
        }

        scanner.close();
    }
}
