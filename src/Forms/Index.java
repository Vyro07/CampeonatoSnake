/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jordan
 */
public class Index {
    
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException
    {
        //Establecimiento del look and feel elegido
        UIManager.setLookAndFeel(new FlatCarbonIJTheme());
        //Método que redondea todos los campos de texto
        UIManager.put("TextComponent.arc", 100);
        //Método que redondea todos los botones
        UIManager.put("Button.arc", 100);
        //Método que actualiza los cambios del look and feel en los forms pasados como parámetros
        SwingUtilities.updateComponentTreeUI(register);
        SwingUtilities.updateComponentTreeUI(menu);
        principal.setVisible(true);
    }
    
    //Declaración de variables
    public static final Principal principal = new Principal();
    public static final Register register = new Register();
    public static final Menu menu = new Menu();
    
}
