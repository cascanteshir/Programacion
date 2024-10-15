//Cree una lista enlazada de números enteros
//Cree un método "buscar" que recibe un int y retorna la posición en la lista
//donde está dicho entero 


public class Lista{

    private NodoLista primerNodo;
    private NodoLista ultimoNodo;

    public Lista(){
        primerNodo = ultimoNodo = null;
    }

    public boolean buscar(int numero){

        if(!estaVacia()){

            NodoLista actual = primerNodo;

            while (actual.getNodoSiguiente() != null) {

                if(actual.getDatos() == numero){
                    return true;
                }
                actual = actual.getNodoSiguiente();
            }
            
        }

        return false;

    }

    public void insertarAlFrente(int aInsertar) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(aInsertar);
        }
        else {
            NodoLista temporal = primerNodo;
            primerNodo = new NodoLista(aInsertar);
            primerNodo.setNodoSiguiente(temporal);
        }
    }

    public void insertarAlFinal(int aInsertar) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(aInsertar);
        }
        else {
            NodoLista nuevo = new NodoLista(aInsertar);
            ultimoNodo.setNodoSiguiente(nuevo);
            ultimoNodo = nuevo;
        }
    }

    public void removerDelFrente() {
        if (estaVacia()){
            System.out.println("La lista esta vacia");
        }else
        {
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            }
            else {
                primerNodo = primerNodo.getNodoSiguiente();
            }
        }
    }

    public void removerDelFinal() {

        if (estaVacia()){
            System.out.println("La lista esta vacia");
        }
        else {

            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            }
            else {
                NodoLista actual = primerNodo;
                while (actual.getNodoSiguiente() != ultimoNodo) {
                    actual = actual.getNodoSiguiente();
                }
                ultimoNodo = actual;
                actual.setNodoSiguiente(null);
            }
        }
    }
    
    public boolean estaVacia() {
        return primerNodo == null;
    }

    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        }
        else {
            NodoLista actual = primerNodo;

            while (actual != null) {
                System.out.printf("%s ", actual.getDatos());
                actual = actual.getNodoSiguiente();
            }
            System.out.println();
        }
    }
}