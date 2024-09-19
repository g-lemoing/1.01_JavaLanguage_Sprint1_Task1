package nivell1.exercise1.java.com.modules;

public class StringInstrument extends Instrument{
    public static String instrType;

    public StringInstrument (String name, double price){
        super(name, price);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de corda.");
    }

    static {
        System.out.println("La classe StringInstrument està carregada.");
        StringInstrument.instrType = "Corda";
    }
}


