import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calificacionPelicula = 0;
        double mediaCalificaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Cual es la nota que le das a película Todos los perros van a el cielo");
            calificacionPelicula = scanner.nextDouble();
            mediaCalificaciones = mediaCalificaciones + calificacionPelicula;
        }
        System.out.println("La media de calificaciones para Todos los perros van al cielo es: " + mediaCalificaciones/3);
    }
}
