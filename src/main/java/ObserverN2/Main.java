package ObserverN2;

public class Main {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        StockBrokerAgency agencySantander = new StockBrokerAgency("Santander Inversiones");
        StockBrokerAgency agencyBBVA = new StockBrokerAgency("BBVA Trading");
        StockBrokerAgency agencyCaixa = new StockBrokerAgency("Caixa Bolsa");


        stockExchange.subscribe(agencySantander);
        stockExchange.subscribe(agencyBBVA);
        stockExchange.subscribe(agencyCaixa);


        stockExchange.updateMarketStatus("El mercado sube por buenas noticias económicas.");
        stockExchange.updateMarketStatus("El mercado cae debido a tensiones geopolíticas.");


        stockExchange.unsubscribe(agencyBBVA);
        stockExchange.updateMarketStatus("El mercado se estabiliza tras la apertura de Wall Street.");
    }
}
