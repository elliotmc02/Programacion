package Windows;

public class Login extends javax.swing.JFrame {

    String URL_assets = "src/Windows/imagenes";

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        javax.swing.JLabel fondo = new javax.swing.JLabel(new javax.swing.ImageIcon(URL_assets + "/fondo1.jpg"));
        fondo.setSize(this.getSize());
        this.add(fondo);
        panelPrincipal.setBackground(new java.awt.Color(10, 10, 10, 100));
        panelCrear.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        tUsuario = new javax.swing.JTextField();
        tPassword = new javax.swing.JPasswordField();
        bCrearCuenta = new javax.swing.JButton();
        bIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        tUsuarioCrear = new javax.swing.JTextField();
        tPasswordCrear = new javax.swing.JPasswordField();
        bYaTengoCuenta = new javax.swing.JButton();
        bCrearCuentaNueva = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        panelLogin.setMinimumSize(new java.awt.Dimension(0, 0));
        panelLogin.setOpaque(false);
        panelLogin.setPreferredSize(new java.awt.Dimension(600, 230));

        tUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUsuarioActionPerformed(evt);
            }
        });

        bCrearCuenta.setBackground(new java.awt.Color(0, 0, 0));
        bCrearCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        bCrearCuenta.setText("Crear Cuenta");
        bCrearCuenta.setBorder(null);
        bCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearCuentaActionPerformed(evt);
            }
        });

        bIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        bIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        bIniciarSesion.setText("Iniciar Sesion");
        bIniciarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bIniciarSesion.setBorderPainted(false);
        bIniciarSesion.setDefaultCapable(false);
        bIniciarSesion.setFocusPainted(false);
        bIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicio de Sesion");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(bIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(bCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelCrear.setMinimumSize(new java.awt.Dimension(0, 0));
        panelCrear.setOpaque(false);
        panelCrear.setPreferredSize(new java.awt.Dimension(600, 230));

        tUsuarioCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUsuarioCrearActionPerformed(evt);
            }
        });

        bYaTengoCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bYaTengoCuenta.setText("Ya tengo cuenta");
        bYaTengoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bYaTengoCuentaActionPerformed(evt);
            }
        });

        bCrearCuentaNueva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCrearCuentaNueva.setText("Crear Cuenta");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de Usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar Cuenta");

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(tUsuarioCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(tPasswordCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(bCrearCuentaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bYaTengoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(tUsuarioCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(tPasswordCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCrearCuentaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bYaTengoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUsuarioActionPerformed

    private void tUsuarioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUsuarioCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUsuarioCrearActionPerformed

    private void bCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearCuentaActionPerformed
        cambiarVisibilidad();
    }//GEN-LAST:event_bCrearCuentaActionPerformed

    private void bYaTengoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bYaTengoCuentaActionPerformed
        cambiarVisibilidad();
    }//GEN-LAST:event_bYaTengoCuentaActionPerformed

    private void cambiarVisibilidad() {
        if (panelLogin.isVisible()) {
            panelLogin.setVisible(false);
            panelCrear.setVisible(true);
        } else {
            panelCrear.setVisible(false);
            panelLogin.setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearCuenta;
    private javax.swing.JButton bCrearCuentaNueva;
    private javax.swing.JButton bIniciarSesion;
    private javax.swing.JButton bYaTengoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JPasswordField tPasswordCrear;
    private javax.swing.JTextField tUsuario;
    private javax.swing.JTextField tUsuarioCrear;
    // End of variables declaration//GEN-END:variables
}
