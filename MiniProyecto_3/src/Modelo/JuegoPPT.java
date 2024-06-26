package Modelo;

import java.util.Random;

/*
- Juego de Piedra, Papel, Tijeras (PPT) con los elementos Fuego, Agua y Aire.
- Esta clase maneja la lógica del juego, incluyendo la selección de elementos y la determinación del ganador.
*/

public class JuegoPPT {

    // Elemento seleccionado por el jugador
    private String elemento_del_jugador;

    // Elemento seleccionado por la máquina
    private String elemento_de_la_maquina;

    // Resultado del juego, indicando quién ganó
    private String ganador;

    // Generador de números aleatorios para seleccionar el elemento de la máquina
    private Random elemento_random;

    // Array de elementos posibles en el juego
    public String[] elementos = {"Fuego", "Agua", "Aire"};

    /*
    - Constructor de la clase JuegoPPT.
    - Inicializa el generador de números aleatorios.
     */

    public JuegoPPT() {
        elemento_random = new Random();
    }

    // Obtiene el elemento seleccionado por el jugador.
    public String getElemento_del_jugador() {
        return elemento_del_jugador;
    }

    // Establece el elemento seleccionado por el jugador.
    
    public void setElemento_del_jugador(String elemento_del_jugador) {
        this.elemento_del_jugador = elemento_del_jugador;
    }

    // Obtiene el elemento seleccionado por la máquina.
    public String getElemento_de_la_maquina() {
        return elemento_de_la_maquina;
    }

    // Establece el elemento seleccionado por la máquina.
    public void setElemento_de_la_maquina(String elemento_de_la_maquina) {
        this.elemento_de_la_maquina = elemento_de_la_maquina;
    }

    // Obtiene el resultado del juego.
    public String getGanador() {
        return ganador;
    }

    // Establece el resultado del juego.
    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    // Obtiene el array de elementos posibles en el juego.
    public String[] getElementos() {
        return elementos;
    }

    // Establece el array de elementos posibles en el juego.
    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

        // Ejecuta una ronda del juego, seleccionando aleatoriamente el elemento de la máquina
        public void jugar() {
            elemento_de_la_maquina = elementos[elemento_random.nextInt(elementos.length)];
            comparar_elementos();
        }
    
        /*
        Compara los elementos seleccionados por el jugador y la máquina para determinar el ganador.
        Las reglas son:
        - Fuego gana a Aire
        - Agua gana a Fuego
        - Aire gana a Agua
        - Si ambos eligen el mismo elemento, es un empate
        */
    
        private void comparar_elementos() {
            if (elemento_del_jugador.equalsIgnoreCase(elemento_de_la_maquina)) {
                ganador = "Empate";
            } else if ((elemento_del_jugador.equalsIgnoreCase("Fuego") && elemento_de_la_maquina.equalsIgnoreCase("Aire")) ||
                    (elemento_del_jugador.equalsIgnoreCase("Agua") && elemento_de_la_maquina.equalsIgnoreCase("Fuego")) ||
                    (elemento_del_jugador.equalsIgnoreCase("Aire") && elemento_de_la_maquina.equalsIgnoreCase("Agua"))) {
                ganador = "Ganaste";
            } else {
                ganador = "Perdiste";
            }
        }
}