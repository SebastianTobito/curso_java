import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de la película que buscas");
        String pelicula = scanner.nextLine();
        System.out.println("Dinos la fecha de lanzamiento");
        int fechaLanzamiento = scanner.nextInt();
        System.out.println("Dinos la calificacion de esta pelicula");
        double calificacionPelicula = scanner.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(calificacionPelicula);


  }
}