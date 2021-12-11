public class Endereco {
//Definindo atributos.
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;

    //Construtor dos endereços.
    public Endereco(String logradouro, int numero, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    //Métodos de get's e set's.
    public String getLogradouro() {
        return this.logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return this.uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
}
