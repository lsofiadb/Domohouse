package modelo;

import static java.lang.Math.log;
import static java.rmi.server.LogStream.log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlanoPiso {

    private Grafo<NodoHabitacion> plano;
    private BuscadorRuta<NodoHabitacion> buscadorRuta;
    
    public PlanoPiso(){
        
    }
    
    public void creacionPiso1() throws Exception {
        Set<NodoHabitacion> nodosHabitaciones = new HashSet<>();
        Map<String, Set<String>> conecciones = new HashMap<>();
        //nodos piso 1
        //nodos principales habitaciones
        nodosHabitaciones.add(new NodoHabitacion ("1","bathroom",700, 100));
        nodosHabitaciones.add(new NodoHabitacion ("2","bedroom",740, 450));
        nodosHabitaciones.add(new NodoHabitacion ("3","living room",260, 410));
        nodosHabitaciones.add(new NodoHabitacion ("4","kitchen",450, 110));
        //nodos de relleno 
        nodosHabitaciones.add(new NodoHabitacion ("5","nodo 5",700, 250));
        nodosHabitaciones.add(new NodoHabitacion ("6","nodo 6",635, 290));
        nodosHabitaciones.add(new NodoHabitacion ("7","nodo 7",635, 370));
        nodosHabitaciones.add(new NodoHabitacion ("8","nodo 8",485, 290));
        nodosHabitaciones.add(new NodoHabitacion ("9","nodo 9",260, 290));
        nodosHabitaciones.add(new NodoHabitacion ("10","nodo 10",485, 190));
        
        //conecciones entre nodos
        //baño-bedroom
        conecciones.put("1", Stream.of("5").collect(Collectors.toSet()));
        conecciones.put("5", Stream.of("1","6").collect(Collectors.toSet()));
        conecciones.put("6", Stream.of("5","7","8").collect(Collectors.toSet()));
        conecciones.put("7", Stream.of("6","2").collect(Collectors.toSet()));
        conecciones.put("2", Stream.of("7").collect(Collectors.toSet()));
        
        //
        conecciones.put("8", Stream.of("6", "9","10").collect(Collectors.toSet()));
        conecciones.put("9", Stream.of("8", "3").collect(Collectors.toSet()));
        conecciones.put("3", Stream.of("9").collect(Collectors.toSet()));
        
        conecciones.put("10", Stream.of("8", "4").collect(Collectors.toSet()));
        conecciones.put("4", Stream.of("10").collect(Collectors.toSet()));
        
        plano = new Grafo<>(nodosHabitaciones, conecciones);
        buscadorRuta = new BuscadorRuta <>(plano, new CalculadorDistancia(), new CalculadorDistancia());
        
    }
    
    public void creacionPiso2() throws Exception {
        Set<NodoHabitacion> nodosHabitaciones = new HashSet<>();
        Map<String, Set<String>> conecciones = new HashMap<>();

    }
    
    public void creacionPiso3() throws Exception {
        Set<NodoHabitacion> nodosHabitaciones = new HashSet<>();
        Map<String, Set<String>> conecciones = new HashMap<>();

    }
    public void encontrarRuta() {
        List<NodoHabitacion> route = buscadorRuta.buscarRuta(plano.getNodoHabitacion("1"), plano.getNodoHabitacion("3"));
        System.out.println(route.stream().map(NodoHabitacion::getName).collect(Collectors.toList()));
    }
    public List<NodoHabitacion> encontrarRuta2(String origen, String destino) {
        List<NodoHabitacion> route = buscadorRuta.buscarRuta(plano.getNodoHabitacion(origen), plano.getNodoHabitacion(destino));
       return route;
    }
    
}

