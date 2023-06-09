/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.E147;

//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.Timer;


import javax.swing.ImageIcon;

/**
 *
 * @author Elliot
 */
public class Cartas extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    private JButton jButtons[];
    private String primerID;
    private String segundoID;
    private int cartasSeleccionadas;
    private ArrayList<JButton> seleccionados;
    //private Color colores[];
    private ImageIcon iconos[];
    private boolean esperar;
    private int cartasEncontradas;
    private Menu menu;
    private int partidasJugadas;

    public Cartas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.eventoBotones();
        this.crearGrupos();
        this.seleccionados = new ArrayList<>();
        this.cartasSeleccionadas = 0;
        this.cartasEncontradas = 0;
        this.esperar = false;
        //this.colores = new Color[]{Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED};
        this.iconos = new ImageIcon[]{new ImageIcon("src/Interfaces/E147/fotos/1.png"), new ImageIcon("src/Interfaces/E147/fotos/2.png"), new ImageIcon("src/Interfaces/E147/fotos/3.png"), new ImageIcon("src/Interfaces/E147/fotos/4.png")};
    }

    public void setPJ(int num) {
        partidasJugadas = num;
    }
    // 147
    // 147
    private void eventoBotones() {
        this.jButtons = new JButton[]{this.jButton1, this.jButton2, this.jButton3, this.jButton4, this.jButton5, this.jButton6, this.jButton7, this.jButton8};
        for (JButton button : this.jButtons) {
            button.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ButtonActionPerformed(evt);
                }
            });
        }
    }

    // 147
    // 147
    private void crearGrupos() {
        ArrayList<JButton> grupos = new ArrayList<>();
        int nRandom;
        int id = 1;
        while (grupos.size() < this.jButtons.length) {
            do {
                nRandom = (int) (Math.random() * 8);
                if (this.jButtons[nRandom].getName() == null) {
                    this.jButtons[nRandom].setName(String.valueOf(id));
                }
            } while (grupos.contains(this.jButtons[nRandom]));
            grupos.add(this.jButtons[nRandom]);

            do {
                nRandom = (int) (Math.random() * 8);
                if (this.jButtons[nRandom].getName() == null) {
                    this.jButtons[nRandom].setName(String.valueOf(id));
                }
            } while (grupos.contains(this.jButtons[nRandom]));
            grupos.add(this.jButtons[nRandom]);
            id++;
        }
    }
    // 147
    // 147

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 550));

        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 20, 20));
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jButton4);
        jPanel1.add(jButton5);
        jPanel1.add(jButton6);
        jPanel1.add(jButton7);
        jPanel1.add(jButton8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // 147
    // 147
    
    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (!this.esperar) {
            JButton boton = (JButton) evt.getSource();
            if (this.primerID == null) {
                this.primerID = boton.getName();
                //boton.setBackground(colores[Integer.parseInt(this.primerID) - 1]);
                boton.setIcon(iconos[Integer.parseInt(this.primerID) - 1]);
                this.seleccionados.add(boton);
                this.cartasSeleccionadas++;
            } else if (!this.seleccionados.get(0).equals(boton)) {
                this.segundoID = boton.getName();
                //boton.setBackground(colores[Integer.parseInt(this.segundoID) - 1]);
                boton.setIcon(iconos[Integer.parseInt(this.segundoID) - 1]);
                this.cartasSeleccionadas++;
            }

            if (this.primerID != null && this.segundoID != null) {
                if (this.primerID.equals(this.segundoID)) {
                    this.seleccionados.get(0).setVisible(false);
                    boton.setVisible(false);
                    this.cartasEncontradas += 2;
                }
            }
            if (this.cartasSeleccionadas == 2) {
                this.primerID = null;
                this.segundoID = null;
                this.cartasSeleccionadas = 0;

                // CHAT GPT
                this.esperar = true;
                Timer timer = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        esperar = false;
                        for (JButton botones : jButtons) {
                            //botones.setBackground(Color.WHITE);
                            botones.setIcon(null);
                        }
                    }
                });
                timer.setRepeats(false);
                timer.start();
                // CHAT GPT
                this.seleccionados.clear();
            }

            if (this.cartasEncontradas == this.jButtons.length) {
                partidasJugadas++;
                this.setVisible(false);
                javax.swing.JOptionPane.showMessageDialog(this, "Enhorabuena, has ganado.");
                if (this.menu == null) {
                    this.menu = new Menu();
                    menu.setPartidasJugadasCartas(partidasJugadas);
                    this.menu.setVisible(true);
                    dispose();
                }
            }

        }
    }
    // 147
    // 147

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
