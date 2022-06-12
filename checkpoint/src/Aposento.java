public class Aposento {

    private int codigo;
    private double diaria;
    private String descricao;
    private int qtdePessoas;
    private static int codigoGlobal;

    public Aposento(double diaria, String descricao, int qtdePessoas) {
        codigoGlobal++;
        this.codigo = codigoGlobal;
        this.diaria = diaria;
        this.descricao = descricao;
        this.qtdePessoas = qtdePessoas;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    @Override
    public String toString() {
        return "Aposento{" +
                "codigo=" + codigo +
                ", diaria=" + diaria +
                ", descricao='" + descricao + '\'' +
                ", qtdePessoas=" + qtdePessoas +
                '}';
    }
}
