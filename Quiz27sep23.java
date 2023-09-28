public class Quiz27sep23 {

    public static void main(String[] args) {
        // Declaramos las variables
        String name;
        int vida;
        int fuerza;
        int inteligencia;

        // Leemos los datos del usuario
        name = System.console().readLine("Introduce el nombre de tu personaje: ");
        vida = Integer.parseInt(System.console().readLine("Introduce la vida de tu personaje: "));
        fuerza = Integer.parseInt(System.console().readLine("Introduce la fuerza de tu personaje: "));
        inteligencia = Integer.parseInt(System.console().readLine("Introduce la inteligencia de tu personaje: "));

        // Llamamos al método
        Personaje(name, vida, fuerza, inteligencia);
    }

    public static void Personaje(String name, int vida, int fuerza, int inteligencia) {
        // Imprimimos los datos del personaje
        System.out.println("Tu personaje se llama " + name + " y posee los siguientes atributos: vida = " + vida + ", fuerza = " + fuerza + ", inteligencia = " + inteligencia);
    }
}
