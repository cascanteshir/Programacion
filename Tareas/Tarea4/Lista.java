public class Lista {
    
    Nodo head; 

    //Método para agregar un nodo al final de la lista
    public void agregarAlFinal(int data) {

        Nodo nuevoNodo = new Nodo(data);

        if (head == null) {

            head = nuevoNodo;
        } else {

            Nodo actual = head;

            while (actual.siguienteNodo != null) {

                actual = actual.siguienteNodo;
            }
            actual.siguienteNodo = nuevoNodo;
        }
    }

    //Método para invertir la lista entre posiciones n y m
    public void invertirLista(int n, int m){

        if (n >= m || head == null) {
            return; 
        }

        Nodo pivote = new Nodo(0); // Nodo pivote para simplificar el manejo de la cabeza
        pivote.siguienteNodo = head;
        Nodo prev = pivote;

        // Encuentra el nodo antes de la posición n
        for (int i = 0; i < n; i++) {
            prev = prev.siguienteNodo;
        }

        Nodo actual = prev.siguienteNodo; // Primer nodo a invertir
        Nodo siguienteNodo = actual.siguienteNodo; // Nodo siguiente

        //Invertir entre n y m
        for (int i = 0; i < m - n; i++){

            actual.siguienteNodo = siguienteNodo.siguienteNodo; // Desconecta el nodo actual
            siguienteNodo.siguienteNodo = prev.siguienteNodo; // Mueve el nodo siguiente al frente de la sección invertida
            prev.siguienteNodo = siguienteNodo; // Reconecta el nodo anterior
            siguienteNodo = actual.siguienteNodo; // Avanza al siguiente nodo
            
        }

        head = pivote.siguienteNodo; // Actualiza la cabeza de la lista
    }

    //Imprimir la lista
    public void printList() {

        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguienteNodo;
        }
    }
}


