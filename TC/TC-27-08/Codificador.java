import java.util.Scanner;

public class Codificador {
    String frase;
    int numero;
    String codigo;

    public void solicitarFraseYNum() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = escaner.nextLine();
        System.out.println("Ingrese un número");
        numero = escaner.nextInt();
        escaner.close();
    }

    public String codificar(String frase, int numero) {
        for (int i = 0; i < frase.length(); i++) {
            codigo += frase.charAt(i);
            codigo += numero;
        }
        return codigo;
    }
}
