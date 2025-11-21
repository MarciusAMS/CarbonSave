package adapter;

public class AdaptadorApiGov implements IApiAmbiental {
    // 1. Tem uma instância da API externa (Composição)
    private ApiExternaGov api;

    public AdaptadorApiGov() {
        this.api = new ApiExternaGov();
    }

    @Override
    public double obterFatorEmissao(String tipoCombustivel) {
        // 2. Traduz os dados de entrada (se necessário)
        String codigoParaApi = "";

        if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            codigoParaApi = "GAS_TYPE_A";
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            codigoParaApi = "DSL_TYPE_B";
        }

        // 3. Chama o método da API externa
        double fator = this.api.getEmissionFactor(codigoParaApi);

        // 4. Retorna o resultado no formato que seu sistema espera
        return fator;
    }
}

