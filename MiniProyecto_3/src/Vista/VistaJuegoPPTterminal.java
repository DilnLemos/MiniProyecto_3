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


    // Método para mostrar el resultado del juego en la terminal.
    public void Mostrar_Ganandor(String eleccion_Jugador, String eleccion_maquina, String ganador) {
        System.out.println("---------------------");
        System.out.println("|     RESULTADO     |");
        System.out.println("---------------------");
        System.out.println("Jugador dios del " + eleccion_Jugador);
        System.out.println("Máquina dios del " + eleccion_maquina);
        System.out.println("Resultado: " + ganador);
        System.out.println("---------------------");
    }
    
    // Método para preguntar al jugador si quiere volver a jugar.
    public boolean Volver_A_Jugar() {
        System.out.println("¿Deseas enfrentarte de nuevo (s), cancelar toca cualquier tecla");
        String respuesta = eleccion_del_Jugador.nextLine();
        return respuesta.equalsIgnoreCase("s");
    }

    // Método para mostrar un mensaje de error en la terminal.
    public void mostrarMensajeError(String mensaje) {
        System.out.println(mensaje);
    }
    
    // Método para cerrar el Scanner y liberar los recursos.
    public void cerrar() {
        eleccion_del_Jugador.close();
    }
}