public class FechaPrueba {

    public static void main(String[] args){

        Fecha fecha = new Fecha(1, 1, 1);

        fecha.despliegueFecha();

        fecha.setDia(4);
        System.out.println("Nuevo días: " + fecha.getDia());

        fecha.setMes(9);
        System.out.println("Nuevo mes: " + fecha.getMes());

        fecha.setAño(2024);
        System.out.println("Nuevo año: " + fecha.getAño());

        fecha.despliegueFecha();

    }
}
