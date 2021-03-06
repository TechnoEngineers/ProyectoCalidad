/*
 * Techno Engineers
 * Login
 * 20/04/2016 -- Autorizo: Jonathan Rojas Simón // scrum master
 * Registrar Vestuario: 
 * Sirve para controlar la estructura de la interfaz Registrar Vestuarios
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Vista;

import Controlador.Manipular;
import Modelo.VestuariosDatosEncapsulados;
import Modelo.VestuariosModelo;
import Vista.mensajes.Mensajes;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class RegistrarVestuarios extends javax.swing.JPanel
{

    JFrame objFrame = new JFrame();

    public RegistrarVestuarios()
    {
        initComponents();
        jTFDescripcion.requestFocusInWindow();
    }

    public void limpiarCampos()
    {
        jTFDescripcion.setText("");
        jTFColor.setText("");
    }

    public void enviarDatos()
    {
        VestuariosModelo objVestuariosModelo = new VestuariosModelo();
        Mensajes objMensajes = new Mensajes();

        VestuariosDatosEncapsulados objVestuariosDatosEncapsulados = new VestuariosDatosEncapsulados();
        objVestuariosDatosEncapsulados.setcTipo(jCTipo.getSelectedItem().toString().charAt(0));
        objVestuariosDatosEncapsulados.setsDescripcion(jTFDescripcion.getText());
        objVestuariosDatosEncapsulados.setScolor(jTFColor.getText());
        objVestuariosDatosEncapsulados.setcSexo(jCSexo.getSelectedItem().toString().charAt(0));
        if (jTFDescripcion.getText().equals("") || jTFColor.getText().equals(""))
        {
            Mensajes.falla(objFrame, "Error, Hay campos vacios");
        } else
        {
            if (objVestuariosModelo.registrarVestuarios(objVestuariosDatosEncapsulados))
            {
                objMensajes.exito(objFrame);
                this.limpiarCampos();
            } else
            {
                objMensajes.falla(objFrame);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLDescripcion = new javax.swing.JLabel();
        jTFDescripcion = new javax.swing.JTextField();
        jLClave = new javax.swing.JLabel();
        jCTipo = new javax.swing.JComboBox<String>();
        jLSexo = new javax.swing.JLabel();
        jCSexo = new javax.swing.JComboBox<String>();
        jLColor = new javax.swing.JLabel();
        jTFColor = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();

        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLDescripcion.setText("Descripción: ");
        jLDescripcion.setPreferredSize(new java.awt.Dimension(61, 30));

        jTFDescripcion.setPreferredSize(new java.awt.Dimension(59, 30));
        jTFDescripcion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFDescripcionKeyTyped(evt);
            }
        });

        jLClave.setText("Tipo:");
        jLClave.setPreferredSize(new java.awt.Dimension(61, 30));

        jCTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prenda", "Accesorio" }));
        jCTipo.setPreferredSize(new java.awt.Dimension(56, 30));
        jCTipo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jCTipoKeyTyped(evt);
            }
        });

        jLSexo.setText("Sexo:");
        jLSexo.setPreferredSize(new java.awt.Dimension(61, 30));

        jCSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));
        jCSexo.setPreferredSize(new java.awt.Dimension(56, 30));
        jCSexo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jCSexoKeyTyped(evt);
            }
        });

        jLColor.setText("Color:");
        jLColor.setPreferredSize(new java.awt.Dimension(29, 30));

        jTFColor.setPreferredSize(new java.awt.Dimension(59, 30));
        jTFColor.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFColorKeyTyped(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.setMaximumSize(new java.awt.Dimension(120, 50));
        jBGuardar.setMinimumSize(new java.awt.Dimension(120, 50));
        jBGuardar.setPreferredSize(new java.awt.Dimension(120, 50));
        jBGuardar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBGuardarActionPerformed(evt);
            }
        });
        jBGuardar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jBGuardarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDescripcionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFDescripcionKeyTyped
    {//GEN-HEADEREND:event_jTFDescripcionKeyTyped
        char c;
        c = evt.getKeyChar();

        if (jTFDescripcion.getText().length() == 0 && Character.isDigit(c))
        {
                Mensajes.falla(objFrame, "No puedes ingresar un numero al inicio");
                evt.consume();
                getToolkit().beep();
        } else
        {
            if (jTFDescripcion.getText().length() <= 249)
            {
                if (evt.getKeyChar() == '\n')
                {
                    Manipular.cambioObj(jCTipo);
                } else
                {
                    if (!Character.isLetter(c) && !Character.isDigit(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE)
                    {
                        evt.consume();
                        getToolkit().beep();
                    }
                }

            } else
            {
                evt.consume();
                getToolkit().beep();
            }
        }

    }//GEN-LAST:event_jTFDescripcionKeyTyped

    private void jTFColorKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFColorKeyTyped
    {//GEN-HEADEREND:event_jTFColorKeyTyped
        char c;
        c = evt.getKeyChar();
        if (jTFColor.getText().length() <= 49)
        {
            if (evt.getKeyChar() == '\n')
            {
                Manipular.cambioObj(jBGuardar);
            } else
            {
                if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE)
                {
                    evt.consume();
                    getToolkit().beep();
                    Mensajes.falla(objFrame, "Error, No puede ingresar numeros y/o caracteres");
                }
            }
        } else
        {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTFColorKeyTyped

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBGuardarActionPerformed
    {//GEN-HEADEREND:event_jBGuardarActionPerformed
        this.enviarDatos();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jCTipoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jCTipoKeyTyped
    {//GEN-HEADEREND:event_jCTipoKeyTyped
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jCSexo);
        }
    }//GEN-LAST:event_jCTipoKeyTyped

    private void jCSexoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jCSexoKeyTyped
    {//GEN-HEADEREND:event_jCSexoKeyTyped
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jTFColor);
        }
    }//GEN-LAST:event_jCSexoKeyTyped

    private void jBGuardarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jBGuardarKeyTyped
    {//GEN-HEADEREND:event_jBGuardarKeyTyped
        this.enviarDatos();
    }//GEN-LAST:event_jBGuardarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<String> jCSexo;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLColor;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFColor;
    private javax.swing.JTextField jTFDescripcion;
    // End of variables declaration//GEN-END:variables
}
