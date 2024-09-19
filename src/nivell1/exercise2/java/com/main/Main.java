package nivell1.exercise2.java.com.main;
import nivell1.exercise2.java.com.modules.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nInstanciem un cotxe car1 amb potència de 150 HP com a únic paràmetre.");
        System.out.println("Inicialitzem els atributs model i marca a nivell de classe.");
        System.out.println("La marca i la potència son finals, per tant no es podran modificar en l'objecte.");

        Car car1 = new Car( 150);
        System.out.println("El cotxe car1 té les característiques:" + car1.toString());

        System.out.println("\nInstanciem un cotxe car2 amb potència de 130 HP com a únic paràmetre.");
        Car car2 = new Car( 130);
        System.out.println("El cotxe car2 té les característiques --> " + car2.toString());

        System.out.println("\nSi modifiquem el model del cotxe a 'Punto', comprovem que aquest canvi afecta als dos cotxes.");
        Car.setModel("Punto");
        System.out.println("El cotxe car1 té les característiques --> " + car1.toString());
        System.out.println("El cotxe car2 té les característiques --> " + car2.toString());

        System.out.println("\nInvoquem el mètode static frenar() des de la classe: Car.frenar()");
        Car.frenar();

        System.out.println("\nInvoquem el mètode no static accelerar() des de la instància: car.accelerar()");
        car1.accelerar();

    }
}