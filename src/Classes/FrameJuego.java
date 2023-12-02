
package classes;

import javax.swing.JFrame;

/**
 *
 * @author mario.alvarado
 */
public class FrameJuego extends JFrame{
    
    PanelDelJuego obj = new PanelDelJuego();
    public  FrameJuego(){
        this.add(obj);
        this.setTitle("JuegoSnake");
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
