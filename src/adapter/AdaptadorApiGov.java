package adapter;

public class AdaptadorApiGov implements IApiAmbiental {
    private ApiExternaGov api;

    public AdaptadorApiGov(ApiExternaGov api) {
        this.api = api;
    }

    @Override
    public double obterFatorEmissao() {
        return api.getEmissionFactor();
    }
}

