/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import Vista.MenuPrincipal;
import java.awt.Color;
import javax.swing.JMenuBar;

/**
 *
 * @author Gabriel
 */
public class MenuPrincipal extends javax.swing.JFrame
{

    /**
     * Creates new form PantallaPrincipal
     */
    public MenuPrincipal()
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
    private void initComponents()
    {

        jPanelInformacion = new javax.swing.JPanel();
        jPanelConsultarVestuarios = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMIConsultarVestuarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInformacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInformacion.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanelConsultarVestuariosLayout = new javax.swing.GroupLayout(jPanelConsultarVestuarios);
        jPanelConsultarVestuarios.setLayout(jPanelConsultarVestuariosLayout);
        jPanelConsultarVestuariosLayout.setHorizontalGroup(
            jPanelConsultarVestuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        jPanelConsultarVestuariosLayout.setVerticalGroup(
            jPanelConsultarVestuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jPanelInformacion.add(jPanelConsultarVestuarios, "card2");

        jMenuBar1.setBackground(new java.awt.Color(57, 110, 176));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 70));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/usuarios1.png"))); // NOI18N
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/usuarios2.png"))); // NOI18N

        jMenuItem1.setText("Altas");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Consultas");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/vestuarios1.png"))); // NOI18N
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/vestuarios2.png"))); // NOI18N

        jMenuItem3.setText("Altas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator2);

        jMIConsultarVestuarios.setText("Consultas");
        jMIConsultarVestuarios.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMIConsultarVestuariosActionPerformed(evt);
            }
        });
        jMenu2.add(jMIConsultarVestuarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/evento1.png"))); // NOI18N
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/evento2.png"))); // NOI18N

        jMenuItem5.setText("Altas");
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator3);

        jMenuItem6.setText("Consultas");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/melodias1.png"))); // NOI18N
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/melodias2.png"))); // NOI18N

        jMenuItem7.setText("Altas");
        jMenu4.add(jMenuItem7);
        jMenu4.add(jSeparator4);

        jMenuItem8.setText("Consultas");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/regiones1.png"))); // NOI18N
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/regiones2.png"))); // NOI18N

        jMenuItem9.setText("Altas");
        jMenu5.add(jMenuItem9);
        jMenu5.add(jSeparator5);

        jMenuItem10.setText("Consultas");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/estados1.png"))); // NOI18N
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/estados2.png"))); // NOI18N

        jMenuItem11.setText("Altas");
        jMenu6.add(jMenuItem11);
        jMenu6.add(jSeparator6);

        jMenuItem12.setText("Consultas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem3ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem12ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMIConsultarVestuariosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMIConsultarVestuariosActionPerformed
    {//GEN-HEADEREND:event_jMIConsultarVestuariosActionPerformed
        ConsultarVestuarios objConsultarVestuarios = new ConsultarVestuarios();
        objConsultarVestuarios.setSize(800, 600);
        objConsultarVestuarios.setLocation(1, 1);
        jPanelInformacion.removeAll();
        jPanelInformacion.add(objConsultarVestuarios, BorderLayout.CENTER);
        jPanelInformacion.revalidate();
        jPanelInformacion.repaint();
    }//GEN-LAST:event_jMIConsultarVestuariosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new MenuPrincipal().setVisible(true);
                MenuPrincipal main = new MenuPrincipal();
                main.setExtendedState(MAXIMIZED_BOTH);
                main.setVisible(true);
            }
            
            
        });
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMIConsultarVestuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanelConsultarVestuarios;
    private javax.swing.JPanel jPanelInformacion;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
