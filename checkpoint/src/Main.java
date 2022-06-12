import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String dataNascimentoDigitada1 = "12/02/1994";
        String dataNascimentoDigitada2 = "23/10/1992";
        String dataNascimentoDigitada3 = "01/08/1985";
        LocalDate dataNascimento1, dataNascimento2, dataNascimento3;

        dataNascimento1 = LocalDate.parse(dataNascimentoDigitada1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dataNascimento2 = LocalDate.parse(dataNascimentoDigitada2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dataNascimento3 = LocalDate.parse(dataNascimentoDigitada3, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Hospede Hebert = new Hospede("Hebert Santos", dataNascimento1, "428456789-56", "9768945-2312");
        Hospede Bianca = new Hospede("Bianca Oliveira", dataNascimento2, "132456789-89", "95678-6545");
        Hospede Marcos = new Hospede("Marcos Gonçalves", dataNascimento3, "456789132-23", "99456-3597");
        Hospede Intruso = new Hospede("Intruso X", dataNascimento3, "111222333-44", "97070-7070");

        System.out.println("Dados dos Hospedes");
        System.out.println("");
        System.out.println(Hebert);
        System.out.println(Bianca);
        System.out.println(Marcos);

        System.out.println("");
        System.out.println("");

        Aposento quarto01 = new Aposento(625.00, "Quarto para duas pessoas", 2);
        Aposento Suite01 = new Aposento(1000.00, "Quarto para quatro pessoas", 4);
        Aposento SuiteMaster = new Aposento(2000.00, "Quarto para seis pessoas", 6);

        System.out.println("Dados dos Aposentos");
        System.out.println("");
        System.out.println(quarto01);
        System.out.println(Suite01);
        System.out.println(SuiteMaster);

        System.out.println("");
        System.out.println("");

        String dataEntradaDigt1 = "09/06/2022";
        String dataEntradaDigt2 = "10/06/2022";
        String dataEntradaDigt3 = "11/06/2022";
        LocalDate dataEntrada1, dataEntrada2, dataEntrada3;

        dataEntrada1 = LocalDate.parse(dataEntradaDigt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dataEntrada2 = LocalDate.parse(dataEntradaDigt2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dataEntrada3 = LocalDate.parse(dataEntradaDigt3, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Hospedagem hosp1 = new Hospedagem(dataEntrada1, quarto01, new Conta());
        Hospedagem hosp2 = new Hospedagem(dataEntrada2, Suite01, new Conta());
        Hospedagem hosp3 = new Hospedagem(dataEntrada3, SuiteMaster, new Conta());

        hosp1.inserirHospedes(Hebert);
        hosp2.inserirHospedes(Bianca);
        hosp3.inserirHospedes(Marcos);
        hosp3.inserirHospedes(Intruso);

        System.out.println("Dados das Hospedagens");
        System.out.println("");
        System.out.println(hosp1);
        System.out.println(hosp2);
        System.out.println(hosp3);

        System.out.println("");
        System.out.println("");

        Consumo hamburguer = new Consumo("Hamburguer delicioso", 1, 10.00);
        Consumo cocacola = new Consumo("coca-cola", 2, 5.00);
        Consumo batatafrita = new Consumo("Batata-frita", 1, 9.00);

        System.out.println("Dados de Consumo");

        hosp1.getConta().inserirConsumo(hamburguer);
        hosp1.getConta().inserirConsumo(cocacola);
        hosp1.getConta().inserirConsumo(batatafrita);

        hosp1.getConta().listarConsumos();

        System.out.println("Dados das Hospedagens Atualizado");
        System.out.println("");
        System.out.println(hosp1);
        System.out.println(hosp2);
        System.out.println(hosp3);

        System.out.println("");
        System.out.println("");

    }
}