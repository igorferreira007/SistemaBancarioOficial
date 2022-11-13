
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
    
    public static PessoaJuridica pesquisaPJ(PessoaJuridica[] todosPJ, int[] cont, String conta) {
        boolean encontrado = false;
        for (int i = 0; i < cont[0]; i++) {
            if (todosPJ[i].getConta().equals(conta)) {
                encontrado = true;
                return todosPJ[i];
            }
        }
        if (!encontrado) {
            System.out.println("Cliente nao encontrado!");
        }
        return null;
    }
    
    static void imprimePJ(PessoaJuridica pj) {
        System.out.println("CPF: " + pj.getCnpj());
        System.out.println("Nome: " + pj.getNome()[0]);
        System.out.println("Nome: " + pj.getNome()[1]);
        System.out.println("Nome: " + pj.getNome()[2]);
        System.out.println("Idade: " + pj.getRazaoSocial());
        System.out.println("Conta: " + pj.getNomeFantasia());
        System.out.println("Agencia: " + pj.getConta());
        System.out.println("Agencia: " + pj.getAgencia());
        System.out.println("Telefone: " + pj.getTelefone());
        System.out.println("Saldo: " + pj.getSaldo());
        System.out.println("Limite do cheque especial: " + pj.getLimiteChequeE());
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
