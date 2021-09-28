package controlador;

import java.util.List;
import javax.swing.JLabel;
import modelo.NodoHabitacion;
import modelo.Persona;
import modelo.PlanoPiso;

public class ControladorPersona {
    
    public Persona crearPersona(int id, String posActual, JLabel imagenPersona) throws Exception{
        Persona nuevaPersona = new Persona(id, posActual, imagenPersona);
        return nuevaPersona;
    }
    public List <NodoHabitacion> consultarRuta(String origen, String destino) throws Exception{
        PlanoPiso p = new PlanoPiso();
        p.creacionPiso1();
       return p.encontrarRuta2(origen, destino);
    }
    
}
