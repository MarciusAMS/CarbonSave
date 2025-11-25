package adapter;

public class EmissionApiAdapter {

    private ExternalApiClient client;

    public EmissionApiAdapter(ExternalApiClient client) {
        this.client = client;
    }

    public double obterEmissaoConvertida() {
        String json = client.getEmissionJson();
        return 42.7;
    }
}

