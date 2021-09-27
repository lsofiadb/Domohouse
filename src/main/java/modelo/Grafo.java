package modelo;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Grafo <T extends NodoGrafo>{
    //colecciones
    private  Set<T> nodosHabitaciones;
    //Nodos incidentes a la habitacion
    private  Map<String, Set<String>> aristasHabitaciones;

    public Grafo(Set<T> nodosHabitaciones, Map<String, Set<String>> aristasHabitaciones) {
        this.nodosHabitaciones = nodosHabitaciones;
        this.aristasHabitaciones = aristasHabitaciones;
    }
    
    
    
    public T getNodoHabitacion(String id) {
        return nodosHabitaciones.stream()
            .filter(node -> node.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("No se encontro el nodo con ese ID"));
    }
    public Set<T> getConnections(T node) {
        return aristasHabitaciones.get(node.getId()).stream()
            .map(this::getNodoHabitacion)
            .collect(Collectors.toSet());
    }
    
}
