/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenii_p2_josueham;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author skxka
 */
public class Main extends javax.swing.JFrame {

    private DefaultTreeModel modelo;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = (DefaultTreeModel) JTtorneos.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUpTorneos = new javax.swing.JPopupMenu();
        OpListarEquipos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        OpMostrarTabla = new javax.swing.JMenuItem();
        CrearTorneo = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FieldNomTorneo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboPeriodo = new javax.swing.JComboBox<>();
        BtnGuardarTorneo = new javax.swing.JButton();
        PopUpDeportes = new javax.swing.JPopupMenu();
        OpAgregarTorneo = new javax.swing.JMenuItem();
        DiaEquiposParticipantes = new javax.swing.JDialog();
        DiaPartidos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTtorneos = new javax.swing.JTree();
        BtnCrearDeporte = new javax.swing.JButton();
        FieldNombreDeporte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        OpListarEquipos.setText("Listar Equipos Participantes");
        OpListarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListarEquiposActionPerformed(evt);
            }
        });
        PopUpTorneos.add(OpListarEquipos);
        PopUpTorneos.add(jSeparator1);

        OpMostrarTabla.setText("Mostrar Tabla de Posiciones");
        PopUpTorneos.add(OpMostrarTabla);

        CrearTorneo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        CrearTorneo.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        CrearTorneo.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 440, 80));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del Torneo");
        CrearTorneo.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));
        CrearTorneo.getContentPane().add(FieldNomTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 30));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel3.setText("Periodo del Torneo");
        CrearTorneo.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        ComboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q1", "Q2", "Q4", "Q5" }));
        CrearTorneo.getContentPane().add(ComboPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, -1));

        BtnGuardarTorneo.setText("Guardar Torneo");
        BtnGuardarTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarTorneoActionPerformed(evt);
            }
        });
        CrearTorneo.getContentPane().add(BtnGuardarTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        OpAgregarTorneo.setText("Crear Torneo");
        OpAgregarTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpAgregarTorneoActionPerformed(evt);
            }
        });
        PopUpDeportes.add(OpAgregarTorneo);

        javax.swing.GroupLayout DiaEquiposParticipantesLayout = new javax.swing.GroupLayout(DiaEquiposParticipantes.getContentPane());
        DiaEquiposParticipantes.getContentPane().setLayout(DiaEquiposParticipantesLayout);
        DiaEquiposParticipantesLayout.setHorizontalGroup(
            DiaEquiposParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DiaEquiposParticipantesLayout.setVerticalGroup(
            DiaEquiposParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DiaPartidosLayout = new javax.swing.GroupLayout(DiaPartidos.getContentPane());
        DiaPartidos.getContentPane().setLayout(DiaPartidosLayout);
        DiaPartidosLayout.setHorizontalGroup(
            DiaPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiaPartidosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DiaPartidosLayout.setVerticalGroup(
            DiaPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiaPartidosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode1.add(treeNode2);
        JTtorneos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTtorneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTtorneosMouseClicked(evt);
            }
        });
        JTtorneos.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JTtorneosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JTtorneos);

        BtnCrearDeporte.setText("Crear Deporte");
        BtnCrearDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearDeporteActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del deporte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1)
                    .addComponent(FieldNombreDeporte)
                    .addComponent(BtnCrearDeporte, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldNombreDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCrearDeporte)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearDeporteActionPerformed
        String nomDeporte = FieldNombreDeporte.getText();
        Deporte deporte = new Deporte(nomDeporte);

        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        DefaultMutableTreeNode Q1 = (DefaultMutableTreeNode) raiz.getChildAt(0);
        DefaultMutableTreeNode Q2 = (DefaultMutableTreeNode) raiz.getChildAt(1);
        DefaultMutableTreeNode Q4 = (DefaultMutableTreeNode) raiz.getChildAt(2);
        DefaultMutableTreeNode Q5 = (DefaultMutableTreeNode) raiz.getChildAt(3);

        DefaultMutableTreeNode dep1 = new DefaultMutableTreeNode(deporte);
        DefaultMutableTreeNode dep2 = new DefaultMutableTreeNode(deporte);
        DefaultMutableTreeNode dep3 = new DefaultMutableTreeNode(deporte);
        DefaultMutableTreeNode dep4 = new DefaultMutableTreeNode(deporte);

        Q1.add(dep1);
        Q2.add(dep2);
        Q4.add(dep3);
        Q5.add(dep4);
        modelo.reload();
        JOptionPane.showMessageDialog(this, "Deporte agregado");
    }//GEN-LAST:event_BtnCrearDeporteActionPerformed

    private void JTtorneosValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JTtorneosValueChanged
        nodoSeleccionado = (DefaultMutableTreeNode) JTtorneos.getLastSelectedPathComponent();
    }//GEN-LAST:event_JTtorneosValueChanged

    private void JTtorneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTtorneosMouseClicked
        if (evt.isMetaDown()) {
            if (nodoSeleccionado.getUserObject() instanceof Torneo) {
                PopUpTorneos.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodoSeleccionado.getUserObject() instanceof Deporte) {
                PopUpDeportes.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_JTtorneosMouseClicked

    private void BtnGuardarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarTorneoActionPerformed
        String nombre = FieldNomTorneo.getText();
        String periodo = ComboPeriodo.getSelectedItem().toString();
        Torneo torneo = new Torneo(nombre, periodo);
        DefaultMutableTreeNode tor = new DefaultMutableTreeNode(torneo);
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        DefaultMutableTreeNode Q1 = (DefaultMutableTreeNode) raiz.getChildAt(0);
        DefaultMutableTreeNode Q2 = (DefaultMutableTreeNode) raiz.getChildAt(1);
        DefaultMutableTreeNode Q4 = (DefaultMutableTreeNode) raiz.getChildAt(2);
        DefaultMutableTreeNode Q5 = (DefaultMutableTreeNode) raiz.getChildAt(3);
        Deporte dep = (Deporte) nodoSeleccionado.getUserObject();
        dep.getListaTorneos().add(torneo);
        if (Q1.getUserObject().toString().equals("Q1")) {
            if (nodoSeleccionado != null) {
                modelo.insertNodeInto(tor, nodoSeleccionado, nodoSeleccionado.getChildCount());
                JOptionPane.showMessageDialog(this, "Torneo agregado al deporte correctamente");
            }
        } else if (Q2.getUserObject().toString().equals("Q2")) {
            modelo.insertNodeInto(tor, nodoSeleccionado, nodoSeleccionado.getChildCount());
            JOptionPane.showMessageDialog(this, "Torneo agregado al deporte correctamente");
        } else if (Q4.getUserObject().toString().equals("Q4")) {
            modelo.insertNodeInto(tor, nodoSeleccionado, nodoSeleccionado.getChildCount());
            JOptionPane.showMessageDialog(this, "Torneo agregado al deporte correctamente");
        } else if (Q5.getUserObject().toString().equals("Q5")) {
            modelo.insertNodeInto(tor, nodoSeleccionado, nodoSeleccionado.getChildCount());
            JOptionPane.showMessageDialog(this, "Torneo agregado al deporte correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "El periodo del torneo no coincide con el nodo");
        }
        modelo.reload();
        CrearTorneo.dispose();
    }//GEN-LAST:event_BtnGuardarTorneoActionPerformed

    private void OpAgregarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpAgregarTorneoActionPerformed
        CrearTorneo.pack();
        CrearTorneo.setLocationRelativeTo(this);
        CrearTorneo.setVisible(true);
    }//GEN-LAST:event_OpAgregarTorneoActionPerformed

    private void OpListarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListarEquiposActionPerformed
        
    }//GEN-LAST:event_OpListarEquiposActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    
    DefaultMutableTreeNode nodoSeleccionado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearDeporte;
    private javax.swing.JButton BtnGuardarTorneo;
    private javax.swing.JComboBox<String> ComboPeriodo;
    private javax.swing.JDialog CrearTorneo;
    private javax.swing.JDialog DiaEquiposParticipantes;
    private javax.swing.JDialog DiaPartidos;
    private javax.swing.JTextField FieldNomTorneo;
    private javax.swing.JTextField FieldNombreDeporte;
    private javax.swing.JTree JTtorneos;
    private javax.swing.JMenuItem OpAgregarTorneo;
    private javax.swing.JMenuItem OpListarEquipos;
    private javax.swing.JMenuItem OpMostrarTabla;
    private javax.swing.JPopupMenu PopUpDeportes;
    private javax.swing.JPopupMenu PopUpTorneos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
