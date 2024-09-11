//π se puede calcular a partir de esta serie infinita.
//Aproxime el valor de π calcul´andolo con 200000 t´erminos de esta serie.
//Imprima su resultado.
public class Pi
{
    public void calcularPi()
    {
        double denominador = 1.0;
        double pi = 0;
        double signo = 1.0;
        
        for(int i = 0; i < 200000; i++){
            double division = 4.0 / denominador * signo;
            pi += division;
            denominador += 2.0;
            
            signo = signo * -1.0;
        }
        System.out.println(pi);
    }
}

