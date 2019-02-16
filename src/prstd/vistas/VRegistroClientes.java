package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import prstd.modelos.Cliente;
import prstd.notificaciones.NotificacionGuardado;


/**
 *
 * @author Edfu-Pro
 */
public class VRegistroClientes extends javax.swing.JDialog {

    int x,y;
    private String texto;
    private String nit;
    private int bandera;
    
    public VRegistroClientes(java.awt.Frame parent, boolean modal, String nit, int bandera) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.nit = nit;
        this.bandera = bandera;
        init();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID Cliente:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, -1, -1));

        lblID.setBackground(new java.awt.Color(0, 0, 0));
        lblID.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("Idcliente");
        jPanel2.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NIT:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 57, -1, -1));

        txtNit.setBackground(new java.awt.Color(255, 255, 255));
        txtNit.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtNit.setForeground(new java.awt.Color(0, 0, 0));
        txtNit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNit.setBorder(null);
        txtNit.setEnabled(false);
        jPanel2.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 265, 20));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 94, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 94, 265, 20));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 141, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccion.setBorder(null);
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 138, 265, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 265, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 115, 265, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 265, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 500, 210));

        jLabel5.setBackground(new java.awt.Color(204, 255, 153));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro de Cliente");
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 60, 8));

        btnGuardar.setBackground(new java.awt.Color(230, 162, 78));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Save_32px.png"))); // NOI18N
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);
        btnGuardar.setPreferredSize(new java.awt.Dimension(78, 54));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        jPanel3.add(btnGuardar);

        btnLimpiar.setBackground(new java.awt.Color(230, 162, 78));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Broom_32px.png"))); // NOI18N
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setOpaque(true);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(78, 54));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        jPanel3.add(btnLimpiar);

        btnCancelar.setBackground(new java.awt.Color(230, 162, 78));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/MetroUI-Folder-OS-Security-Denied-icon-32.png"))); // NOI18N
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.setPreferredSize(new java.awt.Dimension(78, 54));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        jPanel3.add(btnCancelar);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 291, 503, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation(); // Obtiene el punto donde esta el puntero del mouse en ese momento.
        setLocation(point.x - x, point.y - y); //Configura la locación de la ventana segun vamos moviendo el mouse.
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        this.x = evt.getX(); // Obtenemos la posición de X de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
        this.y = evt.getY(); // Obtenemos la posición de Y de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
    }//GEN-LAST:event_jLabel5MousePressed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        setFormato(btnGuardar); // Establece formato al botón de guardar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        resetFormato(btnGuardar); // Restablece formato al botón de guardar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        init(); // Invocamos el método 
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        setFormato(btnLimpiar);// Establece formato al botón de limpiar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        resetFormato(btnLimpiar); // Restablece formato al botón de limpiar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setFormato(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetFormato(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        registrar();
    }//GEN-LAST:event_btnGuardarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            VRegistroClientes dialog = new VRegistroClientes(new javax.swing.JFrame(), true, null,0);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void setFormato(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,153,153),2));
        label.setBackground(new Color(255,204,102));
    }
    
    private void resetFormato(JLabel label){
        label.setBorder(null);
        label.setBackground(new Color(230,162,78));
    }
    
    private void setBorde(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,120,116),2));
    }
    
    private void resetBorde(JLabel label){
        label.setBorder(null);
    }
    
    private void registrar(){
        Cliente cliente = new Cliente();
        
        if(!(txtNit.getText().isEmpty())){
            if(!(txtNombre.getText().isEmpty())){
                if(!(txtDireccion.getText().isEmpty())){
                    if(bandera == 1)
                        cliente.setIdcliente(Integer.parseInt(lblID.getText()));
                    else if(bandera == 2)
                        cliente.setIdcliente(cliente.consultarCliente(txtNit.getText()));
                    cliente.setNombre(txtNombre.getText());
                    cliente.setNit(txtNit.getText());
                    cliente.setDireccion(txtDireccion.getText());

                    // Validamos el tipo de registro que se necesita realizar, actualización o creación.
                    if(bandera == 1 || bandera == 3){
                        // Validamos si el valor retornado por el método para grabar es mayor a 0.
                        if(cliente.grabar(cliente) > 0){
                            //JOptionPane.showMessageDialog(this, "Cliente registrado con éxito");
                            NotificacionGuardado ng = new NotificacionGuardado(null,true,null);
                            ng.setVisible(true);
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(this, "Ha ocurrido un error, por favor revise todos los campos ingresados o comuníquese con el administrador del sistemas para más información.",
                                                            "Error",JOptionPane.ERROR_MESSAGE);
                            txtNombre.grabFocus();
                        }
                    }else if(bandera == 2){
                        // Se valida si el valor de retorno por el método para actualizar es mayor a 0.
                        if(cliente.actualizar(cliente) > 0){
                            NotificacionGuardado ng = new NotificacionGuardado(null,true,null);
                            ng.setVisible(true);
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(this, "Ha ocurrido un error, por favor revise todos los campos ingresados o comuníquese con el administrador del sistemas para más información.",
                                                            "Error",JOptionPane.ERROR_MESSAGE);
                            txtNombre.grabFocus();
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese una dirección válida.","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre válido.","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un NIT válido.","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void init(){
        Cliente cliente;
        
        if(this.bandera == 1){
            cliente = new Cliente();
            if(cliente.getMaxCliente() == 0)
                lblID.setText(String.valueOf("1"));
            else
                lblID.setText(String.valueOf(cliente.getMaxCliente()));
            txtNit.setText(nit);
            txtNombre.setText("");
            txtDireccion.setText("");
        }else if(this.bandera == 2){
            cliente = new Cliente().cargarCliente(nit);
            lblID.setText(String.valueOf(cliente.getIdcliente()));
            txtNit.setText(cliente.getNit());
            txtNombre.setText(cliente.getNombre());
            txtDireccion.setText(cliente.getDireccion());
            txtNit.setEnabled(true);
        }else if(this.bandera == 3){
            cliente = new Cliente();
            if(cliente.getMaxCliente() == 0)
                lblID.setText(String.valueOf("1"));
            else
                lblID.setText(String.valueOf(cliente.getMaxCliente()));
            txtNit.setText(nit);
            txtNombre.setText("");
            txtDireccion.setText("");
            txtNit.setEnabled(true);
            txtNit.grabFocus();
        }
    }
}
