import java.awt.event.*;
import javax.swing.*;

public class InterfazGato {

    JButton[][] botones = new JButton[3][3];
    JFrame frame = new JFrame("Gato");
    GatoLogica logica = new GatoLogica(); 

    
    public JButton[][] crearBotones(){
        int y = 100;
        
        for(int i = 0; i < 3; i++){
            int x = 20;

            for(int j = 0; j < 3; j++){
                botones[i][j] = new JButton(" ");
                botones[i][j].setBounds(x, y, 50, 40);
                botones[i][j].addActionListener(new ActionListener(){

                    public void actionPerformed(ActionEvent e) {
                        JButton btn = (JButton)e.getSource();
                        if (btn.getText().equals(" ")) {
                            btn.setText(logica.turno); 
                            logica.cambiarTurno(); 
                            logica.ganador(botones); 
 
                            if (logica.juego == false){ 
                            deshabilitarBotones();
                            }
                        }

                    }
                });
                x += 50;
                frame.add(botones[i][j]);

            }
            y += 40;
        }
        return botones;
    }

    public void deshabilitarBotones() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setEnabled(false);
            }
        }
    }

    public void definirFrame(){
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);   
    }

}
