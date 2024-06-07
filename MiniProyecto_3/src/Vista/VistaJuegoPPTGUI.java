package Vista;

import javax.swing.*;
//import Controlador.Controlador;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Representa la interfaz gráfica de usuario (GUI) para el juego de Piedra, Papel, Tijeras (PPT) con los elementos Fuego, Agua y Aire.

public class VistaJuegoPPTGUI extends JFrame {
    
    // Botones para seleccionar los elementos Fuego, Agua y Aire
    private JButton boton_fuego, boton_agua, boton_aire;
    
    // Etiqueta para mostrar el resultado del juego
    private JLabel etiqueta_resultado;

    /*
    - Constructor de la clase VistaJuegoPPTGUI.
    - Configura la ventana, crea los componentes GUI y los añade al contenedor.
    */
    public VistaJuegoPPTGUI() {
        super("Elemental Showdown"); // Título de la ventana

        // Inicialización de los botones
        boton_fuego = new JButton("Fuego");
        boton_agua = new JButton("Agua");
        boton_aire = new JButton("Aire");

        // Inicialización de la etiqueta de resultado
        etiqueta_resultado = new JLabel("Elige tu elemento");

        // Configuración del diseño de la ventana y adición de los componentes
        setLayout(new FlowLayout());
        add(boton_fuego);
        add(boton_agua);
        add(boton_aire);
        add(etiqueta_resultado);

        // Configuración de la ventana
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    // Método para establecer el controlador que manejará los eventos de los botones.

    // public void setControlador(Controlador controlador) {
    //     boton_fuego.addActionListener(controlador);
    //     boton_agua.addActionListener(controlador);
    //     boton_aire.addActionListener(controlador);
    // }

    // Método para mostrar el resultado del juego en la etiqueta de resultado.
    public void Mostrar_Ganandor(String eleccion_Jugador, String eleccion_maquina, String ganador) {
        String resultado =  "<html>---------------------<br>" +
                            "|     RESULTADO     |<br>" +
                            "---------------------<br>" +
                            "Jugador dios del: " + eleccion_Jugador + "<br>" +
                            "Máquina dios del: " + eleccion_maquina + "<br>" +
                            "Resultado: " + ganador + "<br>" +
                            "---------------------</html>";
        etiqueta_resultado.setText(resultado);
    }
}
