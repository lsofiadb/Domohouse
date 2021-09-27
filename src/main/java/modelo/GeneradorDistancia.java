
package modelo;

public interface GeneradorDistancia <T extends NodoGrafo>{
    double generarDistancia(T nodoOrigen, T nodoDestino);
}
