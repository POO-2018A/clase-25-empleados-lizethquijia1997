

package empleados;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class InterfazEmpleados extends javax.swing.JFrame {
    
    

    int contadorEmpleados= 0; 
    String [][] empleados;
    DefaultTableModel modeloTablaEmpleado;
    ArrayList<Empleados> listaEmpleados = new ArrayList();
    DefaultComboBoxModel modeloComboBoxEmpleados = new DefaultComboBoxModel(listaEmpleados.toArray());
        
    int contadorSecretaria, contadortaxista, contadorDoctor, contadorProfesor = 0;
    String[][] registros;
    DefaultTableModel modeloTablaRegistro; 
    
   
    public InterfazEmpleados() {
        initComponents();
        
       
       
        String[] titulosTablaEmpleados = new String[]{"Nombre","Apellido","Empleo"};
        modeloTablaEmpleado = new DefaultTableModel(empleados, titulosTablaEmpleados);
        tableEmpleados.setModel(modeloTablaEmpleado);
        
       //Voy a trabajar en los cargos... Para que
        String[] listaCargos = new String[]{"Secretaria","Taxista","Doctor/Enfermera","Profesor"};
        for(int i=0; i<listaCargos.length; i++){
             modeloComboBoxEmpleados.addElement(listaCargos[i]);
        }
              
        cmbEmpleo.setModel(modeloComboBoxEmpleados);
       
        String[] titulosTablaRegistros = new String[]{"Nombre","Apellido","Empleo"};
        modeloTablaRegistro = new DefaultTableModel(registros, titulosTablaRegistros);
        tblRegistro.setModel(modeloTablaRegistro);
        
        cmbCargos.setModel(modeloComboBoxEmpleados); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestañas = new javax.swing.JTabbedPane();
        panelEmpleado = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbEmpleo = new javax.swing.JComboBox();
        labelCargo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();
        btnRegistrarDatos = new javax.swing.JButton();
        labelFondoEmpleados = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        cmbCargos = new javax.swing.JComboBox();
        btnOK = new javax.swing.JButton();
        labelFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setText("Nombre:");
        panelEmpleado.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 24, -1, 20));

        labelApellido.setText("Apellido:");
        panelEmpleado.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 64, -1, 20));
        panelEmpleado.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 80, -1));
        panelEmpleado.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 80, -1));

        cmbEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmpleoActionPerformed(evt);
            }
        });
        panelEmpleado.add(cmbEmpleo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, -1));

        labelCargo.setText("Empleo");
        panelEmpleado.add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableEmpleados);

        panelEmpleado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 276, 110));

        btnRegistrarDatos.setText("Registrar los datos");
        btnRegistrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDatosActionPerformed(evt);
            }
        });
        panelEmpleado.add(btnRegistrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        panelEmpleado.add(labelFondoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, 340));

        pestañas.addTab("Empleado", panelEmpleado);

        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblRegistro);

        panelRegistro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 276, 110));

        cmbCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargosActionPerformed(evt);
            }
        });
        panelRegistro.add(cmbCargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 37, 170, -1));

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        panelRegistro.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));
        panelRegistro.add(labelFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, 340));

        pestañas.addTab("Registro", panelRegistro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestañas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDatosActionPerformed
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cargo = (String) cmbEmpleo.getSelectedItem(); 
        String contador = String.valueOf(contadorEmpleados);
        
        Empleados trabajadores = new Empleados(nombre, apellido, cargo); 
        modeloTablaEmpleado.addRow(new String[]{nombre, apellido,cargo});
        
    }//GEN-LAST:event_btnRegistrarDatosActionPerformed

    
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        
        int numeroFilas = modeloTablaRegistro.getRowCount();
        for(int i= 0; i<numeroFilas; i++){
            modeloTablaRegistro.removeRow(0);
        }
             
        String cargoFiltrado = (String) cmbCargos.getSelectedItem();
        System.out.println("Item seleccionado: "+cargoFiltrado);
       
        for(Empleados item: listaEmpleados){ 

            if(cargoFiltrado.equals("Secretaria")){
               
                if(item.getCargo().equals("Secretaria")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadorSecretaria++;
                String contador = String.valueOf(contadorSecretaria);
                
                modeloTablaRegistro.addRow(new String[]{item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }
             
            if(cargoFiltrado.equals("Taxista")){
                
                if(item.getCargo().equals("Taxista")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadortaxista++;
                String contador = String.valueOf(contadortaxista);
                
                modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }

            if(cargoFiltrado.equals("Doctor/Enfermera")){
                
                if(item.getCargo().equals("Doctor/Enfermera")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadorDoctor++;
                String contador = String.valueOf(contadorDoctor);
                        
                modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }
            
             if(cargoFiltrado.equals("Profesor")){
                
                 if(item.getCargo().equals("Profesor")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadorProfesor++;
                
                String contador = String.valueOf(contadorProfesor);
                
                modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }
            
        }

    
        
    }//GEN-LAST:event_btnOKActionPerformed

    private void cmbEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmpleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmpleoActionPerformed

    private void cmbCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargosActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnRegistrarDatos;
    private javax.swing.JComboBox cmbCargos;
    private javax.swing.JComboBox cmbEmpleo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelFondoEmpleados;
    private javax.swing.JLabel labelFondoRegistro;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
