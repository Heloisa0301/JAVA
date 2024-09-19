package org.example;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private float saldo;

    public ContaBancaria(String titular, int numeroConta, float saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito efetuado. Saldo atual R$" + saldo);
        } else {
            System.out.println("Valor de deposito incorreto.");
        }
    }

        public void sacar(float valor){
            if (valor > 0 && valor <= saldo){
                saldo -= valor;
                System.out.println("Saque realizado. Saldo atual = R$" + saldo);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }

}
