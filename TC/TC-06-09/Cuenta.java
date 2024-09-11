import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuenta{

    int pin;
    int balance;

    public Cuenta(int pin, int balance){

        this.pin = pin;
        this.balance = balance;

    }

    public int retirarDinero(){
        Scanner escaner = new Scanner(System.in);

        int dineroRetirado = 0;

        boolean acceso = false;

        while(acceso == false){

            try{
                System.out.println("INGRESE SU PIN");
                int pinInput = escaner.nextInt();

                if(pinInput == pin){
                    System.out.println("ACCESO CONCEDIDO");
                    acceso = true;
                }
                else{
                    System.out.println("PIN INCORRECTO");
                }
            }
            catch(InputMismatchException e){

                System.out.println("DEBE SER UN NÚMERO DE 4 DÍGITOS");

            }
        }

        

        while(dineroRetirado == 0){
            try{
                System.out.println("INGRESE EL MONTO QUE DESEA RETIRAR");
                int montoARetirar = escaner.nextInt();

                if(montoARetirar > balance){
                    System.out.println("NO TIENE SUFICIENTES FONDOS");
                }
                else{
        
                    dineroRetirado = montoARetirar;
                }
            }
            catch(InputMismatchException e){
                System.out.println("INGRESE UN NÚMERO VÁLIDO");
            }
        }
        balance -= dineroRetirado;

        return dineroRetirado;
    }

    public int deposit(){

        Scanner escaner = new Scanner(System.in);

        int cantidadDepositada = 0;

        while(cantidadDepositada == 0){

            try{
                System.out.println("INGRESE EL MONTO A DEPOSITAR");
                int montoADepositar = escaner.nextInt();
                cantidadDepositada = montoADepositar;
            }
            catch(InputMismatchException e){
                System.out.println("INGRESE UN NÚMERO VÁLIDO");
            }
        }

        balance += cantidadDepositada;
        return cantidadDepositada;
    }

}
