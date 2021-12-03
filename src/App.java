public class App {

    public static void main(String[] args) {

        System.out.println("Só mais outro banco...");

        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(500);

        Conta contaCorrente = new ContaCorrente();

        contaPoupanca.transferir(650, contaCorrente);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
