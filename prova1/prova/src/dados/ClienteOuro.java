package dados;

import java.util.*;

public class ClienteOuro extends Cliente{

    private int quantDependentes;

    public float getMensalidade() {
        return 80 * super.getMensalidade()/100;
    }

    public float getBeneficio(){
        return 10 * super.getBeneficio()/100;
    }

    public int getQuantDependentes() {
        return quantDependentes;
    }

    public void setQuantDependentes(int quantDependentes) {
        this.quantDependentes = quantDependentes;
    }
}
