
package controlador;

import java.util.ArrayList;
import vista.VistaPrincipal;

public class ControladorVista {
    public void crearVistaPrincipal(ArrayList personas, ArrayList pisos){
        VistaPrincipal v = new VistaPrincipal();
        v.setPersonas(personas);
        v.setPisos(pisos);
    }
    public void temporal(){
        VistaPrincipal v = new VistaPrincipal();
    }
}
