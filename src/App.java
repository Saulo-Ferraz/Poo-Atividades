import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
                Registro registro = new Registro();

            int opcao = 0;

                do {

                    System.out.println("Bem vindo ao Banco Atual\nEscolha sua opção\n" +
                        " 1 - Cadastrar Novo Cliente\n" +
                        " 2 - Listar Clientes\n" +
                        " 3 - Excluir Cliente\n" +
                        " 4 - Fechar Banco");

                        opcao = scanner.nextInt();

                    System.out.println("---------------- \n");

                    switch ( opcao) {

                        case 1:
                            registro.registrarCliente();
                        break;
                        case 2:
                            registro.exibeClientes();
                        break;
                        case 3:
                            registro.apagarClientes();
                        break;
                            
                        default:
                        break;
                        }
            } while (opcao != 4);
        }   
    }
}

