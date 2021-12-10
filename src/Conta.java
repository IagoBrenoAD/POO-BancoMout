public class Conta {
// Definindo atributos.
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private static int quantidadeDeContas;

    //Construtor das contas.
    public Conta(int agencia, int numero, Cliente cliente) {
        quantidadeDeContas ++;
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    //Métodos de get's e set's.
    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public static int getQuantidadeDeContas() {
        return quantidadeDeContas;
    }

    //Método de depósito.
    public void depositar(double valor) {
        if(valor > 0){
            this.saldo = this.saldo + valor;
            System.out.println("Valor depositado:" + valor); 
        }else{
            System.out.println("Valor negativo não aceito");
        }
    }

    //Método de saque.
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Valor sacado: " + valor); 
            return true;
        }else{
            System.out.println("Saque não realizado. Valor abaixo do seu saldo atual, que é de: " + this.saldo);
            System.out.println("Saldo atual: " + this.saldo);
            return false;
        }
    }

    //Método de transferencia.
    public void transferencia(double valor, Conta contaDestino) {
        boolean saqueComSucesso = this.sacar(valor);
        if (saqueComSucesso) {
            contaDestino.depositar(valor);
        }
    }
}
