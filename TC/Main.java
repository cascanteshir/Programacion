public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;

        lista.insertarAlFinal(numero1);
        lista.imprimirLista();
        lista.insertarAlFinal(numero2);
        lista.imprimirLista();
        lista.insertarAlFinal(numero3);
        lista.imprimirLista();
        lista.insertarAlFinal(numero4);
        lista.imprimirLista();

        if(lista.buscar(3)){
            System.out.println("El número está en la lisra");
        }
        else{
            System.out.println("El número NO está en la lisra");

        }
    }
}