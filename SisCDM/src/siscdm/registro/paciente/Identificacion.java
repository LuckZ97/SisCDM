/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscdm.registro.paciente;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import siscdm.registro.paciente.sqlUpdates.regSqlUpdates;

/**
 *
 * @author Dayana
 */
public class Identificacion extends javax.swing.JInternalFrame {
    
    String numExp, primApellido, segApellido, nombres, sexo, estCivil, docLegal, numIdentidad, ocupacion, dirHabitual, noTelPaciente;
    String nomPadre, nomMadre, nomConyugue, respPaciente, dirResponsable, telResponsable;
    String propDatosPersonales, propDatosIden, tomoInformacion, observaciones, propParentesco, propDatosNoIden, fechaInsc;

    /**
     * Creates new form NewJInternalFrame
     */
    public Identificacion() {
        initComponents();
        limpiar();
        bloquear();
        
              
    }
    void limpiar(){
        txtNumExp.setText("");
        txtPrimApellido.setText("");
        txtSegApellido.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtMeses.setText("");
        txtDias.setText("");
        txtHoras.setText("");
        txtDocLegal.setText("");
        txtNoIdentidad.setText("");
        txtOcupacion.setText("");
        txtDirhabitual.setText("");
        txtTelDireccion.setText("");
        txtNomPadre.setText("");
        txtNomMadre.setText("");
        txtNomConyugue.setText("");
        txtRespPaciente.setText("");
        txtDirResponsable.setText("");
        txtTelResponsable.setText("");
        txtDatosPersonales.setText("");
        txtParentesco.setText("");
        txtDoc_Legal.setText("");
        txtNoDoc.setText("");
        txtTomoInfo.setText("");
        txtFechaIns.setText("");
        txtObservaciones.setText("");
    }
    void bloquear(){
        txtNumExp.setEnabled(false);
        txtPrimApellido.setEnabled(false);
        txtSegApellido.setEnabled(false);
        txtNombre.setEnabled(false);
        rbtnSexMasculino.setEnabled(false);
        rbtnSexFemenino.setEnabled(false);
        txtEdad.setEnabled(false);
        txtMeses.setEnabled(false);
        txtDias.setEnabled(false);
        txtHoras.setEnabled(false);
        rbtnSoltero.setEnabled(false);
        rbtnCasado.setEnabled(false);
        rbtnDivorciado.setEnabled(false);
        rbtnViuda.setEnabled(false);
        rbtnAcompañado.setEnabled(false);
        txtDocLegal.setEnabled(false);
        txtNoIdentidad.setEnabled(false);
        txtOcupacion.setEnabled(false);
        txtDirhabitual.setEnabled(false);
        txtTelDireccion.setEnabled(false);
        txtNomPadre.setEnabled(false);
        txtNomMadre.setEnabled(false);
        txtNomConyugue.setEnabled(false);
        txtRespPaciente.setEnabled(false);
        txtDirResponsable.setEnabled(false);
        txtTelResponsable.setEnabled(false);
        txtDatosPersonales.setEnabled(false);
        txtParentesco.setEnabled(false);
        txtDoc_Legal.setEnabled(false);
        txtNoDoc.setEnabled(false);
        txtTomoInfo.setEnabled(false);
        txtFechaIns.setEnabled(false);
        txtObservaciones.setEnabled(false);
        btnNuevo.setEnabled(true);
        Guardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }
    void desbloquear(){
                txtNumExp.setEnabled(true);
        txtPrimApellido.setEnabled(true);
        txtSegApellido.setEnabled(true);
        txtNombre.setEnabled(true);
        rbtnSexMasculino.setEnabled(true);
        rbtnSexFemenino.setEnabled(true);
        txtEdad.setEnabled(true);
        txtMeses.setEnabled(true);;
        txtDias.setEnabled(true);
        txtHoras.setEnabled(true);
        rbtnSoltero.setEnabled(true);
        rbtnCasado.setEnabled(true);
        rbtnDivorciado.setEnabled(true);
        rbtnViuda.setEnabled(true);
        rbtnAcompañado.setEnabled(true);
        txtDocLegal.setEnabled(true);
        txtNoIdentidad.setEnabled(true);
        txtOcupacion.setEnabled(true);
        txtDirhabitual.setEnabled(true);
        txtTelDireccion.setEnabled(true);
        txtNomPadre.setEnabled(true);
        txtNomMadre.setEnabled(true);
        txtNomConyugue.setEnabled(true);
        txtRespPaciente.setEnabled(true);
        txtDirResponsable.setEnabled(true);
        txtTelResponsable.setEnabled(true);
        txtDatosPersonales.setEnabled(true);
        txtParentesco.setEnabled(true);
        txtDoc_Legal.setEnabled(true);
        txtNoDoc.setEnabled(true);
        txtTomoInfo.setEnabled(true);
        txtFechaIns.setEnabled(true);
        txtObservaciones.setEnabled(true);
        btnNuevo.setEnabled(false);
        Guardar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombreHospital = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        lblNomExp = new javax.swing.JLabel();
        txtNumExp = new javax.swing.JTextField();
        lblA_Paciente = new javax.swing.JLabel();
        lblPrimApellido = new javax.swing.JLabel();
        txtPrimApellido = new javax.swing.JTextField();
        txtSegApellido = new javax.swing.JTextField();
        lblSegApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        rbtnSexMasculino = new javax.swing.JRadioButton();
        rbtnSexFemenino = new javax.swing.JRadioButton();
        lblEdad = new javax.swing.JLabel();
        lblAños = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblMeses = new javax.swing.JLabel();
        txtMeses = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        lblEstCivil = new javax.swing.JLabel();
        rbtnSoltero = new javax.swing.JRadioButton();
        rbtnCasado = new javax.swing.JRadioButton();
        rbtnDivorciado = new javax.swing.JRadioButton();
        rbtnViuda = new javax.swing.JRadioButton();
        rbtnAcompañado = new javax.swing.JRadioButton();
        lblDocLegal = new javax.swing.JLabel();
        txtDocLegal = new javax.swing.JTextField();
        lblNoIdentidad = new javax.swing.JLabel();
        txtNoIdentidad = new javax.swing.JTextField();
        lblOcupacion = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        lblDirhabitual = new javax.swing.JLabel();
        txtDirhabitual = new javax.swing.JTextField();
        lblTelDireccion = new javax.swing.JLabel();
        txtTelDireccion = new javax.swing.JTextField();
        lblB_Familia = new javax.swing.JLabel();
        lblNomPadre = new javax.swing.JLabel();
        txtNomPadre = new javax.swing.JTextField();
        lblNomMadre = new javax.swing.JLabel();
        txtNomMadre = new javax.swing.JTextField();
        lblNomConyugue = new javax.swing.JLabel();
        txtNomConyugue = new javax.swing.JTextField();
        lblRespPaciente = new javax.swing.JLabel();
        txtRespPaciente = new javax.swing.JTextField();
        lblDirResponsable = new javax.swing.JLabel();
        txtDirResponsable = new javax.swing.JTextField();
        lblTelResponsable = new javax.swing.JLabel();
        txtTelResponsable = new javax.swing.JTextField();
        lblC_Informacion = new javax.swing.JLabel();
        lblDatosPersonales = new javax.swing.JLabel();
        txtDatosPersonales = new javax.swing.JTextField();
        lblDoc_Legal = new javax.swing.JLabel();
        txtDoc_Legal = new javax.swing.JTextField();
        lblTomoInfo = new javax.swing.JLabel();
        txtTomoInfo = new javax.swing.JTextField();
        lblParentesco = new javax.swing.JLabel();
        txtParentesco = new javax.swing.JTextField();
        lblNoDoc = new javax.swing.JLabel();
        txtNoDoc = new javax.swing.JTextField();
        lblFechaIns = new javax.swing.JLabel();
        txtFechaIns = new javax.swing.JTextField();
        lblObsevaciones = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Creacion de Expediente");
        setPreferredSize(new java.awt.Dimension(860, 800));

        lblNombreHospital.setText("HOSPITAL NACIONAL \"SAN JUAN DE DIOS\" SAN MIGUEL");

        lblIdentificacion.setText("FICHA DE IDENTIFICACION");
        lblIdentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNomExp.setText("No. de Expediente Clínico:");

        txtNumExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumExpActionPerformed(evt);
            }
        });

        lblA_Paciente.setText("A) DEL PACIENTE");

        lblPrimApellido.setText("1. Primer Apellido:");

        txtPrimApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimApellidoActionPerformed(evt);
            }
        });
        txtPrimApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimApellidoKeyTyped(evt);
            }
        });

        txtSegApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegApellidoActionPerformed(evt);
            }
        });
        txtSegApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegApellidoKeyTyped(evt);
            }
        });

        lblSegApellido.setText("Segundo Apellido:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombres:");

        lblSexo.setText("2. Sexo:");

        rbtnSexMasculino.setText("Masculino");
        rbtnSexMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSexMasculinoActionPerformed(evt);
            }
        });

        rbtnSexFemenino.setText("Femenino");
        rbtnSexFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSexFemeninoActionPerformed(evt);
            }
        });

        lblEdad.setText("3. Edad:");

        lblAños.setText("Años:");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        lblMeses.setText("Meses:");

        txtMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesesActionPerformed(evt);
            }
        });
        txtMeses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesesKeyTyped(evt);
            }
        });

        lblDias.setText("Dias:");

        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });
        txtDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasKeyTyped(evt);
            }
        });

        lblHoras.setText("Horas:");

        txtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasActionPerformed(evt);
            }
        });
        txtHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorasKeyTyped(evt);
            }
        });

        lblEstCivil.setText("4. Estado Civil:");

        rbtnSoltero.setText("Soltero(a)");
        rbtnSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSolteroActionPerformed(evt);
            }
        });

        rbtnCasado.setText("Casado(a)");
        rbtnCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCasadoActionPerformed(evt);
            }
        });

        rbtnDivorciado.setText("Divorciado(a)");
        rbtnDivorciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDivorciadoActionPerformed(evt);
            }
        });

        rbtnViuda.setText("Viudo(a)");
        rbtnViuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnViudaActionPerformed(evt);
            }
        });

        rbtnAcompañado.setText("Acompañado(a)");
        rbtnAcompañado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAcompañadoActionPerformed(evt);
            }
        });

        lblDocLegal.setText("5. Documento Legal de Identidad:");

        txtDocLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocLegalActionPerformed(evt);
            }
        });

        lblNoIdentidad.setText("No.");

        txtNoIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoIdentidadActionPerformed(evt);
            }
        });
        txtNoIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoIdentidadKeyTyped(evt);
            }
        });

        lblOcupacion.setText("6. Ocupación: ");

        txtOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupacionActionPerformed(evt);
            }
        });

        lblDirhabitual.setText("7. Dirección habitual:");

        txtDirhabitual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirhabitualActionPerformed(evt);
            }
        });

        lblTelDireccion.setText("Tel:");

        txtTelDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelDireccionActionPerformed(evt);
            }
        });

        lblB_Familia.setText("B) DE LA FAMILIA");

        lblNomPadre.setText("1. Nombre del Padre:");

        txtNomPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomPadreActionPerformed(evt);
            }
        });
        txtNomPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomPadreKeyTyped(evt);
            }
        });

        lblNomMadre.setText("2. Nombre de la Madre:");

        txtNomMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomMadreActionPerformed(evt);
            }
        });
        txtNomMadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomMadreKeyTyped(evt);
            }
        });

        lblNomConyugue.setText("3. Nombre del Conyugue:");

        txtNomConyugue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomConyugueActionPerformed(evt);
            }
        });
        txtNomConyugue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomConyugueKeyTyped(evt);
            }
        });

        lblRespPaciente.setText("4. Responsable del Paciente:");

        txtRespPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespPacienteActionPerformed(evt);
            }
        });
        txtRespPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespPacienteKeyTyped(evt);
            }
        });

        lblDirResponsable.setText("5. Dirección del Responsable:");

        txtDirResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirResponsableActionPerformed(evt);
            }
        });

        lblTelResponsable.setText("Tel:");

        txtTelResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelResponsableActionPerformed(evt);
            }
        });

        lblC_Informacion.setText("C) DE LA INFORMACION");

        lblDatosPersonales.setText("Proporcionó datos personales del paciente:");

        txtDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosPersonalesActionPerformed(evt);
            }
        });

        lblDoc_Legal.setText("Documento legal de identificación:");

        txtDoc_Legal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoc_LegalActionPerformed(evt);
            }
        });

        lblTomoInfo.setText("Tomo información:");

        txtTomoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTomoInfoActionPerformed(evt);
            }
        });

        lblParentesco.setText("Parentesco:");

        txtParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParentescoActionPerformed(evt);
            }
        });

        lblNoDoc.setText("No.");

        txtNoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoDocActionPerformed(evt);
            }
        });

        lblFechaIns.setText("Fecha de inscriptión:");

        txtFechaIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInsActionPerformed(evt);
            }
        });

        lblObsevaciones.setText("Observaciones:");

        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomExp)
                .addGap(38, 38, 38)
                .addComponent(txtNumExp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblNombreHospital)
                            .addComponent(lblIdentificacion)))
                    .addComponent(lblB_Familia)
                    .addComponent(lblC_Informacion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAños)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblMeses)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblDias))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rbtnSexMasculino)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbtnSexFemenino))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPrimApellido)
                                        .addComponent(lblA_Paciente))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtPrimApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSegApellido))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addGap(155, 155, 155)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHoras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(386, 386, 386)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Guardar)
                                    .addComponent(btnCancelar)
                                    .addComponent(btnNuevo)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEstCivil)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnSoltero)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnCasado)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnDivorciado)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnViuda)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnAcompañado))
                    .addComponent(lblSexo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOcupacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDocLegal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNoIdentidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDirhabitual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDirhabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirResponsable, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRespPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomConyugue, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomMadre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomPadre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomConyugue, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRespPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelResponsable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTomoInfo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTomoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDoc_Legal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDoc_Legal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDatosPersonales)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addComponent(lblNoDoc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(lblParentesco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lblFechaIns)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFechaIns, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblObsevaciones)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreHospital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdentificacion)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomExp)
                            .addComponent(txtNumExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(lblA_Paciente)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrimApellido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnSexMasculino)
                            .addComponent(rbtnSexFemenino)
                            .addComponent(lblSexo)
                            .addComponent(btnNuevo))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(lblAños)
                            .addComponent(lblMeses)
                            .addComponent(lblDias)
                            .addComponent(lblHoras)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstCivil)
                            .addComponent(rbtnSoltero)
                            .addComponent(rbtnCasado)
                            .addComponent(rbtnDivorciado)
                            .addComponent(rbtnViuda)
                            .addComponent(rbtnAcompañado)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Guardar)
                        .addGap(14, 14, 14)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocLegal)
                    .addComponent(txtDocLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoIdentidad)
                    .addComponent(txtNoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOcupacion)
                            .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnCancelar)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDirhabitual)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelDireccion)
                        .addComponent(txtTelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDirhabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblB_Familia)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomPadre)
                    .addComponent(txtNomPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomMadre)
                    .addComponent(txtNomMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomConyugue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomConyugue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRespPaciente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtRespPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirResponsable)
                            .addComponent(txtDirResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblC_Informacion)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDatosPersonales)
                                    .addComponent(txtDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDoc_Legal)
                                    .addComponent(txtDoc_Legal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTomoInfo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblParentesco)
                                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNoDoc)
                                    .addComponent(txtNoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTomoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaIns)
                                    .addComponent(txtFechaIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelResponsable)
                        .addComponent(txtTelResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObsevaciones)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSegApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegApellidoActionPerformed
        // TODO add your handling code here:
        txtSegApellido.transferFocus();
    }//GEN-LAST:event_txtSegApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void rbtnSexMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSexMasculinoActionPerformed
        // TODO add your handling code here:
        sexo = "Maculino";
        rbtnSexMasculino.transferFocus();
    }//GEN-LAST:event_rbtnSexMasculinoActionPerformed

    private void txtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasActionPerformed
        // TODO add your handling code here:
        txtHoras.transferFocus();
    }//GEN-LAST:event_txtHorasActionPerformed

    private void rbtnSexFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSexFemeninoActionPerformed
        // TODO add your handling code here:
        sexo = "Femenino";
        rbtnSexFemenino.transferFocus();
    }//GEN-LAST:event_rbtnSexFemeninoActionPerformed

    private void txtNoIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoIdentidadActionPerformed
        // TODO add your handling code here:
        txtNoIdentidad.transferFocus();
    }//GEN-LAST:event_txtNoIdentidadActionPerformed

    private void txtRespPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespPacienteActionPerformed
        // TODO add your handling code here:
        txtRespPaciente.transferFocus();
    }//GEN-LAST:event_txtRespPacienteActionPerformed

    private void txtPrimApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimApellidoActionPerformed
        // TODO add your handling code here:
        txtPrimApellido.transferFocus();

    }//GEN-LAST:event_txtPrimApellidoActionPerformed

    private void txtDocLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocLegalActionPerformed
        // TODO add your handling code here:
        txtDocLegal.transferFocus();
    }//GEN-LAST:event_txtDocLegalActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
        txtDias.transferFocus();
    }//GEN-LAST:event_txtDiasActionPerformed

    private void txtNumExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumExpActionPerformed
        // TODO add your handling code here:
        txtNumExp.transferFocus();
    }//GEN-LAST:event_txtNumExpActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquear();
          
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        desbloquear();
        txtNumExp.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        //Se declaran las variables para obtner el texto de los campos de texto de la zona A) Del Paciente
        
        numExp = txtNumExp.getText();
        primApellido = txtPrimApellido.getText();
        segApellido = txtSegApellido.getText();
        nombres = txtNombre.getText();
        docLegal = txtDocLegal.getText();
        numIdentidad = txtNoIdentidad.getText();
        ocupacion = txtOcupacion.getText();
        dirHabitual = txtDirhabitual.getText();
        noTelPaciente = txtTelDireccion.getText();
        
        //Se declaran variables para obtener el texto de los campos de texto de la Zona B) De La Familia
        nomPadre = txtNomPadre.getText();
        nomMadre = txtNomMadre.getText();
        nomConyugue = txtNomConyugue.getText();
        respPaciente = txtRespPaciente.getText();
        dirResponsable = txtDirResponsable.getText();
        telResponsable = txtTelResponsable.getText();
        
        //Se declaran las variables para obtener el texto de los campos de texto de la zona C) De La Informacion
        propDatosPersonales = txtDatosPersonales.getText();
        propDatosIden =  txtDoc_Legal.getText();
        tomoInformacion = txtTomoInfo.getText();
        observaciones = txtObservaciones.getText();
        propParentesco = txtParentesco.getText();
        propDatosNoIden = txtNoDoc.getText();
        fechaInsc = txtFechaIns.getText();
        
        regSqlUpdates pacIngreso = new regSqlUpdates(numExp, primApellido, segApellido, nombres, docLegal, numIdentidad, ocupacion, dirHabitual, noTelPaciente);
        
        /*pacIngreso.setNoExp(numExp);
        pacIngreso.setPriApe(primApellido);
        pacIngreso.setSegApe(segApellido);
        pacIngreso.setNom(nombres);
        pacIngreso.setDocLeTip(docLegal);
        pacIngreso.setDui(numIdentidad);
        pacIngreso.setOcup(ocupacion);
        pacIngreso.setDirHab(dirHabitual);
        pacIngreso.setNoTel(noTelPaciente);
        pacIngreso.setFDeNa("2000-2-6");
        pacIngreso.setEstCivil(estCivil);
        */
      desbloquear();  
    }//GEN-LAST:event_GuardarActionPerformed

    private void rbtnSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSolteroActionPerformed
        // TODO add your handling code here:
        estCivil = "Soltero/a";
        rbtnSoltero.transferFocus();
    }//GEN-LAST:event_rbtnSolteroActionPerformed

    private void rbtnCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCasadoActionPerformed
        // TODO add your handling code here:
        estCivil = "Casado/a";
        rbtnCasado.transferFocus();
    }//GEN-LAST:event_rbtnCasadoActionPerformed

    private void rbtnDivorciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDivorciadoActionPerformed
        // TODO add your handling code here:
        estCivil = "Divorciado/a";
        rbtnDivorciado.transferFocus();
    }//GEN-LAST:event_rbtnDivorciadoActionPerformed

    private void rbtnViudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnViudaActionPerformed
        // TODO add your handling code here:
        estCivil = "Viuda";
        rbtnViuda.transferFocus();
    }//GEN-LAST:event_rbtnViudaActionPerformed

    private void rbtnAcompañadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAcompañadoActionPerformed
        // TODO add your handling code here:
        estCivil = "Acompañado/a";
        rbtnAcompañado.transferFocus();
    }//GEN-LAST:event_rbtnAcompañadoActionPerformed

    private void txtDoc_LegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoc_LegalActionPerformed
        // TODO add your handling code here:
        txtDoc_Legal.transferFocus();
    }//GEN-LAST:event_txtDoc_LegalActionPerformed

    private void txtMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesesActionPerformed
        // TODO add your handling code here:
        txtMeses.transferFocus();
    }//GEN-LAST:event_txtMesesActionPerformed

    private void txtOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupacionActionPerformed
        // TODO add your handling code here:
        txtOcupacion.transferFocus();
    }//GEN-LAST:event_txtOcupacionActionPerformed

    private void txtDirhabitualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirhabitualActionPerformed
        // TODO add your handling code here:
        txtDirhabitual.transferFocus();
    }//GEN-LAST:event_txtDirhabitualActionPerformed

    private void txtTelDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelDireccionActionPerformed
        // TODO add your handling code here:
        txtTelDireccion.transferFocus();
    }//GEN-LAST:event_txtTelDireccionActionPerformed

    private void txtNomPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomPadreActionPerformed
        // TODO add your handling code here:
        txtNomPadre.transferFocus();
    }//GEN-LAST:event_txtNomPadreActionPerformed

    private void txtNomMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomMadreActionPerformed
        // TODO add your handling code here:
        txtNomMadre.transferFocus();
    }//GEN-LAST:event_txtNomMadreActionPerformed

    private void txtNomConyugueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomConyugueActionPerformed
        // TODO add your handling code here:
        txtNomConyugue.transferFocus();
    }//GEN-LAST:event_txtNomConyugueActionPerformed

    private void txtDirResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirResponsableActionPerformed
        // TODO add your handling code here:
        txtDirResponsable.transferFocus();
    }//GEN-LAST:event_txtDirResponsableActionPerformed

    private void txtTelResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelResponsableActionPerformed
        // TODO add your handling code here:
        txtTelResponsable.transferFocus();
    }//GEN-LAST:event_txtTelResponsableActionPerformed

    private void txtDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosPersonalesActionPerformed
        // TODO add your handling code here:
        txtDatosPersonales.transferFocus();
        
    }//GEN-LAST:event_txtDatosPersonalesActionPerformed

    private void txtParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParentescoActionPerformed
        // TODO add your handling code here:
        txtParentesco.transferFocus();
    }//GEN-LAST:event_txtParentescoActionPerformed

    private void txtNoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoDocActionPerformed
        // TODO add your handling code here:
        txtNoDoc.transferFocus();
    }//GEN-LAST:event_txtNoDocActionPerformed

    private void txtTomoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTomoInfoActionPerformed
        // TODO add your handling code here:
        txtTomoInfo.transferFocus();
    }//GEN-LAST:event_txtTomoInfoActionPerformed

    private void txtFechaInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInsActionPerformed
        // TODO add your handling code here:
        txtFechaIns.transferFocus();
    }//GEN-LAST:event_txtFechaInsActionPerformed

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        // TODO add your handling code here:
        txtObservaciones.transferFocus();
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void txtPrimApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimApellidoKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txtPrimApellidoKeyTyped

    private void txtSegApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegApellidoKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txtSegApellidoKeyTyped

    private void txtNoIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoIdentidadKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtNoIdentidadKeyTyped

    private void txtNomPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomPadreKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txtNomPadreKeyTyped

    private void txtNomMadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomMadreKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txtNomMadreKeyTyped

    private void txtNomConyugueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomConyugueKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txtNomConyugueKeyTyped

    private void txtRespPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespPacienteKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txtRespPacienteKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'1'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtMesesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesesKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'1'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtMesesKeyTyped

    private void txtDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'1'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtDiasKeyTyped

    private void txtHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'1'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtHorasKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblA_Paciente;
    private javax.swing.JLabel lblAños;
    private javax.swing.JLabel lblB_Familia;
    private javax.swing.JLabel lblC_Informacion;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblDirResponsable;
    private javax.swing.JLabel lblDirhabitual;
    private javax.swing.JLabel lblDocLegal;
    private javax.swing.JLabel lblDoc_Legal;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEstCivil;
    private javax.swing.JLabel lblFechaIns;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblMeses;
    private javax.swing.JLabel lblNoDoc;
    private javax.swing.JLabel lblNoIdentidad;
    private javax.swing.JLabel lblNomConyugue;
    private javax.swing.JLabel lblNomExp;
    private javax.swing.JLabel lblNomMadre;
    private javax.swing.JLabel lblNomPadre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreHospital;
    private javax.swing.JLabel lblObsevaciones;
    private javax.swing.JLabel lblOcupacion;
    private javax.swing.JLabel lblParentesco;
    private javax.swing.JLabel lblPrimApellido;
    private javax.swing.JLabel lblRespPaciente;
    private javax.swing.JLabel lblSegApellido;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelDireccion;
    private javax.swing.JLabel lblTelResponsable;
    private javax.swing.JLabel lblTomoInfo;
    private javax.swing.JRadioButton rbtnAcompañado;
    private javax.swing.JRadioButton rbtnCasado;
    private javax.swing.JRadioButton rbtnDivorciado;
    private javax.swing.JRadioButton rbtnSexFemenino;
    private javax.swing.JRadioButton rbtnSexMasculino;
    private javax.swing.JRadioButton rbtnSoltero;
    private javax.swing.JRadioButton rbtnViuda;
    private javax.swing.JTextField txtDatosPersonales;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtDirResponsable;
    private javax.swing.JTextField txtDirhabitual;
    private javax.swing.JTextField txtDocLegal;
    private javax.swing.JTextField txtDoc_Legal;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaIns;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtMeses;
    private javax.swing.JTextField txtNoDoc;
    private javax.swing.JTextField txtNoIdentidad;
    private javax.swing.JTextField txtNomConyugue;
    private javax.swing.JTextField txtNomMadre;
    private javax.swing.JTextField txtNomPadre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumExp;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtPrimApellido;
    private javax.swing.JTextField txtRespPaciente;
    private javax.swing.JTextField txtSegApellido;
    private javax.swing.JTextField txtTelDireccion;
    private javax.swing.JTextField txtTelResponsable;
    private javax.swing.JTextField txtTomoInfo;
    // End of variables declaration//GEN-END:variables
}
