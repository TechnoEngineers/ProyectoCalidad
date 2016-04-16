/*
 * Techno Engineers
 * Login
 * 10/04/2016 -- Autorizo: Oscar de Paz Feliciano // Lider de proyecto
 * Modificaciones: 
 * Sirve para controlar la estructura de la interfaz Login
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Vista;

import Controlador.Manipular;
import Controlador.ValidaDatosIngreso;
import static Controlador.ValidaDatosIngreso.bCajaContraseniaVacia;
import Modelo.UsuariosDatosEncapsulados;
import Modelo.UsuariosModelo;
import Vista.mensajes.Mensajes;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Techno Engineers
 */
public class Login extends javax.swing.JFrame
{

    /**
     * Creates new form Login
     */
    public Login()
    {
        initComponents();
        Font font = jLRecuperarContrasena.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLRecuperarContrasena.setFont(font.deriveFont(attributes));
        jLRecuperarContrasena.setForeground(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        jLContrasena = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jPFContrasena = new javax.swing.JPasswordField();
        jBAcceder = new javax.swing.JButton();
        jLRecuperarContrasena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLNombre.setText("Usuario: ");

        jLContrasena.setText("Contraseña: ");

        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFNombreKeyPressed(evt);
            }
        });

        jPFContrasena.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jPFContrasenaKeyPressed(evt);
            }
        });

        jBAcceder.setText("Acceder");
        jBAcceder.setPreferredSize(new java.awt.Dimension(120, 50));
        jBAcceder.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBAccederActionPerformed(evt);
            }
        });

        jLRecuperarContrasena.setText("¿Olvidaste tu contraseña?");
        jLRecuperarContrasena.setToolTipText("");
        jLRecuperarContrasena.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLRecuperarContrasenaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLRecuperarContrasena))
                    .addComponent(jLContrasena)
                    .addComponent(jLNombre)
                    .addComponent(jPFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLContrasena)
                .addGap(4, 4, 4)
                .addComponent(jPFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLRecuperarContrasena)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAccederActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBAccederActionPerformed
    {//GEN-HEADEREND:event_jBAccederActionPerformed
        ValidaDatosIngreso usuario = new ValidaDatosIngreso();
        JFrame objFrame = new JFrame("Dialogo de mensajes");
        UsuariosDatosEncapsulados objUsuariosDatosEncapsulados = new UsuariosDatosEncapsulados();

        while (ValidaDatosIngreso.bUsuarioValido != true)
        {
            usuario.ValidaCadenaAlfanumerica(jTFNombre.getText(), "usuario", "usuario"); //Usuario de 5 digitos o más, pero no más de 100. Y letras con numeros.
            break;
        }
        objUsuariosDatosEncapsulados.setNombreUsuario(ValidaDatosIngreso.sCadenaSinEspacios); //Se manda el usuario sin espacios al inicio y final.
        while (ValidaDatosIngreso.bContraseniaValida != true)
        {
            usuario.ValidaContrasenia(jPFContrasena.getText());
            break;
        }

        objUsuariosDatosEncapsulados.setContrasena(jPFContrasena.getText()); //Contraseña de 4 digitos o más, pero no más de 100.
        int n = UsuariosModelo.consultarUsuarios(objUsuariosDatosEncapsulados);
        if (ValidaDatosIngreso.bUsuarioValido == true && ValidaDatosIngreso.bContraseniaValida==true)
        {
            if (n == 0) //Verifica si la caja de texto esta vacia.
            {
                Mensajes.exito(objFrame);
            } else
            {
                if (ValidaDatosIngreso.bUsuarioValido == true && ValidaDatosIngreso.bContraseniaValida == true)
                {
                    Mensajes.falla(objFrame, "Acceso denegado.");
                }
            }    
            ValidaDatosIngreso.bCajaContraseniaVacia = true;
            ValidaDatosIngreso.bUsuarioValido = false;
            ValidaDatosIngreso.bContraseniaValida = false;
            objUsuariosDatosEncapsulados.setNombreUsuario(ValidaDatosIngreso.sCadenaSinEspacios); //Se manda el usuario sin espacios al inicio y final.
            objUsuariosDatosEncapsulados.setContrasena(null);
        }
        Manipular.limpiaCajas(jTFNombre, jPFContrasena);
    }//GEN-LAST:event_jBAccederActionPerformed

    private void jLRecuperarContrasenaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLRecuperarContrasenaMouseClicked
    {//GEN-HEADEREND:event_jLRecuperarContrasenaMouseClicked
        VerificarUsuario objVerificarUsuario = new VerificarUsuario();
        objVerificarUsuario.setVisible(true);


    }//GEN-LAST:event_jLRecuperarContrasenaMouseClicked

    private void jTFNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFNombreKeyPressed
    {//GEN-HEADEREND:event_jTFNombreKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jPFContrasena);
        }
    }//GEN-LAST:event_jTFNombreKeyPressed

    private void jPFContrasenaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPFContrasenaKeyPressed
    {//GEN-HEADEREND:event_jPFContrasenaKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jBAcceder);
        }
    }//GEN-LAST:event_jPFContrasenaKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcceder;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLRecuperarContrasena;
    private javax.swing.JPasswordField jPFContrasena;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
