/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.E147;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Elliot
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    private Cartas JuegoMemoria;
    private ParesNones JuegoParesNones;
    private Login login;
    private HashMap<String, Usuario> datos;
    String nombre;

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        datos = new HashMap<>();
        this.ventanaElegirJuego.setLocationRelativeTo(null);
        this.ventanaEstadisticas.setLocationRelativeTo(null);
    }

    private void leerDatos() {
        String RUTA_DATOS = "src/Interfaces/E147/ficheros/datos.txt";
        try ( BufferedReader br = new BufferedReader(new FileReader(RUTA_DATOS))) {
            String linea;
            do {
                linea = br.readLine();
                if (linea != null) {
                    nombre = linea.split(":")[0];
                    String password = linea.split(":")[1];
                    ArrayList<Integer> stats = new ArrayList<>();
                    stats.add(Integer.parseInt(linea.split(":")[2]));
                    stats.add(Integer.parseInt(linea.split(":")[3]));
                    stats.add(Integer.parseInt(linea.split(":")[4]));
                    this.datos.put(nombre, new Usuario(password, stats));
                }
            } while (linea != null);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("No se encontró el fichero");
        } catch (java.io.IOException e) {
            System.out.println("Error al leer fichero");
        }
    }

    private void escribirDatos() {
        String RUTA_DATOS = "src/Interfaces/E147/ficheros/datos.txt";
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_DATOS))) {
            for (String user : this.datos.keySet()) {
                bw.append(user + ":" + this.datos.get(user).getPassword() + ":" + this.datos.get(user).getStats().toString().replaceAll("[\\[\\]]", "").replace(", ", ":") + System.lineSeparator());
            }
        } catch (java.io.IOException e) {
            System.out.println("Error al escribir fichero");
        }
    }

    public void cambiarStats(int cj, int vPN, int dPN) {
        this.jugadasCartas.setText(String.valueOf(cj));
        this.victoriasPN.setText(String.valueOf(vPN));
        this.derrotasPN.setText(String.valueOf(dPN));
    }

    public void cambiarTexto(String nombre) {
        mensajeBienvenida.setText("Bienvenido rompetangas " + nombre);
    }

    public void setPartidasJugadasCartas(int num) {
        this.jugadasCartas.setText(String.valueOf(num));
    }

    public void setVictoriasPN(int num) {
        this.victoriasPN.setText(String.valueOf(num));
    }

    public void setDerrotasPN(int num) {
        this.derrotasPN.setText(String.valueOf(num));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaEstadisticas = new javax.swing.JFrame();
        labelPartidasCartas = new javax.swing.JLabel();
        labelVictoriasPN = new javax.swing.JLabel();
        labelDerrotasPN = new javax.swing.JLabel();
        volverES = new javax.swing.JButton();
        jugadasCartas = new javax.swing.JLabel();
        victoriasPN = new javax.swing.JLabel();
        derrotasPN = new javax.swing.JLabel();
        ventanaElegirJuego = new javax.swing.JFrame();
        volverEJ = new javax.swing.JButton();
        paresNones = new javax.swing.JButton();
        cartas = new javax.swing.JButton();
        estadisticas = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        elegirJuego = new javax.swing.JButton();
        mensajeBienvenida = new javax.swing.JLabel();
        salir1 = new javax.swing.JButton();

        ventanaEstadisticas.setUndecorated(true);
        ventanaEstadisticas.setResizable(false);
        ventanaEstadisticas.setSize(new java.awt.Dimension(400, 300));

        labelPartidasCartas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPartidasCartas.setText("Partidas jugadas a las cartas:");

        labelVictoriasPN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelVictoriasPN.setText("Victorias pares y nones: ");

        labelDerrotasPN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDerrotasPN.setText("Derrotas pares y nones: ");

        volverES.setText("Volver");
        volverES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverESActionPerformed(evt);
            }
        });

        jugadasCartas.setText("0");

        victoriasPN.setText("0");

        derrotasPN.setText("0");

        javax.swing.GroupLayout ventanaEstadisticasLayout = new javax.swing.GroupLayout(ventanaEstadisticas.getContentPane());
        ventanaEstadisticas.getContentPane().setLayout(ventanaEstadisticasLayout);
        ventanaEstadisticasLayout.setHorizontalGroup(
            ventanaEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEstadisticasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(volverES, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaEstadisticasLayout.createSequentialGroup()
                        .addComponent(labelVictoriasPN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(victoriasPN, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                    .addGroup(ventanaEstadisticasLayout.createSequentialGroup()
                        .addComponent(labelDerrotasPN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(derrotasPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ventanaEstadisticasLayout.createSequentialGroup()
                        .addComponent(labelPartidasCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jugadasCartas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        ventanaEstadisticasLayout.setVerticalGroup(
            ventanaEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEstadisticasLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(ventanaEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPartidasCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugadasCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventanaEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVictoriasPN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(victoriasPN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventanaEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDerrotasPN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(derrotasPN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(volverES, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ventanaElegirJuego.setUndecorated(true);
        ventanaElegirJuego.setResizable(false);
        ventanaElegirJuego.setSize(new java.awt.Dimension(400, 300));

        volverEJ.setText("Volver");
        volverEJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverEJActionPerformed(evt);
            }
        });

        paresNones.setText("Pares y Nones");
        paresNones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paresNonesActionPerformed(evt);
            }
        });

        cartas.setText("Memorizar Cartas");
        cartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaElegirJuegoLayout = new javax.swing.GroupLayout(ventanaElegirJuego.getContentPane());
        ventanaElegirJuego.getContentPane().setLayout(ventanaElegirJuegoLayout);
        ventanaElegirJuegoLayout.setHorizontalGroup(
            ventanaElegirJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaElegirJuegoLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(ventanaElegirJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cartas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paresNones, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverEJ, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
        ventanaElegirJuegoLayout.setVerticalGroup(
            ventanaElegirJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaElegirJuegoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(paresNones, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cartas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volverEJ, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 300));

        estadisticas.setText("Estadisticas");
        estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasActionPerformed(evt);
            }
        });

        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        elegirJuego.setText("Elegir juego");
        elegirJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirJuegoActionPerformed(evt);
            }
        });

        mensajeBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mensajeBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeBienvenida.setText("Bienvenido, usuario");

        salir1.setText("Salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elegirJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(mensajeBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(elegirJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        this.leerDatos();
        this.escribirDatos();
        if (login == null) {
            login = new Login();
            this.dispose();
            login.setVisible(true);

        }
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void volverESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverESActionPerformed
        this.ventanaEstadisticas.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_volverESActionPerformed

    private void volverEJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverEJActionPerformed
        this.ventanaElegirJuego.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_volverEJActionPerformed

    private void cartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartasActionPerformed
        if (this.JuegoMemoria == null) {
            this.JuegoMemoria = new Cartas();
            JuegoMemoria.setPJ(Integer.parseInt(jugadasCartas.getText()));
            this.JuegoMemoria.setVisible(true);
            this.ventanaElegirJuego.dispose();
        }
    }//GEN-LAST:event_cartasActionPerformed

    private void paresNonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paresNonesActionPerformed
        if (this.JuegoParesNones == null) {
            this.JuegoParesNones = new ParesNones();
            JuegoParesNones.setVictoriasDerrotas(Integer.parseInt(victoriasPN.getText()), Integer.parseInt(derrotasPN.getText()));
            this.JuegoParesNones.setVisible(true);
            this.ventanaElegirJuego.dispose();
        }
    }//GEN-LAST:event_paresNonesActionPerformed

    private void elegirJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirJuegoActionPerformed
        this.ventanaElegirJuego.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_elegirJuegoActionPerformed

    private void estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasActionPerformed
        this.ventanaEstadisticas.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_estadisticasActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        this.leerDatos();
        this.escribirDatos();
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartas;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel derrotasPN;
    private javax.swing.JButton elegirJuego;
    private javax.swing.JButton estadisticas;
    private javax.swing.JLabel jugadasCartas;
    private javax.swing.JLabel labelDerrotasPN;
    private javax.swing.JLabel labelPartidasCartas;
    private javax.swing.JLabel labelVictoriasPN;
    private javax.swing.JLabel mensajeBienvenida;
    private javax.swing.JButton paresNones;
    private javax.swing.JButton salir1;
    private javax.swing.JFrame ventanaElegirJuego;
    private javax.swing.JFrame ventanaEstadisticas;
    private javax.swing.JLabel victoriasPN;
    private javax.swing.JButton volverEJ;
    private javax.swing.JButton volverES;
    // End of variables declaration//GEN-END:variables
}
