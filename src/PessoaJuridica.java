
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String[] nome;
    private String razaoSocial;
    private String nomeFantasia;

    public PessoaJuridica(String cnpj, String[] nome, String razaoSocial, String nomeFantasia, String conta, String agencia, String telefone, double saldo, double limiteChequeE) {
        super(conta, agencia, telefone, saldo, limiteChequeE);
        this.cnpj = cnpj;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }
    
    public static int pesquisaPJ(PessoaJuridica[] todosPJ, int cont, String conta) {
        boolean encontrado = false;
        for (int i = 0; i < cont; i++) {
            if (todosPJ[i] != null && todosPJ[i].getConta().equals(conta)) {
                encontrado = true;
                return i;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente nao encontrado!");
        }
        return -1;
    }
    
    static void imprimePJ(int pj, PessoaJuridica[] todosPJ) {
        System.out.println("CNPJ: " + todosPJ[pj].getCnpj());
        System.out.println("Nome: " + todosPJ[pj].getNome()[0]);
        System.out.println("Nome: " + todosPJ[pj].getNome()[1]);
        System.out.println("Nome: " + todosPJ[pj].getNome()[2]);
        System.out.println("Razao Social: " + todosPJ[pj].getRazaoSocial());
        System.out.println("Nome fantasia: " + todosPJ[pj].getNomeFantasia());
        System.out.println("Conta: " + todosPJ[pj].getConta());
        System.out.println("Agencia: " + todosPJ[pj].getAgencia());
        System.out.println("Telefone: " + todosPJ[pj].getTelefone());
        System.out.println("Saldo: " + todosPJ[pj].getSaldo());
        System.out.println("Limite do cheque especial: " + todosPJ[pj].getLimiteChequeE());
    }
    
    static void removePessoaPJ(int p, PessoaJuridica[] todosPJ) {
        todosPJ[p] = null;
        System.out.println("Cliente removido com sucesso!");
    }
    
    static void ajustaLimitePJ(int p, PessoaJuridica[] todosPJ, double valor) {
        todosPJ[p].setLimiteChequeE(todosPJ[p].getSaldo() + valor);
        System.out.println("Limite alterado com sucesso!");
    }
    
    static void depositaPJ(int p, PessoaJuridica[] todosPJ, double valor) {
        todosPJ[p].setSaldo(valor);
        System.out.println("Deposito realizado com sucesso!");
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    
}
