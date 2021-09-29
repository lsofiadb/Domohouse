package modelo;
public class Puerta {

    private Boolean estado;
    
    //Constructor
    public Puerta(Boolean estado) {
        this.estado = estado;
    }
    
    //getters y setters

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
