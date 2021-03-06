package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Producto;

/**
 *
 * @author Edfu-Pro
 */
public class VProductos extends javax.swing.JDialog {

    int x,y;
    private Producto producto;
    public VProductos(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargarProductos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        panelCobros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAlta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Multiply_32px.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimiza la Pantalla Principal");
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 216, 148));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Search_32px.png"))); // NOI18N
        jPanel4.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 40, 30));

        txtBusqueda.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        jPanel4.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, 120));

        panelCobros.setOpaque(false);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio Costo", "% Ganancia", "Stuck Tienda", "Stuck Bodega", "Estado"
            }
        ));
        tblProductos.setFillsViewportHeight(true);
        tblProductos.setFocusTraversalPolicyProvider(true);
        tblProductos.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblProductos.setShowHorizontalLines(false);
        tblProductos.setShowVerticalLines(false);
        tblProductos.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblProductos);

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Productos Disponibles");

        javax.swing.GroupLayout panelCobrosLayout = new javax.swing.GroupLayout(panelCobros);
        panelCobros.setLayout(panelCobrosLayout);
        panelCobrosLayout.setHorizontalGroup(
            panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCobrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCobrosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCobrosLayout.setVerticalGroup(
            panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCobrosLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jPanel2.add(panelCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 600));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 780));

        panelOpciones.setBackground(new java.awt.Color(0, 153, 153));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos");
        panelOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 50));
        panelOpciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, 170, 10));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 25));

        btnNuevo.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setPreferredSize(new java.awt.Dimension(250, 50));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
        });
        btnNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Producto");
        btnNuevo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_New_Copy_50px.png"))); // NOI18N
        btnNuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnNuevo);

        btnEditar.setBackground(new java.awt.Color(0, 153, 153));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setPreferredSize(new java.awt.Dimension(250, 50));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editar Producto");
        btnEditar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Edit_File_50px.png"))); // NOI18N
        btnEditar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnEditar);

        btnAlta.setBackground(new java.awt.Color(0, 153, 153));
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlta.setPreferredSize(new java.awt.Dimension(250, 50));
        btnAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAltaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAltaMouseExited(evt);
            }
        });
        btnAlta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alta de Producto");
        jLabel7.setToolTipText("");
        btnAlta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Downloading_Updates_50px.png"))); // NOI18N
        btnAlta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnAlta);

        btnEliminar.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setPreferredSize(new java.awt.Dimension(250, 50));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Eliminar Producto");
        jLabel9.setToolTipText("");
        btnEliminar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Delete_Archive_50px_1.png"))); // NOI18N
        btnEliminar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnEliminar);

        panelOpciones.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 330));

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 250, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.dispose();// Cierra la ventana de VProductos.
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBorder(BorderFactory.createLineBorder(new Color(153, 138, 147),2)); // Coloca un borde griseaceo para el botón de minimizar a manera de remarcarlo.
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBorder(null); // Restablece el boton de minimizar.
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        VRegistroProducto vregistro = new VRegistroProducto(null,true, "");
        vregistro.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        setColor(btnNuevo);
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        resetColor(btnNuevo);
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        setColor(btnEditar);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        resetColor(btnEditar);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnAltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaMouseEntered
        setColor(btnAlta);
    }//GEN-LAST:event_btnAltaMouseEntered

    private void btnAltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaMouseExited
        resetColor(btnAlta);
    }//GEN-LAST:event_btnAltaMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        setColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        resetColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaMouseClicked
        try{
            String codigo = tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString();
            VAltaProducto va = new VAltaProducto(null, true, codigo);
            va.setVisible(true);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para poderle dar de Alta.");
        }
    }//GEN-LAST:event_btnAltaMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        String codigo;
        try{
            codigo = tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString();
            VRegistroProducto vr = new VRegistroProducto(null, true, codigo);
            vr.setVisible(true);
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this, "Seleccione por favor seleccione un producto para editar.","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        String codigo;
        try{
            int op = JOptionPane.showOptionDialog(this, "¿Desea descontinuar este producto?", "Advertencia", 
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{"Aceptar","Cancelar"}, "Cancelar");
            if(op != -1){
                if((op + 1) == 1){
                    codigo = tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString();
                    Producto producto = new Producto().buscarProducto(codigo);
                    if(producto.getExistencia_tienda() > 0 || producto.getExistencia_bodega() > 0)
                        JOptionPane.showMessageDialog(this, "No se puede descontinuar un producto que aun posee existencias en tienda o bodega.","Alerta",JOptionPane.WARNING_MESSAGE);
                    else if(producto.descontinuar(codigo) > 0){
                        JOptionPane.showMessageDialog(this, "Producto descontinuado con éxito.");
                        cargarProductos();
                    }else
                        JOptionPane.showMessageDialog(this, "Ha ocurrido un problemas al tratar de descontinuar el producto.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para continuar");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        filtrar();
    }//GEN-LAST:event_txtBusquedaKeyReleased

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
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            VProductos dialog = new VProductos(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windoClosing(java.awt.event.WindowEvent e){
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAlta;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCobros;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

    public void cerrarVentanaPrincipal(){
        this.dispose();
    }
    
    private void setColor(JPanel panel){
        panel.setBackground(new Color(0,212,186));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(0,153,153));
    }
    
    private void setBorder(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,153,153),2));
    }
    
    private void resetBorder(JLabel label){
        label.setBorder(null);
    }
    
    private void cargarProductos(){
        producto = new Producto();
        String[] titulos = {"Código","Nombre","Precio Costo","% Ganancia","Stuck Tienda","Stuck Bodega","Estado"};
        Object[] datos = new Object[7];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        List<Producto> lista = producto.buscarProductos();
        for(int i = 0; i < lista.size(); i++){
            datos[0] = lista.get(i).getCodigo();
            datos[1] = lista.get(i).getNombre();
            datos[2] = lista.get(i).getPrecio_compra();
            datos[3] = lista.get(i).getPorcentaje_ganancia();
            datos[4] = lista.get(i).getExistencia_tienda();
            datos[5] = lista.get(i).getExistencia_bodega();
            datos[6] = lista.get(i).getEstado();
            modelo.addRow(datos);
        }
        tblProductos.setModel(modelo);
    }

    private void filtrar() {
        producto = new Producto();
        String[] titulos = {"Código","Nombre","Precio Costo","% Ganancia","Stuck Tienda","Stuck Bodega","Estado"};
        Object[] datos = new Object[7];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        List<Producto> lista = producto.filtrarProductos(txtBusqueda.getText());
        
        for(int i = 0; i < lista.size(); i++){
            datos[0] = lista.get(i).getCodigo();
            datos[1] = lista.get(i).getNombre();
            datos[2] = lista.get(i).getPrecio_compra();
            datos[3] = lista.get(i).getPorcentaje_ganancia();
            datos[4] = lista.get(i).getExistencia_tienda();
            datos[5] = lista.get(i).getExistencia_bodega();
            datos[6] = lista.get(i).getEstado();
            modelo.addRow(datos);
        }
        tblProductos.setModel(modelo);
    }
}
