/*
 * Techno Engineers
 * Login
 * 10/04/2016 -- Autorizo: Oscar de Paz Feliciano // Lider de proyecto
 * Modificaciones: Miguel Ángel Careaga Gómez // Desarrollo. [17/04/2016]
 * Sirve para controlar la estructura de la interfaz Login
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Vista;

import Controlador.Manipular;
import Controlador.ValidaDatosIngreso;
import Modelo.UsuariosDatosEncapsulados;
import Modelo.UsuariosModelo;
import Vista.mensajes.Mensajes;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JFrame;

/**
 * Valida el usuario y contraseña, para acceder al sistema.
 * @author Techno Engineers
 */
public class Login extends javax.swing.JFrame
{
    /**
     * Guarda si el usuario y contraseña son validos.
     */
    public static boolean bUsuarioContraseña=false;
    
    /**
     * Se crea el formulario.
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
        AyudaLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(208, 208, 208));

        jLNombre.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLNombre.setText("Usuario: ");

        jLContrasena.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLContrasena.setText("Contraseña: ");

        jTFNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTFNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTFNombreActionPerformed(evt);
            }
        });
        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFNombreKeyPressed(evt);
            }
        });

        jPFContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPFContrasena.setForeground(new java.awt.Color(51, 51, 51));
        jPFContrasena.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jPFContrasenaKeyPressed(evt);
            }
        });

        jBAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login/Login/Entrar.png"))); // NOI18N
        jBAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAcceder.setPreferredSize(new java.awt.Dimension(120, 50));
        jBAcceder.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBAccederActionPerformed(evt);
            }
        });

        jLRecuperarContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLRecuperarContrasena.setText("¿Olvidaste tu contraseña?");
        jLRecuperarContrasena.setToolTipText("");
        jLRecuperarContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLRecuperarContrasena.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLRecuperarContrasenaMouseClicked(evt);
            }
        });

        AyudaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login/Login/Ayuda.png"))); // NOI18N
        AyudaLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AyudaLogin.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                AyudaLoginMouseClicked(evt);
            }
        });
        AyudaLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AyudaLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Copyright 2016 by Techno Engineers. All rights reserved.");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AyudaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(138, 138, 138)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(jBAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLContrasena)
                                        .addComponent(jLNombre)
                                        .addComponent(jPFContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jTFNombre)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLRecuperarContrasena)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AyudaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLRecuperarContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login/Login/Iniciar sesión.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Se hace la interfaz de validación pata el usuario y contraseña, evalua si son correctos o no.
     * @param evt 
     */
    private void jBAccederActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBAccederActionPerformed
    {//GEN-HEADEREND:event_jBAccederActionPerformed
        ValidaDatosIngreso usuario = new ValidaDatosIngreso(); 
        MenuPrincipal mandaInicio = new MenuPrincipal();
        JFrame objFrame = new JFrame("Dialogo de mensajes"); //Se crea las ventanas emergentes.
        UsuariosDatosEncapsulados objUsuariosDatosEncapsulados = new UsuariosDatosEncapsulados();

        while (ValidaDatosIngreso.bUsuarioValido != true)
        {
            usuario.validaCadenaAlfanumerica(jTFNombre.getText(), "usuario", "usuario"); //Usuario de 5 digitos o más, pero no más de 100. Y letras con numeros.
            break;
        }
        objUsuariosDatosEncapsulados.setUsuario(ValidaDatosIngreso.sCadenaSinEspacios); //Se manda el usuario sin espacios al inicio y final.
        while (ValidaDatosIngreso.bContraseniaValida != true) 
        {
            usuario.validaContrasenia(jPFContrasena.getText()); //Valida que sea mayor o igual a 4 digitos y menor que 101.
            break;
        }

        objUsuariosDatosEncapsulados.setContrasena(jPFContrasena.getText());
        int n = UsuariosModelo.consultarUsuarios(objUsuariosDatosEncapsulados);
        if (ValidaDatosIngreso.bUsuarioValido == true && ValidaDatosIngreso.bContraseniaValida==true)
        {
            if (n == 0) //Verifica si la caja de texto esta vacia.
            {
                
                bUsuarioContraseña=true;
                //Mensajes.exito(objFrame);
            } else
            {
                if (ValidaDatosIngreso.bUsuarioValido == true && ValidaDatosIngreso.bContraseniaValida == true) //Si contraseña y usuario sonvalidos pero no entontrados, entonces manda mensaje de error.
                {
                    bUsuarioContraseña=false;
                    Mensajes.falla(objFrame, "Acceso denegado, usuario no encontrado.");
                }
            }    
            ValidaDatosIngreso.bCajaContraseniaVacia = true; //Se limpian variables.
            ValidaDatosIngreso.bUsuarioValido = false;
            ValidaDatosIngreso.bContraseniaValida = false;
            objUsuariosDatosEncapsulados.setUsuario(ValidaDatosIngreso.sCadenaSinEspacios); //Se manda el usuario sin espacios al inicio y final.
            objUsuariosDatosEncapsulados.setContrasena(null);
            if(bUsuarioContraseña==true)
            {
                dispose(); //Desaparece la ventana anterior y muestra la de inicio.
                mandaInicio.setVisible(bUsuarioContraseña);
            }
            
        }
        Manipular.limpiaCajas(jTFNombre, jPFContrasena); //Limpia las cajas de texto.
    }//GEN-LAST:event_jBAccederActionPerformed
    
    /**
     * Llama a la interfaz de recuperar contraseña y oculta la anterior.
     * @param evt recibe la accion del clic.
     */
    private void jLRecuperarContrasenaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLRecuperarContrasenaMouseClicked
    {//GEN-HEADEREND:event_jLRecuperarContrasenaMouseClicked
        VerificarUsuario objVerificarUsuario = new VerificarUsuario();
        objVerificarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLRecuperarContrasenaMouseClicked
    
    /**
     * Cambia a la caja nombre.
     * @param evt recibe la accion del clic.
     */
    private void jTFNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFNombreKeyPressed
    {//GEN-HEADEREND:event_jTFNombreKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jPFContrasena);
        }
    }//GEN-LAST:event_jTFNombreKeyPressed
    
    /**
     * Cambia a la caja contraseña.
     * @param evt recibe ja accion del clic.
     */
    private void jPFContrasenaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPFContrasenaKeyPressed
    {//GEN-HEADEREND:event_jPFContrasenaKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jBAcceder);
        }
    }//GEN-LAST:event_jPFContrasenaKeyPressed
    
    
    private void AyudaLoginMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AyudaLoginMouseClicked
    {//GEN-HEADEREND:event_AyudaLoginMouseClicked
        AyudaLogin objAyudaLogin = new AyudaLogin();
        objAyudaLogin.setVisible(true);
        //dispose();
    }//GEN-LAST:event_AyudaLoginMouseClicked

    private void AyudaLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AyudaLoginActionPerformed
    {//GEN-HEADEREND:event_AyudaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AyudaLoginActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTFNombreActionPerformed
    {//GEN-HEADEREND:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    /**
     * Se hace visible la interfaz del login.
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
    private javax.swing.JButton AyudaLogin;
    private javax.swing.JButton jBAcceder;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLRecuperarContrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPFContrasena;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
