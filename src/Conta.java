public abstract class Conta implements IConta {

    // Por padrão, atributos são sempre private
    private String agencia;
    private String numero;
    private double saldo;

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    // Não faz sentido criar métodos setters para nossos atributos, então teremos apenas os getters.
    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
