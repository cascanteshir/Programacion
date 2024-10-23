public class Nodo{

    int dato;
    Nodo siguienteNodo;

    public Nodo(int dato) {
        this.dato = dato;
        siguienteNodo = null;
    }

    public void setNodoSiguiente(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public Nodo getNodoSiguiente() {
        return siguienteNodo;
    }

    public int getDato() {
        return dato;
    }
}