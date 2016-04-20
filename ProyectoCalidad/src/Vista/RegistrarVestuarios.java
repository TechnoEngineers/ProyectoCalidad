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
    }

    public void limpiarCampos()
    {
        jTFDescripcion.setText("");
        jTFColor.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLDescripcion = new javax.swing.JLabel();
        jTFDescripcion = new javax.swing.JTextField();
        jLClave = new javax.swing.JLabel();
        jCTipo = new javax.swing.JComboBox<>();
        jCSexo = new javax.swing.JComboBox<>();
        jLSexo = new javax.swing.JLabel();
        jLColor = new javax.swing.JLabel();
        jTFColor = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();

        setToolTipText("");

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

        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prenda", "Accesorio" }));
        jCTipo.setPreferredSize(new java.awt.Dimension(56, 30));

        jCSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jCSexo.setPreferredSize(new java.awt.Dimension(56, 30));

        jLSexo.setText("Sexo:");
        jLSexo.setPreferredSize(new java.awt.Dimension(61, 30));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDescripcionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFDescripcionKeyTyped
    {//GEN-HEADEREND:event_jTFDescripcionKeyTyped
        char c;
        c = evt.getKeyChar();
        if (jTFDescripcion.getText().length() <= 249)
        {
            if (evt.getKeyChar() == '\n')
            {
                Manipular.cambioObj(jCTipo);
            }else
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
            }else
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

    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<String> jCSexo;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLColor;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JTextField jTFColor;
    private javax.swing.JTextField jTFDescripcion;
    // End of variables declaration//GEN-END:variables
}
