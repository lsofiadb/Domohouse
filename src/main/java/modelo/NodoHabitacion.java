
package modelo;

public class NodoHabitacion implements NodoGrafo{
    //atributos
    private  String id;
    private  String name;
    private  int posX;
    private  int posY;
    
    //

    public NodoHabitacion(String id, String name, int posX, int posY) {
        this.id = id;
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
