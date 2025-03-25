package BuilderN1;

import java.util.ArrayList;
import java.util.List;

public class PizzaConfiguratorBuilder implements PizzaBuilder {
    private String type;
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    @Override
    public PizzaBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(type, size, toppings, dough);
    }
}
