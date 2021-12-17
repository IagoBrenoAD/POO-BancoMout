abstract public class Conta {
// Definindo atributos.
    private int agencia;
    private int numero;
    protected double saldo;
    private Cliente cliente;
    private static int quantidadeDeContas;

    //Construtor das contas.
    public Conta(int agencia, int numero, Cliente cliente) {
        quantidadeDeContas ++;
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    //Método de notificação.
    protected void enviarNotificacao(String operacao, double valor){
        new Notificacao().enviarEmail(operacao, valor);
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
            this.enviarNotificacao("Depósito", valor);
        }else{
            System.out.println("Valor negativo não aceito");
        }
    }

    //Método de saque.
    abstract public boolean sacar(double valor);

    //Método de transferencia.
    public void transferencia(double valor, Conta contaDestino) {
        boolean saqueComSucesso = this.sacar(valor);
        if (saqueComSucesso) {
            contaDestino.depositar(valor);
            this.enviarNotificacao("Transferência", valor);
        }
    }
}
