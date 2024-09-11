public class Main {
    public static void main(String[] args) {
        
        Cuenta usuario1 = new Cuenta(1234, 100000);

        int retiro1 = usuario1.retirarDinero();
        System.out.println("El monto retirado es de: " + retiro1);

        int deposito1 = usuario1.deposit();
        System.out.println("Cantidad depositada: " +  deposito1);

        System.out.println("Su balance es de: " + usuario1.balance);
    }
}
