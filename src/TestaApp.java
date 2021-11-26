public class TestaApp {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.agencia = 123;
        conta1.numero = 678;
        conta1.saldo = 100;
        conta1.depositar(100);
        conta1.sacar(52);

        Conta conta2 = new Conta();
        conta2.agencia = 765;
        conta2.numero = 442;
        conta2.saldo = 50;
        conta2.depositar(20);
        conta2.sacar(30);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Iago";
        cliente1.CPF = "0001234";
        cliente1.endereco = "Rua da luz";

        conta1.cliente = cliente1;
    }
}
        