public interface IConta {

    // Faz sentido manter esse métodos como public, pois formam a interface com o usuário.
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
}
