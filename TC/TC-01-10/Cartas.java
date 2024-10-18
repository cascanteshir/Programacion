/**
Implemente el juego 21 que tiene un naipe (baraja de 52 cartas), los valores de las cartas van de 1 a 10 y 
las especiales J Q  K valen 10 y por simplicidad la A vale 1.

El juego consiste en barajar las cartas, repartir 2 al jugador y 1 a la casa. Al recibir las dos cartas el jugador
puede escoger si quiere otra carta o no.  El mazo debe permitir barajar las cartas, sacar una a una las cartas del mazo. 
Las cartas deben poder retornar su valor.  

Si la casa tiene un puntaje menor o igual a 16 debe pedir otra carta, si su puntaje es mayor a 16, la casa no puede pedir más.

Puntajes de las cartas:
A =  1
2 - 10 = tiene el valor de la carta
J - K = 10

El ganador es el jugador que obtenga una puntuación de 21 o el que tenga la puntuación más cercana a 21. Si la suma de las cartas
es mayor que 21 pierde el juego.
 */

public class Cartas {
    
    String[] palos = {"espadas", "corazones", "diamantes", "tréboles"};
    String[] cartas = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] baraja = new String[52];

    public Cartas(){

    }

    public String[] crearBaraja(){

        int contador = 0;
        
        for(int valor = 0; valor < 13; valor++){
            for(int palo = 0; palo < 4; palo++){
                baraja[contador] = cartas[valor] + " " + palos[palo];
                contador++;
            }
        }
        return baraja;
    }

    public void imprimirBaraja(String[] baraja){
        for(int i = 0; i < 52; i++){
            System.out.println(baraja[i]);
        }
        System.out.println("\n");
    }

    

    public String[] barajar(String[] baraja){

        for(int i = 0; i < 52; i++){
            int inicio = 0;
            int fin = 51;
        
            while (inicio < fin){
    
                String temp = baraja[inicio];
                baraja[inicio] = baraja[fin];
                baraja[fin] = temp;
        
                inicio+= i;
                fin-= i;
            }
        }
        
        return(baraja);
    }
}
