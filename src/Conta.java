public abstract class Conta implements ContaInterface {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    
    protected int saldo;
    public Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(int valor) {
        // Implementação do saque
    }

    @Override
    public void transferir(int valor, ContaInterface contaDestino) {
        // Implementação da transferência
    }

    protected abstract void imprimirInfosComuns();
}

