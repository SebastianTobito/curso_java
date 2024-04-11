public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Master");
        System.out.println("Pelicula: Todos los perros van al cielo");

      int fechaDeLanzamiento = 1989;
      boolean incluidoEnElPlan = true;
      double calificacionPelicula = 9.3;

      double media = (9.3 + 8.1 + 6.5 )/ 3;

      int ranking = (int) media / 2;

        System.out.println(media);

        String sinopsis = """ 
                Los perros van al cielo es una enseñanza, 
                esta nos habla del amor de los perros a los niños,
                del gran corazón de estos y que al final de su vida estos se convierten en angeles 
                todo esto por su gran corazón puro.
                Esta fue lanzada en:  
                """ + fechaDeLanzamiento + """
                  tiene una calificacion de:  """
                + media;

        System.out.println(sinopsis);
        System.out.println(ranking);



    }
}