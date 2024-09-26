import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class InterfazGato{

    JButton[][] botones = new JButton[3][3];
    JFrame frame = new JFrame("Gato");
    GatoLogica logica = new GatoLogica(); 
    Color colorBotones = new Color(250, 198, 218);
    
    public JButton[][] crearBotones(){
        int y = 50;
        
        for(int i = 0; i < 3; i++){
            int x = 50;

            for(int j = 0; j < 3; j++){
                botones[i][j] = new JButton(" ");
                botones[i][j].setBounds(x, y, 130, 130);
                botones[i][j].setBackground(colorBotones);
                botones[i][j].setFont(botones[i][j].getFont().deriveFont(80f));
                botones[i][j].setForeground(Color.WHITE);

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
                x += 130;
                frame.add(botones[i][j]);

            }
            y += 130;
        }
        return botones;
    }

    public void botonReinicio(){

        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBounds(200, 5, 100, 40); 
        btnReiniciar.setFont(btnReiniciar.getFont().deriveFont(15f));

        frame.add(btnReiniciar);

        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego(); 
            }
        });
        
    }

    public void reiniciarJuego(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText(" ");
                botones[i][j].setEnabled(true);
            }
        }
        logica.turno = "X"; 
        logica.juego = true; 
    }

    public void deshabilitarBotones(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setEnabled(false);
            }
        }
    }

    public void definirFrame(){
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);   
    }

}
