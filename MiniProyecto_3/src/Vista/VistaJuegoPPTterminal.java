package Vista;

import java.util.Scanner;

// Interfaz de usuario en terminal para el juego de Piedra, Papel, Tijeras (PPT) con los elementos Fuego, Agua y Aire.
public class VistaJuegoPPTterminal {
    
    // Scanner para capturar la elección del jugador desde la terminal
    private Scanner eleccion_del_Jugador;

    /*
    - Constructor de la clase VistaJuegoPPTterminal.
    - Inicializa el Scanner para leer la entrada del jugador.
    */

    public VistaJuegoPPTterminal() {
        eleccion_del_Jugador = new Scanner(System.in);
    }

    /*
    - Método para capturar la elección del jugador.
    - Muestra un menú en la terminal y lee la elección del jugador.
    */

    public String jugador_elije() throws OpcionNoValidaException {
        System.out.println("---------------------");
        System.out.println("|     BIENVENIDO    |");
        System.out.println("---------------------");
        System.out.println("| Elige un elemento |");
        System.out.println("|       Fuego       |");
        System.out.println("|       Agua        |");
        System.out.println("|       Aire        |");
        System.out.println("---------------------");

        String eleccion = eleccion_del_Jugador.nextLine();

        if (!eleccion.equalsIgnoreCase("Fuego") &&
            !eleccion.equalsIgnoreCase("Agua") &&
            !eleccion.equalsIgnoreCase("Aire")) {
            throw new OpcionNoValidaException("El elemento es inválido, No enojes a los Dioses.");
        }    
        return eleccion;
    }
}
