public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta poupança");
        super.imprimirInfosComuns();
    }

    @Override
    public void depositar(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

}
