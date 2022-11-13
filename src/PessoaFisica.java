
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
    
//    public static int pesquisaPF(PessoaFisica[] todosPF, int cont, String conta) {
//        boolean encontrado = false;
//        for (int i = 0; i < cont; i++) {
//            if (todosPF[i] != null && todosPF[i].getConta().equals(conta)) {
//                encontrado = true;
//                return i;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("Cliente nao encontrado!");
//        }
//        return -1;
//    }
    
    public static int pesquisaPF(PessoaFisica[] todosPF, int cont, String conta) {
        boolean encontrado = false;
        for (int i = 0; i < cont; i++) {
            if (todosPF[i] != null && todosPF[i].getConta().equals(conta)) {
                encontrado = true;
                return i;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente nao encontrado!");
        }
        return -1;
    }
    
//    void imprimePF(int p, PessoaFisica[] todosPF) {
//        System.out.println("CPF: " + todosPF[p].getCpf());
//        System.out.println("Nome: " + todosPF[p].getNome());
//        System.out.println("Idade: " + todosPF[p].getIdade());
//        System.out.println("Conta: " + todosPF[p].getConta());
//        System.out.println("Agencia: " + todosPF[p].getAgencia());
//        System.out.println("Telefone: " + todosPF[p].getTelefone());
//        System.out.println("Saldo: " + todosPF[p].getSaldo());
//        System.out.println("Limite do cheque especial: " + todosPF[p].getLimiteChequeE());
//    }
    void imprimePF() {
        System.out.println("CPF: " + getCpf());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Conta: " + getConta());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite do cheque especial: " + getLimiteChequeE());
    }
    
    static void alteraPessoa(int p, PessoaFisica[] todosPF) {
        
    }
    
    static void removePessoaPF(int p, PessoaFisica[] todosPF) {
        todosPF[p] = null;
        System.out.println("Cliente removido com sucesso!");
    }
    
    static void ajustLimitePF(int p, PessoaFisica[] todosPF, double valor) {
        todosPF[p].setLimiteChequeE(valor);
        System.out.println("Limite alterado com sucesso!");
    }
    
    static void depositaPF(int p, PessoaFisica[] todosPF, double valor) {
        todosPF[p].setSaldo(todosPF[p].getSaldo() + valor);
        System.out.println("Deposito realizado com sucesso!");
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
