package adapter;

public class AdaptadorApiGov implements IApiAmbiental {
    private ApiExternaGov api;

    public AdaptadorApiGov() {
        this.api = new ApiExternaGov();
    }

    @Override
    public double obterFatorEmissao(String tipoCombustivel) {
        String codigoParaApi = "";

        if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            codigoParaApi = "GAS_TYPE_A";
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            codigoParaApi = "DSL_TYPE_B";
        }

        double fator = this.api.getEmissionFactor(codigoParaApi);

        return fator;
    }
}

