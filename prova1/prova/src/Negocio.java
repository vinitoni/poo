import dados.Cliente;
import dados.ClienteOuro;

public class Negocio {
    private Cliente clientes[] = new Cliente[50];
    private int quantClientes;
    private int quantClientesOuro;

    public void adicionaCliente(Cliente somaClientes){
        clientes[quantClientes + quantClientesOuro] = somaClientes;
        quantClientes++;
    }
    public void adicionarClienteOuro(Cliente somaClientes){
        clientes[quantClientes + quantClientesOuro] = somaClientes;
        quantClientesOuro++;
    }
    public float totalMensalidades(){
        float soma = 0;
        for (int i=0;i<quantClientesOuro+quantClientes;i++){
            soma += clientes[i].getMensalidade();
        }
        return soma;
    }
    public float totalBeneficios(){
        float soma = 0;
        for (int i=0;i<quantClientes+quantClientesOuro;i++){
            soma += clientes[i].getBeneficio();
        }
        return soma;
    }
    public String[] listaNomeClientesOuro(){
    String nomesClientes[] = new String[quantClientesOuro];
    int aux = 0;
    for (int i = 0; i < quantClientesOuro + quantClientes; i++){
        if (clientes[i] instanceof ClienteOuro){
            nomesClientes[aux] = clientes[i].getNome();
            aux++;
        }
    }
    return nomesClientes;
    }
}
