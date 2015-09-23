/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscdm.registro.paciente;

/**
 *
 * @author Dayana
 */
public class Identificacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public Identificacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
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
        lblDichabitual = new javax.swing.JLabel();
        txtDichabitual = new javax.swing.JTextField();
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

        jLabel25.setText("jLabel25");

        jLabel6.setText("jLabel6");

        jLabel37.setText("jLabel37");

        lblNombreHospital.setText("HOSPITAL NACIONAL \"SAN JUAN DE DIOS\" SAN MIGUEL");

        lblIdentificacion.setText("FICHA DE IDENTIFICACION");
        lblIdentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNomExp.setText("No. de Expediente Clínico:");

        lblA_Paciente.setText("A) DEL PACIENTE");

        lblPrimApellido.setText("1. Primer Apellido:");

        txtPrimApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimApellidoActionPerformed(evt);
            }
        });

        txtSegApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegApellidoActionPerformed(evt);
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

        lblMeses.setText("Meses:");

        lblDias.setText("Dias:");

        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });

        lblHoras.setText("Horas:");

        txtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasActionPerformed(evt);
            }
        });

        lblEstCivil.setText("4. Estado Civil:");

        rbtnSoltero.setText("Soltero(a)");

        rbtnCasado.setText("Casado(a)");

        rbtnDivorciado.setText("Divorciado(a)");

        rbtnViuda.setText("Viudo(a)");

        rbtnAcompañado.setText("Acompañado(a)");

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

        lblOcupacion.setText("6. Ocupación: ");

        lblDichabitual.setText("7. Dirección habitual:");

        lblTelDireccion.setText("Tel:");

        lblB_Familia.setText("B) DE LA FAMILIA");

        lblNomPadre.setText("1. Nombre del Padre:");

        lblNomMadre.setText("2. Nombre de la Madre:");

        lblNomConyugue.setText("3. Nombre del Conyugue:");

        lblRespPaciente.setText("4. Responsable del Paciente:");

        txtRespPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespPacienteActionPerformed(evt);
            }
        });

        lblDirResponsable.setText("5. Dirección del Responsable:");

        lblTelResponsable.setText("Tel:");

        lblC_Informacion.setText("C) DE LA INFORMACION");

        lblDatosPersonales.setText("Proporcionó datos personales del paciente:");

        lblDoc_Legal.setText("Documento legal de identificación:");

        lblTomoInfo.setText("Tomo información:");

        lblParentesco.setText("Parentesco:");

        lblNoDoc.setText("No.");

        lblFechaIns.setText("Fecha de inscriptión:");

        lblObsevaciones.setText("Observaciones:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblNombreHospital)
                            .addComponent(lblIdentificacion)
                            .addComponent(lblNombre))
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomExp)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumExp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDichabitual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDichabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDirResponsable)
                                .addGap(23, 23, 23)
                                .addComponent(txtDirResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelResponsable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDocLegal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDocLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNoIdentidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOcupacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAños)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblMeses)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblDias))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbtnSexMasculino)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbtnSexFemenino))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblHoras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPrimApellido)
                                        .addComponent(lblA_Paciente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtPrimApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSegApellido)))
                            .addComponent(lblSexo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNomPadre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNomPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(126, 126, 126))
                                .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(rbtnAcompañado))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblC_Informacion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTomoInfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTomoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDoc_Legal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDoc_Legal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDatosPersonales)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblParentesco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNoDoc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFechaIns)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaIns, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblObsevaciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRespPaciente)
                                .addGap(25, 25, 25)
                                .addComponent(txtRespPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomConyugue)
                                    .addComponent(lblNomMadre))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomMadre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomConyugue, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblB_Familia))
                        .addGap(0, 64, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdentificacion)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomExp)
                    .addComponent(txtNumExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(lblA_Paciente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimApellido)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombre)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrimApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSexMasculino)
                    .addComponent(rbtnSexFemenino)
                    .addComponent(lblSexo))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstCivil)
                    .addComponent(rbtnSoltero)
                    .addComponent(rbtnCasado)
                    .addComponent(rbtnDivorciado)
                    .addComponent(rbtnViuda)
                    .addComponent(rbtnAcompañado))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocLegal)
                    .addComponent(txtDocLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoIdentidad)
                    .addComponent(txtNoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacion)
                    .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDichabitual)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelDireccion)
                        .addComponent(txtTelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDichabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblB_Familia)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomPadre)
                    .addComponent(txtNomPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomMadre)
                    .addComponent(txtNomMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomConyugue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomConyugue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRespPaciente)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtRespPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDirResponsable)
                    .addComponent(txtDirResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelResponsable)
                        .addComponent(txtTelResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblC_Informacion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDatosPersonales)
                            .addComponent(txtDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParentesco)
                            .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoc_Legal)
                            .addComponent(txtDoc_Legal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoDoc)
                            .addComponent(txtNoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTomoInfo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTomoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaIns)
                        .addComponent(txtFechaIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObsevaciones)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSegApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void rbtnSexMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSexMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSexMasculinoActionPerformed

    private void txtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasActionPerformed

    private void rbtnSexFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSexFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSexFemeninoActionPerformed

    private void txtNoIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoIdentidadActionPerformed

    private void txtRespPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespPacienteActionPerformed

    private void txtPrimApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimApellidoActionPerformed

    private void txtDocLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocLegalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocLegalActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblA_Paciente;
    private javax.swing.JLabel lblAños;
    private javax.swing.JLabel lblB_Familia;
    private javax.swing.JLabel lblC_Informacion;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblDichabitual;
    private javax.swing.JLabel lblDirResponsable;
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
    private javax.swing.JTextField txtDichabitual;
    private javax.swing.JTextField txtDirResponsable;
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
