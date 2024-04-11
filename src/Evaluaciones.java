import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double calificacionPelicula = 0;
        double mediaCalificaciones = 0;
        int totalEvaluciones = 0;
        while (calificacionPelicula != -1) {
            System.out.println("Escrible la calificación que le das a Todos los perros van al cielo");
            calificacionPelicula = scanner.nextDouble();
            if (calificacionPelicula != -1){
                mediaCalificaciones += calificacionPelicula;
                totalEvaluciones++;
            }
        }
        System.out.println("La media de calificaciones de la pelicula Todos los perros van al cielo es: " + mediaCalificaciones / totalEvaluciones);
    }
}