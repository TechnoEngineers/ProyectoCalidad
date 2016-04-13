/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.UsuariosDatosEncapsulados;
import Modelo.UsuariosModelo;
import Vista.mensajes.Mensajes;
import javax.swing.JFrame;

/**
 *
 * @author mgool
 */
public class RecuperarContrasena extends javax.swing.JFrame
{

    /**
     * Creates new form RecuperarContrasena
     */
    public RecuperarContrasena()
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

        jLFContrasena = new javax.swing.JLabel();
        jLFRepetirContrasena = new javax.swing.JLabel();
        jBPreguntasSeguras = new javax.swing.JButton();
        jPFNuevaContrasena = new javax.swing.JPasswordField();
        jPFRepitaContrasena = new javax.swing.JPasswordField();
        txtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLFContrasena.setText("Nueva contraseña:");

        jLFRepetirContrasena.setText("Repita contraseña:");

        jBPreguntasSeguras.setText("Cambiar contraseña");
        jBPreguntasSeguras.setPreferredSize(new java.awt.Dimension(120, 50));
        jBPreguntasSeguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreguntasSegurasActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLFRepetirContrasena)
                    .addComponent(jPFRepitaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jPFNuevaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jBPreguntasSeguras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLFContrasena)
                    .addComponent(txtusuario))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLFContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLFRepetirContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPFRepitaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBPreguntasSeguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreguntasSegurasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBPreguntasSegurasActionPerformed
    {//GEN-HEADEREND:event_jBPreguntasSegurasActionPerformed
        JFrame objFrame = new JFrame("Dialogo de mensajes");
        UsuariosDatosEncapsulados objUsuariosDatosEncapsulados = new UsuariosDatosEncapsulados();
        //String nombre=objUsuariosDatosEncapsulados.getNombreUsuario();
        //objUsuariosDatosEncapsulados.setNombreUsuario(nombre);
        objUsuariosDatosEncapsulados.setNombreUsuario(txtusuario.getText());
        objUsuariosDatosEncapsulados.setContrasena(jPFRepitaContrasena.getText());
        if(jPFNuevaContrasena.getText().equals(jPFRepitaContrasena.getText()))
        {
            int n=UsuariosModelo.recuperarContrasenia(objUsuariosDatosEncapsulados);
            if(n==0)
            {
               Mensajes.exito(objFrame);
                System.out.println("Contraseñas iguales ");
                System.out.println(""+txtusuario);
            }else
            {
                Mensajes.falla(objFrame, "No se pudo realizar la accion solicitada");
                System.out.println("error");
            }
           
        }else
        {
            Mensajes.errorContrasenia(objFrame);
            System.out.println("no coinciden las contraseñas");
        }
    }//GEN-LAST:event_jBPreguntasSegurasActionPerformed

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
    private javax.swing.JButton jBPreguntasSeguras;
    private javax.swing.JLabel jLFContrasena;
    private javax.swing.JLabel jLFRepetirContrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPFNuevaContrasena;
    private javax.swing.JPasswordField jPFRepitaContrasena;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
