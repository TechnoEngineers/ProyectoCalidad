/*
 * Techno Engineers
 * VerificarUsuario
 * 12/04/2016 -- Autorizo: Marvin Atzael Hernández Benítez // Lider de proyecto
 * Modificaciones: 
 * Sirve para recuperar contraseña me diante preguntas
 * Numero de métodos en el codigo: 0
 * RecuperarContrasena: 
 */
package Vista;

import Controlador.Manipular;
import Controlador.ValidaDatosIngreso;
import Modelo.UsuariosDatosEncapsulados;
import Modelo.UsuariosModelo;
import Vista.mensajes.Mensajes;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;

public class VerificarPreguntas extends javax.swing.JFrame
{

    public VerificarPreguntas()
    {
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

        jLFLugarNacimiento = new javax.swing.JLabel();
        jLFCorreo = new javax.swing.JLabel();
        jBPreguntasSeguras = new javax.swing.JButton();
        jTFCiudadNacimiento = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLFLugarNacimiento.setText("Ciudad de nacimiento:");

        jLFCorreo.setText("Correo de registro:");

        jBPreguntasSeguras.setText("Verificar");
        jBPreguntasSeguras.setPreferredSize(new java.awt.Dimension(120, 50));
        jBPreguntasSeguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreguntasSegurasActionPerformed(evt);
            }
        });

        jTFCiudadNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCiudadNacimientoKeyPressed(evt);
            }
        });

        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });
        jTFCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCorreoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jBPreguntasSeguras, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLFCorreo)
                            .addComponent(jLFLugarNacimiento)
                            .addComponent(jTFCorreo)
                            .addComponent(jTFCiudadNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLFLugarNacimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFCiudadNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLFCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jBPreguntasSeguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreguntasSegurasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBPreguntasSegurasActionPerformed
    {//GEN-HEADEREND:event_jBPreguntasSegurasActionPerformed
        ValidaDatosIngreso recuperarContrasenia = new ValidaDatosIngreso();
        JFrame objFrame = new JFrame("Dialogo de mensajes");
        UsuariosDatosEncapsulados objUsuariosDatosEncapsulados = new UsuariosDatosEncapsulados();

        while (ValidaDatosIngreso.bUsuarioValido != true)
        {
            recuperarContrasenia.ValidaCadenaAlfanumerica(jTFCiudadNacimiento.getText(), "ciudad", "ciudad"); //Usuario de 5 digitos o más, pero no más de 100. Y letras con numeros.
            break;
        }
        objUsuariosDatosEncapsulados.setsCiudad(jTFCiudadNacimiento.getText());
        while (ValidaDatosIngreso.bCorreoValido != true)
        {
            recuperarContrasenia.ValidaCorreo(jTFCorreo.getText());
            break;
        }
        objUsuariosDatosEncapsulados.setsEmail(jTFCorreo.getText());

        int iResultado = UsuariosModelo.verificarPreguntas(objUsuariosDatosEncapsulados);
        if (ValidaDatosIngreso.iCadenaInvalida == 0)
        {
            if (iResultado == 0)
            {
                Mensajes.exito(objFrame);
                RecuperarContrasena objRecuperarContrasena = new RecuperarContrasena();
                objRecuperarContrasena.setVisible(true);
                this.dispose();
            } else
            {
                Mensajes.falla(objFrame);
            }
        }
        ValidaDatosIngreso.bCorreoValido = false;
        ValidaDatosIngreso.bUsuarioValido = false;
        Manipular.limpiaCajas(jTFCiudadNacimiento, jTFCorreo);
    }//GEN-LAST:event_jBPreguntasSegurasActionPerformed

    private void jTFCorreoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFCorreoKeyPressed
    {//GEN-HEADEREND:event_jTFCorreoKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jBPreguntasSeguras);
        }
    }//GEN-LAST:event_jTFCorreoKeyPressed

    private void jTFCiudadNacimientoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFCiudadNacimientoKeyPressed
    {//GEN-HEADEREND:event_jTFCiudadNacimientoKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jTFCorreo);
        }
    }//GEN-LAST:event_jTFCiudadNacimientoKeyPressed

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTFCorreoActionPerformed
    {//GEN-HEADEREND:event_jTFCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(VerificarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VerificarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VerificarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VerificarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VerificarPreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPreguntasSeguras;
    private javax.swing.JLabel jLFCorreo;
    private javax.swing.JLabel jLFLugarNacimiento;
    private javax.swing.JTextField jTFCiudadNacimiento;
    private javax.swing.JTextField jTFCorreo;
    // End of variables declaration//GEN-END:variables
}
