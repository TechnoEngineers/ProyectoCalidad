/*
 * Techno Engineers
 * Cuadros
 * 23/04/2016 -- Autorizo: Oscar De Paz Feliciano
 * Consulta de vestuario: 
 * Sirve para ver toda la lista de los cuadros registrados
 * Numero de metodos en el código: 6
 * Interfaces: 
 */
package Vista;

import Controlador.ValidaDatosIngreso;
import Modelo.CuadrosModelo;
import Vista.mensajes.Mensajes;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ConsultarCuadros extends javax.swing.JFrame
{

   
    public ConsultarCuadros()
    {
        initComponents();
        this.mostrar("");
        jTCuadros.setEnabled(false);
    }
    
    DefaultTableModel dTablaVestuario;
    JFrame jf = new JFrame();

    private void mostrar(String sBuscar)
    {
        try
        {
            CuadrosModelo objCuadrosModelo = new CuadrosModelo();
            dTablaVestuario = objCuadrosModelo.buscarCuadros(sBuscar);
            jTCuadros.setModel(dTablaVestuario);
            this.ocultarColumnas();
        } catch (Exception e)
        {
            Mensajes.falla(jf);
        }
    }
    private void ocultarColumnas()
    {
        jTCuadros.getColumnModel().getColumn(0).setMaxWidth(0);
        jTCuadros.getColumnModel().getColumn(0).setMinWidth(0);
        jTCuadros.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jSPTablaCuadros = new javax.swing.JScrollPane();
        jTCuadros = new javax.swing.JTable();
        jTFConsultarCuadros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar cuadros");
        setType(java.awt.Window.Type.UTILITY);

        jSPTablaCuadros.setViewportView(jTCuadros);

        jTFConsultarCuadros.setPreferredSize(new java.awt.Dimension(6, 30));
        jTFConsultarCuadros.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTFConsultarCuadrosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFConsultarCuadrosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFConsultarCuadros, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSPTablaCuadros, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFConsultarCuadros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSPTablaCuadros, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFConsultarCuadrosKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFConsultarCuadrosKeyTyped
    {//GEN-HEADEREND:event_jTFConsultarCuadrosKeyTyped
        ValidaDatosIngreso.cadena(evt);
        int ilimite=49;
        if (jTFConsultarCuadros.getText().length() == ilimite)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTFConsultarCuadrosKeyTyped

    private void jTFConsultarCuadrosKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFConsultarCuadrosKeyReleased
    {//GEN-HEADEREND:event_jTFConsultarCuadrosKeyReleased
        this.mostrar(jTFConsultarCuadros.getText());
    }//GEN-LAST:event_jTFConsultarCuadrosKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ConsultarCuadros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jSPTablaCuadros;
    private javax.swing.JTable jTCuadros;
    private javax.swing.JTextField jTFConsultarCuadros;
    // End of variables declaration//GEN-END:variables
}
