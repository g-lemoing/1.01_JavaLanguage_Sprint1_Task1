package nivell2.java.com.main;
import nivell2.java.com.modules.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCreem una instància de Smartphone smartphone1.");
        Smartphone smartphone1 = new Smartphone("Samsung", "A52");
        System.out.println("S'ha creat el smartphone " + smartphone1.toString());
        System.out.println("\nInvoquem al mètode trucar() amb paràmetre '123456789'.");
        smartphone1.trucar("123456789");
        System.out.println("\nInvoquem el seu mètode fotografiar():");
        smartphone1.fotografiar();
        System.out.println("\nInvoquem el seu mètode alarma():");
        smartphone1.alarma();
    }
}
