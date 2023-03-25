/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenii_p2_josueham;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        OpCrearEquipo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        OpCrearPartido = new javax.swing.JMenuItem();
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListEquipos = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        lb_nomTorneoSelec = new javax.swing.JLabel();
        BtnSeleccionarEquipo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DiaPartidos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        lb_equipo1 = new javax.swing.JLabel();
        ComboEquipo1 = new javax.swing.JComboBox<>();
        lb_equipo2 = new javax.swing.JLabel();
        ComboEquipo2 = new javax.swing.JComboBox<>();
        SpinnerEquipo1 = new javax.swing.JSpinner();
        SpinnerEquipo2 = new javax.swing.JSpinner();
        BtnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTtorneos = new javax.swing.JTree();
        BtnCrearDeporte = new javax.swing.JButton();
        FieldNombreDeporte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnGuardarDeporte = new javax.swing.JButton();
        BtnCargarDeporte = new javax.swing.JButton();
        BarraGuardar = new javax.swing.JProgressBar();

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
        PopUpTorneos.add(jSeparator2);

        OpCrearEquipo.setText("Crear Equipo");
        OpCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpCrearEquipoActionPerformed(evt);
            }
        });
        PopUpTorneos.add(OpCrearEquipo);
        PopUpTorneos.add(jSeparator3);

        OpCrearPartido.setText("Crear Partido");
        OpCrearPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpCrearPartidoActionPerformed(evt);
            }
        });
        PopUpTorneos.add(OpCrearPartido);

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

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        JListEquipos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(JListEquipos);

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel4.setText("Torneo Seleccionado: ");

        lb_nomTorneoSelec.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N

        BtnSeleccionarEquipo.setText("Seleccionar");
        BtnSeleccionarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarEquipoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSeleccionarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nomTorneoSelec)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_nomTorneoSelec))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSeleccionarEquipo)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DiaEquiposParticipantesLayout = new javax.swing.GroupLayout(DiaEquiposParticipantes.getContentPane());
        DiaEquiposParticipantes.getContentPane().setLayout(DiaEquiposParticipantesLayout);
        DiaEquiposParticipantesLayout.setHorizontalGroup(
            DiaEquiposParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DiaEquiposParticipantesLayout.setVerticalGroup(
            DiaEquiposParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        lb_equipo1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        lb_equipo1.setText("Equipo 1");

        ComboEquipo1.setModel(new DefaultComboBoxModel());

        lb_equipo2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        lb_equipo2.setText("Equipo 2");

        ComboEquipo2.setModel(new DefaultComboBoxModel());

        SpinnerEquipo1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SpinnerEquipo1)
                    .addComponent(lb_equipo1)
                    .addComponent(ComboEquipo1, 0, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_equipo2)
                    .addComponent(ComboEquipo2, 0, 102, Short.MAX_VALUE)
                    .addComponent(SpinnerEquipo2))
                .addGap(80, 80, 80))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(BtnRegistrar)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_equipo1)
                    .addComponent(lb_equipo2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SpinnerEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(SpinnerEquipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(BtnRegistrar)
                .addGap(69, 69, 69))
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

        BtnGuardarDeporte.setText("Guardar Deporte");
        BtnGuardarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarDeporteActionPerformed(evt);
            }
        });

        BtnCargarDeporte.setText("Cargar Deporte");
        BtnCargarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarDeporteActionPerformed(evt);
            }
        });

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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnGuardarDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(BtnCargarDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BarraGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(BarraGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldNombreDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearDeporte)
                    .addComponent(BtnGuardarDeporte)
                    .addComponent(BtnCargarDeporte))
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
        Torneo tor = (Torneo) nodoSeleccionado.getUserObject();
        lb_nomTorneoSelec.setText(tor.getNombre());
        JListEquipos.setModel(llenarEquipos(tor));

        DiaEquiposParticipantes.pack();
        DiaEquiposParticipantes.setLocationRelativeTo(this);
        DiaEquiposParticipantes.setVisible(true);
    }//GEN-LAST:event_OpListarEquiposActionPerformed

    private void BtnSeleccionarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarEquipoActionPerformed
        if (JListEquipos.getSelectedIndex() >= 0) {
            try {
                DefaultListModel modelito = new DefaultListModel();

            } catch (Exception e) {
            }
        } else {

        }
    }//GEN-LAST:event_BtnSeleccionarEquipoActionPerformed

    private void OpCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpCrearEquipoActionPerformed
        String nomEquipo = JOptionPane.showInputDialog(this, "Ingrese el nombre del equipo");
        int puntos = 0;
        Torneo tor = (Torneo) nodoSeleccionado.getUserObject();

        Equipo eq = new Equipo(nomEquipo, puntos);
        tor.getListaEquipos().add(eq);
        JOptionPane.showMessageDialog(this, "Equipo guardado correctamente");
    }//GEN-LAST:event_OpCrearEquipoActionPerformed

    private void OpCrearPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpCrearPartidoActionPerformed
        Torneo tor = (Torneo) nodoSeleccionado.getUserObject();
        ComboEquipo1.setModel(llenarComboEquipos(tor));
        ComboEquipo2.setModel(llenarComboEquipos(tor));

        DiaPartidos.pack();
        DiaPartidos.setLocationRelativeTo(this);
        DiaPartidos.setVisible(true);
    }//GEN-LAST:event_OpCrearPartidoActionPerformed

    private void BtnGuardarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarDeporteActionPerformed
        if (nodoSeleccionado != null && nodoSeleccionado.getUserObject() instanceof Deporte) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos Deportes", "dep");
            chooser.setFileFilter(filter);
            int seleccion = chooser.showSaveDialog(this);
            File archivo = chooser.getSelectedFile();
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                adminDeportes aD = new adminDeportes(archivo.getPath() + ".dep");
                aD.setDepor(((Deporte) nodoSeleccionado.getUserObject()));
                aD.escribirArchivo();
                Deporte depor = (Deporte) nodoSeleccionado.getUserObject();
                adminHilo aH = new adminHilo(depor, BarraGuardar);
                Thread proceso = new Thread(aH);
                proceso.start();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un deporte");
        }
    }//GEN-LAST:event_BtnGuardarDeporteActionPerformed

    private void BtnCargarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarDeporteActionPerformed
        if (nodoSeleccionado != null) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos Deportes", "dep");
            chooser.setFileFilter(filter);
            int seleccion = chooser.showOpenDialog(this);
            File archivo = chooser.getSelectedFile();
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                adminDeportes aD = new adminDeportes(archivo.getPath() + ".dep");
                DefaultTreeModel mod = (DefaultTreeModel) JTtorneos.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) mod.getRoot();
                DefaultMutableTreeNode Q1 = (DefaultMutableTreeNode) raiz.getChildAt(0);
                DefaultMutableTreeNode Q2 = (DefaultMutableTreeNode) raiz.getChildAt(1);
                DefaultMutableTreeNode Q4 = (DefaultMutableTreeNode) raiz.getChildAt(2);
                DefaultMutableTreeNode Q5 = (DefaultMutableTreeNode) raiz.getChildAt(3);
                aD.cargarArchivo();

                Deporte depor = aD.getDepor();
                DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(depor);
                for (int i = 0; i < depor.getListaTorneos().size(); i++) {
                    if (depor.getListaTorneos().get(i).getPeriodo().equals("Q1")) {
                        Q1.add(nodo);
                    } else if (depor.getListaTorneos().get(i).getPeriodo().equals("Q2")) {
                        Q2.add(nodo);
                    } else if (depor.getListaTorneos().get(i).getPeriodo().equals("Q4")) {
                        Q4.add(nodo);
                    } else if (depor.getListaTorneos().get(i).getPeriodo().equals("Q5")) {
                        Q5.add(nodo);
                    }
                }

            }
            JOptionPane.showMessageDialog(this, "Deporte cargado");
        }
    }//GEN-LAST:event_BtnCargarDeporteActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        if (nodoSeleccionado != null) {
            try {
                String strPuntaje1 = SpinnerEquipo1.getValue().toString();
                int puntaje1 = Integer.parseInt(strPuntaje1);
                String strPuntaje2 = SpinnerEquipo2.getValue().toString();
                int puntaje2 = Integer.parseInt(strPuntaje2);
                
                Equipo eq1  = (Equipo) ComboEquipo1.getSelectedItem();
                Equipo eq2 = (Equipo) ComboEquipo2.getSelectedItem();
                eq1.setPuntos(puntaje1);
                eq2.setPuntos(puntaje2);
                Partido match = new Partido(ComboEquipo1.getSelectedItem().toString(), ComboEquipo2.getSelectedItem().toString(), puntaje1, puntaje2);
                
                Torneo tor = (Torneo) nodoSeleccionado.getUserObject();
                tor.getListaPartidos().add(match);
                
                JOptionPane.showMessageDialog(this, "Partido agregado correctamente");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

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

    public DefaultListModel llenarEquipos(Torneo a) {
        DefaultListModel modelito = new DefaultListModel();
        for (Equipo eq : a.getListaEquipos()) {
            modelito.addElement(eq);
        }
        return modelito;
    }

    public DefaultComboBoxModel llenarComboEquipos(Torneo a) {
        DefaultComboBoxModel modelito = new DefaultComboBoxModel();
        for (Equipo eq : a.getListaEquipos()) {
            modelito.addElement(eq);
        }
        return modelito;
    }
    DefaultMutableTreeNode nodoSeleccionado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraGuardar;
    private javax.swing.JButton BtnCargarDeporte;
    private javax.swing.JButton BtnCrearDeporte;
    private javax.swing.JButton BtnGuardarDeporte;
    private javax.swing.JButton BtnGuardarTorneo;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnSeleccionarEquipo;
    private javax.swing.JComboBox<String> ComboEquipo1;
    private javax.swing.JComboBox<String> ComboEquipo2;
    private javax.swing.JComboBox<String> ComboPeriodo;
    private javax.swing.JDialog CrearTorneo;
    private javax.swing.JDialog DiaEquiposParticipantes;
    private javax.swing.JDialog DiaPartidos;
    private javax.swing.JTextField FieldNomTorneo;
    private javax.swing.JTextField FieldNombreDeporte;
    private javax.swing.JList<String> JListEquipos;
    private javax.swing.JTree JTtorneos;
    private javax.swing.JMenuItem OpAgregarTorneo;
    private javax.swing.JMenuItem OpCrearEquipo;
    private javax.swing.JMenuItem OpCrearPartido;
    private javax.swing.JMenuItem OpListarEquipos;
    private javax.swing.JMenuItem OpMostrarTabla;
    private javax.swing.JPopupMenu PopUpDeportes;
    private javax.swing.JPopupMenu PopUpTorneos;
    private javax.swing.JSpinner SpinnerEquipo1;
    private javax.swing.JSpinner SpinnerEquipo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_equipo1;
    private javax.swing.JLabel lb_equipo2;
    private javax.swing.JLabel lb_nomTorneoSelec;
    // End of variables declaration//GEN-END:variables
}
