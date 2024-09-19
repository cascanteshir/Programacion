import java.util.*;

public class EjerciciosArrayList{

    public EjerciciosArrayList(){

    }

    public ArrayList<Integer> ArrayList25(){

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for(int i = 0; i < 25; i++){
            numeros.add((int)(Math.random() * 100));
        }

        System.out.println("Arreglo números aleatorios: ");
        imprimirArregloInt(numeros);

        numeros.sort(null);
        System.out.println("Arreglo números ordenados: ");

        imprimirArregloInt(numeros);
        
        return numeros;
    }

    public ArrayList<Integer> ArrayList20(){

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++){
            numeros.add((int)(Math.random() * 100));
        }

        System.out.println("Arreglo números aleatorios: ");
        imprimirArregloInt(numeros);

        return numeros;
    }

    public void sumaYPromedio(ArrayList<Integer> arreglo){
        float suma = 0;

        for(int i = 0; i < arreglo.size(); i++){
            suma += arreglo.get(i);
        }

        float promedio = suma / arreglo.size();

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El promedio del arreglo es: " + promedio);

    }

    public void arrayList10Char(){

        ArrayList<Character> caracteres = new ArrayList<Character>();

        caracteres.add('a');
        caracteres.add('b');
        caracteres.add('c');
        caracteres.add('d');
        caracteres.add('e');
        caracteres.add('f');
        caracteres.add('g');
        caracteres.add('h');
        caracteres.add('i');
        caracteres.add('j');

        System.out.println("Arreglo original: ");
        imprimirArregloChar(caracteres);
        
        System.out.println("Arreglo reverso: ");
        imprimirArregloCharAlReves(caracteres);
    }


    
    public void solicitarNumeros(ArrayList<Integer> arreglo){

        Scanner escaner = new Scanner(System.in);
        boolean continuar = true;
    
        while(continuar){
            System.out.println("Ingrese un número que desee agregar");
            int numero = escaner.nextInt();
            escaner.nextLine(); 
    
            if(arreglo.contains(numero)){
                System.out.println("El número ya está en el arreglo. No se insertó.");
            } else {
                arreglo.add(numero);
            }
    
            imprimirArregloInt(arreglo);

            String siNo = "";
    
            while(!siNo.equals("S") && !siNo.equals("N")){
    
                System.out.println("¿Desea insertar otro? S/N");
                siNo = escaner.nextLine();
    
                if(!siNo.equals("S") && !siNo.equals("N")){
                    System.out.println("Digite S o N");
                }
            } 

            if(siNo.equals("S")){
                continuar = true;
            } else if(siNo.equals("N")){
                continuar = false;
            }
            imprimirArregloInt(arreglo);
        }
    }
    

    //imprimir ArrayList
    public void imprimirArregloInt(ArrayList<Integer> arreglo){

        for(int j =0; j < arreglo.size(); j++){
            System.out.print(arreglo.get(j) + " ");
        }
        System.out.println("");
    }
    public void imprimirArregloChar(ArrayList<Character> arreglo){

        for(int j =0; j < arreglo.size(); j++){
            System.out.print(arreglo.get(j) + " ");
        }
        System.out.println("");
    }
    //Imprimir al revés
    public void imprimirArregloCharAlReves(ArrayList<Character> arreglo){

        for(int j = arreglo.size() - 1; j >= 0; j--){
            System.out.print(arreglo.get(j) + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        EjerciciosArrayList ejercicio1 = new EjerciciosArrayList();

        //Escriba un programa que inserte 25 números aleatorios entre 0 y 100, los inserte
        //en un ArrayList y los ordene
        //Calcule la suma y el promedio (en punto flotante) de los elementos
        ArrayList<Integer> arreglo25 = ejercicio1.ArrayList25();
        ejercicio1.sumaYPromedio(arreglo25);

        //Escriba un programa que cree un ArrayList con 10 caracteres (char) luego cree un
        //segundo ArrayList de manera que contenga una copia del primero, pero en orden
        //inverso a como fue creado
        ejercicio1.arrayList10Char();

        //Cree un programa que contenga un ArrayList de 20 números enteros (aleatorios
        //entre 0 y 100)
        //Su programa debe de solicitar m´as n´umeros al usuario para insertarlos, pero no
        //debe de insertar los que ya est´an presentes en el array, sino que debe notificar al
        //usuario que el valor est´a duplicado y no insertarlo
        ArrayList<Integer> arreglo20 = ejercicio1.ArrayList20();
        ejercicio1.solicitarNumeros(arreglo20);




    }
}



    


    



