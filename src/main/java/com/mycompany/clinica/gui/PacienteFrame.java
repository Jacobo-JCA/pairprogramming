package com.mycompany.clinica.gui;

import com.mycompany.clinica.data.BaseDatos;
import com.mycompany.clinica.model.Consulta;
import com.mycompany.clinica.model.Enfermedades;
import com.mycompany.clinica.model.Paciente;
import com.mycompany.clinica.model.SignosVitales;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacob
 */
public class PacienteFrame extends javax.swing.JInternalFrame {

    BaseDatos base = new BaseDatos();
    Paciente paciente;
    EnfermedadesFrame enfermedadesFrame;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    Paciente pacienteSeleccionado = null;
    ArrayList<Paciente> listaPacientes;
    
    SignosVitales signosVitalesReferencia = new SignosVitales();
    
    
    public PacienteFrame() {
        paciente = new Paciente();
        enfermedadesFrame = new EnfermedadesFrame(null, true, paciente);
        listaPacientes = base.obtenerPacientes();
        cargarModeloTabla();
        this.setSize(1200, 750);
        initComponents();
    }
    
    private void cargarModeloTabla() {
        modeloTabla.addColumn("identificador");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("apellido");
        modeloTabla.addColumn("género");
        modeloTabla.addColumn("ciudad");
        modeloTabla.addColumn("expediente");
        modeloTabla.addColumn("edad");
        
        int numeroPacientes = listaPacientes.size();
        modeloTabla.setNumRows(numeroPacientes);
        
        for (int i = 0; i < numeroPacientes; i++) {
            Paciente paciente = listaPacientes.get(i);
            
            modeloTabla.setValueAt(paciente.getIdPaciente(), i, 0);
            modeloTabla.setValueAt(paciente.getNombre(), i, 1);
            modeloTabla.setValueAt(paciente.getApellido(), i, 2);
            modeloTabla.setValueAt(paciente.getGenero(), i, 3);
            modeloTabla.setValueAt(paciente.getCiudad(), i, 4);
            modeloTabla.setValueAt(paciente.getExpediente(), i, 5);
            modeloTabla.setValueAt(paciente.getEdad(), i, 6);
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoExpediente = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCiudad = new javax.swing.JTextField();
        campoEstado = new javax.swing.JTextField();
        campoOcuapacion = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoMotivoConsulta = new javax.swing.JTextArea();
        btnGuardarPaciente = new javax.swing.JButton();
        campoGenero = new javax.swing.JTextField();
        campoFechaNacimiento = new javax.swing.JTextField();
        campoFechaConsulta = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnNoPatologico = new javax.swing.JButton();
        btnQuirurjico = new javax.swing.JButton();
        btnSignos = new javax.swing.JButton();
        btnClinico = new javax.swing.JButton();
        btnPatologico = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPaciente = new javax.swing.JTable();
        select = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        btnHeredit = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

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
        jScrollPane1.setViewportView(jTable1);

        setTitle("Paciente");

        jLabel1.setText("Cédula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Motivo de Consulta:");

        jLabel4.setText("Fecha de Nacimiento:");

        jLabel5.setText("N: Expediente:");

        jLabel6.setText("Apellido:");

        jLabel7.setText("Género:");

        jLabel8.setText("Dirección:");

        jLabel11.setText("Télefono:");

        jLabel12.setText("Email:");

        jLabel13.setText("Ciudad:");

        jLabel14.setText("Fecha Consulta:");

        jLabel15.setText("Ocupación:");

        jLabel16.setText("Estado:");

        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaActionPerformed(evt);
            }
        });

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCiudadActionPerformed(evt);
            }
        });

        campoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstadoActionPerformed(evt);
            }
        });

        campoOcuapacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoOcuapacionActionPerformed(evt);
            }
        });

        campoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDireccionActionPerformed(evt);
            }
        });

        campoMotivoConsulta.setColumns(20);
        campoMotivoConsulta.setRows(5);
        jScrollPane2.setViewportView(campoMotivoConsulta);

        btnGuardarPaciente.setText("Guardar");
        btnGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPacienteActionPerformed(evt);
            }
        });

        campoFechaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaConsultaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnNoPatologico.setText("No Patologico");
        btnNoPatologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoPatologicoActionPerformed(evt);
            }
        });

        btnQuirurjico.setText("Quirurjico");
        btnQuirurjico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuirurjicoActionPerformed(evt);
            }
        });

        btnSignos.setText("Signos vitales");
        btnSignos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignosActionPerformed(evt);
            }
        });

        btnClinico.setText("Clinico");
        btnClinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinicoActionPerformed(evt);
            }
        });

        btnPatologico.setText("Patologico");
        btnPatologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatologicoActionPerformed(evt);
            }
        });

        jButton6.setText("Consulta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setText("Buscar:");

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });

        tablaPaciente.setModel(modeloTabla);
        jScrollPane4.setViewportView(tablaPaciente);

        select.setText("Seleccionar");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        btnHeredit.setText("Hereditario");
        btnHeredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHereditActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(btnPatologico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(51, 51, 51)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(42, 42, 42)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnNoPatologico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnQuirurjico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(68, 68, 68)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHeredit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnSignos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(161, 161, 161)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(campoFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(265, 265, 265)
                                .addComponent(campoOcuapacion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(531, 531, 531))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNoPatologico, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuirurjico, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPatologico, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHeredit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(campoCiudad)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoOcuapacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPacienteActionPerformed

        LocalDate fechaNacimiento;
        String cedula = campoCedula.getText();
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String direccion = campoDireccion.getText();
        String email = campoEmail.getText();

        String genero = campoGenero.getText();
        String expedienteString = campoExpediente.getText(); // Se obtiene el texto del campo expediente
        String ciudad = campoCiudad.getText();
        String estado = campoEstado.getText();
        String nacimiento = campoFechaNacimiento.getText();

        try {
            fechaNacimiento = LocalDate.parse(nacimiento);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha de nacimiento válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();

        String telefono = campoTelefono.getText();
        String ocupacion = campoOcuapacion.getText();

        int expediente;
        try {
            expediente = Integer.parseInt(expedienteString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número de expediente válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || email.isEmpty()
                || genero.isEmpty() || expedienteString.isEmpty() || ciudad.isEmpty()
                || estado.isEmpty() || nacimiento.isEmpty() || telefono.isEmpty() || ocupacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ArrayList<Enfermedades> enfermedades1 = paciente.getListEnfermedades();
        
        ArrayList<Consulta> consulta = paciente.getListConsultas();

        

        paciente = new Paciente(cedula, nombre, apellido, direccion, email, edad, genero, expediente, ciudad, estado, fechaNacimiento,
                telefono, ocupacion);

        paciente.setListEnfermedades(enfermedades1);
        paciente.setListConsultas(consulta);
        
        base.insertPaciente(paciente);
        paciente = new Paciente();
        JOptionPane.showMessageDialog(this, "¡Se almacenó el Paciente!");

    }//GEN-LAST:event_btnGuardarPacienteActionPerformed

    private void campoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDireccionActionPerformed

    private void campoOcuapacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoOcuapacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoOcuapacionActionPerformed

    private void campoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadoActionPerformed

    private void campoCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCiudadActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        campoCedula.setText("");
        campoNombre.setText("");
        campoApellido.setText("");
        campoDireccion.setText("");
        campoEmail.setText("");
        campoGenero.setText("");
        campoExpediente.setText("");
        campoCiudad.setText("");
        campoEstado.setText("");
        campoFechaNacimiento.setText("");
        campoTelefono.setText("");
        campoOcuapacion.setText("");
        campoMotivoConsulta.setText("");
        campoFechaConsulta.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ConsultaFrame diagnosticoFrame = new ConsultaFrame(null, true, this, paciente, signosVitalesReferencia);
        diagnosticoFrame.setLocationRelativeTo(null);
        diagnosticoFrame.setVisible(true);
        diagnosticoFrame.setLocation(600, 150);
        diagnosticoFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnPatologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatologicoActionPerformed
        enfermedadesFrame.setEnfermedad("patologico");
        enfermedadesFrame.setLocationRelativeTo(null);
        enfermedadesFrame.setVisible(true);
        enfermedadesFrame.setLocation(600, 150);
        enfermedadesFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnPatologicoActionPerformed

    private void btnNoPatologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoPatologicoActionPerformed
        enfermedadesFrame.setEnfermedad("no patologico");
        
        enfermedadesFrame.setLocationRelativeTo(null);
        enfermedadesFrame.setVisible(true);
        enfermedadesFrame.setLocation(600, 150);
        enfermedadesFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnNoPatologicoActionPerformed

    private void btnClinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinicoActionPerformed
        enfermedadesFrame.setEnfermedad("clinico");
        enfermedadesFrame.setLocationRelativeTo(null);
        enfermedadesFrame.setVisible(true);
        enfermedadesFrame.setLocation(600, 150);
        enfermedadesFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnClinicoActionPerformed

    private void btnQuirurjicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuirurjicoActionPerformed
        enfermedadesFrame.setEnfermedad("quirurjico");
        enfermedadesFrame.setLocationRelativeTo(null);
        enfermedadesFrame.setVisible(true);
        enfermedadesFrame.setLocation(600, 150);
        enfermedadesFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnQuirurjicoActionPerformed

    private void btnSignosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignosActionPerformed
    
        SignosFrame signosFrame = new SignosFrame(null, true, signosVitalesReferencia);
        signosFrame.setLocationRelativeTo(null);
        signosFrame.setVisible(true);
        signosFrame.setLocation(600, 150);
        signosFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnSignosActionPerformed

    private void campoFechaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaConsultaActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        
    }//GEN-LAST:event_busquedaActionPerformed

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        this.limpiarTabla();
        String cadenaBusqueda = busqueda.getText();
        ArrayList<Paciente> listPacientes = base.obtenerPacientesPorCampo(cadenaBusqueda);
        
        int numeroPacientes = listPacientes.size();
        modeloTabla.setNumRows(numeroPacientes);
        
        for (int i = 0; i < numeroPacientes; i++) {
            Paciente paciente = listPacientes.get(i);
            int id = paciente.getIdPaciente();
            String nombre = paciente.getNombre();
            String apellido = paciente.getApellido();
            int expediente = paciente.getExpediente();
            String ciudad = paciente.getCiudad();
            String genero = paciente.getGenero();
            int edad = paciente.getEdad();
            
            modeloTabla.setValueAt(id, i, 0);
            modeloTabla.setValueAt(nombre, i, 1);
            modeloTabla.setValueAt(apellido, i, 2);
            modeloTabla.setValueAt(genero, i, 3);
            modeloTabla.setValueAt(ciudad, i, 4);
            modeloTabla.setValueAt(expediente, i, 5);
            
            
            modeloTabla.setValueAt(edad, i, 6);
        }
        
    }//GEN-LAST:event_busquedaKeyReleased

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        
        if (tablaPaciente.getSelectedRow() == -1) {
            
            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro en la tabla!", "ERROR AL MODIFICAR REGISTRO", JOptionPane.WARNING_MESSAGE);
        } else {
            
            if (busqueda.getText().equals("")) {
               pacienteSeleccionado = this.listaPacientes.get(tablaPaciente.getSelectedRow());
            } else {
                int rowSelected = tablaPaciente.getSelectedRow();
                int idPaciente = (Integer) modeloTabla.getValueAt(rowSelected, 0);
                System.out.println("id" + idPaciente);
                for (int i = 0; i < this.listaPacientes.size(); i++) {
                    if (this.listaPacientes.get(i).getIdPaciente() == idPaciente) {
                        pacienteSeleccionado = listaPacientes.get(i);
                        break;
                    } 
                }
                 
            }
            if (pacienteSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "No se encontro el paciente");
                return;
            }
            
            
            campoNombre.setText(pacienteSeleccionado.getNombre());
            campoApellido.setText(pacienteSeleccionado.getApellido());
            campoGenero.setText(pacienteSeleccionado.getGenero());
            campoCiudad.setText(pacienteSeleccionado.getCiudad());
            campoExpediente.setText(String.valueOf(pacienteSeleccionado.getExpediente()));
            
            campoEmail.setText(pacienteSeleccionado.getEmail());
            
            Consulta consulta = base.obtenerConsulta(pacienteSeleccionado.getIdPaciente());
            pacienteSeleccionado.addConsultas(consulta);
            
            LocalDate fechaConsulta = consulta.getFechaConsulta();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fechaString = fechaConsulta.format(formatter);
            campoFechaConsulta.setText(fechaString);
            campoMotivoConsulta.setText(consulta.getMotivoConsulta());
            

            /*for (int i = 0; i < listaPacientes.size(); i++) {
                if (listaPacientes.get(i).getIdPaciente() == idPacient) {
                    pacienteSeleccionado = listaPacientes.get(i);
                }
            }*/
            
            
        }
    }//GEN-LAST:event_selectActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if (pacienteSeleccionado != null) {
           
            int idPaciente = pacienteSeleccionado.getIdPaciente();
            String nombre = campoNombre.getText();
            String apellido = campoApellido.getText();
            int expediente = Integer.parseInt(campoExpediente.getText());
            String ciudad = campoCiudad.getText();
            String genero = campoGenero.getText();
            String email = campoEmail.getText();
             
            pacienteSeleccionado.setNombre(nombre);
            pacienteSeleccionado.setApellido(apellido);
            pacienteSeleccionado.setExpediente(expediente);
            pacienteSeleccionado.setCiudad(ciudad);
            pacienteSeleccionado.setGenero(genero);
            pacienteSeleccionado.setEmail(email);

            base.actualizarPaciente(pacienteSeleccionado, idPaciente);
            JOptionPane.showMessageDialog(null, "Actualización exitosa!", "Información", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un paciente para editar!", "ERROR AL EDITAR PACIENTE", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_editarActionPerformed

    private void btnHereditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHereditActionPerformed
        enfermedadesFrame.setEnfermedad("hereditario");
        enfermedadesFrame.setLocationRelativeTo(null);
        enfermedadesFrame.setVisible(true);
        enfermedadesFrame.setLocation(600, 150);
        enfermedadesFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnHereditActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void limpiarTabla() {
        int numFilas = modeloTabla.getRowCount();
        if(numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTabla.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClinico;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarPaciente;
    private javax.swing.JButton btnHeredit;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNoPatologico;
    private javax.swing.JButton btnPatologico;
    private javax.swing.JButton btnQuirurjico;
    private javax.swing.JButton btnSignos;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoExpediente;
    private javax.swing.JTextField campoFechaConsulta;
    private javax.swing.JTextField campoFechaNacimiento;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextArea campoMotivoConsulta;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoOcuapacion;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton editar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton select;
    private javax.swing.JTable tablaPaciente;
    // End of variables declaration//GEN-END:variables

    String getCampoMotivo() {
        return campoMotivoConsulta.getText();
    }
    
    String getFechaConsulta() {
        return campoFechaConsulta.getText();
    }
}
