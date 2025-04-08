package ObserverN2;


import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Observable {
 private final List<Observer> subscribeAgencies;
 private String currentMarketStatus;

    public StockExchange() {
        this.subscribeAgencies = new ArrayList<>();
    }


    @Override
    public void subscribe(Observer observer) {
        subscribeAgencies.add(observer);

    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribeAgencies.remove(observer);

    }

    @Override
    public void notifyObservers(String marketStatus) {

        for(Observer agency : subscribeAgencies){
            agency.onStockMarketUpdate(marketStatus);
        }

    }

    public void updateMarketStatus(String newStatus){
        this.currentMarketStatus = newStatus;
        System.out.println("\n[StockExchange] Estado actualizado: " + currentMarketStatus);
        notifyObservers(currentMarketStatus);

    }

    public String getCurrentMarketStatus() {
        return currentMarketStatus;
    }
}
