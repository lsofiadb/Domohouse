package modelo;

import java.util.ArrayList;

public class Piso {
    private ArrayList <Luz> luces;
    private ArrayList <Puerta> puertas;
    
    //constructor
    public Piso(ArrayList<Luz> luces, ArrayList<Puerta> puertas) {
        this.luces = luces;
        this.puertas = puertas;
    }
    
    //getters y setters
    public ArrayList<Luz> getLuces() {
        return luces;
    }

    public void setLuces(ArrayList<Luz> luces) {
        this.luces = luces;
    }

    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }

    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }
    
}
