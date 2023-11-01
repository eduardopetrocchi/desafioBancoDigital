public interface ContaInterface {
    void sacar(int valor);

    void depositar(int valor);

    void transferir(int valor, ContaInterface contaDestino);

    void imprimirExtrato();

    


}
