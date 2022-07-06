import java.util.*;
import dados.*;

public class Principal {
    private static Negocio negocio = new Negocio();
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int escolher;
        do {
            System.out.println("\t Menu de Opcoes");
            System.out.println("(0) - Cadastrar Cliente");
            System.out.println("(1) - Cadastrar Cliente Ouro");
            System.out.println("(2) - Mostrar Mensalidades");
            System.out.println("(3) - Mostrar Beneficios");
            System.out.println("(4) - Mostrar Clientes Ouro");
            System.out.println("(5) - Mostrar Clientes");
            System.out.println("(6) - Encerrar");

            escolher = Integer.parseInt(ler.nextLine());

            switch (escolher) {
                case 0:
                    cadastraCliente();
                    break;
                case 1:
                    cadastraClienteOuro();
                    break;
                case 2:
                    mostraTotalMensalidades();
                    break;
                case 3:
                    mostraTotalBeneficios();
                    break;
                case 4:
                    mostraNomeClientesOuro();
                    break;
                case 5:
                    mostraNomeClientes();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (escolher != 5);
    }

    public static void cadastraCliente() {
        System.out.println("Nome do Cliente: ");
        String nome = ler.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setMensalidade(99);
        cliente.setBeneficio(2);
        negocio.adicionaCliente(cliente);
    }

    public static void cadastraClienteOuro() {
        System.out.println("Nome do Cliente Ouro:");
        String nome = ler.nextLine();
        ClienteOuro cliente = new ClienteOuro();
        cliente.setNome(nome);
        cliente.setMensalidade(249);
        cliente.setBeneficio(6);
        negocio.adicionarClienteOuro(cliente);
    }

    public static void mostraTotalMensalidades() {
        System.out.println("Total de Mensalidades: " + negocio.totalMensalidades());
    }

    public static void mostraTotalBeneficios() {
        System.out.println("Total de Benefícios: " + negocio.totalBeneficios());
    }

    public static void mostraNomeClientesOuro() {
        String nomes[] = negocio.listaNomeClientesOuro();

        System.out.println("Nome Clientes Ouro:");
        for (String nome : nomes)
            System.out.println(nome);
    }

    public static void mostraNomeClientes() {
        String nomes[] = negocio.listaNomeClientes();

        System.out.println("Nome Clientes:");
        for (String nome : nomes)
            System.out.println(nome);
    }
}