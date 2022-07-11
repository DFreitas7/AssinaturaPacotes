package tsi.assinaturapacotes;

public class Pacote {
    private final String descricao;
    private final Float valor;

    public Pacote(String descricao, Float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public Float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + ": R$ " + valor;
    }
}
