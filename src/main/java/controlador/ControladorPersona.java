package controlador;

import modelo.Persona;

public class ControladorPersona {
    
    public Persona crearPersona(int id, int posX, int posY){
        Persona nuevaPersona = new Persona(id, posX, posY);
        return nuevaPersona;
    }
}
