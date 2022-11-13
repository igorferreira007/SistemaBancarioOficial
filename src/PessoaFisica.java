
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
    
    public static PessoaFisica pesquisaPF(PessoaFisica[] todosPF, int[] cont, String conta) {
        boolean encontrado = false;
        for (int i = 0; i < cont[0]; i++) {
            if (todosPF[i].getConta().equals(conta)) {
                encontrado = true;
                return todosPF[i];
            }
        }
        if (!encontrado) {
            System.out.println("Cliente nao encontrado!");
        }
        return null;
    }
    
    static void imprimePF(PessoaFisica p) {
        System.out.println("CPF: " + p.getCpf());
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Conta: " + p.getConta());
        System.out.println("Agencia: " + p.getAgencia());
        System.out.println("Telefone: " + p.getTelefone());
        System.out.println("Saldo: " + p.getSaldo());
        System.out.println("Limite do cheque especial: " + p.getLimiteChequeE());
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
