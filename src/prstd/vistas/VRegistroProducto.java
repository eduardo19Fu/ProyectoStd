package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.List;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import prstd.modelos.Fabricante;
import prstd.modelos.Familia;
import prstd.modelos.Producto;
import prstd.modelos.Rol;
import prstd.modelos.Usuario;

/**
 *
 * @author Edfu-Pro
 */
public class VRegistroProducto extends javax.swing.JDialog {
    
    private int contador,x,y;
    private Usuario usuario;
    private Rol rol;
    List<Familia> listaFamilia;
    List<Fabricante> listaFabricante;
    private String codigo;
    
    public VRegistroProducto(java.awt.Frame parent, boolean modal, String codigo) {
        super(parent,modal);
        initComponents();
        this.codigo = codigo;
        contador = 0;
        if(!this.codigo.isEmpty()){
            cargarChoiceFabricante();
            cargarChoiceFamilia();
            cargarProducto();
            txtCodigo.setEditable(false);
        }else{
            cargarChoiceFabricante();
            cargarChoiceFamilia();
        }
        config();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtStuckTienda = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtStuckMinTienda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStuckBodega = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtStuckMinBodega = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateCompra = new org.jdesktop.swingx.JXDatePicker();
        dateVencimiento = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        checkVencimiento = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        choiceFamilia = new javax.swing.JComboBox<>();
        choiceFabricante = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.setToolTipText("Minimiza la Pantalla Principal");
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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 340, 920, 10));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos de Venta y Almacén", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio Costo:");

        txtPrecioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Porcentaje Ganancia:");

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Stuck Tienda:");

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Q.");

        txtPorcentaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentajeFocusLost(evt);
            }
        });
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("%");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio Venta:");

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioVenta.setBorder(null);
        txtPrecioVenta.setOpaque(false);
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Q.");

        txtStuckTienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStuckTiendaKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Stuck Bodega:");

        txtStuckMinTienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStuckMinTiendaKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Stuck Minimo en Tienda:");

        txtStuckBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStuckBodegaKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Stuck Minimo en Bodega:");

        txtStuckMinBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStuckMinBodegaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStuckBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel16)
                                .addGap(12, 12, 12)
                                .addComponent(txtPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12)
                                .addComponent(txtStuckTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel17))
                            .addComponent(txtStuckMinTienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18)
                        .addGap(5, 5, 5)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtStuckMinBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(jLabel16)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStuckTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtStuckMinTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtStuckBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(txtStuckMinBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 360, 920, 230));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos de Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo:");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jPanel7.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 43, 215, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Producto:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 45, -1, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fabricante:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 180, -1, -1));
        jPanel7.add(dateCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 108, 210, -1));
        jPanel7.add(dateVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 210, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Familia:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 178, -1, -1));

        txtNombre.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jPanel7.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 43, 220, -1));

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha Compra:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 113, -1, -1));

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha Vencimiento:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 113, -1, -1));

        checkVencimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkVencimiento.setOpaque(false);
        checkVencimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkVencimientoMouseClicked(evt);
            }
        });
        jPanel7.add(checkVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 108, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(". . .");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 34, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(". . .");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 34, -1));

        choiceFamilia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(choiceFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 176, 160, -1));

        choiceFabricante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(choiceFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 176, 160, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 50, 920, 270));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Broom_50px.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar Campos");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setOpaque(true);
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

        btnGuardar.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Save_50px.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar Producto");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 340, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation(); // Obtiene el punto donde esta el puntero del mouse en ese momento.
        setLocation(point.x - x, point.y - y); //Configura la locación de la ventana segun vamos moviendo el mouse.
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        this.x = evt.getX(); // Obtenemos la posición de X de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
        this.y = evt.getY(); // Obtenemos la posición de Y de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
    }//GEN-LAST:event_jLabel7MousePressed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();// Cierra la ventana de Productos.
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBorder(BorderFactory.createLineBorder(new Color(153, 138, 147),2)); // Coloca un borde griseaceo para el botón de minimizar a manera de remarcarlo.
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBorder(null); // Restablece el boton de minimizar.
    }//GEN-LAST:event_btnCerrarMouseExited

    private void txtPrecioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar() != '.'){
            evt.consume();
        }
        if(evt.getKeyChar() == '.' && txtPrecioC.getText().contains("."))
            evt.consume();
    }//GEN-LAST:event_txtPrecioCKeyTyped

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar() != '.'){
            evt.consume();
        }
        if(evt.getKeyChar() == '.' && txtPrecioC.getText().contains("."))
            evt.consume();
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void txtPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar() != '.'){
            evt.consume();
        }
        if(evt.getKeyChar() == '.' && txtPrecioC.getText().contains("."))
            evt.consume();
    }//GEN-LAST:event_txtPrecioVentaKeyTyped

    private void txtStuckTiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStuckTiendaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar() != '.'){
            evt.consume();
        }
        if(evt.getKeyChar() == '.' && txtPrecioC.getText().contains("."))
            evt.consume();
    }//GEN-LAST:event_txtStuckTiendaKeyTyped

    private void txtStuckMinTiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStuckMinTiendaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStuckMinTiendaKeyTyped

    private void txtStuckBodegaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStuckBodegaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStuckBodegaKeyTyped

    private void txtStuckMinBodegaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStuckMinBodegaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStuckMinBodegaKeyTyped

    private void txtPorcentajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentajeFocusLost
        if(!txtPorcentaje.getText().isEmpty()){
            Producto producto = new Producto();
            txtPrecioVenta.setText(producto.calcularPrecioVenta(txtPrecioC.getText(), txtPorcentaje.getText()));
        }
    }//GEN-LAST:event_txtPorcentajeFocusLost

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        setFormato(btnGuardar);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        resetFormato(btnGuardar);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        setFormato(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        resetFormato(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        
        int op = JOptionPane.showOptionDialog(this, "¿Seguro que desea registrar este producto?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, 
                                              null,new Object[]{"Aceptar","Cancelar"}, "Cancelar");
        if(op != -1){
            if((op + 1) == 1){
                registrar();
            }else{
                
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        VRegistroFamilias rf = new VRegistroFamilias(null,true,0);
        rf.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        VRegistroFabricantes rf = new VRegistroFabricantes(null, true, 0);
        rf.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void checkVencimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkVencimientoMouseClicked
        if(checkVencimiento.isSelected())
            dateVencimiento.setEnabled(true);
        else
            dateVencimiento.setEnabled(false);
    }//GEN-LAST:event_checkVencimientoMouseClicked

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
            java.util.logging.Logger.getLogger(VRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            VRegistroProducto dialog = new VRegistroProducto(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JCheckBox checkVencimiento;
    public static javax.swing.JComboBox<String> choiceFabricante;
    public static javax.swing.JComboBox<String> choiceFamilia;
    private org.jdesktop.swingx.JXDatePicker dateCompra;
    private org.jdesktop.swingx.JXDatePicker dateVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStuckBodega;
    private javax.swing.JTextField txtStuckMinBodega;
    private javax.swing.JTextField txtStuckMinTienda;
    private javax.swing.JTextField txtStuckTienda;
    // End of variables declaration//GEN-END:variables

    private void setFormato(JLabel label){
        //label.setBorder(BorderFactory.createLineBorder(new Color(0,153,153),2));
        label.setBackground(new Color(0,212,186));
    }
    
    private void resetFormato(JLabel label){
        label.setBorder(null);
        label.setBackground(new Color(0,153,153));
    }
    
     private void setColor(JPanel panel){
        panel.setBackground(new Color(0,212,186));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(0,153,153));
    }
    
    private void registrar(){
        Producto producto = new Producto();
        Familia familia = new Familia();
        Fabricante fabricante = new Fabricante();
        
        // Datos Generales:
        if(!txtCodigo.getText().isEmpty()){
            producto.setCodigo(txtCodigo.getText());
        }else{
            int rand;
            Random random = new Random();
            rand = random.nextInt(5000) + 1;
            producto.setCodigo(String.valueOf(rand) + txtNombre.getText().substring(0,1));
        }
        producto.setNombre(txtNombre.getText());
        producto.setFecha_compra(dateCompra.getDate());
        producto.setFecha_vencimiento(dateVencimiento.getDate());
        producto.setFamilia(familia.getId(choiceFamilia.getSelectedItem().toString()));
        producto.setFabricante(fabricante.getId(choiceFabricante.getSelectedItem().toString()));
        
        // Datos de Venta y Almacén:
        producto.setPrecio_compra(Double.parseDouble(txtPrecioC.getText()));
        producto.setPorcentaje_ganancia(Double.parseDouble(txtPorcentaje.getText()));
        producto.setPrecio_venta(Double.parseDouble(txtPrecioVenta.getText()));
        producto.setExistencia_tienda(Integer.parseInt(txtStuckTienda.getText()));
        producto.setExistencia_minima_tienda(Integer.parseInt(txtStuckMinTienda.getText()));
        producto.setExistencia_bodega(Integer.parseInt(txtStuckBodega.getText()));
        producto.setExistencia_minima_bodega(Integer.parseInt(txtStuckMinBodega.getText()));
        
        // Registrar nuevo Producto
        if(this.codigo.isEmpty()){
            if(producto.crear(producto) > 0){
                JOptionPane.showMessageDialog(this, "Producto Registrado con éxito","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(this, "Resulta imposible registrar el producto, revise los campos ingresados para prevenir errores.","Error",JOptionPane.ERROR_MESSAGE);
                txtCodigo.grabFocus();
            }
        }else{
            if(producto.actualizar(producto) > 0){
                JOptionPane.showMessageDialog(this, "Producto Registrado con éxito","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(this, "Resulta imposible registrar el producto, revise los campos ingresados para prevenir errores.","Error",JOptionPane.ERROR_MESSAGE);
                txtCodigo.grabFocus();
            }
        }
    }
    
    private void cargarChoiceFabricante(){
        Fabricante fabricante = new Fabricante();
        listaFabricante = fabricante.listar();
        for(int i = 0; i < listaFabricante.size(); i++){
            choiceFabricante.addItem(String.valueOf(listaFabricante.get(i).getNombre_fabricante()));
        }
    }
    
    private void cargarChoiceFamilia(){
        Familia familia = new Familia();
        listaFamilia = familia.listar();
        for(int i = 0; i < listaFamilia.size(); i++){
            choiceFamilia.addItem(String.valueOf(listaFamilia.get(i).getNombre_familia()));
        }
    }
    
    private void config(){
        dateCompra.setDate(new java.util.Date());
        dateVencimiento.setEnabled(false);
    }
    
    private void cargarProducto(){
        Producto producto = new Producto().buscarProducto(this.codigo);
        
        txtCodigo.setText(producto.getCodigo());
        txtNombre.setText(producto.getNombre());
        dateCompra.setDate(producto.getFecha_compra());
        if(producto.getFecha_vencimiento() != null)
            dateVencimiento.setDate(producto.getFecha_vencimiento());
        else
            dateVencimiento.setDate(null);
        choiceFabricante.setSelectedItem(producto.getNombre_fabricante());
        choiceFamilia.setSelectedItem(producto.getNombre_familia());
        
        txtPrecioC.setText(String.valueOf(producto.getPrecio_compra()));
        txtPrecioVenta.setText(String.valueOf(producto.getPrecio_venta()));
        txtPorcentaje.setText(String.valueOf(producto.getPorcentaje_ganancia()));
        txtStuckTienda.setText(String.valueOf(producto.getExistencia_tienda()));
        txtStuckMinTienda.setText(String.valueOf(producto.getExistencia_minima_tienda()));
        txtStuckBodega.setText(String.valueOf(producto.getExistencia_bodega()));
        txtStuckMinBodega.setText(String.valueOf(producto.getExsitencia_minima_bodega()));
    }
    
    private void limpiar(){
        // Datos Generales
        txtCodigo.setText("");
        txtNombre.setText("");
        dateCompra.setDate(new java.util.Date());
        dateVencimiento.setEnabled(false);
        dateVencimiento.setDate(null);
        checkVencimiento.setSelected(false);
        
        // Datos de venta y compra
        txtPrecioC.setText("0.00");
        txtPorcentaje.setText("0.00");
        txtPrecioVenta.setText("0.00");
        txtStuckTienda.setText("");
        txtStuckMinTienda.setText("");
        txtStuckBodega.setText("");
        txtStuckMinBodega.setText("");
    }
}
