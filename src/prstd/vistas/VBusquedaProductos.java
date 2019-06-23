package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Fabricante;
import prstd.modelos.Familia;
import prstd.modelos.Producto;

public class VBusquedaProductos extends javax.swing.JDialog {
    
    int x,y;
    int flag;

    public VBusquedaProductos(java.awt.Frame parent, boolean modal, int flag) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.flag = flag;
        cargarProductos(this.flag);
        txtArticulo.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        radioNombre = new javax.swing.JRadioButton();
        radioFamilia = new javax.swing.JRadioButton();
        radioFabricante = new javax.swing.JRadioButton();
        btnCerrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio Venta", "Familia", "Fabricante", "Existencias"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 210, 753, 158));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Artículo:");

        txtArticulo.setToolTipText("");
        txtArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtArticuloKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 216, 148));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 2), "Buscar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 12), new java.awt.Color(0, 120, 116))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        buttonGroup1.add(radioNombre);
        radioNombre.setForeground(new java.awt.Color(0, 102, 51));
        radioNombre.setSelected(true);
        radioNombre.setText("Nombre");
        radioNombre.setOpaque(false);
        jPanel3.add(radioNombre);

        buttonGroup1.add(radioFamilia);
        radioFamilia.setForeground(new java.awt.Color(0, 102, 51));
        radioFamilia.setText("Familia");
        radioFamilia.setOpaque(false);
        jPanel3.add(radioFamilia);

        buttonGroup1.add(radioFabricante);
        radioFabricante.setForeground(new java.awt.Color(0, 102, 51));
        radioFabricante.setText("Fabricante");
        radioFabricante.setOpaque(false);
        jPanel3.add(radioFabricante);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 65, 740, -1));

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
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 153));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Búsqueda de Productos");
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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();// Cierra la ventana de VProductos.
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBorder(BorderFactory.createLineBorder(new Color(153, 138, 147),2)); // Coloca un borde griseaceo para el botón de minimizar a manera de remarcarlo.
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBorder(null); // Restablece el boton de minimizar.
    }//GEN-LAST:event_btnCerrarMouseExited

    private void tblProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMousePressed
        if(evt.getClickCount() > 1){
            String codigo = tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString();
            String nombre = tblProductos.getValueAt(tblProductos.getSelectedRow(), 1).toString();
            if(this.flag == 1){    
                VCrearFactura.txtCodigo.setText(codigo);
                VCrearFactura.txtProducto.setText(nombre);
                this.dispose();
                VCrearFactura.txtCantidad.grabFocus();
            }else if(this.flag == 2){
                VCreacionProforma.txtCodigo.setText(codigo);
                VCreacionProforma.txtProducto.setText(nombre);
                this.dispose();
                VCreacionProforma.txtCantidad.grabFocus();
            }else if(this.flag == 3){
                VCrearOrdenes.txtCodigo.setText(codigo);
                VCrearOrdenes.txtProducto.setText(nombre);
                this.dispose();
                VCrearOrdenes.txtCantidad.grabFocus();
            }
        }
    }//GEN-LAST:event_tblProductosMousePressed

    private void txtArticuloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArticuloKeyReleased
        cargarNombre();
    }//GEN-LAST:event_txtArticuloKeyReleased

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
            java.util.logging.Logger.getLogger(VBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VBusquedaProductos dialog = new VBusquedaProductos(new javax.swing.JFrame(), true, 0);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioFabricante;
    private javax.swing.JRadioButton radioFamilia;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtArticulo;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos(int flag){
        Producto producto = new Producto();
        Familia familia = new Familia();
        Fabricante fabricante = new Fabricante();
        
        String titulos[] = {"Código","Nombre","Precio Venta","Familia","Fabricante","Existencias"};
        Object[] datos = new Object[6];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        List<Producto> lista = producto.buscarProductos();
        
        for(int i = 0; i < lista.size(); i++){
            datos[0] = lista.get(i).getCodigo();
            datos[1] = lista.get(i).getNombre();
            datos[2] = lista.get(i).getPrecio_venta();
            datos[3] = lista.get(i).getNombre_familia();
            datos[4] = lista.get(i).getNombre_fabricante();
            if(flag == 3)
                datos[5] = lista.get(i).getExistencia_bodega();
            else
                datos[5] = lista.get(i).getExistencia_tienda();
            modelo.addRow(datos);
        }
        tblProductos.setModel(modelo);
    }
    
    private void cargarNombre(){
        Producto producto = new Producto();
        String titulos[] = {"Código","Nombre","Precio Venta","Familia","Fabricante","Existencias"};
        Object[] datos = new Object[6];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        List<Producto> lista = new ArrayList<>();
        
        if(radioNombre.isSelected())
            lista = producto.busquedaNombre(txtArticulo.getText());
        else if(radioFamilia.isSelected())
            lista = producto.busquedaFamilia(txtArticulo.getText());
        else if(radioFabricante.isSelected())
            lista = producto.busquedaFabricante(txtArticulo.getText());
            
        
        for(int i = 0; i < lista.size(); i++){
            datos[0] = lista.get(i).getCodigo();
            datos[1] = lista.get(i).getNombre();
            datos[2] = lista.get(i).getPrecio_venta();
            datos[3] = lista.get(i).getNombre_familia();
            datos[4] = lista.get(i).getNombre_fabricante();
            datos[5] = lista.get(i).getExistencia_tienda();
            modelo.addRow(datos);
        }
        tblProductos.setModel(modelo);
    }
}
