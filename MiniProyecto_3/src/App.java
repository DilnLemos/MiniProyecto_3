import Modelo.JuegoPPT;
import Vista.VistaJuegoPPTGUI;
import Vista.VistaJuegoPPTterminal;
import Controlador.Controlador;

import javax.swing.*;

/*
- Clase App.
- Punto de entrada de la aplicación que permite al usuario elegir entre la interfaz de usuario basada en terminal o GUI.
*/
public class App {

    // Controlador que maneja la lógica del juego
    public static Controlador controlador;

    // Método principal de la aplicación.
    public static void main(String[] args) throws Exception {
        
        // Instancia del juego
        JuegoPPT juego = new JuegoPPT();
        
        // Instancias de las vistas
        VistaJuegoPPTterminal vista_terminal = new VistaJuegoPPTterminal();
        VistaJuegoPPTGUI vista_GUI = new VistaJuegoPPTGUI();

        // Opciones para el modo de juego
        String[] opciones = {"Terminal", "GUI"};
        
        // Muestra un cuadro de diálogo para elegir el modo de juego
        int opcion = JOptionPane.showOptionDialog(null, "Elige como te quieres enfrentar", "Modo de Juego",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        // Según la opción seleccionada, inicializa el controlador con la vista correspondiente
        if (opcion == 0) {
            controlador = new Controlador(juego, vista_terminal);
            controlador.iniciar_terminal();
        } else if (opcion == 1) {
            controlador = new Controlador(juego, vista_GUI);
        }
    }
}