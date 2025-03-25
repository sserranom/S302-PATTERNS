package BuilderN1;

public interface PizzaBuilder{
    PizzaBuilder setType(String type);
    PizzaBuilder setSize(String size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}
