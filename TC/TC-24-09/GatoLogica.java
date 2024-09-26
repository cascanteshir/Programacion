import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GatoLogica {
    boolean juego = true;
    String turno = "X";


    public void cambiarTurno(){
        if(turno == "O"){
            turno = "X";
        }else{
            turno = "O";
        }
    }

    public void ganador(JButton[][] matriz){

        //Revisar filas
        for(int fila = 0; fila < 3; fila++){
            if(matriz[fila][0].getText() == matriz[fila][1].getText() &&
            matriz[fila][0].getText() == matriz[fila][2].getText() &&
            matriz[fila][0].getText() != " "){
                JOptionPane.showMessageDialog(null, "El ganador es: " + matriz[fila][0].getText());
                juego = false;
                return;
            }
        }

        //Revisar columnas
        for(int col = 0; col < 3; col++){
            if(matriz[0][col].getText() == matriz[1][col].getText() &&
            matriz[0][col].getText() == matriz[2][col].getText() &&
            matriz[0][col].getText() != " "){
                JOptionPane.showMessageDialog(null, "El ganador es: " + matriz[0][col].getText());
                juego = false;
                return;
            }
        }

        //Revisar diagonal 1
        if(matriz[0][0].getText() == matriz[1][1].getText() &&
        matriz[0][0].getText() == matriz[2][2].getText() &&
        matriz[0][0].getText() != " "){
            JOptionPane.showMessageDialog(null, "El ganador es: " + matriz[0][0].getText());
            juego = false;
            return;

        }
        
        //Revisar diagnoal 2
        if(matriz[0][2].getText() == matriz[1][1].getText() &&
        matriz[0][2].getText() == matriz[2][0].getText() &&
        matriz[0][2].getText() != " "){
            JOptionPane.showMessageDialog(null, "El ganador es: " + matriz[0][2].getText());
            juego = false;
            return;
        }

    }
    
}
