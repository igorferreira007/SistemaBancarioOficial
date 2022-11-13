
import java.util.Scanner;

public class ProgramaBanco {
    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
    public static void menuPrincipal() {
        System.out.println("CLIENTES");
        System.out.println("1. CADASTRA");
        System.out.println("2. CONSULTA");
        System.out.println("3. ALTERA(Desabilitado)");
        System.out.println("4. REMOVE");
        System.out.println("5. AJUSTA LIMITE");
        System.out.println("6. TRANSFERENCIA");
        System.out.println("7. DEPOSITO");
        System.out.println("8. TODOS CLIENTES");
        System.out.println("0. SAIR");
    }
    
    public static int menuTipoCliente(Scanner ler, int opcao) {
        do {            
            System.out.println("1. Pessoa Fisica");
            System.out.println("2. Pessoa Juridica");
            System.out.println("0. Voltar");
            opcao = ler.nextInt();
            clearBuffer(ler);
        } while (opcao != 1 && opcao != 2 && opcao != 0);
        return opcao;
    }
    
    public static int[] formularioCadastro(Scanner ler, int tipoCliente, int[] cont, PessoaFisica[] todosPF, PessoaJuridica[] todosPJ) {
        System.out.println("Conta:");
        String conta = ler.nextLine();
        System.out.println("Agencia:");
        String agencia = ler.nextLine();
        System.out.println("Telefone:");
        String telefone = ler.nextLine();
        System.out.println("Saldo:");
        double saldo = ler.nextDouble();
        clearBuffer(ler);
        System.out.println("Limite cheque especial:");
        double limite = ler.nextDouble();
        clearBuffer(ler);
        if (tipoCliente == 1) {
            System.out.println("CPF:");
            String cpf = ler.nextLine();
            System.out.println("Nome:");
            String nome = ler.nextLine();
            System.out.println("Idade:");
            int idade = ler.nextInt();
            PessoaFisica pf = new PessoaFisica(cpf, nome, idade, conta, agencia, telefone, saldo, limite);
            todosPF[cont[0]] = pf;
            System.out.println("Cadastrado com sucesso!");
            cont[0]++;
        } else {
            System.out.println("CNPJ:");
            String cnpj = ler.nextLine();
            String[] nome = new String[3];
            System.out.println("Nome socio 1:");
            nome[0] = ler.nextLine();
            System.out.println("Nome socio 2:");
            nome[1] = ler.nextLine();
            System.out.println("Nome socio 3:");
            nome[2] = ler.nextLine();
            System.out.println("Razao social:");
            String razaoSocial = ler.nextLine();
            System.out.println("Nome fantasia");
            String nomeFantasia = ler.nextLine();
            PessoaJuridica pj = new PessoaJuridica(cnpj, nome, razaoSocial, nomeFantasia, conta, agencia, telefone, saldo, limite);
            todosPJ[cont[1]] = pj;
            System.out.println("Cadastrado com sucesso!");
            cont[1]++;
        }
        return cont;
    }
    
    public static void imprimePessoa(Scanner ler, int tipoCliente, PessoaFisica[] todosPF, PessoaJuridica[] todosPJ, int[] cont) {
        System.out.println("Numero da conta:");
        String conta = ler.nextLine();
        if (tipoCliente == 1) {
            int p = PessoaFisica.pesquisaPF(todosPF, cont[0], conta);
            if (p != -1) {
                PessoaFisica pf = todosPF[p];
                pf.imprimePF();
            }            
        } else {
            int pj = PessoaJuridica.pesquisaPJ(todosPJ, cont[1], conta);
            if (pj != -1) {
                PessoaJuridica.imprimePJ(pj, todosPJ);
            }
        }
    }
    
    private static void alteraPessoa(Scanner ler, int tipoCliente, PessoaFisica[] todosPF, PessoaJuridica[] todosPJ, int[] cont) {
        System.out.println("Numero da conta:");
        String conta = ler.nextLine();
        if (tipoCliente == 1) {
            int p = PessoaFisica.pesquisaPF(todosPF, cont[0], conta);
            PessoaFisica.alteraPessoa(p, todosPF);
        } else {
            
        }
    }
    
    private static void removePessoa(Scanner ler, int tipoCliente, PessoaFisica[] todosPF, PessoaJuridica[] todosPJ, int[] cont) {
        System.out.println("Numero da conta:");
        String conta = ler.nextLine();
        if (tipoCliente == 1) {
            int p = PessoaFisica.pesquisaPF(todosPF, cont[0], conta);
            PessoaFisica.removePessoaPF(p, todosPF);
        } else {
            int p = PessoaJuridica.pesquisaPJ(todosPJ, cont[1], conta);
            PessoaJuridica.removePessoaPJ(p, todosPJ);
        }
    }
    
    public static void ajustaLimite(Scanner ler, int tipoCliente, PessoaFisica[] todosPF, PessoaJuridica[] todosPJ, int[] cont) {
        System.out.println("Numero da conta:");
        String conta = ler.nextLine();
        System.out.println("Novo limite:");
        double valor = ler.nextDouble();
        clearBuffer(ler);
        if (tipoCliente == 1) {
            int p = PessoaFisica.pesquisaPF(todosPF, cont[0], conta);
            if (p != -1) {
                PessoaFisica.ajustLimitePF(p, todosPF, valor);
            }
        } else {
            int p = PessoaJuridica.pesquisaPJ(todosPJ, cont[1], conta);
            if (p != -1) {
                PessoaJuridica.ajustaLimitePJ(p, todosPJ, valor);
            }            
        }
    }
    
    public static void deposita(Scanner ler, int tipoCliente, PessoaFisica[] todosPF, PessoaJuridica[] todosPJ, int[] cont) {
        System.out.println("Numero da conta:");
        String conta = ler.nextLine();
        System.out.println("Valor para deposito:");
        double valor = ler.nextDouble();
        clearBuffer(ler);
        if (tipoCliente == 1) {
            int p = PessoaFisica.pesquisaPF(todosPF, cont[0], conta);
            if (p != -1) {
                PessoaFisica.depositaPF(p, todosPF, valor);
            }
        } else {
            int p = PessoaJuridica.pesquisaPJ(todosPJ, cont[1], conta);
            if (p != -1) {
                PessoaJuridica.depositaPJ(p, todosPJ, valor);
            }            
        }
    }
    
    public static void exibeTodos(PessoaFisica[] todosPF, PessoaJuridica[] todosPJ, int[] cont) {
        System.out.println("PESSOAS FISICAS");
        for (int i = 0; i < cont[0]; i++) {
            System.out.println(todosPF[i].getNome());
        }
        System.out.println("PESSOAS JURIDICAS");
        for (int i = 0; i < cont[1]; i++) {
            System.out.println(todosPJ[i].getNomeFantasia());
        }
    }
    
    public static void transfere(Scanner ler, PessoaFisica[] todosPF, PessoaJuridica[] todosPJ, int[] cont) {
//        System.out.println("Conta de origem");
//        String contaOrigem = ler.nextLine();
//        System.out.println("Valor de transferencia:");
//        double valor = ler.nextDouble();
//        int p = PessoaFisica.pesquisaPF(todosPF, cont[0], contaOrigem);
//        if (p != -1) {
//            System.out.println("Conta de destino");
//            String contaDestino = ler.nextLine();
//            p = pe
//        }        
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
//        int contPF = 0, contPJ = 0;
        int[] cont = {0, 0};
        int tipoCliente = 0;
        PessoaFisica[] todosPF = new PessoaFisica[20];
        PessoaJuridica[] todosPJ = new PessoaJuridica[20];
        do {
            menuPrincipal();
            opcao = ler.nextInt();
            clearBuffer(ler);
            switch (opcao) {
                case 1 -> {
                    System.out.println("CADASTRAR");
                    tipoCliente = menuTipoCliente(ler, opcao);
                    if (tipoCliente != 0) {
                        cont = formularioCadastro(ler, tipoCliente, cont, todosPF, todosPJ);
                    }
                }
                case 2 -> {
                    System.out.println("CONSULTAR");
                    tipoCliente = menuTipoCliente(ler, opcao);
                    if (tipoCliente != 0) {
                        imprimePessoa(ler, tipoCliente, todosPF, todosPJ, cont);
                    }
                }
                case 4 -> {
                    System.out.println("REMOVER");
                    tipoCliente = menuTipoCliente(ler, opcao);
                    if (tipoCliente != 0) {
                        removePessoa(ler, tipoCliente, todosPF, todosPJ, cont);
                    }
                }
                case 5 -> {
                    System.out.println("AJUSTAR LIMITE");
                    tipoCliente = menuTipoCliente(ler, opcao);
                    if (tipoCliente != 0) {
                        ajustaLimite(ler, tipoCliente, todosPF, todosPJ, cont);
                    }
                }
                case 6 -> {
                    System.out.println("TRANSFERIR");
                    transfere(ler, todosPF, todosPJ, cont);
                }
                case 7 -> {
                    System.out.println("DEPOSITAR");
                    tipoCliente = menuTipoCliente(ler, opcao);
                    if (tipoCliente != 0) {
                        deposita(ler, tipoCliente, todosPF, todosPJ, cont);
                    }
                }
                case 8 -> {
                    System.out.println("TODOS OS CLIENTES");
                    exibeTodos(todosPF, todosPJ, cont);
                }
            }
//                case 3:
//                    System.out.println("ALTERAR");
//                    tipoCliente = menuTipoCliente(ler, opcao);
//                    if (tipoCliente != 0) {
//                        alteraPessoa(ler, tipoCliente, todosPF, todosPJ, cont);
//                    }
//                    break;
                    } while (opcao != 0);
    }

}
