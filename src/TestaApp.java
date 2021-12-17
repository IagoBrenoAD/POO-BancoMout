import java.time.LocalDate;

public class TestaApp {

    public static void main(String[] args) {
        //Início do contador de contas.
        System.out.println("Abrindo o banco Maut. Quantidade de contas: " + Conta.getQuantidadeDeContas());

        //Endereço 1.
        //Cliente 1.
        Cliente cliente1 = new Cliente("Iago", "0001234", LocalDate.of(2003, 5, 28), new Endereco("log1", 71, "World", "Nublar", "JW"));

        System.out.println("----------Dados de endereco----------");
        System.out.println("Seu logradouro é: " + cliente1.getEndereco().getLogradouro());
        System.out.println("Seu número é: " + cliente1.getEndereco().getNumero());
        System.out.println("Seu bairro e cidade são: " + cliente1.getEndereco().getBairro() + ", " + cliente1.getEndereco().getCidade());
        System.out.println("Seu uf é: " + cliente1.getEndereco().getUf());
        System.out.println("----------Fim de dados----------");

        //Conta 1 do cliente 1.
        Conta conta1 = new ContaPoupanca(123, 678, cliente1);
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
        Cliente cliente2 = new Cliente("Talita", "830289", LocalDate.of(1999, 12, 28), new Endereco("log2", 490, "Park", "Sorna", "JP"));

        //Conta 1 do cliente 2.
        Conta conta2 = new ContaCorrente(456, 90, cliente2);
        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getQuantidadeDeContas());


        conta2.depositar(2000);
        System.out.println("Saldo da conta (conta2): " + conta2.getSaldo());


        //Conta 2 do cliente 2.
        Conta conta3 = new ContaPoupanca(789, 40, cliente2);
        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getQuantidadeDeContas());

        System.out.println("-----------Início do teste de depositar e transferir----------");
        conta3.depositar(200);
        conta3.transferencia(100, conta1);
        System.out.println("Tranferencia concluida. Seu saldo (conta3) é de: " + conta3.getSaldo());
        System.out.println("Sua conta (cliente1) agora tem o saldo de: " + conta1.getSaldo());
        System.out.println("-----------Fim de teste----------");

        //Cliente 3.
        Cliente cliente3 = new Cliente("Márcia", "639482111", LocalDate.of(2004, 3, 17), new Endereco("log3", 833, "Junco", "Picos", "PI"));
        
        //Conta 1 do cliente 3.
        Conta conta4 = new ContaCorrente(5, 2, cliente3);
        //Conta 2 do cliente 3
        Conta conta5 = new ContaPoupanca(1, 4, cliente3);

        System.out.println("$$$$$$$$$$ Início de testes para conta corrente e poupança $$$$$$$$$$");
        conta4.depositar(100);
        conta5.depositar(100);

        conta4.sacar(50);
        conta5.sacar(50);

        conta4.sacar(150);
        conta5.sacar(150);

        System.out.println("Seu saldo (conta4) é de: " + conta4.getSaldo());
        System.out.println("Seu saldo (conta5) é de: " + conta5.getSaldo());
        System.out.println("$$$$$$$$$$ Fim de testes $$$$$$$$$$");
    }
}
        