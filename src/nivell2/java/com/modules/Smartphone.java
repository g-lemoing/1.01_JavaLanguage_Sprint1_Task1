package nivell2.java.com.modules;

public class Smartphone extends Phone implements Camera, Rellotge{
    public Smartphone(String brand, String model){
        super(brand, model);
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l’alarma.");
    }

    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto.");
    }
}

