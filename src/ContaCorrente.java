public class ContaCorrente extends Conta {
    Cliente cliente = new Cliente();

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        
    }

    @Override
    public void imprimirExtrato() {
       
        imprimirInfosComuns(); // Chama o método específico da subclasse
    }

    @Override
    public void depositar(int valor) {
        this.saldo += valor;
    }

    @Override
    protected void imprimirInfosComuns() {
         System.out.println("Extrato da conta:");
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }

}
