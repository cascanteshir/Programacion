public class Main{
    public static void main(String[] args){
        
        Carta carta = new Carta();
        
        String[] baraja = carta.generarBaraja();
        String[] cartas = carta.repartir(baraja);
        
        for(int i = 0; i < 5; i++){
            System.out.println(cartas[i]);
        }
    }
}
