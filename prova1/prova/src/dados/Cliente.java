package dados;

public class Cliente {
    private String nome;
    private float mensalidade;
    private float beneficio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMensalidade() {
        return mensalidade - beneficio;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public float getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(float beneficio) {
        this.beneficio = beneficio;
    }
}
