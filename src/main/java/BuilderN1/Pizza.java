package BuilderN1;

import java.util.List;

public class Pizza {
    private String type;
    private String size;
    private String dough;
    private List<String> toppings;

    public Pizza() {
    }

    public Pizza(String type, String size, List<String> toppings, String dough) {
        this.type = type;
        this.size = size;
        this.toppings = toppings;
        this.dough = dough;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return  "\n***Type=" + type + "***" +
                "\n size=" + size +
                "\n dough=" + dough +
                "\n toppings=" + toppings + "\n" ;
    }
}
