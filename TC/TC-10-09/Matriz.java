// Solicite 6 números al usuario y acomódelos en una matriz (array de dos dimensiones) de 2x3
// y usted da una 3x3, -5

import java.util.Scanner;

public class Matriz{

    private int[][] matriz;
    private int filas;
    private int columnas;

    //Constructor
    public Matriz(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
    }

    //Llenar matriz con valores ingresados
    public int[][] llenarMatriz(){

        Scanner escaner = new Scanner(System.in);

        matriz = new int[filas][columnas];

        for(int fil = 0; fil < filas; fil++){
            for(int col = 0; col < columnas; col++){
                System.out.println("Ingrese un número");
                matriz[fil][col] = escaner.nextInt();
            }
        }
        return matriz;
    }

    //Crear matriz identidad
    public int[][] crearMatrizIdentidad(){
        for(int fil = 0; fil < filas; fil++){
            for(int col = 0; col < columnas; col++){

                if(fil == col){
                    matriz[fil][col] = 1;
                }
                else{
                    matriz[fil][col] = 0;
                }

            }
        }
        return matriz;
    }

    //Imprimir matriz
    public void imprimirMatriz(){
        for(int fil = 0; fil < filas; fil++){
            for(int col = 0; col < columnas; col++){
                System.out.print(matriz[fil][col] + " ");
            }
            System.out.println("");
        }
    }

    //Determinar cuál de todas las entradas es menor
    public void determinarMenor(){
        int menor = Integer.MAX_VALUE;

        for(int fil = 0; fil < filas; fil++){
            for(int col = 0; col < columnas; col++){

                if(matriz[fil][col] < menor){
                    menor = matriz[fil][col];
                }
            }
        }
        System.out.println("El número menor es: " + menor);
    }

    //Calcular determinante de matriz 2x2
    public void calcularDeterminante(){

        if(filas > 2 || columnas >  2){
            System.out.println("La matriz debe ser 2x2");
        }
        else{
            int a = matriz[0][0] * matriz[1][1];
            int b = matriz[0][1] * matriz[1][0];

            int determinante = a - b;

            System.out.println("El determinante es: " + determinante);
        }
    }

    public static void main(String[] args) {
        
        Matriz matriz3dim = new Matriz(3, 3);

        matriz3dim.llenarMatriz();
        matriz3dim.imprimirMatriz();
        matriz3dim.determinarMenor();
        matriz3dim.calcularDeterminante();
        matriz3dim.crearMatrizIdentidad();
        matriz3dim.imprimirMatriz();

        Matriz matriz2dim = new Matriz(2, 2);
        matriz2dim.llenarMatriz();
        matriz2dim.imprimirMatriz();
        matriz2dim.determinarMenor();
        matriz2dim.calcularDeterminante();

    }


}
