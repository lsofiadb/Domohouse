package domohouse;

import modelo.PlanoPiso;
import vista.Menu;

public class Domohouse {

    public static void main(String[] args) throws Exception {
        //Run
        Menu run = new Menu ();
        run.setVisible(true);
        PlanoPiso p = new PlanoPiso();
        p.creacionPiso1();
        p.encontrarRuta();
        
    }
    
}
