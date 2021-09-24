package modelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class BuscadorRuta<T extends NodoHabitacion> {

    private PlanoPiso<T> planoPiso;
    private GeneradorDistancia<T> generadorDistanciaSiguienteNodo;
    private GeneradorDistancia<T> generadorDistanciaNodoObjetivo;

    public ArrayList<T> buscadorRuta(T nodoOrigen, T nodoDestino) {
        Queue<RutaNodos> colaPrioridad = new PriorityQueue<>();
        Map<T, RutaNodos<T>> mapaNodos = new HashMap<>();

        RutaNodos<T> nodoInicial = new RutaNodos<>(nodoOrigen, null, 0d, generadorDistanciaNodoObjetivo.generarDistancia(nodoOrigen, nodoDestino));
        colaPrioridad.add(nodoInicial);
        mapaNodos.put(nodoOrigen, nodoInicial);

        while (!colaPrioridad.isEmpty()) {
            RutaNodos<T> siguienteRuta = colaPrioridad.poll();
            if (siguienteRuta.getNodoActual().equals(nodoDestino)) {
                ArrayList<T> ruta = new ArrayList<T>();
                RutaNodos<T> actual = siguienteRuta;
                do {
                    ruta.add(0, actual.getNodoActual());
                    actual = mapaNodos.get(actual.getNodoAnterior());
                } while (actual != null);
                return ruta;
            }
            planoPiso.getConnections(siguienteRuta.getNodoActual()).forEach(coneccion -> {
                RutaNodos<T> nodoSiguiente = mapaNodos.getOrDefault(coneccion, new RutaNodos<>(coneccion));
                mapaNodos.put(coneccion, nodoSiguiente);

                double nuevaDistancia = siguienteRuta.getDistanciaRuta() + generadorDistanciaSiguienteNodo.generarDistancia(siguienteRuta.getNodoActual(), coneccion);
                if (nuevaDistancia < nodoSiguiente.getDistanciaRuta()) {
                    nodoSiguiente.setNodoAnterior(siguienteRuta.getNodoActual());
                    nodoSiguiente.setDistanciaRuta(nuevaDistancia);
                    nodoSiguiente.setDistanciaEstimada(nuevaDistancia + generadorDistanciaNodoObjetivo.generarDistancia(coneccion, nodoDestino));
                    colaPrioridad.add(nodoSiguiente);
                }
            });
        }
        throw new IllegalStateException("No route found");
    }
}
