/**
 * Dada una lista enlazada y 2 posiciones n y m.
 * Invierta la lista enlazada, pero únicamente entre las posiciones n y m.
 */

 public class Main {
    public static void main(String[] args) {
        Lista list = new Lista();
        
        // Agregando elementos a la lista
        list.agregarAlFinal(1);
        list.agregarAlFinal(2);
        list.agregarAlFinal(3);
        list.agregarAlFinal(4);
        list.agregarAlFinal(5);
        
        // Imprimir la lista original
        System.out.println("Lista original:");
        list.printList();
        
        // Invertir la sección entre las posiciones 1 y 3
        list.invertirLista(1, 3);
        
        // Imprimir la lista después de la inversión
        System.out.println("\nLista después de invertir entre posiciones 1 y 3:");
        list.printList();
    }
}
