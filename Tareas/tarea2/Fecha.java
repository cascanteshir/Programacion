public class Fecha {
    
    int mes;
    int dia;
    int anio;

    public Fecha(int mes, int dia, int anio){
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public void setMes(int nuevoMes){
        this.mes = nuevoMes;
    }
    public int getMes(){
        return mes;
    }

    public void setDia(int nuevoDia){
        this.dia = nuevoDia;
    }
    public int getDia(){
        return dia;
    }

    public void setAño(int nuevoAño){
        this.anio = nuevoAño;
    }
    public int getAño(){
        return anio;
    }

    public void despliegueFecha(){

        String fecha = dia + "/" + mes + "/" + anio;

        System.out.println(fecha);
    }

}
