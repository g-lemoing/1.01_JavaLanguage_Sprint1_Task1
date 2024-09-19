package nivell1.exercise1.java.com.main;
import nivell1.exercise1.java.com.modules.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nCreem una instància d'instrument de vent.");
        System.out.println("Comprobem que es carreguen la classe i la subclasse.\n");

        Instrument flute = new WindInstrument("Flauta",19.95);
        System.out.println("\nInvoquem el seu mètode tocar().");
        flute.tocar();

        System.out.println("\nCreem una instància d'instrument de corda.");
        System.out.println("Comprobem que només es carrega la subclasse ja que la classe Instrument ja està carregada.");

        StringInstrument guitar = new StringInstrument("Guitarra", 250.00);
        System.out.println("\nInvoquem el seu mètode tocar().");
        guitar.tocar();

        System.out.println("\nCarreguem la classe DrumInstrument accedint al seu membre estàtic DrumInstrument.instrType.");
        System.out.println("Comprovem que només es carrega la subclasse.");

        String tipo = DrumInstrument.instrType;
        System.out.println("\nCreem una instància d'instrument de percussió.");
        DrumInstrument drum = new DrumInstrument("Tambor", 99.00);
        System.out.println("Invoquem el seu mètode tocar().");

        drum.tocar();
    }
}
