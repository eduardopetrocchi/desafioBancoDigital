/*
import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta novaConta = null;  // Mova a declaração para fora do bloco if
        Conta conta = new ContaCorrente(new Cliente());  
        Conta contaDestino = new ContaCorrente(new Cliente());  
        int numeroDaConta = conta.getNumero();
        
        


        System.out.println("SISTEMA DO BANCO");
        System.out.println("Digite a opção desejada PRIMEIRO MENU: ");
        System.out.println("OPÇÃO 1: ABRIR CONTA");
        System.out.println("OPÇÃO 2: DEPOSITAR");
        System.out.println("OPÇÃO 3: SACAR");
        System.out.println("OPÇÃO 4: TRANSFERIR");
        System.out.println("OPÇÃO 5: EXTRATO");
        
        int opcao = scanner.nextInt();
        System.out.println("Digite a opção desejada SEGUNDO MENU: " + opcao);

        if (opcao == 1) { //ABERTURA DE CONTA
            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.next();

            System.out.println("Digite opção desejada: \n OPÇÃO 1: CONTA CORRENTE \n OPÇÃO 2 CONTA POUPANÇA");
            int tipoConta = scanner.nextInt();

            if (tipoConta == 1) {
                novaConta = new ContaCorrente(cliente);
            } else if (tipoConta == 2) {
                novaConta = new ContaPoupanca(cliente);
            } else {
                System.out.println("Opção inválida");
            }

            System.out.println("Conta número: " + novaConta.getNumero() + "\n Agência: " + novaConta.getAgencia() + "\n Cliente:" + nomeCliente);
        } else if (opcao == 2) { // DEPOSITAR
            if (numeroDaConta >= 1){
                System.out.println("Digite valor do depósito: ");
                int valorD = scanner.nextInt();
                
                System.out.println("Digite número da conta: ");
                int numeroContaDestino = scanner.nextInt();
                contaDestino.setNumero(numeroContaDestino);

                conta.depositar(valorD);
                System.out.println("Saldo atual da conta destino: " + contaDestino.getSaldo());            }
        } 
        else if (opcao == 3) {//SACAR
            if (numeroDaConta >= 1){
                System.out.println("Digite valor do saque: ");
                int valorS = scanner.nextInt();
            

                conta.sacar(valorS);
                System.out.println("Saque conclído");
        }
        }
        else if(opcao == 4){//TRANSFERIR
            if (numeroDaConta >= 1){
            System.out.println("Digite o número da conta destino: ");
            int numeroContaDestino = scanner.nextInt();
            
            System.out.println("Digite valor do saque: ");
            int valorD = scanner.nextInt();

            conta.transferir(valorD, contaDestino);
            System.out.println("Transferência concluída para a conta: " + numeroContaDestino);    
        }
    }
    else{
            System.out.println("SELECIONE UMA OPÇÃO VÁLIDA");    

        }
        }

        }
    }
*/