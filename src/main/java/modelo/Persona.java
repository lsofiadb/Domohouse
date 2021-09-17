package modelo;
public class Persona {
    private int id;
    private int posX, posY;
    
    //constructor
    public Persona(int id, int posX, int posY) {
        this.id = id;
        this.posX = posX;
        this.posY = posY;
    }
    
    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
}
