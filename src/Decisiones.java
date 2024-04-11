public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1989;
        boolean incluidoEnElPlan = true;
        double calificacionPelicula = 9.3;
        String tipoDePlan = "plus";


        if(fechaDeLanzamiento >= 2022){
            System.out.println("Películas más populares");
        }else{
            System.out.println("Película retro");
        }

        if(incluidoEnElPlan && tipoDePlan.equals("plus")){
            System.out.println("disfruta de tu película");
        }else{
            System.out.println("Lo sentimos no puede acceder a la película");
        }
    }
}

