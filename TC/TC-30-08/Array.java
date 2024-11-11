// 100

import java.util.Scanner;

public class Array {

    private int[] arreglo = new int[5];

    public void solicitarNumero() {
        Scanner escaner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número: ");
            arreglo[i] = escaner.nextInt();
        }
        escaner.close();
    }

    public void sumaTotal() {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.solicitarNumero();
        array.sumaTotal();
    }
}
