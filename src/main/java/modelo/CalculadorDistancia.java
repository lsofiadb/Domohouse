
package modelo;

public class CalculadorDistancia implements GeneradorDistancia<NodoHabitacion>{
    
    @Override
    public double generarDistancia(NodoHabitacion nodoOrigen, NodoHabitacion nodoDestino) {
        double distancia = 0;
        int parentX=0;
        int parentY=0;
        parentX = (int) Math.pow(nodoDestino.getPosX() - nodoOrigen.getPosX(), 2);
        parentY = (int) Math.pow(nodoDestino.getPosY() - nodoOrigen.getPosY(), 2);
        distancia = Math.sqrt(parentX + parentY);
    return distancia; 
    }
    
}
