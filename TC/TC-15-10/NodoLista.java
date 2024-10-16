public class NodoLista {

    private int dato;
    private NodoLista nodoSiguiente;

    public NodoLista(int datos) {
        this.dato = datos;
        nodoSiguiente = null;
    }

    public void setNodoSiguiente(NodoLista nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public NodoLista getNodoSiguiente() {
        return nodoSiguiente;
    }

    public int getDatos() {
        return dato;
    }
}

