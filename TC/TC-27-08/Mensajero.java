public class Mensajero {
    public static void main(String[] args) {
        Codificador codificador = new Codificador();
        codificador.solicitarFraseYNum();
        String palabra = codificador.codificar(codificador.frase, codificador.numero);
        System.out.println(palabra);
    }
}


/*
-5 porque su salida da primero un null
Entonces 95

Ingrese una frase
olla
Ingrese un número
66
nullo66l66l66a66
 */