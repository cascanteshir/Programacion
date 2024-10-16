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
