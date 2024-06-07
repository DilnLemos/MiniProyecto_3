package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.JuegoPPT;
import Vista.OpcionNoValidaException;
import Vista.VistaJuegoPPTGUI;
import Vista.VistaJuegoPPTterminal;

/*
- Clase Controlador.
- Maneja la lógica del juego y la interacción entre el modelo (JuegoPPT) y las vistas (VistaJuegoPPTterminal y VistaJuegoPPTGUI).
*/
public class Controlador implements ActionListener {
    
    // Instancia del juego
    private JuegoPPT juego;
    
    // Vista del juego basada en terminal
    private VistaJuegoPPTterminal vista_terminal;
    
    // Vista del juego basada en GUI
    private VistaJuegoPPTGUI vista_GUI;

    // Constructor de la clase Controlador para la vista basada en terminal.

    public Controlador(JuegoPPT juego, VistaJuegoPPTterminal vista_terminal) {
        this.juego = juego;
        this.vista_terminal = vista_terminal;
    }

    // Constructor de la clase Controlador para la vista basada en GUI.

    public Controlador(JuegoPPT juego, VistaJuegoPPTGUI vista_GUI) {
        this.juego = juego;
        this.vista_GUI = vista_GUI;
        this.vista_GUI.setControlador(this);
    }

    /*
    - Método para iniciar el juego en la terminal.
    - Contiene el ciclo principal del juego, manejando la lógica de interacción y repetición del juego.
    */
    public void iniciar_terminal() {
        boolean jugar = true;

        while (jugar) {
            String elemento_del_jugador = null;
            boolean elemento_valido = false;
            while (!elemento_valido) {
                try {
                    elemento_del_jugador = vista_terminal.jugador_elije();
                    elemento_valido = true;
                } catch (OpcionNoValidaException e) {
                    vista_terminal.mostrarMensajeError(e.getMessage());
                }
            }
            juego.setElemento_del_jugador(elemento_del_jugador);
            juego.jugar();
            vista_terminal.Mostrar_Ganandor(juego.getElemento_del_jugador(), juego.getElemento_de_la_maquina(), juego.getGanador());
            jugar = vista_terminal.Volver_A_Jugar();
        }
        vista_terminal.cerrar();
    }

    // Método que se ejecuta cuando se produce un evento de acción en la GUI.
    @Override
    public void actionPerformed(ActionEvent e) {
        String elemento_del_jugador = e.getActionCommand();
        juego.setElemento_del_jugador(elemento_del_jugador);
        juego.jugar();
        vista_GUI.Mostrar_Ganandor(juego.getElemento_del_jugador(), juego.getElemento_de_la_maquina(), juego.getGanador());
    }
}
