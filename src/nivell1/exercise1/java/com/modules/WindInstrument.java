package nivell1.exercise1.java.com.modules;

public class WindInstrument extends Instrument{
    public static String instrType;

    public WindInstrument (String name, double price){
        super(name, price);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de vent.");
    }

    static {
        System.out.println("La classe WindInstrument està carregada.");
        WindInstrument.instrType = "Vent";
    }
}
