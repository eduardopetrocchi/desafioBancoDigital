/*/public class App {
    public static void main(String[] args) throws Exception {
        Cliente eduardo = new Cliente();
        eduardo.setNome("Eduardo");

        Conta contaCorrente = new ContaCorrente(eduardo);
        Conta contaPoupanca = new ContaPoupanca(eduardo);

        contaCorrente.depositar(123);
        contaPoupanca.sacar(321);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        
    }
}
*/