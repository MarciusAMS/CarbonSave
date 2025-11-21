package adapter;

public class AdaptadorApiAmbiental implements IApiAmbiental {

    private ApiExternaGov apiGov = new ApiExternaGov();

    @Override
    public double obterFatorEmissao() {
        return apiGov.getEmissionFactor();
    }
}
