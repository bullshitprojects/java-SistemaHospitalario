/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juliocanizalez
 */
public class frmSistema extends javax.swing.JFrame {

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public ArrayList<Medico> lMedico;
    public ArrayList<Paciente> lPaciente;
    public ArrayList<Medicamento> lMedicamentos;
    public ArrayList<Consulta> lConsulta;
    public Medico med;
    public Paciente pac;
    public Medicamento drug;
    public Consulta con;
    DefaultTableModel tDocs;
    DefaultTableModel tPaci;
    DefaultTableModel tConsu;
    DefaultTableModel tDrugs;
    DefaultTableModel tPacientes;
    DefaultTableModel tMedicamentos;
    public int idMed = 0, idPac = 1, idCon = 0, idDoc = 0;

    public frmSistema() {
        initComponents();
        lMedico = new ArrayList<>();
        lConsulta = new ArrayList<>();
        lMedicamentos = new ArrayList<>();
        lPaciente = new ArrayList<>();
        tDocs = (DefaultTableModel) this.tablaMedico.getModel();
        tPaci = (DefaultTableModel) this.tablaPacientes.getModel();
        tConsu = (DefaultTableModel) this.tablaConsultas.getModel();
        tDrugs = (DefaultTableModel) this.tablaMedicamentos.getModel();
        tPacientes = (DefaultTableModel) this.tablaPacientes1.getModel();
        tMedicamentos = (DefaultTableModel) this.tabMedicamentos.getModel();
        tMedicamentos.getDataVector().removeAllElements();
        this.jTabbedPane1.setSelectedIndex(1);
        this.jTabbedPane1.setEnabledAt(0, false);
        placeHolder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPacientes1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarPa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        chkNuevaCon = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePa = new javax.swing.JTextField();
        txtDui = new javax.swing.JFormattedTextField();
        txtFechaNac = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbDoctores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCausa = new javax.swing.JTextArea();
        txtDiagnostico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreMedicamento = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        txtDosis = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabMedicamentos = new javax.swing.JTable();
        btnAgregarMedicamento = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedico = new javax.swing.JTable();
        lblMedRecetados = new javax.swing.JLabel();
        lblPacientes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        lblConsulta = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        lblMedicos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMedicamentos = new javax.swing.JTable();
        btnResetear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA HOSPITALARIO");

        tablaPacientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ));
        tablaPacientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPacientes1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaPacientes1);

        jLabel1.setText("Últimos pacientes registrados");

        txtBuscarPa.setText("jTextField1");

        btnBuscar.setText("BuscarPaciente");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        chkNuevaCon.setText("Nuevo Paciente");
        chkNuevaCon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNuevaConStateChanged(evt);
            }
        });

        jLabel2.setText("Datos del paciente:");

        txtNombrePa.setEnabled(false);

        txtDui.setColumns(10);
        try {
            txtDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDui.setEnabled(false);

        try {
            txtFechaNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaNac.setEnabled(false);

        jLabel3.setText("Dui");

        jLabel4.setText("Nombre");

        jLabel5.setText("Fecha Nacimiento");

        jLabel6.setText("Doctor");

        jLabel7.setText("Diagnostico");

        jLabel8.setText("Causa");

        txtCausa.setColumns(20);
        txtCausa.setRows(5);
        jScrollPane6.setViewportView(txtCausa);

        jLabel9.setText("Medicamentos (Opcional)");

        tabMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Presentacion", "Dosis"
            }
        ));
        jScrollPane7.setViewportView(tabMedicamentos);

        btnAgregarMedicamento.setText("Agregar medicamento");
        btnAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicamentoActionPerformed(evt);
            }
        });

        jLabel10.setText("Ultimos medicamentos agregados");

        jButton1.setText("Terminar consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(chkNuevaCon)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtDiagnostico)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombrePa, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbDoctores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFechaNac, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAgregarMedicamento)
                                .addGap(168, 168, 168)
                                .addComponent(jButton1)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancelar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreMedicamento)
                                        .addComponent(txtPresentacion)
                                        .addComponent(txtDosis)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtBuscarPa)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(255, 255, 255)
                                .addComponent(jLabel9)
                                .addGap(164, 164, 164)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnBuscar))
                        .addGap(353, 353, 353))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNuevaCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombrePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMedicamento)
                    .addComponent(jButton1)
                    .addComponent(btnCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1146, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(1146, 500));

        tablaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dui", "Nombre", "Edad", "Fecha de Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMedico);

        lblMedRecetados.setText("Medicamentos Recetados");

        lblPacientes.setText("Pacientes");

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Causa", "Diagnóstico"
            }
        ));
        tablaConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConsultasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaConsultas);

        lblConsulta.setText("Consultas");

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dui", "Nombre", "Edad", "Fecha de Nacimiento"
            }
        ));
        tablaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPacientesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaPacientes);

        lblMedicos.setText("Medicos");

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Presentacion", "Dosis"
            }
        ));
        tablaMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaMedicamentos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(lblPacientes)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblConsulta)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedRecetados)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicos)
                    .addComponent(lblConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedRecetados, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPacientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dashboard", jPanel2);

        btnResetear.setText("Vista general");
        btnResetear.setEnabled(false);
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });

        jMenu1.setText("Agregar");

        jMenuItem3.setText("Doctor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Consulta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Paciente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buscar");

        jMenuItem2.setText("Medicina");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem6.setText("Cantidad Medicamento recetado");
        jMenuItem6.setToolTipText("");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Eliminar");

        jMenuItem8.setText("Paciente");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem7.setText("Medico");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Cargar");

        jMenuItem9.setText("Datos de prueba");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(btnResetear)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResetear)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Nueva consulta
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        if (tablaPacientes.getSelectedRowCount() > 0) {
            int index = tablaPacientes.getSelectedRow();
            txtNombrePa.setText((String) tablaPacientes.getValueAt(index, 1));
            txtDui.setText((String) tablaPacientes.getValueAt(index, 0));
            txtFechaNac.setText((String) tablaPacientes.getValueAt(index, 3));
            txtDui.setEnabled(false);
            txtNombrePa.setEnabled(false);
            txtFechaNac.setEnabled(false);
            this.jTabbedPane1.setSelectedIndex(0);
            this.jTabbedPane1.setEnabledAt(0, true);
            this.jTabbedPane1.setEnabledAt(1, false);
            cargarDoc();
            llenarTablaPaciente();
            limpiarCampoMedicaConsul();
        } else {
            this.jTabbedPane1.setSelectedIndex(0);
            this.jTabbedPane1.setEnabledAt(0, true);
            this.jTabbedPane1.setEnabledAt(1, false);
            cargarDoc();
            llenarTablaPaciente();
            limpiarCampoMedicaConsul();
        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed
    private void limpiarCampoMedicaConsul() {
        tMedicamentos.getDataVector().removeAllElements();
        placeHolder();
    }

    private void cargarDoc() {
        this.cmbDoctores.removeAllItems();
        for (int i = 0; i < this.lMedico.size(); i++) {
            String nom = this.lMedico.get(i).getNombre();
            this.cmbDoctores.addItem(nom);
        }
    }

    //Filtrado de doctores, pacientes para X medicamento
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String medi = JOptionPane.showInputDialog("Ingresa el medicamento a buscar").toUpperCase();
        tDocs.getDataVector().removeAllElements();
        tConsu.getDataVector().removeAllElements();
        tPaci.getDataVector().removeAllElements();
        tDrugs.getDataVector().removeAllElements();
        int existDoc, existPa;
        
        for (int i = 0; i < this.lMedico.size(); i++) {
            existDoc=0;
            for (int j = 0; j < this.lMedico.get(i).paciente.size(); j++) {
                existPa=0;
                for (int k = 0; k < this.lMedico.get(i).paciente.get(j).consulta.size(); k++) {
                    for (int l = 0; l < this.lMedico.get(i).paciente.get(j).consulta.get(k).medicamento.size(); l++) {
                        if (this.lMedico.get(i).paciente.get(j).consulta.get(k).medicamento.get(l).getNombre().equals(medi)) {
                            if (existDoc==0) {
                               String[] reg1= {this.lMedico.get(i).getDui(),
                                this.lMedico.get(i).getNombre(),
                                this.lMedico.get(i).getEdad(),
                                formatter.format(this.lMedico.get(i).getFechaNacimiento())};
                                tDocs.addRow(reg1);
                                existDoc++;
                            }
                            
                            String[] reg2 = {formatter.format(this.lMedico.get(i).paciente.get(j).consulta.get(k).getFechaConsulta()),
                                this.lMedico.get(i).paciente.get(j).consulta.get(k).getCausa(),
                                this.lMedico.get(i).paciente.get(j).consulta.get(k).getDiagnostico()};
                            if (existPa==0) {
                                String[] reg3 = {this.lMedico.get(i).paciente.get(j).getDui(),
                                this.lMedico.get(i).paciente.get(j).getNombre(),
                                this.lMedico.get(i).paciente.get(j).getEdad(),
                                formatter.format(this.lMedico.get(i).paciente.get(j).getFechaNacimiento())};
                                tPaci.addRow(reg3);
                                existPa++;
                            }
                            
                            String[] reg4 = {this.lMedico.get(i).paciente.get(j).consulta.get(k).medicamento.get(l).getNombre(),
                                this.lMedico.get(i).paciente.get(j).consulta.get(k).medicamento.get(l).getPresentacion(),
                                this.lMedico.get(i).paciente.get(j).consulta.get(k).medicamento.get(l).getDosis()};      
                            
                            tConsu.addRow(reg2);                         
                            tDrugs.addRow(reg4);
                        } 
                    }
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        //Aqui cargaremos los datos de prueba, se cargarán 10 medicos, 
        //cada uno con 5 pacientes y cada paciente con 5 consultas y 
        //cada consulta con 3 medicamentos prescritos
        try {
            for (int i = 0; i < 10; i++) {

                med = new Medico();
                med.setDui(Integer.toString(i + 98734412) + "-0");
                med.setNombre("ALFREDO" + Integer.toString(i + 1));
                String f = Math.round(Math.random() * 1000) + "/07/1956";
                Date fecha = formatter.parse(f);
                med.setFechaNacimiento(fecha);
                fecha = new Date();
                med.setEdad(Integer.toString(fecha.getYear() - med.getFechaNacimiento().getYear()));
                med.paciente = new ArrayList<>();
                for (int j = 0; j < 5; j++) {
                    pac = new Paciente();
                    pac.setDui(Integer.toString(i + 24629312) + "-0");
                    pac.setNombre("PEDRO RAMIREZ" + idPac);
                    idPac++;
                    f = Math.round(Math.random() * 1000) + "/07/1986";
                    fecha = formatter.parse(f);
                    pac.setFechaNacimiento(fecha);
                    fecha = new Date();
                    pac.setEdad(Integer.toString(fecha.getYear() - pac.getFechaNacimiento().getYear()));
                    med.paciente.add(pac);
                    lPaciente.add(pac);
                    pac.consulta = new ArrayList<>();
                    for (int k = 0; k < 5; k++) {
                        con = new Consulta();
                        f = Math.round(Math.random() * 1000) + "/07/2012";
                        fecha = formatter.parse(f);
                        con.setFechaConsulta(fecha);
                        con.setDiagnostico(con.consultaAleatoria(0));
                        con.setCausa(con.consultaAleatoria(1));
                        pac.consulta.add(con);
                        lConsulta.add(con);
                        con.medicamento = new ArrayList<>();
                        for (int l = 0; l < 3; l++) {
                            drug = new Medicamento();
                            drug.setNombre(drug.medicamentosAleatorios(0));
                            drug.setPresentacion(drug.medicamentosAleatorios(1));
                            drug.setDosis(drug.medicamentosAleatorios(2));
                            con.medicamento.add(drug);
                            med.agregarMedicamentoRecetado(drug.getNombre());
                            lMedicamentos.add(drug);
                        }
                    }
                }
                lMedico.add(med);
            }
            cargarTablas();
            this.btnResetear.setEnabled(true);
        } catch (ParseException e) {

        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    //Eliminar Paciente
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            int index = tablaPacientes.getSelectedRow();
            if (this.lPaciente.get(index).consulta.isEmpty()) {
                this.lPaciente.remove(index);
                JOptionPane.showMessageDialog(null, "Paciente eliminado");
                actualizarTablaPaciente();
            } else {
                JOptionPane.showMessageDialog(null, "El paciente tiene al menos una consulta en ese hospital, no se puede eliminar");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Para eliminar un paciente deber DAR CLICK sobre un registro de la tabla PACIENTES");
        }

    }//GEN-LAST:event_jMenuItem8ActionPerformed

   //Mostrar el ultimo consumo de medicamento
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String bus = JOptionPane.showInputDialog("Ingrese el nombre del medicamento que desea buscar").toUpperCase();
        String texto="";
        for (int i = 0; i < this.lMedico.size(); i++) {
            for (int j = 0; j < this.lMedico.get(i).cantMedRec.size(); j++) {
                if (this.lMedico.get(i).cantMedRec.get(j).equals(bus)) {
                this.lMedico.get(i).cantidadRecetada++;
            }
          }            
        }    
        for (int i = 0; i < this.lMedico.size(); i++) {
            if (this.lMedico.get(i).cantidadRecetada>0) {
                texto += lMedico.get(i).getNombre() + " "+lMedico.get(i).cantidadRecetada+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Resultados para el medicamento '"+bus+"'\n"+texto);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        cargarTablas();
        this.lblMedicos.setText("Medicos");
        this.lblPacientes.setText("Pacientes");
        this.lblConsulta.setText("Consultas");
        this.lblMedRecetados.setText("Medicamentos recetados");
    }//GEN-LAST:event_btnResetearActionPerformed

    //Agregar Doctor
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        med = new Medico();
        med.setDui(JOptionPane.showInputDialog("Ingresa el DUI del nuevo médico"));
        med.setNombre("Ingresa el nombre del nuevo medico:");
        Date fecha;
        String f;
        do {
            try {
                f = JOptionPane.showInputDialog("Ingresa la fecha de nacimiento del medico (dd/MM/yyyy)");
                fecha = formatter.parse(f);
                break;
            } catch (ParseException e) {

            }
        } while (true);
        med.setFechaNacimiento(fecha);
        Date fechaAux = new Date();
        med.setEdad(Integer.toString(fechaAux.getYear() - pac.getFechaNacimiento().getYear()));
        this.lMedico.add(med);
        actualizarTablaMedicos();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tablaMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicamentosMouseClicked

    }//GEN-LAST:event_tablaMedicamentosMouseClicked

    private void tablaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPacientesMouseClicked
        if (evt.getClickCount() == 1) {

        }
        if (evt.getClickCount() == 2) {

        }
    }//GEN-LAST:event_tablaPacientesMouseClicked

    private void tablaConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsultasMouseClicked

    }//GEN-LAST:event_tablaConsultasMouseClicked

    private void tablaMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicoMouseClicked

    }//GEN-LAST:event_tablaMedicoMouseClicked

    private void tablaPacientes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPacientes1MouseClicked
        try {
            int index = tablaPacientes1.getSelectedRow();

            this.txtNombrePa.setText(lPaciente.get(index).getNombre());

        } catch (Exception e) {

        }
    }//GEN-LAST:event_tablaPacientes1MouseClicked

    private void chkNuevaConStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNuevaConStateChanged
        if (this.chkNuevaCon.isSelected()) {
            this.btnBuscar.setEnabled(false);
            this.txtBuscarPa.setEnabled(false);
            this.txtDui.setEnabled(true);
            this.txtNombrePa.setEnabled(true);
            this.txtFechaNac.setEnabled(true);
        } else {
            this.btnBuscar.setEnabled(true);
            this.txtBuscarPa.setEnabled(true);
            this.txtDui.setEnabled(false);
            this.txtNombrePa.setEnabled(false);
            this.txtFechaNac.setEnabled(false);
        }
    }//GEN-LAST:event_chkNuevaConStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.txtDui.isEnabled() && this.txtDui.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verifica que todos campos requeridos estén llenos");
        } else {
            pac = new Paciente();
            pac.setDui(this.txtDui.getText());
            pac.setNombre(this.txtNombrePa.getText());
            try {
                pac.setFechaNacimiento(formatter.parse(this.txtFechaNac.getText()));
            } catch (ParseException e) {

            }
            Date hoy = new Date();
            try{
            pac.setEdad(String.valueOf(hoy.getYear() - pac.getFechaNacimiento().getYear()));
            }catch(Exception e){
                
            }
            pac.consulta = new ArrayList<>();
            con = new Consulta();
            con.setCausa(this.txtCausa.getText());
            con.setDiagnostico(this.txtDiagnostico.getText());
            try {
                hoy = formatter.parse(Calendar.getInstance().toString());
            } catch (Exception e) {
                
            }
            con.setFechaConsulta(hoy);
            if (tMedicamentos.getRowCount() > 0) {
                con.medicamento = new ArrayList<>();
                for (int i = 0; i < tMedicamentos.getRowCount(); i++) {
                    drug = new Medicamento();
                    drug.setNombre(String.valueOf(tMedicamentos.getValueAt(i, 0)).toUpperCase());
                    drug.setPresentacion(String.valueOf(tMedicamentos.getValueAt(i, 1)));
                    drug.setDosis(String.valueOf(tMedicamentos.getValueAt(i, 2)));

                    con.medicamento.add(drug);
                    pac.consulta.add(con);
                    this.lMedico.get(this.cmbDoctores.getSelectedIndex()).paciente.add(pac);
                    this.lMedico.get(this.cmbDoctores.getSelectedIndex()).agregarMedicamentoRecetado(drug.getNombre());
                    this.lMedicamentos.add(drug);
                }
            } else {
                pac.consulta.add(con);
                this.lMedico.get(this.cmbDoctores.getSelectedIndex()).paciente.add(pac);
            }
            this.lPaciente.add(pac);
            this.lConsulta.add(con);
            JOptionPane.showMessageDialog(null, "Consulta terminada!");
            limpiarCampoMedicaConsul();
            limpiarConsulta();
            cargarTablas();
            this.jTabbedPane1.setSelectedIndex(1);
            this.jTabbedPane1.setEnabledAt(0, false);
            this.jTabbedPane1.setEnabledAt(1, true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void limpiarConsulta() {
        this.txtDui.removeAll();
        this.txtNombrePa.removeAll();
        this.txtFechaNac.removeAll();
        this.txtCausa.removeAll();
        this.txtDiagnostico.removeAll();

    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.jTabbedPane1.setSelectedIndex(1);
        this.jTabbedPane1.setEnabledAt(1, true);
        this.jTabbedPane1.setEnabledAt(0, false);
        cargarTablas();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //Agregar Medicamento
    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        if (this.txtNombreMedicamento.getText().isEmpty() || this.txtPresentacion.getText().isEmpty()
                || this.txtDosis.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para agregar medicamento necesitas llenar todos los campos");
        } else {
            drug = new Medicamento();
            drug.setNombre(this.txtNombreMedicamento.getText());
            drug.setPresentacion(this.txtPresentacion.getText());
            drug.setDosis(this.txtDosis.getText());
            String[] datos = {drug.getNombre(), drug.getPresentacion(), drug.getDosis()};
            tMedicamentos.addRow(datos);
        }
    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        tPacientes.getDataVector().removeAllElements();
        for (int i = 0; i < this.lPaciente.size(); i++) {
            if (this.lPaciente.get(i).getNombre().equals(this.txtBuscarPa.getText())) {
                String[] reg = {this.lPaciente.get(i).getNombre()};
                tPacientes.addRow(reg);
            }
            break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void actualizarTablaPaciente(){
        tPaci.setRowCount(0);
        for (int i = 0; i < this.lPaciente.size(); i++) {
            String[] reg = {this.lPaciente.get(i).getDui(),
                this.lPaciente.get(i).getNombre(),
                this.lPaciente.get(i).getEdad(),
                String.valueOf(formatter.format(this.lPaciente.get(i).getFechaNacimiento()))};
            this.tPaci.addRow(reg);
        }
    }
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        pac = new Paciente();
        pac.setDui(JOptionPane.showInputDialog("Ingresa el dui"));
        pac.setNombre(JOptionPane.showInputDialog("Ingresa el nombre del paciente").toUpperCase());
        Date fecha;
        String f;
        do {
            try {
                f = JOptionPane.showInputDialog("Ingresa la fecha de nacimiento del paciente (dd/MM/yyyy)");
                fecha = formatter.parse(f);
                break;
            } catch (ParseException e) {

            }
        } while (true);
        pac.setFechaNacimiento(fecha);
        pac.setEdad(JOptionPane.showInputDialog("Ingresa la edad"));
        pac.consulta = new ArrayList<>();
        this.lPaciente.add(pac);
        JOptionPane.showMessageDialog(null, "Paciente agregado");
        actualizarTablaPaciente();
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    //Eliminar doctor
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            int index = tablaMedico.getSelectedRow();
                this.lMedico.remove(index);
                JOptionPane.showMessageDialog(null, "Paciente eliminado");
                actualizarTablaMedicos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Para eliminar un paciente deber DAR CLICK sobre un registro de la tabla PACIENTES");
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    public void cargarPacientesConsumo() {
        tDocs.getDataVector().removeAllElements();
        tConsu.getDataVector().removeAllElements();
        tPaci.getDataVector().removeAllElements();
        tDrugs.getDataVector().removeAllElements();
    }
    private void actualizarTablaMedicos(){
        tDocs.setRowCount(0);
        for (int i = 0; i < this.lMedico.size(); i++) {
            String[] reg = {this.lMedico.get(i).getDui(),
                this.lMedico.get(i).getNombre(),
                this.lMedico.get(i).getEdad(),
                String.valueOf(formatter.format(this.lMedico.get(i).getFechaNacimiento()))};
            this.tDocs.addRow(reg);
        }
    }
    public void cargarTablas() {
        tDrugs.setNumRows(0);
        tConsu.setNumRows(0);
        actualizarTablaMedicos();
        actualizarTablaPaciente();
        for (int i = 0; i < this.lConsulta.size(); i++) {
            String[] reg = {String.valueOf(formatter.format(this.lConsulta.get(i).getFechaConsulta())),
                this.lConsulta.get(i).getCausa(),
                this.lConsulta.get(i).getDiagnostico()};
            this.tConsu.addRow(reg);
        }
        for (int i = 0; i < this.lMedicamentos.size(); i++) {
            String[] reg = {this.lMedicamentos.get(i).getNombre(),
                this.lMedicamentos.get(i).getPresentacion(),
                this.lMedicamentos.get(i).getDosis()};
            this.tDrugs.addRow(reg);
        }
    }

    private void placeHolder() {
        this.txtBuscarPa.setText("Ingresa el nombre del paciente");//Creando un placeholder en java
        this.txtBuscarPa.setForeground(Color.GRAY);
        this.txtBuscarPa.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtBuscarPa.getText().equals("Ingresa el nombre del paciente")) {
                    txtBuscarPa.setText("");
                    txtBuscarPa.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtBuscarPa.getText().isEmpty()) {
                    txtBuscarPa.setText("Ingresa el nombre del paciente");
                    txtBuscarPa.setForeground(Color.GRAY);
                }
            }
        });
        this.txtNombreMedicamento.setText("Nombre del medicamento");
        this.txtNombreMedicamento.setForeground(Color.gray);
        this.txtNombreMedicamento.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNombreMedicamento.getText().equals("Nombre del medicamento")) {
                    txtNombreMedicamento.setText("");
                    txtNombreMedicamento.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNombreMedicamento.getText().isEmpty()) {
                    txtNombreMedicamento.setText("Nombre del medicamento");
                    txtNombreMedicamento.setForeground(Color.gray);
                }
            }
        });
        this.txtPresentacion.setText("Presentación (Ej. 30 capsulas)");
        this.txtPresentacion.setForeground(Color.gray);
        this.txtPresentacion.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPresentacion.getText().equals("Presentación (Ej. 30 capsulas)")) {
                    txtPresentacion.setText("");
                    txtPresentacion.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPresentacion.getText().isEmpty()) {
                    txtPresentacion.setText("Presentación (Ej. 30 capsulas)");
                    txtPresentacion.setForeground(Color.gray);
                }
            }
        });
        this.txtDosis.setText("Dosis (Ej. 2 capsulas cada 4 horas)");
        this.txtDosis.setForeground(Color.gray);
        this.txtDosis.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtDosis.getText().equals("Dosis (Ej. 2 capsulas cada 4 horas)")) {
                    txtDosis.setText("");
                    txtDosis.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtDosis.getText().isEmpty()) {
                    txtDosis.setText("Dosis (Ej. 2 capsulas cada 4 horas)");
                    txtDosis.setForeground(Color.gray);
                }
            }
        });
    }

    private void llenarTablaPaciente() {
        try {
            tPacientes.getDataVector().removeAllElements();
            for (int i = 0; i < this.lPaciente.size(); i++) {
                String[] reg = {lPaciente.get(i).getNombre()};
                tPacientes.addRow(reg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aun no se pueden cargar los pacientes");
        }

    }

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
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMedicamento;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JCheckBox chkNuevaCon;
    private javax.swing.JComboBox<String> cmbDoctores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblMedRecetados;
    private javax.swing.JLabel lblMedicos;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JTable tabMedicamentos;
    private javax.swing.JTable tablaConsultas;
    private javax.swing.JTable tablaMedicamentos;
    private javax.swing.JTable tablaMedico;
    private javax.swing.JTable tablaPacientes;
    private javax.swing.JTable tablaPacientes1;
    private javax.swing.JTextField txtBuscarPa;
    private javax.swing.JTextArea txtCausa;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtDosis;
    public javax.swing.JFormattedTextField txtDui;
    public javax.swing.JFormattedTextField txtFechaNac;
    private javax.swing.JTextField txtNombreMedicamento;
    public javax.swing.JTextField txtNombrePa;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
