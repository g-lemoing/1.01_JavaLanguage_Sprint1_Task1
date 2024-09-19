package nivell1.exercise2.java.com.modules;

public class Car {
    private static final String BRAND = "Fiat";
    private static String model = "Ducato";
    private final int HORSEPOWER;

    public Car (int horsePower){
        this.HORSEPOWER = horsePower;
    }

    public int getHORSEPOWER() {
        return HORSEPOWER;
    }

    public static String getBRAND() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant.");
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant.");
    }

    public String toString(){
        return "Marca: " + BRAND + ", model: " + model + "Potència: " + HORSEPOWER;
    }
}

