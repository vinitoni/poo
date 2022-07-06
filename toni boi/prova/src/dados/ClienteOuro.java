package dados;

import java.util.*;

public class ClienteOuro extends Cliente{

    private int quantDependentes;
    private List<Cliente> mensalidadeeBeneficio = new LinkedList<Cliente>();

    public float getMensalidade() {
        return 80 * super.getMensalidade();
    }

    public float getBeneficio(){
        return 10 * super.getBeneficio();
    }

    public int getQuantDependentes() {
        return quantDependentes;
    }

    public void setQuantDependentes(int quantDependentes) {
        this.quantDependentes = quantDependentes;
    }
}
