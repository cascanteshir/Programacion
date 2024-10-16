public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.insertarAlFinal(1);
        lista.imprimirLista();
        lista.insertarAlFinal(2);
        lista.imprimirLista();
        lista.insertarAlFinal(3);
        lista.imprimirLista();
        lista.insertarAlFinal(4);
        lista.imprimirLista();
        lista.insertarAlFinal(5);
        lista.imprimirLista();
        lista.insertarAlFinal(6);
        lista.imprimirLista();

        if(lista.buscar(8)){
            System.out.println("El número está en la lista");
        }
        else{
            System.out.println("El número NO está en la lista");

        }
    }
}