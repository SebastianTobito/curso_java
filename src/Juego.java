import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(10);
        int numeroUsuario;

        System.out.println("ingresa un número");
        for (int numeroIntentos = 0; numeroIntentos < 5; numeroIntentos++) {
            numeroUsuario = scanner.nextInt();
            if (numeroSecreto < numeroUsuario) {
                System.out.println("El número secreto es menor");
            } else if (numeroSecreto > numeroUsuario) {
                System.out.println("El número secreto es mayor");
            } else {
                System.out.println("Felicidades acertaste el numero secreto");
                break;
            }
        }
    }
}
