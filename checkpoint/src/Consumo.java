public class Consumo {

    private int codigo;
    private String descricao;
    private int quantidade;
    private double valorUnitario;
    private static int codigoGlobal;

    public Consumo(String descricao, int quantidade, double valorUnitario) {
        codigoGlobal++;
        this.codigo = codigoGlobal;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}

