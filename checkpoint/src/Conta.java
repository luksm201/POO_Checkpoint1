import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int codigo;
    private double valorTotal;
    private boolean pago;
    private List<Consumo> consumos;
    private static int codigoGlobal;

    public Conta() {
        codigoGlobal++;
        this.codigo = codigoGlobal;
        this.pago = false;
        this.valorTotal = 0.0;
        this.consumos = new ArrayList<>();
    }

    public void inserirConsumo(Consumo consumo){
        this.consumos.add(consumo);
    }

    public void deletarConsumo(Consumo consumo){
        this.consumos.remove(consumo);
    }

    public void listarConsumos(){
        for(Consumo consumo : this.consumos){
            System.out.println(consumo);
        }
    }

    public void modificarStatus(boolean pago){
      this.pago = pago;
    }

    public void setValorTotal (){
        for(Consumo consumo : this.consumos){
            this.valorTotal += consumo.getValorUnitario() * consumo.getQuantidade();
        }
    }

    public boolean getStatus(){
        return this.pago;
    }

    @Override
    public String toString() {
        this.setValorTotal();
        return "Conta{" +
                "codigo=" + codigo +
                ", valorTotal=" + valorTotal +
                ", pago=" + pago +
                ", consumo=" + consumos +
                '}';
    }
}
