package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import prstd.modelos.Usuario;
import prstd.modelos.UsuarioCorrelativo;
import prstd.notificaciones.NotificacionError;
import prstd.notificaciones.NotificacionGuardado;

public class VUsuarioCorrelativos extends javax.swing.JDialog {

    int x,y;
    
    public VUsuarioCorrelativos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        comboUsuarios = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtIni = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtFin = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 139, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Serie:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        txtSerie.setBackground(new java.awt.Color(255, 255, 255));
        txtSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSerie.setBorder(null);
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 224, 174, 20));

        comboUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        comboUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(comboUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 133, 174, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.setToolTipText("Cierra la pantalla actual");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 6, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 153));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Asignación de Correlativos");
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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 79, 420, 10));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Corr. Inicial:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Corr. Final:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 320, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 10));

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
        jPanel2.add(btnGuardar);

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
        jPanel2.add(btnLimpiar);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 408, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 244, 174, 20));

        txtIni.setBackground(new java.awt.Color(255, 255, 255));
        txtIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIni.setBorder(null);
        jPanel1.add(txtIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 174, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 174, 20));

        txtFin.setBackground(new java.awt.Color(255, 255, 255));
        txtFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFin.setBorder(null);
        jPanel1.add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 317, 174, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 338, 174, 20));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 185, -1, -1));

        comboTipo.setBackground(new java.awt.Color(255, 255, 255));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FACTURA", "PROFORMA" }));
        comboTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 180, 174, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
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

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        registrar(); // Invoca al método registrar creado.
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        setFormato(btnGuardar); // Establece formato al botón de guardar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        resetFormato(btnGuardar); // Restablece formato al botón de guardar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar(); // Invocamos el método
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        setFormato(btnLimpiar);// Establece formato al botón de limpiar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        resetFormato(btnLimpiar); // Restablece formato al botón de limpiar cada vez que el puntero pasa sobre él.
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();// Cierra la ventana de VProductos.
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBorder(BorderFactory.createLineBorder(new Color(153, 138, 147),2)); // Coloca un borde griseaceo para el botón de minimizar a manera de remarcarlo.
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBorder(null); // Restablece el boton de minimizar.
    }//GEN-LAST:event_btnCerrarMouseExited

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
            java.util.logging.Logger.getLogger(VUsuarioCorrelativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUsuarioCorrelativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUsuarioCorrelativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUsuarioCorrelativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VUsuarioCorrelativos dialog = new VUsuarioCorrelativos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtIni;
    private javax.swing.JTextField txtSerie;
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
        UsuarioCorrelativo uc = new UsuarioCorrelativo();
        Usuario usuario = new Usuario();
        int tipo = 0;
        if(comboTipo.getSelectedItem().toString().equals("FACTURA"))
            tipo = 1;
        else if(comboTipo.getSelectedItem().toString().equals("PROFORMA"))
            tipo = 2;
        
        // Verificamos que el usuario no tenga un correlativo ya asignado
        if(tipo == 1){
            if(!(uc.verificarUsuario(usuario.consultarUsuario(comboUsuarios.getSelectedItem().toString())))){
                uc.setIdusuario(usuario.consultarUsuario(comboUsuarios.getSelectedItem().toString()));
                uc.setSerie(txtSerie.getText());
                uc.setCorrelativo_ini(Integer.parseInt(txtIni.getText()));
                uc.setCorrelativo_fin(Integer.parseInt(txtFin.getText()));
                uc.setCorrelativo_act(Integer.parseInt(txtIni.getText()));
                uc.setTipo_correlativo(tipo);
                // Se verifica que el metodo grabar() devuelva un valor mayor que cero.
                if(uc.grabar(uc) > 0){
                    NotificacionGuardado ng = new NotificacionGuardado(null, true, null);
                    ng.setVisible(true);
                    limpiar();
                }else{
                    NotificacionError ne = new NotificacionError(null, true, null);
                    ne.setVisible(true);
                    txtSerie.grabFocus();
                }
            }else{
                JOptionPane.showMessageDialog(this, "El usuario elegido ya posee un correlativo existente, si desea modificarlo por favor utilice la opción de edición de correlativos."
                                            ,"Advertencia",JOptionPane.WARNING_MESSAGE);
                this.dispose();
            }
        }else if(tipo == 2){
            if(!(uc.verificarProforma(usuario.consultarUsuario(comboUsuarios.getSelectedItem().toString())))){
                uc.setIdusuario(usuario.consultarUsuario(comboUsuarios.getSelectedItem().toString()));
                uc.setSerie(txtSerie.getText());
                uc.setCorrelativo_ini(Integer.parseInt(txtIni.getText()));
                uc.setCorrelativo_fin(Integer.parseInt(txtFin.getText()));
                uc.setCorrelativo_act(Integer.parseInt(txtIni.getText()));
                uc.setTipo_correlativo(tipo);
                // Se verifica que el metodo grabar() devuelva un valor mayor que cero.
                if(uc.grabar(uc) > 0){
                    NotificacionGuardado ng = new NotificacionGuardado(null, true, null);
                    ng.setVisible(true);
                    limpiar();
                }else{
                    NotificacionError ne = new NotificacionError(null, true, null);
                    ne.setVisible(true);
                    txtSerie.grabFocus();
                }
            }else{
                JOptionPane.showMessageDialog(this, "El usuario elegido ya posee un correlativo existente, si desea modificarlo por favor utilice la opción de edición de correlativos."
                                            ,"Advertencia",JOptionPane.WARNING_MESSAGE);
                this.dispose();
            }
        }
    }
    
    private void limpiar(){
        Usuario usuario = new Usuario();
        List<Usuario> lista = usuario.listar();
        
        // Inicializar campos de texto
        txtSerie.setText("");
        txtIni.setText("");
        txtFin.setText("");
        
        // Recargar combobox de usuarios
        comboUsuarios.removeAll();
        for(int i = 0; i < lista.size(); i++){
            comboUsuarios.addItem(lista.get(i).getUsuario());
        }
    }
}
