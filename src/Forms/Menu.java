/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

/**
 *
 * @author Jordan
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPlayers = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnRetire = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();
        btnTablePoints = new javax.swing.JButton();
        btnGame = new javax.swing.JButton();
        btnCredits = new javax.swing.JButton();
        btnCredits1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lblMenu = new javax.swing.JLabel();
        wallpaper2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlayers.setBackground(new java.awt.Color(51, 102, 0));
        btnPlayers.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnPlayers.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayers.setText("Lista de participantes");
        btnPlayers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayersActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 240, 60));

        btnRegister.setBackground(new java.awt.Color(51, 102, 0));
        btnRegister.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registro de participantes");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 240, 60));

        btnRetire.setBackground(new java.awt.Color(51, 102, 0));
        btnRetire.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnRetire.setForeground(new java.awt.Color(255, 255, 255));
        btnRetire.setText("Retiro voluntario");
        btnRetire.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnRetire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetireActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetire, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 240, 60));

        btnResults.setBackground(new java.awt.Color(51, 102, 0));
        btnResults.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnResults.setForeground(new java.awt.Color(255, 255, 255));
        btnResults.setText("Resultados Finales");
        btnResults.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });
        jPanel1.add(btnResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 240, 60));

        btnTablePoints.setBackground(new java.awt.Color(51, 102, 0));
        btnTablePoints.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnTablePoints.setForeground(new java.awt.Color(255, 255, 255));
        btnTablePoints.setText("Tabla de puntuación general");
        btnTablePoints.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnTablePoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablePointsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTablePoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 240, 60));

        btnGame.setBackground(new java.awt.Color(51, 102, 0));
        btnGame.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnGame.setForeground(new java.awt.Color(255, 255, 255));
        btnGame.setText("Comenzar campeonato 2023");
        btnGame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 240, 60));

        btnCredits.setBackground(new java.awt.Color(51, 102, 0));
        btnCredits.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnCredits.setForeground(new java.awt.Color(255, 255, 255));
        btnCredits.setText("Créditos");
        btnCredits.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditsActionPerformed(evt);
            }
        });
        jPanel1.add(btnCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 240, 60));

        btnCredits1.setBackground(new java.awt.Color(204, 0, 51));
        btnCredits1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnCredits1.setForeground(new java.awt.Color(255, 255, 255));
        btnCredits1.setText("Salir");
        btnCredits1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnCredits1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredits1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCredits1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 240, 60));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 10));

        lblMenu.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 51, 0));
        lblMenu.setText("Menú Principal");
        jPanel1.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 230, 40));

        wallpaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snakewallpaper (2).jpg"))); // NOI18N
        wallpaper2.setText("jLabel1");
        jPanel1.add(wallpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        this.setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayersActionPerformed

    private void btnRetireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetireActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultsActionPerformed

    private void btnTablePointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablePointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTablePointsActionPerformed

    private void btnGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGameActionPerformed

    private void btnCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreditsActionPerformed

    private void btnCredits1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredits1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCredits1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnCredits1;
    private javax.swing.JButton btnGame;
    private javax.swing.JButton btnPlayers;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnRetire;
    private javax.swing.JButton btnTablePoints;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel wallpaper2;
    // End of variables declaration//GEN-END:variables
}
