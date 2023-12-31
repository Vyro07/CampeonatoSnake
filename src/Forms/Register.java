/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author Jordan
 */
public class Register extends javax.swing.JFrame {

    //Instanciación de objetos
    Classes.Process process = new Classes.Process();
    Classes.List list = new Classes.List();

    public Register() {
        initComponents();
        //Setea el focus en el txtName al ejecutar la ventana
        txtName.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblBorn = new javax.swing.JLabel();
        txtBorn = new javax.swing.JTextField();
        lblResidence = new javax.swing.JLabel();
        txtResidence = new javax.swing.JTextField();
        lblNick = new javax.swing.JLabel();
        txtNick = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblRegister.setBackground(new java.awt.Color(255, 255, 255));
        lblRegister.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("Registro");

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nombre:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        lblLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblLastName.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Apellidos:");

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        lblBorn.setBackground(new java.awt.Color(255, 255, 255));
        lblBorn.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        lblBorn.setForeground(new java.awt.Color(255, 255, 255));
        lblBorn.setText("Nacimiento (dd/mm/yyyy):");

        txtBorn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBornKeyPressed(evt);
            }
        });

        lblResidence.setBackground(new java.awt.Color(255, 255, 255));
        lblResidence.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        lblResidence.setForeground(new java.awt.Color(255, 255, 255));
        lblResidence.setText("Residencia: ");

        txtResidence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResidenceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResidenceKeyTyped(evt);
            }
        });

        lblNick.setBackground(new java.awt.Color(255, 255, 255));
        lblNick.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        lblNick.setForeground(new java.awt.Color(255, 255, 255));
        lblNick.setText("Sobrenombre:");

        txtNick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNickKeyPressed(evt);
            }
        });

        btnClean.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnClean.setText("Limpiar campos");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnSend.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnSend.setText("Enviar registro");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNick, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnClean)
                        .addGap(31, 31, 31)
                        .addComponent(btnSend))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(lblRegister)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblBorn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBorn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(lblResidence))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblNick))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClean)
                    .addComponent(btnSend))
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 530, 380));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snakewallpaper (2).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        //Formateo del txtField para que solo permita digitar letras y espacios
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ')
            evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        //Formateo del txtField para que solo permita digitar letras y espacios
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ')
            evt.consume();
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        //Invocación de las validaciones
        validation();
        process.toEmail(txtEmail.getText(), txtName.getText());
        btnBack.setEnabled(true);
        cleaner();
        
    }//GEN-LAST:event_btnSendActionPerformed

    //Método vacío
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    /*
       @Eventos de navegacion con la tecla enter
     */

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed

        //Se ejecuta el if si se presiona enter
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            //Si el textfield está vacío, solicita al usuario rellenarlo y setea el focus en el mismo
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, llena este campo antes de proseguir");
                txtName.requestFocus();
            } else {
                //Setea el focus en el siguiente textfield
                txtLastName.requestFocus();
            }

        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            //Si el textfield está vacío, solicita al usuario rellenarlo y setea el focus en el mismo
            if (txtLastName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, llena este campo antes de proseguir");
                txtLastName.requestFocus();
            } //Si la validación de la repetición de apellidos retorna true, muestra un mensaje de advertencia
            else if (list.validarApellidosRepetidos(txtLastName.getText(), list.toArray())) {
                JOptionPane.showMessageDialog(null, "Error. Estos datos ya se encuentran registrados");
                txtLastName.requestFocus();
            } else {
                txtEmail.requestFocus();
            }

        }
    }//GEN-LAST:event_txtLastNameKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed

        //Se ejecuta el if si se presiona enter
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            //Se crea una variable que contiene el email
            String email = txtEmail.getText();

            //Se valida si el textfield se encuentra lleno
            if (!txtEmail.getText().equals("")) {
                //Se valida la estructura del email
                if (process.validarEmail(email)) {
                    //Se valida si el email no ha sido registrado
                    if (list.validarEmailRepetido(txtEmail.getText(), list.toArray())) {
                        JOptionPane.showMessageDialog(null, "Error. Estos datos ya se encuentran registrados");
                        txtEmail.requestFocus();
                    } else {
                        txtBorn.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de correo inválido");
                    txtEmail.setText("");
                    txtEmail.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llena este campo antes de proseguir");
                txtEmail.requestFocus();

            }
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    //Método vacío
    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped

    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtBornKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBornKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            String date = txtBorn.getText();
            if (!txtBorn.getText().equals("")) {
                //Se valida la estructura de la fecha de nacimiento
                if (process.validarFecha(date)) {
                    txtResidence.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de fecha inválido");
                    txtBorn.setText("");
                    txtBorn.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llena este campo antes de proseguir");
                txtBorn.requestFocus();

            }
        }
    }//GEN-LAST:event_txtBornKeyPressed

    private void txtResidenceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResidenceKeyTyped
        //Formateo del txtField para que solo permita digitar letras y espacios
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ')
            evt.consume();
    }//GEN-LAST:event_txtResidenceKeyTyped

    private void txtResidenceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResidenceKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (txtResidence.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, llena este campo antes de proseguir");
                txtResidence.requestFocus();
            } else {
                txtNick.requestFocus();
            }

        }
    }//GEN-LAST:event_txtResidenceKeyPressed

    private void txtNickKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (txtNick.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, llena este campo antes de proseguir");
                txtNick.requestFocus();
            } //Se valida que el nickname no haya sido registrado
            else if (list.validarNickRepetido(txtNick.getText(), list.toArray())) {
                JOptionPane.showMessageDialog(null, "Error. Estos datos ya se encuentran registrados");
                txtNick.requestFocus();
            } else {
                btnSend.requestFocus();
                //Método que ejecuta las acciones del botón send
                btnSend.doClick();
            }

        }
    }//GEN-LAST:event_txtNickKeyPressed

    /*
       @Fin de sección de eventos de navegacion con la tecla enter
     */
    //Invocación del método cleaner
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleaner();
    }//GEN-LAST:event_btnCleanActionPerformed

    //Método que invoca la ventana del menú principal
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    //Método que limpia todos los campos de texto
    public void cleaner() {
        txtName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtBorn.setText("");
        txtResidence.setText("");
        txtNick.setText("");
    }

    //Validación general para el envío de registro (EN LA MEDIDA DE LO POSIBLE, NO MODIFICAR)
    public void validation() {

        //Declaración de variables 
        String email = txtEmail.getText();
        String date = txtBorn.getText();

        //Se valida que los campos de texto no estén vacíos
        if (!txtName.getText().equals("") || !txtLastName.getText().equals("") || !txtEmail.getText().equals("") || !txtBorn.getText().equals("") || !txtResidence.getText().equals("") || !txtNick.getText().equals("")) {
            //Se valida que la estructura de la fecha y el email sean las correctas
            if (process.validarFecha(date) && process.validarEmail(email)) {
                //Se validan que no haya información repetida en el registro
                if (list.validarApellidosRepetidos(txtLastName.getText(), list.toArray()) || list.validarEmailRepetido(txtEmail.getText(), list.toArray()) || list.validarNickRepetido(txtNick.getText(), list.toArray())) {
                    JOptionPane.showMessageDialog(null, "Error. Este registro ya se realizó anteriormente");
                    txtLastName.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Participante registrado correctamente");
                    registerHelper();
                    JOptionPane.showMessageDialog(null, "Enviando cógido de participación. POR FAVOR, NO CIERRE ESTA VENTANA...");
                    btnBack.setEnabled(false);
                    
                  
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, rellene los campos con el formato solicitado");
                txtEmail.setText("");
                txtBorn.setText("");
                txtEmail.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            txtName.requestFocus();
        }

    }

    //Ayudante para el registro de los participantes en la lista doblemente enlazada
    public void registerHelper() {

        //Se crea el objeto participante
        Classes.Player player = new Classes.Player(txtName.getText(), txtLastName.getText(), txtEmail.getText(), txtBorn.getText(), txtResidence.getText(), txtNick.getText());
        //Se agrega el participante a la lista
        list.agregarAlFinal(player);
        

    }

    public void ImpresionNormal(Classes.Player player[]) {

        //Si el array está vacío, se indica que no se han agregadi participantes
        if (player.length == 0) {
            JOptionPane.showMessageDialog(null, "No se han ingresado participantes");
        } else {

            //Se concatetan todos los atributos de los participantes, para luego imprimir la información
            String conca = "";
            for (int x = 0; x < player.length; x++) {
                conca += player[x].getName() + "-" + player[x].getLastname() + "-" + player[x].getEmail() + "-" + player[x].getBorn() + "-" + player[x].getResidence() + "-" + player[x].getNickname() + "\n";

            }
            JOptionPane.showMessageDialog(null, conca, "Ventana de impresion: Datos", JOptionPane.NO_OPTION);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBorn;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblResidence;
    private javax.swing.JTextField txtBorn;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextField txtResidence;
    // End of variables declaration//GEN-END:variables
}
