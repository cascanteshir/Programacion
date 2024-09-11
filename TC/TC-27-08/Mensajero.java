public class Mensajero {
    public static void main(String[] args){
        Codificador codificador = new Codificador();

        codificador.solicitarFraseYNum();

        String palabra = codificador.codificar(codificador.frase, codificador.numero);
        System.out.println(palabra);
    }
}
