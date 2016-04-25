/*
 * Techno Engineers
 * Registro de cuadros
 * 23/04/2016 -- Autorizo: Oscar De Paz Feliciano
 * Registro de cuadros: 
 * Sirve para dar de alta a los cuadros o estados
 * Numero de metodos en el código: 9
 * Interfaces: 
 */
package Vista;

import Controlador.Manipular;
import Controlador.ValidaDatosIngreso;
import Vista.mensajes.Mensajes;
import Modelo.Conexion;
import Modelo.Querys;

public class RegistrarCuadros extends javax.swing.JFrame
{

    public RegistrarCuadros()
    {
        initComponents();
    }

    public int validaCamposVacios()
    {
        if (jTFNombreCuadro.getText().equals(""))
        {
            Mensajes.falla(this, "Escribe un nombre de cuadro valido");
            jTFNombreCuadro.requestFocus();
            return 1;
        } else if (jTFTiempo.getText().equals(""))
        {
            Mensajes.falla(this, "Escribe un tiempo valido");
            jTFTiempo.requestFocus();
            return 1;
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNombreCuadro = new javax.swing.JLabel();
        jTFNombreCuadro = new javax.swing.JTextField();
        jLTempo = new javax.swing.JLabel();
        jTFTiempo = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de cuadros");
        setType(java.awt.Window.Type.UTILITY);

        jLNombreCuadro.setText("Nombre de cuadro:");

        jTFNombreCuadro.setPreferredSize(new java.awt.Dimension(6, 30));
        jTFNombreCuadro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNombreCuadroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreCuadroKeyTyped(evt);
            }
        });

        jLTempo.setText("Tiempo de cambio: ");

        jTFTiempo.setEnabled(false);
        jTFTiempo.setPreferredSize(new java.awt.Dimension(6, 30));
        jTFTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFTiempoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTiempoKeyTyped(evt);
            }
        });

        jBAceptar.setText("Aceptar");
        jBAceptar.setEnabled(false);
        jBAceptar.setPreferredSize(new java.awt.Dimension(120, 50));
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });
        jBAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAceptarKeyPressed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.setPreferredSize(new java.awt.Dimension(120, 50));
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNombreCuadro)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNombreCuadro, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTempo)
                        .addGap(18, 18, 18)
                        .addComponent(jTFTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreCuadro)
                    .addComponent(jTFNombreCuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTempo)
                    .addComponent(jTFTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombreCuadroKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFNombreCuadroKeyPressed
    {//GEN-HEADEREND:event_jTFNombreCuadroKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jTFTiempo);
        }
    }//GEN-LAST:event_jTFNombreCuadroKeyPressed

    private void jTFNombreCuadroKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFNombreCuadroKeyTyped
    {//GEN-HEADEREND:event_jTFNombreCuadroKeyTyped
        ValidaDatosIngreso.cadena(evt);
        int ilimite=49;
        if (jTFNombreCuadro.getText().length() == ilimite)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTFNombreCuadroKeyTyped

    private void jTFTiempoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFTiempoKeyPressed
    {//GEN-HEADEREND:event_jTFTiempoKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            Manipular.cambioObj(jBAceptar);
        }
    }//GEN-LAST:event_jTFTiempoKeyPressed

    private void jTFTiempoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFTiempoKeyTyped
    {//GEN-HEADEREND:event_jTFTiempoKeyTyped
        ValidaDatosIngreso.entero(evt);
        int ilimite=9;
        if (jTFTiempo.getText().length() == ilimite)
        {
            evt.consume();
        }

    }//GEN-LAST:event_jTFTiempoKeyTyped

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBAceptarActionPerformed
    {//GEN-HEADEREND:event_jBAceptarActionPerformed
        int r = this.validaCamposVacios();
        if (r == 0)
        {
            Conexion objConexion = new Conexion();
            objConexion.Conecta("localhost", "trajin", "root", "101125");
            if (objConexion.con != null)
            {
                String sCadena = "null," + "'" + jTFNombreCuadro.getText() + "'," + jTFTiempo.getText() + "";
                Querys objQuerys = new Querys();
                objQuerys.Insertar(objConexion.con, "cuadros", sCadena);

                try
                {
                    objConexion.con.close();
                    Mensajes.exito(this);

                } catch (Exception ex)
                {
                    Mensajes.msj(this, "Error en DB... " + ex.getMessage());
                }
            }
            jBCancelarActionPerformed(evt);
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jBAceptarKeyPressed
    {//GEN-HEADEREND:event_jBAceptarKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            jBAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_jBAceptarKeyPressed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBCancelarActionPerformed
    {//GEN-HEADEREND:event_jBCancelarActionPerformed
        Manipular.deshabilitaObj(false, jTFTiempo, jBAceptar);
        Manipular.limpiaCajas(jTFNombreCuadro, jTFTiempo);
        jTFNombreCuadro.requestFocus();
    }//GEN-LAST:event_jBCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RegistrarCuadros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLNombreCuadro;
    private javax.swing.JLabel jLTempo;
    private javax.swing.JTextField jTFNombreCuadro;
    private javax.swing.JTextField jTFTiempo;
    // End of variables declaration//GEN-END:variables
}
