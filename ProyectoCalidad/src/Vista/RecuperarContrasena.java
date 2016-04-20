/*
 * Techno Engineers
 * RecuperarContrasena
 * 12/04/2016 -- Autorizo: Marvin Atzael Hernández Benítez // Lider de proyecto
 * Modificaciones: Miguel Ángel Careaga Gómez // Desarrollo. [17/04/2016]
 * Sirve paracambiar o actualizar la contraseña
 * Numero de métodos en el codigo: 0
 * Login: 
 */
package Vista;

import Controlador.Manipular;
import Controlador.ValidaDatosIngreso;
import javax.swing.JFrame;
import Modelo.UsuariosModelo;
import Modelo.UsuariosDatosEncapsulados;
import Vista.mensajes.Mensajes;
import java.awt.Color;

/**
 * Recupera la contraseña del usuario.
 * @author mgool
 */
public class RecuperarContrasena extends javax.swing.JFrame
{

    public static boolean bRecuperarContrasenia = false;

    /**
     * Crea formulario de recuperar contraseña.
     */
    public RecuperarContrasena()
    {
        initComponents();
        jBPreguntasSeguras.setBackground(new Color(0,104,88));
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
        jLabel1 = new javax.swing.JLabel();
        jPFUsuario = new javax.swing.JTextField();
        jLFContrasena = new javax.swing.JLabel();
        jPFNuevaContrasena = new javax.swing.JPasswordField();
        jLFRepetirContrasena = new javax.swing.JLabel();
        jPFRepitaContrasena = new javax.swing.JPasswordField();
        jBPreguntasSeguras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(208, 208, 208));

        jLabel1.setText("Usuario:");

        jPFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFUsuarioActionPerformed(evt);
            }
        });

        jLFContrasena.setText("Nueva contraseña:");

        jLFRepetirContrasena.setText("Repita contraseña:");

        jBPreguntasSeguras.setBackground(new java.awt.Color(204, 204, 204));
        jBPreguntasSeguras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Entrar.png"))); // NOI18N
        jBPreguntasSeguras.setOpaque(true);
        jBPreguntasSeguras.setPreferredSize(new java.awt.Dimension(120, 50));
        jBPreguntasSeguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreguntasSegurasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel2.setText("Copyright 2013 by Techno Engineers. All rights reserved.");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ayuda.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 104, 88));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Recuperar contraseña");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese los siguientes datos para el cambio de contraseña:");

        cancelar.setBackground(new java.awt.Color(204, 204, 204));
        cancelar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        cancelar.setOpaque(true);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regresar.png"))); // NOI18N
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLFContrasena))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPFNuevaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jPFRepitaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLFRepetirContrasena))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jBPreguntasSeguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPFUsuario))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLFContrasena)
                .addGap(18, 18, 18)
                .addComponent(jPFNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLFRepetirContrasena)
                .addGap(18, 18, 18)
                .addComponent(jPFRepitaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBPreguntasSeguras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 479, Short.MAX_VALUE)))
        );

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

    private void jBPreguntasSegurasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBPreguntasSegurasActionPerformed
    {//GEN-HEADEREND:event_jBPreguntasSegurasActionPerformed
        ValidaDatosIngreso nombre = new ValidaDatosIngreso();
        JFrame objFrame = new JFrame("Dialogo de mensajes");
        UsuariosDatosEncapsulados objUsuariosDatosEncapsulados = new UsuariosDatosEncapsulados();

        while (ValidaDatosIngreso.bUsuarioValido != true)
        {
            nombre.validaCadenaAlfanumerica(jPFUsuario.getText(), "usuario", "usuario"); //Usuario de 5 digitos o más, pero no más de 100. Y letras con numeros.
            break;
        }

        objUsuariosDatosEncapsulados.setUsuario(jPFUsuario.getText());
        if (ValidaDatosIngreso.bUsuarioValido == true)
        {
            Login mandaLogin = new Login();

            while (ValidaDatosIngreso.bContraseniaValida != true)
            {
                nombre.validaContrasenia(jPFRepitaContrasena.getText());
                break;
            }
            objUsuariosDatosEncapsulados.setContrasena(jPFRepitaContrasena.getText());
            if (ValidaDatosIngreso.bContraseniaValida != false)
            {

                if (jPFNuevaContrasena.getText().equals(jPFRepitaContrasena.getText()))
                {
                    int n = UsuariosModelo.recuperarContrasenia(objUsuariosDatosEncapsulados);
                    if (n == 0)
                    {
                        //Mensajes.exito(objFrame);
                        bRecuperarContrasenia = true;
                        System.out.println("Contraseñas iguales ");
                        System.out.println("" + jPFUsuario);
                    } else
                    {
                        bRecuperarContrasenia = false;
                        Mensajes.falla(objFrame, "No se pudo realizar la accion solicitada");
                        System.out.println("error");
                    }

                } else
                {
                    bRecuperarContrasenia = false;
                    Mensajes.falla(objFrame, "La contraseña no coincide, verifique porfavor!");
                    System.out.println("no coinciden las contraseñas");
                }
            }
            ValidaDatosIngreso.bCorreoValido = false;
            ValidaDatosIngreso.bUsuarioValido = false;
            if (bRecuperarContrasenia == true)
            {
                mandaLogin.setVisible(bRecuperarContrasenia);
                dispose();
            }
        }
        Manipular.limpiaCajas(jPFUsuario, jPFNuevaContrasena, jPFRepitaContrasena);
    }//GEN-LAST:event_jBPreguntasSegurasActionPerformed

    private void jPFNuevaContrasenaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPFNuevaContrasenaKeyPressed
    {//GEN-HEADEREND:event_jPFNuevaContrasenaKeyPressed
         if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jPFRepitaContrasena);
        }
    }//GEN-LAST:event_jPFNuevaContrasenaKeyPressed

    private void jPFRepitaContrasenaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPFRepitaContrasenaKeyPressed
    {//GEN-HEADEREND:event_jPFRepitaContrasenaKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jBPreguntasSeguras);
        }
    }//GEN-LAST:event_jPFRepitaContrasenaKeyPressed

    private void jPFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        Login mandaLogin = new Login();
        mandaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RegresarActionPerformed
    {//GEN-HEADEREND:event_RegresarActionPerformed
        VerificarPreguntas mandaPreguntas = new VerificarPreguntas();
        mandaPreguntas.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RecuperarContrasena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jBPreguntasSeguras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLFContrasena;
    private javax.swing.JLabel jLFRepetirContrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPFNuevaContrasena;
    private javax.swing.JPasswordField jPFRepitaContrasena;
    private javax.swing.JTextField jPFUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
