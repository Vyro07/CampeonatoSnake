/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jordan
 */
public class Process {
    
      public boolean validarEmail(String email)
    {
     Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
     Matcher matcher = pattern.matcher(email);
     return matcher.find();
    }
      
      public boolean validarFecha(String fecha)
    {
     Pattern pattern = Pattern
                .compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$");
     Matcher matcher = pattern.matcher(fecha);
     return matcher.find();
    }
}
