public class Conta {
    int agencia;
    int numero;
    float saldo;
    Cliente cliente;

    public void depositar(float valor) {
        saldo = saldo + valor;
        System.out.println("Valor do saldo após o deposito:" + saldo);
    }

    public void sacar(float valor) {
        saldo = saldo - valor;
        System.out.println("Valor do saldo após o saque: " + saldo);
    }
}
