import model.*;
import template.*;
import strategy.*;
import visitor.*;
import adapter.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== CarbonSave - Cálculo de Emissões =====\n");

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nEscolha o tipo de cálculo:");
        System.out.println("1 - Emissão por carro");
        System.out.println("2 - Emissão por energia elétrica");
        System.out.println("3 - Emissão por viagem de avião");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        EmissionStrategy strategy = null;
        Atividade atividade = null;
        int idAtividade = 1;

        switch (opcao) {
            case 1 -> {
                System.out.print("Quantos km você percorreu? ");
                double km = scanner.nextDouble();

                // STRATEGY
                strategy = new CarEmissionStrategy(km);

                // ATIVIDADE
                atividade = new Atividade(idAtividade++, "Carro", km);
            }
            case 2 -> {
                System.out.print("Quanto de energia (kWh) você consumiu? ");
                double kwh = scanner.nextDouble();

                strategy = new EnergyEmissionStrategy(kwh);
                atividade = new Atividade(idAtividade++, "Energia", kwh);
            }
            case 3 -> {
                System.out.print("Informe a distância da viagem (km): ");
                double distancia = scanner.nextDouble();

                strategy = new FlightEmissionStrategy(distancia);
                atividade = new Atividade(idAtividade++, "Voo", distancia);
            }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        // ADAPTER — pega o fator externo de uma API simulada
        IApiAmbiental api = new AdaptadorApiAmbiental();

        // TEMPLATE METHOD
        CarbonCalculatorTemplate calculator = new CarbonCalculator(api);

        // PROCESSA EMISSÃO COMPLETA
        Emissao emissao = calculator.processarEmissao(atividade);

        // SOMA STRATEGY + TEMPLATE (opcional, dependendo do que você quer demonstrar)
        double emissaoTotal = emissao.getQuantidadeCO2() + strategy.calcular();

        Person p = new Person(nome, emissaoTotal);
        Company c = new Company("EcoCorp", 950.8);

        System.out.println("\nEscolha o tipo de relatório:");
        System.out.println("1 - Relatório PDF");
        System.out.println("2 - Relatório HTML");
        System.out.print("Opção: ");

        int tipoRelatorio = scanner.nextInt();

        ReportVisitor visitor;

        switch (tipoRelatorio) {
            case 1 -> {
                visitor = new PdfReportVisitor();
                System.out.println("\n===== Relatório PDF =====");
            }
            case 2 -> {
                visitor = new HtmlReportVisitor();
                System.out.println("\n===== Relatório HTML =====");
            }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        // VISITOR executando em diferentes elementos
        p.accept(visitor);
        c.accept(visitor);
        atividade.accept(visitor);
        emissao.accept(visitor);

        scanner.close();
    }
}
