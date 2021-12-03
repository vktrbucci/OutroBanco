public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    // Por padrão, atributos são sempre private
    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
            }
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void infoExtrato() {
        System.out.println(String.format("Agência: %d", getAgencia()));
        System.out.println(String.format("Número: %d", getNumero()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }

    // Não faz sentido criar métodos setters para nossos atributos, então teremos apenas os getters.
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
