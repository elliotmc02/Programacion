package Banderas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class Juego extends javax.swing.JFrame {

    ArrayList<JButton> banderas; // array de los botones
    ArrayList<String> paisesRestantes; // los paises que faltan por adivinar
    String URL_assets = "assets/";
    String URL_img = URL_assets + "imagenes/";
    String URL_audio = URL_assets + "audio/";
    File carpeta = new File(URL_img);
    String paisAdivinar; // el pais que tiene que adivinar
    int intentos;
    int paisesCorrectos; // los paises que ha acertado
    int paisesIncorrectos; // los paises que ha fallado
    int aciertosPrimera; // Acertados a la primera
    boolean correcto;
    Timer tiempo;

    public Juego() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        frameEstadisticas.setLocationRelativeTo(null);
        paisesRestantes = new ArrayList<>(Arrays.asList(carpeta.list()));
        generarBotones();
        asignarBanderas();
        paisAleatorio();
        intentos = 3;
        paisesCorrectos = 0;
        paisesIncorrectos = 0;
        aciertosPrimera = 0;
        jPanel1.getVerticalScrollBar().setUnitIncrement(30);
        iniciarTiempo();
        jlPaises.setText("Quedan " + paisesRestantes.size() + " paises");
    }

    private void iniciarTiempo() {
        tiempo = new Timer(1000, new ActionListener() {
            int minutos = 0;
            int segundos = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                }
                jlContador.setText((minutos >= 10 ? minutos : "0" + minutos) + ":" + (segundos >= 10 ? segundos : "0" + segundos));
            }
        });

        tiempo.start();
    }

    private void generarBotones() {
        banderas = new ArrayList<>();

        for (int i = 0; i < carpeta.list().length; i++) {
            JButton boton = new JButton();
            boton.setContentAreaFilled(false);
            banderas.add(boton);
            jPanel2.add(boton);
        }
        for (JButton button : banderas) {
            button.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pulsarBandera(evt);
                }
            });
        }

    }

    private void asignarBanderas() {
        ArrayList<String> paises = new ArrayList<>(Arrays.asList(carpeta.list()));
        for (JButton boton : banderas) {
            int numRand = new Random().nextInt(paises.size());
            boton.setIcon(new ImageIcon(URL_img + paises.get(numRand)));
            paises.remove(numRand);
        }
    }

    private void paisAleatorio() {
        if (!paisesRestantes.isEmpty()) {
            int numRand = new Random().nextInt(paisesRestantes.size());
            paisAdivinar = paisesRestantes.get(numRand);
            jlPais.setText(paisAdivinar.split("\\.")[0].replace("_", " "));
        }
    }

    private void sonidoCorrectoIncorrecto() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File((correcto ? URL_audio + "si.wav" : URL_audio + "no.wav")).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error al reproducir sonido");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameEstadisticas = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jlAcertados = new javax.swing.JLabel();
        jlFallados = new javax.swing.JLabel();
        jlAcertadosPrimera = new javax.swing.JLabel();
        jbJugar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlTiempoTardado = new javax.swing.JLabel();
        jlPais = new javax.swing.JLabel();
        jlIntentos = new javax.swing.JLabel();
        jlIndicador = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jlPaises = new javax.swing.JLabel();
        jlContador = new javax.swing.JLabel();

        frameEstadisticas.setResizable(false);
        frameEstadisticas.setSize(new java.awt.Dimension(420, 400));
        frameEstadisticas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resultados");
        frameEstadisticas.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 6, 242, 35));

        jlAcertados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlAcertados.setText("Acertados:");
        frameEstadisticas.getContentPane().add(jlAcertados, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, 388, -1));

        jlFallados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlFallados.setText("Fallados:");
        frameEstadisticas.getContentPane().add(jlFallados, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 388, -1));

        jlAcertadosPrimera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlAcertadosPrimera.setText("Acertados a la primera:");
        frameEstadisticas.getContentPane().add(jlAcertadosPrimera, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, 390, -1));

        jbJugar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbJugar.setText("Volver a Jugar");
        jbJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJugarActionPerformed(evt);
            }
        });
        frameEstadisticas.getContentPane().add(jbJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 243, 388, -1));

        jbSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        frameEstadisticas.getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 286, 388, -1));

        jlTiempoTardado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTiempoTardado.setText("Tiempo:");
        frameEstadisticas.getContentPane().add(jlTiempoTardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1240, 720));
        setPreferredSize(new java.awt.Dimension(1240, 720));

        jlPais.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPais.setText("España");

        jlIntentos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlIntentos.setText("Intentos: 3");

        jlIndicador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlIndicador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIndicador.setText(" ");

        jPanel1.setMaximumSize(new java.awt.Dimension(1980, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 100));
        jPanel1.setViewportView(null);

        jPanel2.setFocusable(false);
        jPanel2.setLayout(new java.awt.GridLayout(0, 6, 20, 20));
        jPanel1.setViewportView(jPanel2);

        jlPaises.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlPaises.setText("Quedan ");

        jlContador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlContador.setText("00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlIndicador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPais, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(jlContador, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlIntentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlContador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlPais, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPaises, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jlIndicador)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        frameEstadisticas.dispose();
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJugarActionPerformed
        frameEstadisticas.setVisible(false);
        this.setVisible(true);
        reiniciar();
    }//GEN-LAST:event_jbJugarActionPerformed

    private void reiniciar() {
        for (JButton botones : banderas) {
            botones.setEnabled(true);
        }
        paisesRestantes = new ArrayList<>(Arrays.asList(carpeta.list()));
        asignarBanderas();
        paisAleatorio();
        intentos = 3;
        paisesCorrectos = 0;
        paisesIncorrectos = 0;
        aciertosPrimera = 0;
        iniciarTiempo();
    }

    private void pulsarBandera(java.awt.event.ActionEvent evt) {
        JButton boton = (JButton) evt.getSource();
        comprobarBandera(boton);
    }

    private void comprobarBandera(JButton boton) {
        String tmp = boton.getIcon().toString();
        if (tmp.substring(tmp.lastIndexOf("/") + 1).equalsIgnoreCase(paisAdivinar)) {
            correcto = true;
            boton.setEnabled(false);
            paisesRestantes.remove(paisAdivinar);
            comprobarCorrectoIncorrecto();
        } else {
            correcto = false;
            comprobarCorrectoIncorrecto();
            if (intentos <= 0) {
                for (JButton botones : banderas) {
                    String tmp2 = botones.getIcon().toString();
                    if (tmp2.substring(tmp.lastIndexOf("/") + 1).equalsIgnoreCase(paisAdivinar)) {
                        botones.setEnabled(false);
                        paisesRestantes.remove(paisAdivinar);
                        break;
                    }
                }
                jlIndicador.setText("Incorrecto");
                jlIndicador.setForeground(Color.red);
                cooldown();
                intentos = 3;
                jlIntentos.setText("Intentos: " + String.valueOf(intentos));
                paisesIncorrectos++;
                paisAleatorio();
            }
        }
        jlPaises.setText("Quedan " + paisesRestantes.size() + " paises");
        if (paisesRestantes.isEmpty()) {
            frameEstadisticas.setVisible(true);
            this.setVisible(false);
            jlAcertados.setText("Acertados: " + String.valueOf(paisesCorrectos));
            jlFallados.setText("Fallados: " + String.valueOf(paisesIncorrectos));
            jlAcertadosPrimera.setText("Acertados a la primera: " + String.valueOf(aciertosPrimera));
            tiempo.stop();
            jlTiempoTardado.setText("Tiempo: " + jlContador.getText());
        }
        sonidoCorrectoIncorrecto();
    }

    private void comprobarCorrectoIncorrecto() {
        jlIndicador.setText(correcto ? "Correcto" : "Incorrecto");
        jlIndicador.setForeground(correcto ? Color.green : Color.red);
        cooldown();
        if (correcto) {
            if (intentos == 3) {
                aciertosPrimera++;
            }
            intentos = 3;
            paisesCorrectos++;
            paisAleatorio();
        } else {
            intentos--;
        }
        jlIntentos.setText("Intentos: " + String.valueOf(intentos));
    }

    private void cooldown() {
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlIndicador.setText(" ");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame frameEstadisticas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbJugar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAcertados;
    private javax.swing.JLabel jlAcertadosPrimera;
    private javax.swing.JLabel jlContador;
    private javax.swing.JLabel jlFallados;
    private javax.swing.JLabel jlIndicador;
    private javax.swing.JLabel jlIntentos;
    private javax.swing.JLabel jlPais;
    private javax.swing.JLabel jlPaises;
    private javax.swing.JLabel jlTiempoTardado;
    // End of variables declaration//GEN-END:variables

}
