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
    public int getagencia() {
        return this.agencia;
    }

    public int getnumero() {
        return this.numero;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public Cliente getcliente() {
        return this.cliente;
    }

    public static int getquantidadeDeContas() {
        return quantidadeDeContas;
    }

    //Método de depósito.
    public void depositar(float valor) {
        if(valor > 0){
            this.saldo = this.saldo + valor;
            System.out.println("Valor depositado:" + valor); 
        }else{
            System.out.println("Valor negativo não aceito");
        }
    }

    //Método de saque.
    public void sacar(float valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Valor sacado: " + valor); 
        }else{
            System.out.println("Saque não realizado. Valor abaixo do seu saldo atual, que é de: " + this.saldo);
            System.out.println("Saldo atual: " + this.saldo);
        }
    }

    //Método de transferencia.
    public float transferencia(float valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Tranferência concluida com sucesso.");
            return valor;
        }else{
            System.out.println("Saldo insuficiente para transferência.");
            return 0;
        }
    }
}
