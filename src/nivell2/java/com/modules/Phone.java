package nivell2.java.com.modules;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String toString(){
        return "Marca: " + brand + ", Model: " + model;
    }

    public void trucar(String phoneNr){
        System.out.println("S'està trucant al número " + phoneNr + ".");
    }
}

