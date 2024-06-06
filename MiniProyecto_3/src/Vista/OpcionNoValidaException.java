package Vista;

/*
- Clase OpcionNoValidaException extiende de Exception.
- Representa una excepción personalizada que se lanza cuando se selecciona una opción no válida en el juego.
*/

public class OpcionNoValidaException extends Exception {

    /*
    - Constructor de la clase OpcionNoValidaException.
    - Llama al constructor de la superclase Exception con un mensaje específico.
    */
    
    public OpcionNoValidaException(String mensaje) {
        super(mensaje);
    }
}