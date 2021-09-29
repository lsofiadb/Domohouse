package modelo;

import java.util.ArrayList;
import javax.swing.JButton;

public class Piso {
    private ArrayList <Luz> luces;
    //constructor
    
    
    public void crearPiso1(JButton btn1, JButton btn2, JButton btn3, JButton btn4){
        luces = new ArrayList();
        luces.add(new Luz(btn1));
        luces.add(new Luz(btn2));
        luces.add(new Luz(btn3));
        luces.add(new Luz(btn4));
    }
    
    //getters y setters
    public ArrayList<Luz> getLuces() {
        return luces;
    }

    public void setLuces(ArrayList<Luz> luces) {
        this.luces = luces;
    }
    
}
