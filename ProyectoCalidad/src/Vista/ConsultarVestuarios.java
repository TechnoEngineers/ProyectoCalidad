/*
 * Techno Engineers
 * Vestuarios
 * 19/04/2016 -- Autorizo: Jonathan Rojas Simón // scrum master
 * Consulta de vestuario: 
 * Sirve para ver toda la lista de vestuarios
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */

package Vista;
import Modelo.VestuariosModelo;
import Vista.mensajes.Mensajes;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ConsultarVestuarios extends javax.swing.JPanel
{

    DefaultTableModel objjTVestuario;
    JFrame jf = new JFrame();

    public ConsultarVestuarios()
    {
        initComponents();
        this.mostrar("");
    }

    private void mostrar(String sBuscar)
    {
        try
        {
            VestuariosModelo objVestuariosModelo = new VestuariosModelo();
            objjTVestuario = objVestuariosModelo.mostrarVestuarios(sBuscar);
            jTVestuario.setModel(objjTVestuario);
            this.ocultarColumnas();
        } catch (Exception e)
        {
            Mensajes.falla(jf);
        }
    }

    private void ocultarColumnas()
    {
        jTVestuario.getColumnModel().getColumn(0).setMaxWidth(0);
        jTVestuario.getColumnModel().getColumn(0).setMinWidth(0);
        jTVestuario.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLBuscarVestuario = new javax.swing.JLabel();
        jTFBuscarVestuario = new javax.swing.JTextField();
        jSVestuario = new javax.swing.JScrollPane();
        jTVestuario = new javax.swing.JTable();

        jLBuscarVestuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N

        jTFBuscarVestuario.setPreferredSize(new java.awt.Dimension(59, 30));
        jTFBuscarVestuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTFBuscarVestuarioActionPerformed(evt);
            }
        });
        jTFBuscarVestuario.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFBuscarVestuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFBuscarVestuarioKeyTyped(evt);
            }
        });

        jTVestuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jSVestuario.setViewportView(jTVestuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSVestuario, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLBuscarVestuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFBuscarVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBuscarVestuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscarVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscarVestuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTFBuscarVestuarioActionPerformed
    {//GEN-HEADEREND:event_jTFBuscarVestuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscarVestuarioActionPerformed

    private void jTFBuscarVestuarioKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFBuscarVestuarioKeyPressed
    {//GEN-HEADEREND:event_jTFBuscarVestuarioKeyPressed
        this.mostrar(jTFBuscarVestuario.getText());
    }//GEN-LAST:event_jTFBuscarVestuarioKeyPressed

    private void jTFBuscarVestuarioKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFBuscarVestuarioKeyTyped
    {//GEN-HEADEREND:event_jTFBuscarVestuarioKeyTyped
        char c;
        c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isDigit(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
            getToolkit().beep();
            Mensajes.falla(jf, "Error, No puede ingresar caracteres especiales.");
        }
    }//GEN-LAST:event_jTFBuscarVestuarioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBuscarVestuario;
    private javax.swing.JScrollPane jSVestuario;
    private javax.swing.JTextField jTFBuscarVestuario;
    private javax.swing.JTable jTVestuario;
    // End of variables declaration//GEN-END:variables
}
