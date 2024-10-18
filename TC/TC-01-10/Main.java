public class Main{

    public static void main(String[] args) {
        Cartas baraja = new Cartas();
        String[] baraja1 = baraja.crearBaraja();

        baraja.imprimirBaraja(baraja1);
        baraja.barajar(baraja1);
        baraja.imprimirBaraja();

    }
}