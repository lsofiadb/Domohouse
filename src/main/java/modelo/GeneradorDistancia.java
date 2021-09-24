
package modelo;

public interface GeneradorDistancia <T extends NodoHabitacion>{
    double generarDistancia(T nodoOrigen, T nodoDestino);
}
