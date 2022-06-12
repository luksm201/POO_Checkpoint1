import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Hospedagem {

    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private List<Hospede> hospedes;
    private Aposento aposento;
    private Conta conta;
    private static int codigoGlobal;

    public Hospedagem(LocalDate dataEntrada, Aposento aposento, Conta conta) {
        codigoGlobal++;
        this.codigo = codigoGlobal;
        this.dataEntrada = dataEntrada;
        this.hospedes = new ArrayList<>();
        this.aposento = aposento;
        this.conta = conta;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void finalizarHospedagem(LocalDate dataSaida) {
        if (dataSaida != null && dataSaida.isAfter(dataEntrada)){
            this.dataSaida = dataSaida;
        }
        else{
            System.out.println("Data de saída inválida (menor que a data de entrada");
        }

    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public void inserirHospedes(Hospede hospede) {
        this.hospedes.add(hospede);
    }

    public void deletarHospede(Hospede hospede) {
        this.hospedes.remove(hospede);
    }
    public void listarHospedes() {
        for(Hospede hospede : this.hospedes){
            System.out.println(hospede);
        }
    }

    public Aposento getAposento() {
        return aposento;
    }

    public void setAposento(Aposento aposento) {
        this.aposento = aposento;
    }

    public Conta getConta() {
        return conta;
    }

    public void tempoHospedado(){
        if (this.dataSaida != null && dataSaida.isAfter(dataEntrada)){
            long tempoDias =  ChronoUnit.DAYS.between( dataEntrada , dataSaida ) ;
            System.out.println("Tempo Hospedado: " + tempoDias);
        }
        else{
            System.out.println("Data de saída inválida (menor que a data de entrada");
        }
    }

    @Override
    public String toString() {
        return "Hospedagem{" +
                "codigo=" + codigo +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                "/n"+
                ", hospedes=" + hospedes +
                "/n"+
                ", aposento=" + aposento +
                ", conta=" + conta +
                '}';
    }
}
