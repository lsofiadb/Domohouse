package modelo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Luz {

    private Boolean estado=false;
    private JButton btnLuz;
    private ImageIcon imgLuzEncendida = new ImageIcon("src/main/java/imagenes/encendida.png");
    private ImageIcon imgLuzApagada = new ImageIcon("src/main/java/imagenes/apagada.png");
    
    
    public Luz(JButton btnLuz) {
       this.btnLuz = btnLuz;
       this.btnLuz.setIcon(imgLuzApagada);
    }
    
    public void cambiarEstado(){
        
         if(this.estado==false){
               btnLuz.setIcon(imgLuzEncendida);
               this.setEstado(true);
            }else{
                btnLuz.setIcon(imgLuzApagada);
                this.setEstado(false);
            }
    }
    
    //getters y setters
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
