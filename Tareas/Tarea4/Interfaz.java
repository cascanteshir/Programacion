import javax.swing.*;
import java.awt.*;


public class Interfaz{

    JFrame frame;
    JPanel panel; 

    public Interfaz(){
         // Configuración del JFrame
         setTitle("Mi Interfaz con un Panel");
         setSize(600, 400);  // Tamaño de la ventana
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);  // Centrar la ventana en la pantalla
 
         // Crear un único panel
         JPanel panelUnico = new JPanel();
         panelUnico.setBackground(Color.LIGHT_GRAY);  // Color de fondo para diferenciar el panel
         panelUnico.setLayout(new FlowLayout());  // LayoutManager sencillo (predeterminado)
 
         // Añadir algunos componentes al panel
         panelUnico.add(new JButton("Botón 1"));
         panelUnico.add(new JButton("Botón 2"));
         panelUnico.add(new JButton("Botón 3"));
 
         // Agregar el panel al JFrame
         add(panelUnico);
 
         // Hacer visible la ventana
         setVisible(true);
    }

    
}
