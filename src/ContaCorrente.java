public class ContaCorrente extends Conta {
    
    //Definindo atributo.
    private double chequeEspecial;

    //Contrutor da classe filha.
    public ContaCorrente(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
        this.chequeEspecial = 100;
    }

    //Definindo get e set.
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    //Subescrevendo método sacar.
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= super.saldo + this.chequeEspecial) {
            super.saldo = super.saldo - valor;
            System.out.println("Valor sacado: " + super.getNumero()); 
            super.enviarNotificacao("Saque", valor);
            return true;
        }else{
            System.out.println("Saque não realizado. Valor abaixo do seu saldo atual, que é de: " + super.saldo);
            System.out.println("Saldo atual: " + super.saldo);
            return false;
        }
    } 
    
}
