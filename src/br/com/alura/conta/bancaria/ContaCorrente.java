package br.com.alura.conta.bancaria;
import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 10;
    int diaCobranca = 8;
    public void cobrarTarifaMensal(){
        // Obter data atual
        LocalDate dataAtual = LocalDate.now();
        // Obter o dia da cobrança
        LocalDate dia = dataAtual.withDayOfMonth(diaCobranca);

        if (dataAtual.equals(dia)){
            saldo -= tarifaMensal;
            System.out.println("Saldo atualizado: " + saldo);
    } else {
            System.out.println("Cobrança não efetuada");
        }
    }
}
