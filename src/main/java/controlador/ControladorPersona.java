package controlador;

import java.util.List;
import modelo.NodoHabitacion;
import modelo.Persona;
import modelo.PlanoPiso;

public class ControladorPersona {
    
    public Persona crearPersona(int id, int posX, int posY){
        Persona nuevaPersona = new Persona(id, posX, posY);
        return nuevaPersona;
    }
    public List <NodoHabitacion> consultarRuta() throws Exception{
        PlanoPiso p = new PlanoPiso();
        p.creacionPiso1();
       return p.encontrarRuta2();
    }
}
