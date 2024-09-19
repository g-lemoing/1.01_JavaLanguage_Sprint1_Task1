package nivell1.exercise1.java.com.modules;

public abstract class Instrument {
    private String name;
    private double price;

    Instrument (String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void tocar();

    static {
        System.out.println("La classe Instrument està carregada.");
    }
}

