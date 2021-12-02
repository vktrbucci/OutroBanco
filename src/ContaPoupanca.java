public class ContaPoupanca {

    // Por padrão, atributos são sempre private
    private String agencia;
    private String numero;
    private double saldo;

    // Faz sentido manter esse métodos como public, pois formam a interface com o usuário.
    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

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
