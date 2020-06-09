/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static View.HomeView.btnMenu;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author GARBARINO
 */
public class AsignaturaView extends javax.swing.JFrame {

    /**
     * Creates new form AsignaturaView
     */
    public AsignaturaView() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_barraSuperior = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel_barraLateral = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelesAsignatura = new javax.swing.JPanel();
        jPanel_AgregarAsignatura = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreAsignatura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreProfesor = new javax.swing.JTextField();
        ComboBoxPeriodoDictado = new javax.swing.JComboBox<>();
        ComboBoxCondicionPromocional = new javax.swing.JComboBox<>();
        btnCargar = new javax.swing.JButton();
        jPanel_MostrarAsignatura = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_EdtarAsignatura = new javax.swing.JPanel();
        jPanel_AgregarAsignatura1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEditarNombreAsignatura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEditarNombreProfesor = new javax.swing.JTextField();
        ComboBoxPeriodoDictadoEditar = new javax.swing.JComboBox<>();
        ComboBoxCondicionPromocionalEditar = new javax.swing.JComboBox<>();
        btnActualizarAsignatura = new javax.swing.JButton();
        txtEditarBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel_EliminarAsignatura = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarNombreAsignatura = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_barraSuperior.setBackground(new java.awt.Color(254, 251, 100));
        jPanel_barraSuperior.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_titulo.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel_titulo.setText("ASIGNATURAS");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-cropped (2) (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel_barraSuperiorLayout = new javax.swing.GroupLayout(jPanel_barraSuperior);
        jPanel_barraSuperior.setLayout(jPanel_barraSuperiorLayout);
        jPanel_barraSuperiorLayout.setHorizontalGroup(
            jPanel_barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_barraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214)
                .addComponent(jLabel_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_barraSuperiorLayout.setVerticalGroup(
            jPanel_barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_barraSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addComponent(jLabel_titulo))
                .addContainerGap())
        );

        jPanel_barraLateral.setBackground(new java.awt.Color(246, 255, 190));
        jPanel_barraLateral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnMostrar.setBackground(new java.awt.Color(232, 61, 1));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMostrar.setBorderPainted(false);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAgregar.setBackground(new java.awt.Color(232, 141, 1));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEditar.setBackground(new java.awt.Color(232, 190, 1));
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEliminar.setBackground(new java.awt.Color(232, 229, 1));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel_barraLateralLayout = new javax.swing.GroupLayout(jPanel_barraLateral);
        jPanel_barraLateral.setLayout(jPanel_barraLateralLayout);
        jPanel_barraLateralLayout.setHorizontalGroup(
            jPanel_barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_barraLateralLayout.setVerticalGroup(
            jPanel_barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_barraLateralLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        panelesAsignatura.setLayout(new java.awt.CardLayout());

        jPanel_AgregarAsignatura.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Profesor");

        txtNombreAsignatura.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreAsignatura.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        txtNombreAsignatura.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setText("Periodo de Dictado");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setText("Condicion Promocional");

        txtNombreProfesor.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreProfesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ComboBoxPeriodoDictado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboBoxPeriodoDictado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuatrimestral", "Anual" }));

        ComboBoxCondicionPromocional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboBoxCondicionPromocional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promocional", "No Promocional" }));

        btnCargar.setBackground(new java.awt.Color(249, 70, 70));
        btnCargar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCargar.setText("AÑADIR");
        btnCargar.setBorderPainted(false);

        javax.swing.GroupLayout jPanel_AgregarAsignaturaLayout = new javax.swing.GroupLayout(jPanel_AgregarAsignatura);
        jPanel_AgregarAsignatura.setLayout(jPanel_AgregarAsignaturaLayout);
        jPanel_AgregarAsignaturaLayout.setHorizontalGroup(
            jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AgregarAsignaturaLayout.createSequentialGroup()
                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AgregarAsignaturaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_AgregarAsignaturaLayout.createSequentialGroup()
                                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreProfesor)
                                    .addComponent(txtNombreAsignatura)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AgregarAsignaturaLayout.createSequentialGroup()
                                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxPeriodoDictado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxCondicionPromocional, 0, 219, Short.MAX_VALUE)))))
                    .addGroup(jPanel_AgregarAsignaturaLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel_AgregarAsignaturaLayout.setVerticalGroup(
            jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AgregarAsignaturaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ComboBoxPeriodoDictado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel_AgregarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboBoxCondicionPromocional, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelesAsignatura.add(jPanel_AgregarAsignatura, "PanelAgregarAsignatura");

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Profesor", "Periodo Dictado", "Condicion Promocional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setEnabled(false);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel_MostrarAsignaturaLayout = new javax.swing.GroupLayout(jPanel_MostrarAsignatura);
        jPanel_MostrarAsignatura.setLayout(jPanel_MostrarAsignaturaLayout);
        jPanel_MostrarAsignaturaLayout.setHorizontalGroup(
            jPanel_MostrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        jPanel_MostrarAsignaturaLayout.setVerticalGroup(
            jPanel_MostrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MostrarAsignaturaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelesAsignatura.add(jPanel_MostrarAsignatura, "PanelMostrarAsignatura");

        jPanel_AgregarAsignatura1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Profesor");

        txtEditarNombreAsignatura.setBackground(new java.awt.Color(204, 204, 204));
        txtEditarNombreAsignatura.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        txtEditarNombreAsignatura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEditarNombreAsignatura.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setText("Periodo de Dictado");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel10.setText("Condicion Promocional");

        txtEditarNombreProfesor.setBackground(new java.awt.Color(204, 204, 204));
        txtEditarNombreProfesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEditarNombreProfesor.setEnabled(false);

        ComboBoxPeriodoDictadoEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboBoxPeriodoDictadoEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuatrimestral", "Anual" }));
        ComboBoxPeriodoDictadoEditar.setEnabled(false);

        ComboBoxCondicionPromocionalEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboBoxCondicionPromocionalEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promocional", "No Promocional" }));
        ComboBoxCondicionPromocionalEditar.setEnabled(false);

        btnActualizarAsignatura.setBackground(new java.awt.Color(249, 70, 70));
        btnActualizarAsignatura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizarAsignatura.setText("ACTUALIZAR");
        btnActualizarAsignatura.setBorderPainted(false);
        btnActualizarAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarAsignatura.setEnabled(false);

        txtEditarBuscar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");

        javax.swing.GroupLayout jPanel_AgregarAsignatura1Layout = new javax.swing.GroupLayout(jPanel_AgregarAsignatura1);
        jPanel_AgregarAsignatura1.setLayout(jPanel_AgregarAsignatura1Layout);
        jPanel_AgregarAsignatura1Layout.setHorizontalGroup(
            jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AgregarAsignatura1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarAsignatura)
                .addGap(223, 223, 223))
            .addGroup(jPanel_AgregarAsignatura1Layout.createSequentialGroup()
                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AgregarAsignatura1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_AgregarAsignatura1Layout.createSequentialGroup()
                                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEditarNombreProfesor)
                                    .addComponent(txtEditarNombreAsignatura)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AgregarAsignatura1Layout.createSequentialGroup()
                                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxPeriodoDictadoEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxCondicionPromocionalEditar, 0, 219, Short.MAX_VALUE)))))
                    .addGroup(jPanel_AgregarAsignatura1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEditarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel_AgregarAsignatura1Layout.setVerticalGroup(
            jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AgregarAsignatura1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEditarNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEditarNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(ComboBoxPeriodoDictadoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel_AgregarAsignatura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(ComboBoxCondicionPromocionalEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnActualizarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_EdtarAsignaturaLayout = new javax.swing.GroupLayout(jPanel_EdtarAsignatura);
        jPanel_EdtarAsignatura.setLayout(jPanel_EdtarAsignaturaLayout);
        jPanel_EdtarAsignaturaLayout.setHorizontalGroup(
            jPanel_EdtarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
            .addGroup(jPanel_EdtarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_EdtarAsignaturaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_AgregarAsignatura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_EdtarAsignaturaLayout.setVerticalGroup(
            jPanel_EdtarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(jPanel_EdtarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_EdtarAsignaturaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_AgregarAsignatura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelesAsignatura.add(jPanel_EdtarAsignatura, "PanelEditarAsignatura");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("¿Que asignatura quieres eliminar?");

        txtBuscarNombreAsignatura.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        jButton8.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jButton8.setText("BUSCAR");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "NOMBRE"
            }
        ));
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        jButton9.setBackground(new java.awt.Color(249, 70, 70));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("ELIMINAR");
        jButton9.setBorderPainted(false);

        javax.swing.GroupLayout jPanel_EliminarAsignaturaLayout = new javax.swing.GroupLayout(jPanel_EliminarAsignatura);
        jPanel_EliminarAsignatura.setLayout(jPanel_EliminarAsignaturaLayout);
        jPanel_EliminarAsignaturaLayout.setHorizontalGroup(
            jPanel_EliminarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_EliminarAsignaturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(227, 227, 227))
            .addGroup(jPanel_EliminarAsignaturaLayout.createSequentialGroup()
                .addGroup(jPanel_EliminarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_EliminarAsignaturaLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel_EliminarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscarNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel_EliminarAsignaturaLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButton8))
                    .addGroup(jPanel_EliminarAsignaturaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel_EliminarAsignaturaLayout.setVerticalGroup(
            jPanel_EliminarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EliminarAsignaturaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        panelesAsignatura.add(jPanel_EliminarAsignatura, "PanelElliminarAsignatura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_barraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_barraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelesAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_barraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelesAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel_barraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AsignaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignaturaView().setVisible(true);
            }
        });
    }

//jnuevaAsinagura  = new NuevaAsignatura();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> ComboBoxCondicionPromocional;
    private static javax.swing.JComboBox<String> ComboBoxCondicionPromocionalEditar;
    private static javax.swing.JComboBox<String> ComboBoxPeriodoDictado;
    private static javax.swing.JComboBox<String> ComboBoxPeriodoDictadoEditar;
    public static javax.swing.JButton btnActualizarAsignatura;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCargar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_titulo;
    public static javax.swing.JPanel jPanel_AgregarAsignatura;
    private javax.swing.JPanel jPanel_AgregarAsignatura1;
    public static javax.swing.JPanel jPanel_EdtarAsignatura;
    public static javax.swing.JPanel jPanel_EliminarAsignatura;
    public static javax.swing.JPanel jPanel_MostrarAsignatura;
    private javax.swing.JPanel jPanel_barraLateral;
    private javax.swing.JPanel jPanel_barraSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    public static javax.swing.JPanel panelesAsignatura;
    private static javax.swing.JTextField txtBuscarNombreAsignatura;
    private static javax.swing.JTextField txtEditarBuscar;
    private static javax.swing.JTextField txtEditarNombreAsignatura;
    private static javax.swing.JTextField txtEditarNombreProfesor;
    private static javax.swing.JTextField txtNombreAsignatura;
    private static javax.swing.JTextField txtNombreProfesor;
    // End of variables declaration//GEN-END:variables

    public static String getTxtNombreAsignatura() {
        return txtNombreAsignatura.getText();
    }

    public static void setTxtNombreAsignatura() {
        txtNombreAsignatura.setText("");
    }

    public static String getTxtNombreProfesor() {
        return txtNombreProfesor.getText();
    }

    public static void setTxtNombreProfesor() {
        txtNombreProfesor.setText("");
    }

    /**
     * @return the ComboBoxCondicionPromocional
     */
    public static String getComboBoxCondicionPromocional() {
        String CondicionPromocional = (String) ComboBoxCondicionPromocional.getSelectedItem();
        return CondicionPromocional;
    }

    /**
     * @param aComboBoxCondicionPromocional the ComboBoxCondicionPromocional to
     * set
     */
    public static void setComboBoxCondicionPromocional() {
        ComboBoxCondicionPromocional.setSelectedItem("Promocional");
    }

    /**
     * @return the ComboBoxCondicionPromocionalEditar
     */
    public static String getComboBoxCondicionPromocionalEditar() {
        String CondicionPromocionalEditar = (String) ComboBoxCondicionPromocionalEditar.getSelectedItem();
        return CondicionPromocionalEditar;
    }

    /**
     * @param aComboBoxCondicionPromocionalEditar the
     * ComboBoxCondicionPromocionalEditar to set
     */
    public static void setComboBoxCondicionPromocionalEditar(String CondicionPromocional) {
        ComboBoxCondicionPromocionalEditar.setSelectedItem(CondicionPromocional);
    }

    /**
     * @return the ComboBoxPeriodoDictado
     */
    public static String getComboBoxPeriodoDictado() {
        String PeriodoDictado = (String) ComboBoxPeriodoDictado.getSelectedItem();
        return PeriodoDictado;
    }

    /**
     * @param aComboBoxPeriodoDictado the ComboBoxPeriodoDictado to set
     */
    public static void setComboBoxPeriodoDictado() {
        ComboBoxPeriodoDictado.setSelectedItem("Anual");
    }

    /**
     * @return the ComboBoxPeriodoDictadoEditar
     */
    public static String getComboBoxPeriodoDictadoEditar() {
        String PeriodoDictadoEditar = (String) ComboBoxPeriodoDictadoEditar.getSelectedItem();
        return PeriodoDictadoEditar;
    }

    /**
     * @param aComboBoxPeriodoDictadoEditar the ComboBoxPeriodoDictadoEditar to
     * set
     */
    public static void setComboBoxPeriodoDictadoEditar(String periodoDictado) {
        ComboBoxPeriodoDictadoEditar.setSelectedItem(periodoDictado);
    }

    /**
     * @return the txtBuscar
     */
    public static String getTxtBuscar() {
        return getTxtEditarBuscar().getText();
    }

    /**
     * @param txtBuscar the txtBuscar to set
     */
    public void setTxtBuscar(javax.swing.JTextField txtBuscar) {
        this.setTxtEditarBuscar(txtBuscar);
    }

    /**
     * @return the txtBuscarNombreAsignatura
     */
    public static String getTxtBuscarNombreAsignatura() {
        String BuscarNombreAsignatura = (String) txtBuscarNombreAsignatura.getText();
        return BuscarNombreAsignatura;
    }

    /**
     * @param aTxtBuscarNombreAsignatura the txtBuscarNombreAsignatura to set
     */
    public static void setTxtBuscarNombreAsignatura(javax.swing.JTextField aTxtBuscarNombreAsignatura) {
        txtBuscarNombreAsignatura = aTxtBuscarNombreAsignatura;
    }

    /**
     * @return the txtEditarNombreAsignatura
     */
    public static String getTxtEditarNombreAsignatura() {
        String EditarNombreAsignatura = (String) txtEditarNombreAsignatura.getText();
        return EditarNombreAsignatura;
    }

    /**
     * @param aTxtEditarNombreAsignatura the txtEditarNombreAsignatura to set
     */
    public static void setTxtEditarNombreAsignatura(String nombreAsignatura) {
        txtEditarNombreAsignatura.setText(nombreAsignatura);
    }

    /**
     * @return the txtEditarNombreProfesor
     */
    public static String getTxtEditarNombreProfesor() {
        String EditarNombreProfesor = (String) txtEditarNombreProfesor.getText();
        return EditarNombreProfesor;

    }

    /**
     * Este metodo permite cambiar el estado de campos de no editable a editable
     */
    public static void EstadoEditableCampos() {
        txtEditarNombreAsignatura.setEnabled(true);
        txtEditarNombreProfesor.setEnabled(true);
        ComboBoxCondicionPromocionalEditar.setEnabled(true);
        ComboBoxPeriodoDictadoEditar.setEnabled(true);
        getBtnActualizarAsignatura().setEnabled(true);
    }

    /**
     * @param aTxtEditarNombreProfesor the txtEditarNombreProfesor to set
     */
    public static void setTxtEditarNombreProfesor(String nombreProfesor) {
        txtEditarNombreProfesor.setText(nombreProfesor);
    }

    /**
     * @return the btnActualizarAsignatura
     */
    public static javax.swing.JButton getBtnActualizarAsignatura() {
        return btnActualizarAsignatura;
    }

    /**
     * @param aBtnActualizarAsignatura the btnActualizarAsignatura to set
     */
    public static void setBtnActualizarAsignatura(javax.swing.JButton aBtnActualizarAsignatura) {
        btnActualizarAsignatura = aBtnActualizarAsignatura;
    }

    /**
     * @return the txtEditarBuscar
     */
    public static javax.swing.JTextField getTxtEditarBuscar() {
        
        return txtEditarBuscar;
    }

    /**
     * @param aTxtEditarBuscar the txtEditarBuscar to set
     */
    public static void setTxtEditarBuscar(javax.swing.JTextField aTxtEditarBuscar) {
        txtEditarBuscar = aTxtEditarBuscar;
    }

}
