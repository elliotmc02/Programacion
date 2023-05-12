package T3P4.apartadoA;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.NumberFormatException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class adivinaElNumero extends javax.swing.JFrame {

    int contador;
    int numMaquina;

    public adivinaElNumero() {
        int contador = 0;
        numMaquina = (int) ((Math.random() * (100 - 1 + 1) + 1));
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
        imagenLabel.setIcon(new ImageIcon("src/T3P4/apartadoA/assets/foto.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numApuesta = new javax.swing.JTextField();
        botApostar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        informacion = new javax.swing.JLabel();
        intentos = new javax.swing.JLabel();
        Rendirse = new javax.swing.JButton();
        imagenLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 255));
        jLabel1.setText("Adivina el numero");

        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("El objetivo del juego es encontrar el numero entre 1 y 100 que ha pensado el ordenador");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Tu apuesta:");

        numApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numApuestaActionPerformed(evt);
            }
        });

        botApostar.setBackground(new java.awt.Color(51, 255, 51));
        botApostar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botApostar.setForeground(new java.awt.Color(0, 0, 0));
        botApostar.setText("Apuesta");
        botApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botApostarActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 0, 51));
        Salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        informacion.setForeground(new java.awt.Color(51, 255, 255));
        informacion.setText("INFO:");

        intentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        intentos.setForeground(new java.awt.Color(51, 255, 255));
        intentos.setText("# - Intentos:");

        Rendirse.setBackground(new java.awt.Color(255, 255, 51));
        Rendirse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Rendirse.setForeground(new java.awt.Color(0, 0, 0));
        Rendirse.setText("Me rindo");
        Rendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendirseActionPerformed(evt);
            }
        });

        imagenLabel.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rendirse, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imagenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rendirse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(imagenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numApuestaActionPerformed

    }//GEN-LAST:event_numApuestaActionPerformed

    private void botApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botApostarActionPerformed
        ReproducirSonido();
        String aux = numApuesta.getText();
        try {
            int numeroApuesta = Integer.parseInt(aux);
            if (numeroApuesta > 0 && numeroApuesta < 101) {
                //Numero introducido es igual al de la maquina
                if (numeroApuesta == numMaquina) {
                    JOptionPane.showMessageDialog(null, "FELICIDADESSS! HAS ENCONTRADO EL NUMERO EN " + contador + " INTENTOS");
                    intentos.setText("#-Intentos: ");
                    informacion.setText("INFO: ");
                    numApuesta.setText("");
                    contador = 0;
                    numApuesta.requestFocus();
                    numMaquina = (int) ((Math.random() * (100 - 1 + 1) + 1));
                    //Numero introducido es menor
                } else if (numeroApuesta < numMaquina) {
                    informacion.setText("INFO: El numero introducido es menor");
                    contador++;
                    numApuesta.setText("");
                    intentos.setText("#-Intentos: " + contador);
                    numApuesta.requestFocus();
                    //Numero introducido es mayor
                } else {
                    informacion.setText("INFO: El numero introducido es mayor");
                    contador++;
                    intentos.setText("#-Intentos: " + contador);
                    numApuesta.setText("");
                    numApuesta.requestFocus();
                }
            }
            //Numeros fuera de los que queremos
            if (numeroApuesta < 1 || numeroApuesta > 100) {
                informacion.setText("INFO: Tienes que escribir un numero entre (1-100)");
                numApuesta.setText("");
                contador++;
                intentos.setText("#-Intentos: " + contador);
                numApuesta.requestFocus();
            }
            if (numApuesta.getText().equals(" ")) {
                informacion.setText("INFO: Tienes que escribir un numero entre (1-100)");
                numApuesta.setText("");
                contador++;
                intentos.setText("#-Intentos: " + contador);
                numApuesta.requestFocus();
            }
            //Controlar cadenas
        } catch (NumberFormatException nbfe) {
            informacion.setText("INFO: No esta permitido introducir cadenas");
            contador++;
            numApuesta.setText("");
            intentos.setText("#-Intentos: " + contador);
            numApuesta.requestFocus();
        }
    }//GEN-LAST:event_botApostarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void RendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendirseActionPerformed
        ReproducirSonido();
        informacion.setText("INFO: El numero era!!!!! ->" + numMaquina);
        intentos.setText("# - Intentos:");
        contador = 0;
        numApuesta.requestFocus();
        numMaquina = (int) ((Math.random() * (100 - 1 + 1) + 1));
    }//GEN-LAST:event_RendirseActionPerformed

    public void ReproducirSonido() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/T3P4/apartadoA/assets/sonido.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adivinaElNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adivinaElNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adivinaElNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adivinaElNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adivinaElNumero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rendirse;
    private javax.swing.JButton Salir;
    private javax.swing.JButton botApostar;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel informacion;
    private javax.swing.JLabel intentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField numApuesta;
    // End of variables declaration//GEN-END:variables
}
