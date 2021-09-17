package controlador;

import java.util.ArrayList;
import modelo.Puerta;

public class ControladorPuerta {
    
    public ArrayList crearPuertas(int cantidadPuertas) {
        ArrayList<Puerta> arrayPuertas = new ArrayList();
        for (int i = 0; i < cantidadPuertas; i++) {
            Puerta nuevaPuerta = new Puerta(false);
            arrayPuertas.add(nuevaPuerta);
        }
        return arrayPuertas;
    }
}
