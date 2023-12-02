/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Jordan
 */
public class Process {
    
      //Método que permite validar la estructura del email
      public boolean validarEmail(String email)
    {
     //Compilación de la expresion regular o patrón para un email
     Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
     
     //Matcher que compara el input del usuario contra el patrón
     Matcher matcher = pattern.matcher(email);
     
     //Retorno del resultado de la comparación
     return matcher.find();
    }
      
      public boolean validarFecha(String fecha)
    {
     //Compilación de la expresion regular o patrón para un email
     Pattern pattern = Pattern
                .compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$");
     Matcher matcher = pattern.matcher(fecha);
     return matcher.find();
    }
      
      public void toEmail(String Correo, String nombre)
      {
          
          String emitition = "jordanfadellm@gmail.com";
          String password = "gqma nosd mehy nohf";
          String message = "Hola "+nombre+ "!!\n Bienvedido al Campeonanto Internacional de Snake. Tu código de participante es: \n"
                  +String.valueOf((int)(Math.random()*1000+1));
          
          Properties object = new Properties();
          
          object.put("mail.smtp.host", "smtp.gmail.com");
          object.setProperty("mail.smtp.starttls.enable", "true");
          object.put("mail.smtp.port", "587");
          object.setProperty("mail.smtp.port", "587");
          object.put("mail.smtp.user", emitition);
          object.setProperty("mail.smtp.auth", "true");
          
          Session session = Session.getDefaultInstance(object);
          MimeMessage mail = new MimeMessage(session);
          
          try
          {
             mail.setFrom(new InternetAddress (emitition));
             mail.addRecipients(Message.RecipientType.TO, Correo);
             mail.setSubject("Código de participante (Campeonato Mundial de Snake)");
             mail.setText(message);
             
             Transport transport = session.getTransport("smtp");
             transport.connect(emitition, password);
             transport.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
             transport.close();
             
             JOptionPane.showMessageDialog(null, "Estimado usuario\nSe le ha enviado un correo con su código de participante");
             
          }catch (Exception e)
          {
            JOptionPane.showMessageDialog(null, "Error de envío de correo...\n"+e);
          }
      }
      
     
      
     
     
}
