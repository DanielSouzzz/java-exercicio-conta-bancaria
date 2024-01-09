import br.com.alura.conta.bancaria.ContaBancaria;
import br.com.alura.conta.bancaria.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setValor(100);
        conta.consultarSaldo();

        ContaCorrente corrente = new ContaCorrente();
        corrente.cobrarTarifaMensal();

    }
}