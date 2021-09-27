package modelo;

public class RutaNodos<T extends NodoGrafo> implements Comparable<RutaNodos> {

    private T nodoActual;
    private T nodoAnterior;
    private double distanciaRuta;
    private double distanciaEstimada;

    RutaNodos(T nodoActual) {
        this(nodoActual, null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    RutaNodos(T nodoActual, T nodoAnterior, double distanciaRuta, double distanciaEstimada) {
        this.nodoActual = nodoActual;
        this.nodoAnterior = nodoAnterior;
        this.distanciaRuta = distanciaRuta;
        this.distanciaEstimada = distanciaEstimada;
    }

    @Override
    public int compareTo(RutaNodos otraRuta) {
        if (this.distanciaEstimada > otraRuta.distanciaEstimada) {
            return 1;
        } else if (this.distanciaEstimada < otraRuta.distanciaEstimada) {
            return -1;
        } else {
            return 0;
        }
    }
    public T getNodoActual() {
        return nodoActual;
    }

    public T getNodoAnterior() {
        return nodoAnterior;
    }

    public double getDistanciaRuta() {
        return distanciaRuta;
    }

    public double getDistanciaEstimada() {
        return distanciaEstimada;
    }

    public void setNodoActual(T nodoActual) {
        this.nodoActual = nodoActual;
    }

    public void setNodoAnterior(T nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    public void setDistanciaRuta(double distanciaRuta) {
        this.distanciaRuta = distanciaRuta;
    }

    public void setDistanciaEstimada(double distanciaEstimada) {
        this.distanciaEstimada = distanciaEstimada;
    }
    

}
