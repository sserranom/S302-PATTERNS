package ObserverN2;

public class StockBrokerAgency implements Observer{
    private final String agencyName;

    public StockBrokerAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void onStockMarketUpdate(String marketStatus) {
        System.out.println(" [" + agencyName + "] recibió actualización del mercado: " + marketStatus);
    }
}
