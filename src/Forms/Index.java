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
        UIManager.setLookAndFeel(new FlatCarbonIJTheme());
        UIManager.put("TextComponent.arc", 100);
        UIManager.put("Button.arc", 100);
        SwingUtilities.updateComponentTreeUI(register);
        SwingUtilities.updateComponentTreeUI(menu);
        principal.setVisible(true);
    }
    
    public static final Principal principal = new Principal();
    public static final Register register = new Register();
    public static final Menu menu = new Menu();
    
}
