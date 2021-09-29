package controlador;

import java.util.ArrayList;
import javax.swing.JButton;
import modelo.Piso;


public class ControladorPiso {
   
    public Piso crearPiso1(JButton btn1, JButton btn2, JButton btn3, JButton btn4){
        Piso nuevoPiso1=new Piso();
        nuevoPiso1.crearPiso1(btn1, btn2, btn3, btn4);
        return nuevoPiso1;
    }
}
