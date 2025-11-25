package adapter;

public class AdaptadorApiAmbiental implements IApiAmbiental {

    private ApiExternaGov apiGov = new ApiExternaGov();

    @Override
    public double obterFatorEmissao(String tipoCombustivel) {
        String codigoParaApi = "";

        if (tipoCombustivel.equalsIgnoreCase("Carro")) {
            codigoParaApi = "GAS_TYPE_A";

        } else if (tipoCombustivel.equalsIgnoreCase("Voo")) {
            codigoParaApi = "DSL_TYPE_B";

        } else if (tipoCombustivel.equalsIgnoreCase("Energia")) {
            codigoParaApi = "ENERGY_BR";
        }

        return apiGov.getEmissionFactor(codigoParaApi);
    }
}