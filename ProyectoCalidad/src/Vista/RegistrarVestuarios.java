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

public class RegistrarVestuarios extends javax.swing.JFrame
{

    public RegistrarVestuarios()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jBConsultarVestuario = new javax.swing.JButton();
        jBRegistrarVestuario = new javax.swing.JButton();
        jPVestuario = new javax.swing.JPanel();
        jLSelecionarVestimenta = new javax.swing.JLabel();
        jBSeleccionarVestimenta = new javax.swing.JButton();
        jLVestimenta = new javax.swing.JLabel();
        jLMedida = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jTFDescripcion = new javax.swing.JTextField();
        jLColor = new javax.swing.JLabel();
        jTFColor = new javax.swing.JTextField();
        jSMedida = new javax.swing.JSpinner();
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
        jBRegistrarVestuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBRegistrarVestuarioActionPerformed(evt);
            }
        });

        jPVestuario.setBackground(new java.awt.Color(255, 255, 255));

        jLSelecionarVestimenta.setText("Seleccionar vestimenta: ");
        jLSelecionarVestimenta.setPreferredSize(new java.awt.Dimension(117, 30));

        jBSeleccionarVestimenta.setText("Seleccionar");
        jBSeleccionarVestimenta.setMaximumSize(new java.awt.Dimension(120, 50));
        jBSeleccionarVestimenta.setMinimumSize(new java.awt.Dimension(120, 50));
        jBSeleccionarVestimenta.setPreferredSize(new java.awt.Dimension(120, 50));

        jLVestimenta.setText("PB");
        jLVestimenta.setPreferredSize(new java.awt.Dimension(12, 30));

        jLMedida.setText("Medida:");
        jLMedida.setPreferredSize(new java.awt.Dimension(38, 30));

        jLDescripcion.setText("Descripción: ");
        jLDescripcion.setPreferredSize(new java.awt.Dimension(61, 30));

        jTFDescripcion.setPreferredSize(new java.awt.Dimension(59, 30));

        jLColor.setText("Color:");
        jLColor.setPreferredSize(new java.awt.Dimension(29, 30));

        jTFColor.setPreferredSize(new java.awt.Dimension(59, 30));

        jSMedida.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPVestuarioLayout = new javax.swing.GroupLayout(jPVestuario);
        jPVestuario.setLayout(jPVestuarioLayout);
        jPVestuarioLayout.setHorizontalGroup(
            jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVestuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSelecionarVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPVestuarioLayout.createSequentialGroup()
                        .addComponent(jBSeleccionarVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jLVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPVestuarioLayout.createSequentialGroup()
                        .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFColor, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jTFDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSMedida))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPVestuarioLayout.setVerticalGroup(
            jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVestuarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSeleccionarVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSelecionarVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPVestuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setMaximumSize(new java.awt.Dimension(120, 50));
        jBGuardar.setMinimumSize(new java.awt.Dimension(120, 50));
        jBGuardar.setPreferredSize(new java.awt.Dimension(120, 50));

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cancelar.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setMaximumSize(new java.awt.Dimension(120, 50));
        jBCancelar.setMinimumSize(new java.awt.Dimension(120, 50));
        jBCancelar.setPreferredSize(new java.awt.Dimension(120, 50));

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
                        .addGap(30, 30, 30)
                        .addComponent(jPVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarVestuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBRegistrarVestuarioActionPerformed
    {//GEN-HEADEREND:event_jBRegistrarVestuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRegistrarVestuarioActionPerformed

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
    private javax.swing.JButton jBSeleccionarVestimenta;
    private javax.swing.JLabel jLColor;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLMedida;
    private javax.swing.JLabel jLSelecionarVestimenta;
    private javax.swing.JLabel jLVestimenta;
    private javax.swing.JMenu jMBailarines;
    private javax.swing.JMenuBar jMBarraHerramientas;
    private javax.swing.JMenu jMEventos;
    private javax.swing.JMenu jMVestuarios;
    private javax.swing.JPanel jPVestuario;
    private javax.swing.JSpinner jSMedida;
    private javax.swing.JTextField jTFColor;
    private javax.swing.JTextField jTFDescripcion;
    // End of variables declaration//GEN-END:variables
}
