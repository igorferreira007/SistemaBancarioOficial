
public class Pessoa {
    private String conta;
    private String agencia;
    private String telefone;
    private double saldo;
    private double limiteChequeE;

    public Pessoa(String conta, String agencia, String telefone, double saldo, double limiteChequeE) {
        this.conta = conta;
        this.agencia = agencia;
        this.telefone = telefone;
        this.saldo = saldo;
        this.limiteChequeE = limiteChequeE;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteChequeE() {
        return limiteChequeE;
    }

    public void setLimiteChequeE(double limiteChequeE) {
        this.limiteChequeE = limiteChequeE;
    }
    
}
