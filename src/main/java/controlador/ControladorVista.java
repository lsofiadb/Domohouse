
package controlador;

import java.util.ArrayList;
import vista.VistaPrincipal;

public class ControladorVista {
    public void crearVistaPrincipal(ArrayList personas, ArrayList pisos) throws Exception{
        VistaPrincipal v = new VistaPrincipal();
        v.setPersonas(personas);
        v.setPisos(pisos);
    }
    public void temporal() throws Exception{
        VistaPrincipal v = new VistaPrincipal();
    }
}
