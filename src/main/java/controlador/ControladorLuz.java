package controlador;

import java.util.ArrayList;
import modelo.Luz;

public class ControladorLuz {
    
    public ArrayList crearLuces(int cantidadLuces){
        ArrayList <Luz> arrayLuces= new ArrayList();
        for(int i=0; i<cantidadLuces; i++){
            Luz nuevaLuz= new Luz(false);
            arrayLuces.add(nuevaLuz);
        }
        return arrayLuces;
    }
}
