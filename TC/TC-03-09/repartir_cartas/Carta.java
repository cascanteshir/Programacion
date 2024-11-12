import java.lang.Math;

public class Carta {

    private String[] valores = { "A", "1", "2", "3", "4", "5", "6", "8", "9", "J", "Q", "K" };
    private String[] palos = { "Corazones", "Diamantes", "Treboles", "espadas" };

    public String[] generarBaraja() {
        String[] baraja = new String[52];
        int indice = 0;

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                baraja[indice] = valores[j] + " de " + palos[i];
                indice++;
            }
        }
        return baraja;
    }

    public String[] repartir(String[] baraja) {
        String[] cartas = new String[5];

        for (int i = 0; i < 5; i++) {
            int cartaRandom = (int) (Math.random() * 52 + 1);
            cartas[i] = baraja[cartaRandom];
        }
        return cartas;
    }
}
