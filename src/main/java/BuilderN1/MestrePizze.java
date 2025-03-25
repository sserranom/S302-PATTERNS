package BuilderN1;

public class MestrePizze {
    private PizzaBuilder pizzaBuilder;

    public MestrePizze(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

        public Pizza makeHawaiianPizza(){
        return pizzaBuilder.setType("Hawaiian")
                .setSize("median")
                .setDough("slim")
                .addTopping("pineapple")
                .addTopping("ham")
                .addTopping("cheese")
                .build();
        }

        public Pizza makeVegetarianPizza(){
        return pizzaBuilder.setType("Vegetarian")
                .setSize("big")
                .setDough("Thin crust or regula")
                .addTopping("Bell peppers")
                .addTopping("Onions")
                .addTopping("Mushrooms")
                .addTopping("Black olives")
                .addTopping("Cherry tomatoes")
                .addTopping("Spinach")
                .addTopping("Zucchini")
                .addTopping("Artichokes")
                .build();
        }
}
