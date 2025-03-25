package BuilderN1;

import BuilderN1.PizzaBuilder;
import BuilderN1.PizzaConfiguratorBuilder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder builder = new PizzaConfiguratorBuilder();
        MestrePizze mestre = new MestrePizze(builder);

        Pizza hawaiana = mestre.makeHawaiianPizza();
        System.out.println(hawaiana);

        Pizza vegetarian = mestre.makeVegetarianPizza();
        System.out.println(vegetarian);
    }
}