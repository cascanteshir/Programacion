// 100

import java.util.Scanner;

public class Arreglo {

    public int[] crearArreglo() {
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int) (Math.random() * 100 + 1);
        }
        return arreglo;
    }

    public int[] sumarNum(int[] arreglo, int numero) {
        int[] arregloSumado = new int[10];

        for (int i = 0; i < 10; i++) {
            arregloSumado[i] = arreglo[i] + numero;
        }
        return arregloSumado;
    }

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        Arreglo objetoArreglo = new Arreglo();
        int[] arreglo = objetoArreglo.crearArreglo();

        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + ", ");
        }

        System.out.println("\nIngrese un numero");
        int numero = escaner.nextInt();
        int[] resultados = objetoArreglo.sumarNum(arreglo, numero);

        for (int i = 0; i < 10; i++) {
            System.out.print(resultados[i] + ", ");
        }
    }
}
