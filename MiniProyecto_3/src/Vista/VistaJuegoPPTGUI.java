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
}
