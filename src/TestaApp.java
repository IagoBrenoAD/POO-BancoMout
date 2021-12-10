import java.time.LocalDate;

public class TestaApp {

    public static void main(String[] args) {
        //Início do contador de contas.
        System.out.println("Abrindo o banco Maut. Quantidade de contas: " + Conta.getQuantidadeDeContas());

        //Cliente 1.
        Cliente cliente1 = new Cliente("Iago", "0001234", LocalDate.of(2003, 5, 28), "Rua da luz");

        //Conta 1 do cliente 1.
        Conta conta1 = new Conta(123, 678, cliente1);
        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getQuantidadeDeContas());

        System.out.println("----------Informações da conta do cliente1----------");
        System.out.println(conta1.getAgencia() + "-" + conta1.getNumero() + "-" + conta1.getCliente().getNome());
        System.out.println("Número da agencia: " + conta1.getAgencia());
        System.out.println("Data de nascimento(cliente1): " + cliente1.getDataNascimento());
        System.out.println("----------Fim de informações----------");

        System.out.println("----------Testes de métodos 'depositar' e 'sacar' (conta1)----------");
        conta1.depositar(299);
        System.out.println("Sua conta (conta1) agora tem o saldo de: " + conta1.getSaldo());
        conta1.sacar(99);
        System.out.println("Sua conta (conta1) agora tem o saldo de: " + conta1.getSaldo());
        System.out.println("----------Fim de testes----------");
        


        //Cliente 2.
        Cliente cliente2 = new Cliente("Talita", "830289", LocalDate.of(1999, 12, 28), "Rua do rio");

        //Conta 1 do cliente 2.
        Conta conta2 = new Conta(456, 90, cliente2);
        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getQuantidadeDeContas());


        conta2.depositar(2000);
        System.out.println("Saldo da conta (conta2): " + conta2.getSaldo());


        //Conta 2 do cliente 2.
        Conta conta3 = new Conta(789, 40, cliente2);
        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getQuantidadeDeContas());

        System.out.println("-----------Início do teste de depositar e transferir----------");
        conta3.depositar(200);
        conta3.transferencia(100, conta1);
        System.out.println("Tranferencia concluida. Seu saldo (conta3) é de: " + conta3.getSaldo());
        System.out.println("Sua conta (cliente1) agora tem o saldo de: " + conta1.getSaldo());
        System.out.println("-----------Fim de teste----------");
    }
}
        