package modelo;

import controlador.ControladorPersona;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import vista.VistaPrincipal;

public class Persona implements Runnable {

    private int id;
    private String posActual;
    private PlanoPiso planoPiso;
    private JLabel imagenPersona;
    private Piso piso;
    //constructor

    public Persona(int id, String posActual, JLabel imagenPersona, Piso piso) throws Exception {
        this.id = id;
        this.posActual = posActual;
        this.imagenPersona = imagenPersona;
        this.planoPiso = new PlanoPiso();
        this.planoPiso.creacionPiso1();
        this.piso = piso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosActual() {
        return posActual;
    }

    public void setPosActual(String posActual) {
        this.posActual = posActual;
    }

    @Override
    public void run() {
        actualizarPosicion();
    }

    public void actualizarPosicion() {
        List<NodoHabitacion> ruta = new ArrayList();

        while (true) {
            int aleatorio = (int) (Math.random() * 4 + 1);
            String numero = String.valueOf(aleatorio);

            try {
                ruta = this.planoPiso.encontrarRuta2(this.getPosActual(), numero);

            } catch (Exception ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            

            for (int i = 0; i < ruta.size(); i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.imagenPersona.setBounds(ruta.get(i).getPosX(), ruta.get(i).getPosY(), 40, 40);

            }
            this.setPosActual(numero);
            int pos = Integer.parseInt(this.getPosActual());
            if(piso.getLuces().get(pos-1).getEstado()==false){ //encender la luz si esta apagada
                piso.getLuces().get(pos-1).cambiarEstado();
            }
            try {
                //  mihilo.stop();
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
