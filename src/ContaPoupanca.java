public class ContaPoupanca extends Conta {

    //Definindo atributo.
    private double rendimento;

    //Construtor da classe filha.
    public ContaPoupanca(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
        this.rendimento = 0.02;
    }

    //Método de get e set.
    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    //Subescrevendo método sacar.
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= super.saldo) {
            super.saldo = super.saldo - valor;
            System.out.println("Valor sacado: " + super.getNumero()); 
            this.enviarNotificacao("Saque", valor);
            return true;
        }else{
            System.out.println("Saque não realizado. Valor abaixo do seu saldo atual, que é de: " + super.saldo);
            System.out.println("Saldo atual: " + super.saldo);
            return false;
        }
    }
    
}
