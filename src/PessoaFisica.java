
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    public PessoaFisica(String cpf, String nome, int idade, String conta, String agencia, String telefone, double saldo, double limiteChequeE) {
        super(conta, agencia, telefone, saldo, limiteChequeE);
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
