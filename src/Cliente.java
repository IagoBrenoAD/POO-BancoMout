import java.time.LocalDate;
import java.util.Date;

public class Cliente {
//Definindo atributos.
    private String nome;
    private String CPF;
    private LocalDate dataNascimento;
    private String endereco;

    //Construtor dos clientes.
    public Cliente(String nome, String CPF, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    //Métodos de get's e set's.
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome trocado. Seu nome é: " + this.nome);
    }

    public String getCPF() {
        return this.CPF;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
        System.out.println("Endereço trocado. Seu endereço é: " + this.endereco);
    }
}
