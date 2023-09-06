package trabajoaulico;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonel
 */
public class EmpresasFrame extends javax.swing.JFrame {

    private final TreeSet<Empresa> listaEmpresas;
    private final ArrayList<Empleado> listaEmpleados;

    /**
     * Creates new form EmpresasFrame
     */
    public EmpresasFrame() {
        initComponents();
        listaEmpresas = new TreeSet();
        listaEmpleados = new ArrayList();
        /* Data para trabajar */
        agregarDatosIniciales();
    }

    private void agregarDatosIniciales() {
        Empresa empresa;
        Empleado empleado;
        empresa = new Empresa("Pepito SA", 10000000);
        listaEmpresas.add(empresa);
        cbEmpresas.addItem(empresa.toString());
        empleado = new Empleado(10000, "Pepe Pepez", Categoria.DIRECTOR.capitalizar(), 1000, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);
        empleado = new Empleado(10001, "Juan Pepez", Categoria.GERENTE.capitalizar(), 700, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);
        empleado = new Empleado(10002, "Carlos Pepez", Categoria.GERENTE.capitalizar(), 700, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);
        empleado = new Empleado(11000, "Otroncio Perez", Categoria.MIEMBRO.capitalizar(), 100, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);

        empresa = new Empresa("Laurencio SRL", 20000000);
        listaEmpresas.add(empresa);
        cbEmpresas.addItem(empresa.toString());
        empleado = new Empleado(20000, "Laurencio Lautarez", Categoria.DIRECTOR.capitalizar(), 1000, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);
        empleado = new Empleado(20001, "Lautaro Lorentz", Categoria.GERENTE.capitalizar(), 900, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);
        empleado = new Empleado(20002, "Laura Laurancia", Categoria.GERENTE.capitalizar(), 720, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);
        empleado = new Empleado(22000, "Lau Lau", Categoria.MIEMBRO.capitalizar(), 10, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);

        empresa = new Empresa("Pedro Sociedad Colectiva", 30000);
        listaEmpresas.add(empresa);
        cbEmpresas.addItem(empresa.toString());
        empleado = new Empleado(30000, "Pedro Rodriguez", Categoria.DIRECTOR.capitalizar(), 0, empresa);
        empresa.agregarEmpleado(empleado);
        listaEmpleados.add(empleado);

        bGuardarEmpleado.setEnabled(true);
        bMostrarEmpleados.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lDocumento = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lApellido = new javax.swing.JLabel();
        lCategoria = new javax.swing.JLabel();
        lSueldo = new javax.swing.JLabel();
        lEmpresas = new javax.swing.JLabel();
        tfDocumento = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        tfSueldo = new javax.swing.JTextField();
        cbEmpresas = new javax.swing.JComboBox<>();
        bGuardarEmpleado = new javax.swing.JButton();
        bMostrarEmpleados = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lRazonSocial = new javax.swing.JLabel();
        lCuit = new javax.swing.JLabel();
        tfRazonSocial = new javax.swing.JTextField();
        tfCUIT = new javax.swing.JTextField();
        bCrearEmpresa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmEmpleado = new javax.swing.JMenu();
        jmEmpresas = new javax.swing.JMenu();
        jmSueldo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(getPreferredSize());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lDocumento.setText("Nro Documento");

        lNombre.setText("Nombre");

        lApellido.setText("Apellido");

        lCategoria.setText("Categoria");

        lSueldo.setText("Sueldo");

        lEmpresas.setText("Empresas");

        cbCategoria.setModel(new DefaultComboBoxModel(Categoria.capitalizadas()));
        cbCategoria.setSelectedIndex(-1);

        cbEmpresas.setLightWeightPopupEnabled(false);
        cbEmpresas.setMaximumSize(new java.awt.Dimension(72, 22));

        bGuardarEmpleado.setText("Guardar");
        bGuardarEmpleado.setEnabled(false);
        bGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarEmpleadoActionPerformed(evt);
            }
        });

        bMostrarEmpleados.setText("Mostrar Empleados");
        bMostrarEmpleados.setEnabled(false);
        bMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarEmpleadosActionPerformed(evt);
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
                        .addComponent(bGuardarEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(bMostrarEmpleados))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNombre)
                            .addComponent(lApellido)
                            .addComponent(lCategoria)
                            .addComponent(lSueldo)
                            .addComponent(lEmpresas)
                            .addComponent(lDocumento))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDocumento)
                            .addComponent(tfNombre)
                            .addComponent(tfApellido)
                            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfSueldo)
                            .addComponent(cbEmpresas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDocumento)
                    .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lApellido)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCategoria)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSueldo)
                    .addComponent(tfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmpresas)
                    .addComponent(cbEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardarEmpleado)
                    .addComponent(bMostrarEmpleados))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Empresa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lRazonSocial.setText("Razon Social");

        lCuit.setText("CUIT");

        bCrearEmpresa.setText("Crear Empresa");
        bCrearEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lRazonSocial)
                    .addComponent(lCuit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCUIT)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bCrearEmpresa)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addComponent(tfRazonSocial))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRazonSocial)
                    .addComponent(tfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCuit)
                    .addComponent(tfCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bCrearEmpresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmEmpleado.setText("Empleado");
        jMenuBar1.add(jmEmpleado);

        jmEmpresas.setText("Empresas");
        jMenuBar1.add(jmEmpresas);

        jmSueldo.setText("Sueldo");
        jMenuBar1.add(jmSueldo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearEmpresaActionPerformed
        String razonSocial = tfRazonSocial.getText();
        String cuitStr = tfCUIT.getText();

        if (razonSocial.isBlank() || cuitStr.isBlank()) {
            JOptionPane.showMessageDialog(this, "Los campos son necesarios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int cuit;
        try {
            cuit = (Integer) Integer.parseInt(cuitStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El CUIT debe ser número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Empresa e = new Empresa(razonSocial, cuit);
        if (!(listaEmpresas.add(e))) {
            JOptionPane.showMessageDialog(this, "Esta Empresa ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cbEmpresas.addItem(e.toString());
        bGuardarEmpleado.setEnabled(true);
        bMostrarEmpleados.setEnabled(true);
    }//GEN-LAST:event_bCrearEmpresaActionPerformed

    private void bGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarEmpleadoActionPerformed
        String documentoStr = tfDocumento.getText();
        String apellido = tfApellido.getText();
        String nombre = tfNombre.getText();
        String categoria = (String) cbCategoria.getSelectedItem();
        String sueldoStr = tfSueldo.getText();
        String empresaStr = (String) cbEmpresas.getSelectedItem();

        if (documentoStr.isBlank() || apellido.isBlank()
                || nombre.isBlank() || sueldoStr.isBlank()
                || categoria == null || empresaStr == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int documento;
        try {
            documento = (Integer) Integer.parseInt(documentoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El número de documento debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double sueldo;
        try {
            sueldo = (Double) Double.parseDouble(sueldoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El sueldo debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Empresa empresa = null;
        for (Empresa e : listaEmpresas) {
            if (e.getRazonSocial().equals(empresaStr)) {
                empresa = e;
            }
        }
        if (empresa == null) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado esta empresa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Empleado nuevoEmpleado = new Empleado(documento, (nombre + " " + apellido), categoria, sueldo, empresa);
        if (empresa.agregarEmpleado(nuevoEmpleado)) {
            listaEmpleados.add(nuevoEmpleado);
        } else {
            JOptionPane.showMessageDialog(this, "Ya hay un empleado con este documento en la empresa", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bGuardarEmpleadoActionPerformed

    private void bMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarEmpleadosActionPerformed
        VerEmpleados dVerEmpleados = new VerEmpleados(this, true, listaEmpleados);
        dVerEmpleados.setVisible(true);
    }//GEN-LAST:event_bMostrarEmpleadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void ejecutar(String[] args) {
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
            java.util.logging.Logger.getLogger(EmpresasFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresasFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresasFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresasFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearEmpresa;
    private javax.swing.JButton bGuardarEmpleado;
    private javax.swing.JButton bMostrarEmpleados;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbEmpresas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu jmEmpleado;
    private javax.swing.JMenu jmEmpresas;
    private javax.swing.JMenu jmSueldo;
    private javax.swing.JLabel lApellido;
    private javax.swing.JLabel lCategoria;
    private javax.swing.JLabel lCuit;
    private javax.swing.JLabel lDocumento;
    private javax.swing.JLabel lEmpresas;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lRazonSocial;
    private javax.swing.JLabel lSueldo;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCUIT;
    private javax.swing.JTextField tfDocumento;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfRazonSocial;
    private javax.swing.JTextField tfSueldo;
    // End of variables declaration//GEN-END:variables
}
