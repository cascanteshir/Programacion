
import java.util.Scanner;

public class Ejercicio1{

    public void contador(int[] arreglo, int numero){

        int veces = 0;

        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == numero){
                veces++;
            }
        }
        System.out.println("El número se repite " + veces + " veces.");
    }

    public void paresEImpares(int[] arreglo){

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < arreglo.length; i++){

            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Hay " + pares + " pares y " + impares + " impares en el arreglo");
    }

    public void resta(int[] arreglo){

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < arreglo.length; i++){

            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
            if(arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        int resta = mayor - menor;

        System.out.println("El resultado de la resta es: " + resta);
    }

    public void numerosPequenos(int[] arreglo){

        int primerPequeno = Integer.MAX_VALUE;
        int segundoPequeno = Integer.MAX_VALUE;

        for(int i = 0; i < arreglo.length; i++){

            if(arreglo[i] < primerPequeno){
                primerPequeno = arreglo[i];
            }
        }

        for(int j = 0; j < arreglo.length; j++){

            if(arreglo[j] < segundoPequeno){
                if(arreglo[j] > primerPequeno){
                    segundoPequeno = arreglo[j];
                }
            }
        }

        System.out.println("El número más pequeño es: " + primerPequeno);
        System.out.println("El segundo número más pequeño es: " + segundoPequeno);
    }

    public static void main(String[] args){
        
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Scanner escaner = new Scanner(System.in);

        int[] arreglo = {1, 6, 2, 8, 4, 9, 6, 5, 3, 3, 4, 7};
        System.out.println("Ingrese un número");
        int numero = escaner.nextInt();

        //Escriba un método en Java que reciba como parámetro un array y un número,
        //luego retorne cuántas veces dicho número aparece en el array
        ejercicio1.contador(arreglo, numero);


        //Escriba un programa en Java que imprima la cantidad de valores pares e impares
        //que tiene un array
        ejercicio1.paresEImpares(arreglo);

        //Escriba un programa en Java que obtenga la resta entre el número más grande y
        //el más pequeño de un array
        ejercicio1.resta(arreglo);

        //Escriba un programa que encuentre el número más pequeño y el segundo más
        //pequeño de un array
        ejercicio1.numerosPequenos(arreglo);

        
    }


}