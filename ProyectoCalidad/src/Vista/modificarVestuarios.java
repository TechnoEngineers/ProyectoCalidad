/*
 * Techno Engineers
 * Modificar Vestuario
 * 23/04/2016 -- Autorizo: Luis Fernando Nava Ramirez // Elizabeth Garcia Nava
 * Modificación de vestuarios 
 * Sirve para modificar los registros de vestuarios
 * Numero de metodos en el código: 
 * Interfaces: modificarVestuario
 */
package Vista;

import Controlador.ManipulaInterfaces;
import Controlador.Validaciones;
import Modelo.Conexion;
import Modelo.Querys;
import Vista.mensajes.Mensajes;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class modificarVestuarios extends javax.swing.JFrame {

    /**
     * Creates new form modificarVestuarios
     */
    public modificarVestuarios() {
        initComponents();
    }
    
    public int validaCamposVacios()
    {
        if (descripcion.getText().equals(""))
        {
            Mensajes.falla(this, "Selecciona una descripcion valida");
            descripcion.requestFocus();
            return 1;
        } else if (color.getText().equals(""))
        {
            Mensajes.falla(this, "Selecciona un color valido");
            color.requestFocus();
            return 1;
        }
        return 0;
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
        jPanel2 = new javax.swing.JPanel();
        jLDescripcion = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLClave = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLSexo = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        jLColor = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLDescripcion.setText("Descripción: ");
        jLDescripcion.setPreferredSize(new java.awt.Dimension(61, 30));

        descripcion.setEnabled(false);
        descripcion.setPreferredSize(new java.awt.Dimension(59, 30));
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionKeyTyped(evt);
            }
        });

        jLClave.setText("Tipo:");
        jLClave.setPreferredSize(new java.awt.Dimension(61, 30));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prenda", "Accesorio" }));
        tipo.setEnabled(false);
        tipo.setPreferredSize(new java.awt.Dimension(56, 30));
        tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipoKeyTyped(evt);
            }
        });

        jLSexo.setText("Sexo:");
        jLSexo.setPreferredSize(new java.awt.Dimension(61, 30));

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        sexo.setEnabled(false);
        sexo.setPreferredSize(new java.awt.Dimension(56, 30));
        sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sexoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sexoKeyTyped(evt);
            }
        });

        jLColor.setText("Color:");
        jLColor.setPreferredSize(new java.awt.Dimension(29, 30));

        color.setEnabled(false);
        color.setPreferredSize(new java.awt.Dimension(59, 30));
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                colorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.setMaximumSize(new java.awt.Dimension(120, 50));
        jBguardar.setMinimumSize(new java.awt.Dimension(120, 50));
        jBguardar.setPreferredSize(new java.awt.Dimension(120, 50));
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        jBguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBguardarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBguardarKeyTyped(evt);
            }
        });

        jBcancelar.setText("Cancelar");
        jBcancelar.setMaximumSize(new java.awt.Dimension(120, 50));
        jBcancelar.setMinimumSize(new java.awt.Dimension(120, 50));
        jBcancelar.setPreferredSize(new java.awt.Dimension(120, 50));
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        jBcancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBcancelarKeyTyped(evt);
            }
        });

        jLabel1.setText("Ingresa el id a Modificar: ");

        id.setPreferredSize(new java.awt.Dimension(59, 30));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyTyped
        Validaciones.cadenaN(evt);
    }//GEN-LAST:event_descripcionKeyTyped

    private void tipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoKeyTyped
        
    }//GEN-LAST:event_tipoKeyTyped

    private void sexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexoKeyTyped
        
    }//GEN-LAST:event_sexoKeyTyped

    private void colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyTyped
        Validaciones.cadena(evt);
    }//GEN-LAST:event_colorKeyTyped

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        int r = this.validaCamposVacios();
        if (r == 0)
        {
            Conexion con = new Conexion();
            con.Conecta("localhost", "trajin", "root", "123456");
            if (con.con != null)
            {
                String s= "tipo, descripcion, color, sexo";
                String n = "'" + tipo.getSelectedItem().toString().charAt(0) + "','" + descripcion.getText() + "','" + color.getText()
                        + "','" + sexo.getSelectedItem().toString().charAt(0) + "'";
                Querys q = new Querys();
                q.Modificar(con.con, "vestuarios", s, n, "idvestuario = " + id.getText());

                try
                {
                    con.con.close();
                    Mensajes.exito(this);

                } catch (Exception ex)
                {
                    Mensajes.msj(this, "Error en DB... " + ex.getMessage());
                }
            }
            jBcancelarActionPerformed(evt);
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBguardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBguardarKeyTyped
        
    }//GEN-LAST:event_jBguardarKeyTyped

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        // TODO add your handling code here:
        ManipulaInterfaces.limpia(id);
        ManipulaInterfaces.habilita(id, true);
        ManipulaInterfaces.habObjetos(false, descripcion, color, sexo, jBguardar, tipo);
        tipo.setSelectedIndex(0);
        tipo.requestFocus();
        sexo.setSelectedIndex(0);
        sexo.requestFocus();
        id.requestFocus();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBcancelarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBcancelarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jBcancelarKeyTyped

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
            ArrayList<Object> reg = new ArrayList();
            Conexion con = new Conexion();
            con.Conecta("localhost", "trajin", "root", "123456");
            if(con.con != null)
            {
                String s= "tipo, descripcion, color, sexo";
                Querys q = new Querys();
                reg = q.Seleccion(con.con, s,"vestuarios", "idvestuario = " + id.getText());
                try
                {
                    System.out.println(reg);
                    descripcion.setText(reg.get(1).toString());
                     if (reg.get(0).toString().equals("A")) {
                        tipo.setSelectedItem("Accesorio");
                         System.out.println("acc");
                    } else {
                        tipo.setSelectedItem("Prenda");
                         System.out.println("pren");
                    }
                    if (reg.get(3).toString().equals(" M ")) {
                        sexo.setSelectedItem("Hombre");
                    } else {
                        sexo.setSelectedItem("Mujer");
                    }
                    color.setText(reg.get(2).toString());
                   
                    //tipo.setText(reg.get(0).toString());
                    //sexo.setText(reg.get(3).toString());
                    ManipulaInterfaces.habilita(jBguardar, true);
                    ManipulaInterfaces.habilita(id, false);
                    ManipulaInterfaces.cambiar(descripcion);
                    
                    con.con.close();
                    Mensajes.exito(this);
                    
                } catch (Exception ex)
                {
                   Mensajes.msj(this, "Error en DB... " + ex.getMessage());
                }
            }
        
    }//GEN-LAST:event_idActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:}
 
    }//GEN-LAST:event_idKeyTyped

    private void descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n')
        {
            ManipulaInterfaces.cambiar(tipo);
        }
    }//GEN-LAST:event_descripcionKeyPressed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
        Validaciones.entero(evt);
        if (evt.getKeyChar() == '\n')
        {
            ManipulaInterfaces.habilita(id, false);
            ManipulaInterfaces.cambiar(descripcion);
        }
    }//GEN-LAST:event_idKeyPressed

    private void tipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n')
        {
            ManipulaInterfaces.cambiar(sexo);
        }
    }//GEN-LAST:event_tipoKeyPressed

    private void sexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n')
        {
            ManipulaInterfaces.cambiar(color);
        }
    }//GEN-LAST:event_sexoKeyPressed

    private void colorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n')
        {
            ManipulaInterfaces.cambiar(jBguardar);
        }
    }//GEN-LAST:event_colorKeyPressed

    private void jBguardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBguardarKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyChar() == '\n')
        {
            jBguardarActionPerformed(null);
        }
    }//GEN-LAST:event_jBguardarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(modificarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarVestuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarVestuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField color;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField id;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLColor;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
