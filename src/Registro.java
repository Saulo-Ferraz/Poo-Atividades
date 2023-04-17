import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Registro () {}


    public Registro(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
            return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
            this.clientes = clientes;
    }

    private Cliente adicionaCliente() {

            Cliente cliente = new Cliente();

            System.out.println("Informe o nome do cliente: ");
            cliente.setNome(scanner.nextLine());
            System.out.println("Informe o cpf do cliente: ");
            cliente.setCpf(scanner.nextInt());
            System.out.println("---------------- \n");
            
            return cliente;
        }

    private Endereco adicionaEndereco() {

            Endereco endereco = new Endereco();

            System.out.println("Digite o cep do endereço: ");
            endereco.setCep(scanner.nextInt());
            System.out.println("Informe o logradouro do endereço: ");
            endereco.setLogradouro(scanner.next());
            System.out.println("Informe o numero do endereço: ");
            endereco.setNumero(scanner.nextInt());
            System.out.println("---------------- \n");

            return endereco;
        }

    private Telefone adicionaTelefone(){

            Telefone telefone = new Telefone();

            System.out.println("Digite o DDD do telefone: ");
            telefone.setDdd(scanner.nextInt());
            System.out.println("Informe o número do telefone: ");
            telefone.setNumeroTelefone(scanner.nextInt());
            System.out.println("---------------- \n");

            return telefone;

        }
       
    private Conta adicionaConta() {

            Conta conta = new Conta();

            System.out.println("Informe o número da conta: ");
            conta.setNumeroConta(scanner.nextInt());
            System.out.println("Informe a agência: ");
            conta.setAgenciaConta(scanner.nextInt());
            System.out.println("Informe o tipo da conta: (Corrente/Poupança)");
            conta.setTipoConta(scanner.next());
            conta.setSaldo(0);

            System.out.println("---------------- \n");

            return conta;
        }

    public void registrarCliente() {

            Cliente cliente = adicionaCliente();
            Endereco endereco = adicionaEndereco();
            Telefone telefone = adicionaTelefone();
            Conta conta = adicionaConta();

            cliente.setEndereco(endereco);
            cliente.addTelefone(telefone);
            cliente.addConta(conta);

            clientes.add(cliente);
        }

    public void exibeClientes() {

            for(int i = 0; i < clientes.size(); i++) {
                
                System.out.println(clientes.get(i).getNome());
            }

            System.out.println("---------------- \n");
        }

    public void apagarClientes() {


            System.out.println("Informe o cpf do cliente que será excluído: ");
            int cpf = scanner.nextInt();

            for(int i=0; i<clientes.size(); i++) {

                Cliente cpfCliente = clientes.get(i);

                if(cpfCliente.getCpf() == cpf) {
                    
                    System.out.println(cpfCliente.getNome() + " Foi excluído");
                    clientes.remove(i);
                    System.out.println("---------------- \n");
            
            }   else {

                    System.out.println("Cliente com este CPF não foi encontrado");
                    System.out.println("---------------- \n");
            }
        }
}

}
