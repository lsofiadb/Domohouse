package controlador;

import java.util.ArrayList;
import modelo.Piso;


public class ControladorPiso {
   
    public Piso crearPiso(ArrayList arrayLuces, ArrayList arrayPuertas ){
        Piso nuevoPiso=new Piso(arrayLuces, arrayPuertas);
        return nuevoPiso;
    }
}
