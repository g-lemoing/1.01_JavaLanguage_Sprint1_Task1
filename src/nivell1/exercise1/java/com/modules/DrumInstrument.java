package nivell1.exercise1.java.com.modules;

public class DrumInstrument extends Instrument{
    public static String instrType;

    public DrumInstrument (String name, double price){
        super(name, price);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de percussió.");
    }

    static {
        DrumInstrument.instrType = "Percussió";
        System.out.println("La classe DrumInstrument està carregada.");
    }
}

