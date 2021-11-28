public class TestaApp {

    public static void main(String[] args) {
        //Início do contador de contas.
        System.out.println("Abrindo o banco Maut. Quantidade de contas: " + Conta.getquantidadeDeContas());

        //Cliente 1.
        Cliente cliente1 = new Cliente("Iago", "0001234", "Rua da luz");

        //Conta 1 do cliente 1.
        Conta conta1 = new Conta(123, 678, cliente1);


        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getquantidadeDeContas());
        System.out.println(conta1.getagencia() + "-" + conta1.getnumero() + "-" + conta1.getcliente().getnome());
        System.out.println("Número da agencia: " + conta1.getagencia());

        conta1.depositar(299);
        System.out.println("Sua conta agora tem o saldo de: " + conta1.getsaldo());
        conta1.sacar(99);
        System.out.println("Sua conta agora tem o saldo de: " + conta1.getsaldo());


        //Cliente 2.
        Cliente cliente2 = new Cliente("Talita", "830289", "Rua do rio");

        //Conta 1 do cliente 2.
        Conta conta2 = new Conta(456, 90, cliente2);


        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getquantidadeDeContas());

        conta2.depositar(2000);
        System.out.println("Saldo da conta: " + conta2.getsaldo());


        //Conta 2 do cliente 2.
        Conta conta3 = new Conta(789, 40, cliente2);


        System.out.println("Quantidade de contas do Banco Maut: " + Conta.getquantidadeDeContas());

        conta3.depositar(conta2.transferencia(50));
        System.out.println("Tranferencia concluida. Seu saldo é de: " + conta3.getsaldo());
        System.out.println("Sua conta agora tem o saldo de: " + conta2.getsaldo());
    }
}
        