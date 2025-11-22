package adapter;

public class AdaptadorApiAmbiental implements IApiAmbiental {

    private ApiExternaGov apiGov = new ApiExternaGov();

    @Override
    public double obterFatorEmissao(String tipoCombustivel) {
        String codigoParaApi = "";

        // 1. TRADUÇÃO: De "Português" (App) para "Código da API" (Gov)
        if (tipoCombustivel.equalsIgnoreCase("Carro")) {
            // Mapeamos Carro para Gasolina Tipo A da API
            codigoParaApi = "GAS_TYPE_A";

        } else if (tipoCombustivel.equalsIgnoreCase("Voo")) {
            // Vamos usar o outro tipo disponível para testar, ou você adiciona mais na API
            codigoParaApi = "DSL_TYPE_B";

        } else if (tipoCombustivel.equalsIgnoreCase("Energia")) {
            // A APIGov atual não tem energia, então retornará 0.0
            // a menos que você adicione um "case" lá na classe ApiExternaGov
            codigoParaApi = "ENERGY_BR";
        }

        // 2. CHAMADA REAL
        return apiGov.getEmissionFactor(codigoParaApi);
    }
}