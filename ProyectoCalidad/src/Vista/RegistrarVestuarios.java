/*
 * Techno Engineers
 * Login
 * 16/04/2016 -- Autorizo: Jonathan Rojas Simón // scrum master
 * Modificaciones: 
 * Sirve para controlar la estructura de la interfaz Registrar Vestuarios
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Vista;

import Modelo.VestuariosDatosEncapsulados;
import Modelo.VestuariosModelo;
import Vista.mensajes.Mensajes;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistrarVestuarios extends javax.swing.JFrame
{

    public RegistrarVestuarios()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBConsultarVestuario = new javax.swing.JButton();
        jBRegistrarVestuario = new javax.swing.JButton();
        jPVestuario = new javax.swing.JPanel();
        jLDescripcion = new javax.swing.JLabel();
        jTFDescripcion = new javax.swing.JTextField();
        jLColor = new javax.swing.JLabel();
        jTFColor = new javax.swing.JTextField();
        jLClave = new javax.swing.JLabel();
        jCTipo = new javax.swing.JComboBox<String>();
        jLSexo = new javax.swing.JLabel();
        jCSexo = new javax.swing.JComboBox<String>();
        jBGuardar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jMBarraHerramientas = new javax.swing.JMenuBar();
        jMBailarines = new javax.swing.JMenu();
        jMVestuarios = new javax.swing.JMenu();
        jMEventos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBConsultarVestuario.setText("Consultar Vestuario");
        jBConsultarVestuario.setPreferredSize(new java.awt.Dimension(120, 50));

        jBRegistrarVestuario.setText("Registrar Vestuario");
        jBRegistrarVestuario.setPreferredSize(new java.awt.Dimension(120, 50));
        jBRegistrarVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarVestuarioActionPerformed(evt);
            }
        });

        jPVestuario.setBackground(new java.awt.Color(255, 255, 255));
        jPVestuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del vestuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLDescripcion.setText("Descripción: ");
        jLDescripcion.setPreferredSize(new java.awt.Dimension(61, 30));

        jTFDescripcion.setPreferredSize(new java.awt.Dimension(59, 30));
        jTFDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDescripcionKeyTyped(evt);
            }
        });

        jLColor.setText("Color:");
        jLColor.setPreferredSize(new java.awt.Dimension(29, 30));

        jTFColor.setPreferredSize(new java.awt.Dimension(59, 30));
        jTFColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFColorKeyTyped(evt);
            }
        });

        jLClave.setText("Tipo:");
        jLClave.setPreferredSize(new java.awt.Dimension(61, 30));

        jCTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prenda", "Accesorio" }));
        jCTipo.setPreferredSize(new java.awt.Dimension(56, 30));

        jLSexo.setText("Sexo:");
        jLSexo.setPreferredSize(new java.awt.Dimension(61, 30));

        jCSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));
        jCSexo.setPreferredSize(new java.awt.Dimension(56, 30));

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setMaximumSize(new java.awt.Dimension(120, 50));
        jBGuardar.setMinimumSize(new java.awt.Dimension(120, 50));
        jBGuardar.setPreferredSize(new java.awt.Dimension(120, 50));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cancelar.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setMaximumSize(new java.awt.Dimension(120, 50));
        jBCancelar.setMinimumSize(new java.awt.Dimension(120, 50));
        jBCancelar.setPreferredSize(new java.awt.Dimension(120, 50));

        javax.swing.GroupLayout jPVestuarioLayout = new javax.swing.GroupLayout(jPVestuario);
        jPVestuario.setLayout(jPVestuarioLayout);
        jPVestuarioLayout.setHorizontalGroup(
            jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVestuarioLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPVestuarioLayout.createSequentialGroup()
                        .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPVestuarioLayout.createSequentialGroup()
                        .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(jPVestuarioLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPVestuarioLayout.setVerticalGroup(
            jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVestuarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMBarraHerramientas.setPreferredSize(new java.awt.Dimension(165, 25));

        jMBailarines.setText("Bailarines");
        jMBarraHerramientas.add(jMBailarines);

        jMVestuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vestuarios.png"))); // NOI18N
        jMVestuarios.setText("Vestuarios");
        jMVestuarios.setToolTipText("");
        jMBarraHerramientas.add(jMVestuarios);

        jMEventos.setText("Eventos");
        jMBarraHerramientas.add(jMEventos);

        setJMenuBar(jMBarraHerramientas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jBConsultarVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBRegistrarVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConsultarVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRegistrarVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarVestuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBRegistrarVestuarioActionPerformed
    {//GEN-HEADEREND:event_jBRegistrarVestuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRegistrarVestuarioActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBGuardarActionPerformed
    {//GEN-HEADEREND:event_jBGuardarActionPerformed
        VestuariosModelo objVestuariosModelo = new VestuariosModelo();
        Mensajes objMensajes = new Mensajes();
        JFrame objFrame=new JFrame();
        
        
        VestuariosDatosEncapsulados objVestuariosDatosEncapsulados=new VestuariosDatosEncapsulados();
        objVestuariosDatosEncapsulados.setcTipo(jCTipo.getSelectedItem().toString().charAt(0));
        objVestuariosDatosEncapsulados.setsDescripcion(jTFDescripcion.getText());
        objVestuariosDatosEncapsulados.setScolor(jTFColor.getText());
        objVestuariosDatosEncapsulados.setcSexo(jCSexo.getSelectedItem().toString().charAt(0));
        if(jTFDescripcion.getText().equals("") || jTFColor.getText().equals(""))
        {
            Mensajes.falla(objFrame, "Error, Hay campos vacios");
        }else
        {
            if (objVestuariosModelo.registrarVestuarios(objVestuariosDatosEncapsulados)) 
            {
                objMensajes.exito(objFrame);
            }else
            {
                objMensajes.falla(objFrame);
            }  
        }
       
         
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDescripcionKeyTyped
        char c;
        c=evt.getKeyChar();
        if(!Character.isLetter(c)&& !Character.isDigit(c) && c!=KeyEvent.VK_SPACE && c!=KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
            getToolkit().beep();  
            
        }
    }//GEN-LAST:event_jTFDescripcionKeyTyped

    private void jTFColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFColorKeyTyped
        char c;
        c=evt.getKeyChar();
        if(!Character.isLetter(c) && c!=KeyEvent.VK_SPACE && c!=KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
            getToolkit().beep(); 
            Mensajes.falla(this, "Error, No puede ingresar numeros.");
        }
    }//GEN-LAST:event_jTFColorKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RegistrarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RegistrarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RegistrarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RegistrarVestuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConsultarVestuario;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBRegistrarVestuario;
    private javax.swing.JComboBox<String> jCSexo;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLColor;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JMenu jMBailarines;
    private javax.swing.JMenuBar jMBarraHerramientas;
    private javax.swing.JMenu jMEventos;
    private javax.swing.JMenu jMVestuarios;
    private javax.swing.JPanel jPVestuario;
    private javax.swing.JTextField jTFColor;
    private javax.swing.JTextField jTFDescripcion;
    // End of variables declaration//GEN-END:variables
}