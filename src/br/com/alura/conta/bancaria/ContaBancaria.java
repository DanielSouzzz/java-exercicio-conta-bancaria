package br.com.alura.conta.bancaria;

public class ContaBancaria {
    protected double saldo = 200;
    protected double valor;
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void depositar(){
        if (valor <= 0){
            System.out.println("Valor insuficiente!");
        } else {
            saldo += valor;
            System.out.println("Saldo atualizado: " + saldo);
        }
    }
    public void sacar(){
        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else{
            saldo -= valor;
            System.out.println("Saldo atualizado: " + saldo);
        }
    }
    public void consultarSaldo(){
        System.out.println("Seu saldo atual é: " + saldo);
    }
}

