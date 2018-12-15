package prstd.vistas;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Cliente;
import prstd.modelos.Documento;
import prstd.modelos.NotaCliente;
import prstd.modelos.NotaCredito;
import prstd.modelos.NotaTransaccion;
import prstd.modelos.Producto;
import prstd.modelos.Usuario;
import prstd.modelos.UsuarioCorrelativo;
import static prstd.vistas.VCreacionProforma.tblDetalle;

public class VCrearFactura extends javax.swing.JDialog {

    
    int x,y;
    String vendedor;
    double sumatoria;
    private Usuario usuario;
    private String[] titulos = {"Cantidad","Codigo","Producto","Sub-total","Descuento","Nota"};
    private DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    private Object[] datos = new Object[6];
    
    public VCrearFactura(java.awt.Frame parent, boolean modal, String vendedor) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        checkVarios.setVisible(false);
        this.vendedor = vendedor;
        usuario = new Usuario();
        usuario.setUsuario(this.vendedor);
        lblVendedor.setText(usuario.getVendedor());
        sumatoria = 0;
        init();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTransac = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        checkVarios = new javax.swing.JCheckBox();
        btnBuscarCliente = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtProducto = new javax.swing.JTextField();
        btnBuscarCodigo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        btnDescuento = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblFechaFactura = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("No. Factura:");

        lblFactura.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblFactura.setForeground(new java.awt.Color(0, 0, 0));
        lblFactura.setText("jLabel2");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Serie:");

        lblSerie.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(0, 0, 0));
        lblSerie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSerie.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("No. de Transacción:");

        lblTransac.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblTransac.setForeground(new java.awt.Color(0, 0, 0));
        lblTransac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTransac.setText("No. Factura:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblTransac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lblSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFactura)
                    .addComponent(jLabel7)
                    .addComponent(lblSerie)
                    .addComponent(jLabel2)
                    .addComponent(lblTransac))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 120, 880, -1));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nit:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 16, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 63, -1, -1));

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });
        jPanel3.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 11, 130, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 58, 199, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 63, -1, -1));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 58, 285, -1));

        checkVarios.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        checkVarios.setForeground(new java.awt.Color(0, 0, 0));
        checkVarios.setText("Clientes Varios");
        checkVarios.setToolTipText("");
        checkVarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkVarios.setOpaque(false);
        checkVarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkVariosMouseClicked(evt);
            }
        });
        jPanel3.add(checkVarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        btnBuscarCliente.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Search_32px_1.png"))); // NOI18N
        btnBuscarCliente.setText("F4");
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseExited(evt);
            }
        });
        jPanel3.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 5, 63, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 880, 120));

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
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 153));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Creación de Factura");
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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 896, 40));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Codigo", "Producto", "Sub-total", "Descuento", "Nota Credito"
            }
        ));
        tblDetalle.setFillsViewportHeight(true);
        tblDetalle.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDetalle.setShowHorizontalLines(false);
        tblDetalle.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblDetalle);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 66, 787, 181));

        txtTotal.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0.00");
        txtTotal.setFocusable(false);
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 246, 133, 43));

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 260, -1, -1));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 5, 280, 28));

        btnBuscarCodigo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnBuscarCodigo.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Search_32px_1.png"))); // NOI18N
        btnBuscarCodigo.setText("F5");
        btnBuscarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCodigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarCodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarCodigoMouseExited(evt);
            }
        });
        jPanel5.add(btnBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 4, 63, -1));

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cantidad:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel5.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 5, 180, 28));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel5.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 5, 60, 28));

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Código:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, -1, -1));

        btnAdd.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Plus_Math_30px.png"))); // NOI18N
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 4, 49, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 16, 860, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 116), 2, true));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 10));

        btnImprimir.setBackground(new java.awt.Color(230, 162, 78));
        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Print_32px.png"))); // NOI18N
        btnImprimir.setToolTipText("Generar Factura (F1)");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setOpaque(true);
        btnImprimir.setPreferredSize(new java.awt.Dimension(78, 54));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirMouseExited(evt);
            }
        });
        jPanel6.add(btnImprimir);

        btnEliminar.setBackground(new java.awt.Color(230, 162, 78));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Minus_32px.png"))); // NOI18N
        btnEliminar.setToolTipText("Remover Producto");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setOpaque(true);
        btnEliminar.setPreferredSize(new java.awt.Dimension(78, 54));
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
        jPanel6.add(btnEliminar);

        btnLimpiar.setBackground(new java.awt.Color(230, 162, 78));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Broom_32px.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar el Detalle por completo");
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
        jPanel6.add(btnLimpiar);

        btnDescuento.setBackground(new java.awt.Color(230, 162, 78));
        btnDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDescuento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Discount_32px.png"))); // NOI18N
        btnDescuento.setToolTipText("Generar Descuento");
        btnDescuento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescuento.setOpaque(true);
        btnDescuento.setPreferredSize(new java.awt.Dimension(78, 54));
        btnDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDescuentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDescuentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDescuentoMouseExited(evt);
            }
        });
        jPanel6.add(btnDescuento);

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 580, 80));

        txtDescuento.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuento.setText("0.00");
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });
        jPanel4.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 295, 133, 43));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 880, 350));

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha:");

        lblFechaFactura.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblFechaFactura.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaFactura.setText("jLabel3");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Vendedor:");

        lblVendedor.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblVendedor.setForeground(new java.awt.Color(0, 0, 0));
        lblVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVendedor.setText("jLabel2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(lblVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(lblFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblFechaFactura)
                    .addComponent(jLabel15)
                    .addComponent(lblVendedor))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 50, 880, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
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

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        setFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        resetFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        resetFormato(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        setFormato(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminarProducto((DefaultTableModel) tblDetalle.getModel());
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarDetalle();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        setFormato(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        resetFormato(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentoMouseClicked
        if(txtDescuento.isVisible()){
            txtDescuento.setVisible(false);
            txtDescuento.setText("0.00");
        }else{
            txtDescuento.setVisible(true);
            txtDescuento.setText("0.00");
        }
    }//GEN-LAST:event_btnDescuentoMouseClicked

    private void btnDescuentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentoMouseEntered
        setFormato(btnDescuento);
    }//GEN-LAST:event_btnDescuentoMouseEntered

    private void btnDescuentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentoMouseExited
        resetFormato(btnDescuento);
    }//GEN-LAST:event_btnDescuentoMouseExited

    private void btnBuscarCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCodigoMouseEntered
        setBorde(btnBuscarCodigo);
    }//GEN-LAST:event_btnBuscarCodigoMouseEntered

    private void btnBuscarCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCodigoMouseExited
        resetBorde(btnBuscarCodigo);
    }//GEN-LAST:event_btnBuscarCodigoMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        setBorde(btnAdd);
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        resetBorde(btnAdd);
    }//GEN-LAST:event_btnAddMouseExited

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            buscarNit();
        }        
    }//GEN-LAST:event_txtNitKeyTyped

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnBuscarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCodigoMouseClicked
        VBusquedaProductos bp = new VBusquedaProductos(null,true,1);
        bp.setVisible(true);
    }//GEN-LAST:event_btnBuscarCodigoMouseClicked

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        Cliente cl= new Cliente();
        UsuarioCorrelativo ucorr;
        Documento documento = new Documento();
        int transaccion;
        if(documento.getMaxTransaccion() == 0)
            transaccion = 1;
        else
            transaccion = documento.getMaxTransaccion() + 1;
        int no_factura = Integer.parseInt(lblFactura.getText());
        Timestamp time = new Timestamp(new Date().getTime());
        double total = Double.parseDouble(txtTotal.getText());
        int idusuario = usuario.consultarUsuario(vendedor);
        ucorr = new UsuarioCorrelativo().getActual(idusuario);
        String serie = lblSerie.getText().replaceAll("\"", "");
        int cliente = cl.consultarCliente(txtNit.getText());
        int actual = ucorr.getCorrelativo_act();
        
        if(!(no_factura == 0)){
            if(!(no_factura > actual)){
                documento.setIdtransaccion(transaccion);
                documento.setNo_documento(no_factura);
                documento.setFecha_emision(time);
                documento.setTotal(total);
                documento.setIdcliente(cliente);
                documento.setIdvendedor(idusuario);
                documento.setEstado("PAGADA");
                documento.setTipo_documento(1);
                documento.setSerie(serie);
                
                if(documento.crearFactura(documento) > 0){
                    if(documento.detalleFactura((DefaultTableModel) tblDetalle.getModel(), transaccion, serie) > 0){
                        if(documento.actualizarExistencias((DefaultTableModel) tblDetalle.getModel()) > 0){
                            if(ucorr.avanzaCorrelativo(idusuario, no_factura, 1) > 0){
                                //JOptionPane.showMessageDialog(this, "FacturaCreada");
                                Documento dc = new Documento();
                                NotaCredito nc = new NotaCredito();
                                NotaTransaccion nt = new NotaTransaccion();
                                NotaCliente ncl = new NotaCliente();
                                
                                nc.update((DefaultTableModel) tblDetalle.getModel());
                                nt.crear((DefaultTableModel) tblDetalle.getModel(), transaccion);
                                ncl.crear((DefaultTableModel) tblDetalle.getModel(), cliente);
                                try {
                                    dc.imprimir(documento.getMaxTransaccion(), no_factura, serie, total);
                                } catch (SQLException ex) {
                                    Logger.getLogger(VCrearFactura.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                init();
                            }
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "El usuario ha alcanzado el máximo de facturas permitido");
            }
        }else{
            JOptionPane.showMessageDialog(this, "El usuario no posee un correlativo válido");
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            if(!txtNit.getText().isEmpty()){
                agregarDetalle(txtCodigo.getText());
                txtCodigo.setText("");
                txtProducto.setText("");
                txtCantidad.setText("");
                txtCodigo.grabFocus();
                configurarTabla(tblDetalle);
            }else{
                JOptionPane.showMessageDialog(this, "Nit no válido");
                txtNit.grabFocus();
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void checkVariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkVariosMouseClicked
//        Documento dc = new Documento();
//        List<Documento> lista = dc.consultarClientesVarios();
//        if(lista != null){
//            VClientesVariosF vc = new VClientesVariosF(null,true);
//            vc.setVisible(true);
//        }else{
//            Documento doc = new Documento();
//            doc.setIdtransaccion(FRAMEBITS);
//            
//        }
    }//GEN-LAST:event_checkVariosMouseClicked

    private void txtDescuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            
            try {
                double porcentaje = Double.parseDouble(txtDescuento.getText());
                String codigo = tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 1).toString();
                descuento_dos(porcentaje, codigo);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun producto para aplicar descuento","Advertencia",JOptionPane.WARNING_MESSAGE);
                txtDescuento.setText("");
                txtDescuento.grabFocus();
            }
        }
    }//GEN-LAST:event_txtDescuentoKeyPressed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            if(txtCodigo.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Código no puede estar vacío.","Advertencia",JOptionPane.WARNING_MESSAGE);
                txtCodigo.grabFocus();
            }else{
                buscarProducto();
            }
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked
        VBusquedaClientes vb = new VBusquedaClientes(null, true, 1);
        vb.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        setBorde(btnBuscarCliente);
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        resetBorde(btnBuscarCliente);
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VCrearFactura dialog = new VCrearFactura(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnBuscarCliente;
    private javax.swing.JLabel btnBuscarCodigo;
    private javax.swing.JLabel btnDescuento;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnImprimir;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JCheckBox checkVarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFechaFactura;
    public static javax.swing.JLabel lblSerie;
    public static javax.swing.JLabel lblTransac;
    private javax.swing.JLabel lblVendedor;
    public static javax.swing.JTable tblDetalle;
    public static javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescuento;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtNit;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void init(){
        limpiar();
        //txtDescuento.setEditable(true);
        Date fechaAct = new Date();
        Documento factura = new Documento();
        UsuarioCorrelativo ucorr = new UsuarioCorrelativo();
        ucorr = ucorr.getActual(usuario.consultarUsuario(this.vendedor));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblFechaFactura.setText("" + formato.format(fechaAct));
        if(factura.getMaxTransaccion() == 0)
            lblTransac.setText("1");
        else
            lblTransac.setText(String.valueOf(factura.getMaxTransaccion() + 1));
        lblFactura.setText(String.valueOf(ucorr.getCorrelativo_act()));
        lblSerie.setText("\"" + ucorr.getSerie() + "\"");
        modelo = new DefaultTableModel(null,titulos);
        tblDetalle.removeAll();
        tblDetalle.setModel(modelo);
        configurarTabla(tblDetalle);
        
    }
    
    void limpiar(){
        txtNit.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtCodigo.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtTotal.setText("0.00");
        txtDescuento.setText("0.00");
        txtDescuento.setVisible(false);
        txtNit.grabFocus();
    }
    
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
    
    public void buscarNit(){
        Cliente cliente;
        if(!txtNit.getText().isEmpty())
            cliente = new Cliente().buscarNit(txtNit.getText());
        else
            cliente = new Cliente().buscarNit("C/F");
        if(cliente != null){
            
            txtNit.setText(cliente.getNit());
            txtNombre.setText(cliente.getNombre());
            txtDireccion.setText(cliente.getDireccion());
            
            txtCodigo.grabFocus();
        }else{
            VRegistroClientes rc = new VRegistroClientes(null, true, txtNit.getText());
            rc.setVisible(true);
        }
    }
    
    
    private void agregarDetalle(String codigo){
        boolean bandera = false;
        Producto producto = new Producto().buscarProducto(codigo);
        NotaCredito nc = new NotaCredito();
//        String[] titulos = {"Cantidad","Codigo","Producto","Sub-Total","Descuento"};
//        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
//        Object[] datos = new Object[5];
        int existencia = producto.getExistencia_tienda();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        
        if(cantidad <= existencia){
            datos[0] = cantidad;
            datos[1] = producto.getCodigo();
            datos[2] = producto.getNombre();
            datos[3] = Double.parseDouble(producto.redondearPrecio((producto.getPrecio_venta() * cantidad)));
            datos[4] = 0.00;
            datos[5] = "";
            
            //Evitar datos duplicados en el detalle de la factura
            for(int i = 0; i < tblDetalle.getRowCount(); i++){
                if(tblDetalle.getValueAt(i, 1).toString().trim().equals(codigo)){
                    int nCantidad = cantidad + (int) tblDetalle.getValueAt(i, 0);
                    if(!(nCantidad > existencia)){
                        double nPrecio = Double.parseDouble(producto.redondearPrecio(nCantidad * (double) producto.getPrecio_venta()));
                        tblDetalle.setValueAt(nCantidad, i, 0);
                        tblDetalle.setValueAt(nPrecio, i, 3);
                        bandera = true;
                    }else{
                        // Crear nota de crédito
                        int op = JOptionPane.showOptionDialog(this, "Existencias insuficientes. ¿Desea crear una nota de crédito para este producto?", 
                                "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{"Aceptar","Cancelar"}, "Cancelar");
                        if(op != -1){
                            if((op + 1) == 1){
                                crearNotaCredito(nCantidad);
                                double nPrecio = Double.parseDouble(producto.redondearPrecio(nCantidad * (double) producto.getPrecio_venta()));
                                tblDetalle.setValueAt(nCantidad, i, 0);
                                tblDetalle.setValueAt(nPrecio, i, 3);
                                tblDetalle.setValueAt(nc.notaMax(codigo), i, 5); // Colocar la nota de crédito recién creada en la tabla de detalle Factura
                                bandera = true;
                            }
                        }
                    }
                }
            }
            if(bandera == false){
                modelo.addRow(datos);
                tblDetalle.setModel(modelo);
            }
            int conteoTabla = tblDetalle.getRowCount();
            double suma = 0;
            sumatoria = 0;
            for(int i = 0; i<= (conteoTabla - 1); i++){
                suma = Double.parseDouble(String.valueOf(tblDetalle.getValueAt(i, 3)));
                sumatoria += suma;
            }
            txtTotal.setText(String.valueOf(producto.redondearPrecio(sumatoria)));
        }else{
            // aqui va la creacion de notas de crédito
            int op = JOptionPane.showOptionDialog(this, "Existencias insuficientes. ¿Desea crear una nota de crédito para este producto?", 
                                "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{"Aceptar","Cancelar"}, "Cancelar");
            if(op != -1){
                if((op + 1) == 1){
                    
                    datos[0] = cantidad;
                    datos[1] = producto.getCodigo();
                    datos[2] = producto.getNombre();
                    datos[3] = Double.parseDouble(producto.redondearPrecio((producto.getPrecio_venta() * cantidad)));
                    datos[4] = 0.00;
                    crearNotaCredito(cantidad); 
                    datos[5] = nc.notaMax(codigo); // Colocar la nota de crédito recién creada en la tabla de detalle Factura
                    
                    // Evitar Datos Duplicados
                    for(int i = 0; i < tblDetalle.getRowCount(); i++){
                        if(tblDetalle.getValueAt(i, 1).toString().trim().equals(codigo)){
                            int nCantidad = cantidad + (int) tblDetalle.getValueAt(i, 0);
                            double nPrecio = Double.parseDouble(producto.redondearPrecio(nCantidad * (double) producto.getPrecio_venta()));
                            tblDetalle.setValueAt(nCantidad, i, 0);
                            tblDetalle.setValueAt(nPrecio, i, 3);
                            tblDetalle.setValueAt(nc.notaMax(codigo), i, 5);
                            bandera = true;
                        }
                    }
                    if(bandera == false){
                        modelo.addRow(datos);
                        tblDetalle.setModel(modelo);
                    }
                    int conteoTabla = tblDetalle.getRowCount();
                    double suma = 0;
                    sumatoria = 0;
                    for(int i = 0; i<= (conteoTabla - 1); i++){
                        suma = Double.parseDouble(String.valueOf(tblDetalle.getValueAt(i, 3)));
                        sumatoria += suma;
                    }
                    txtTotal.setText(String.valueOf(sumatoria));
                }
            }
        }
    }
    
    private void eliminarProducto(DefaultTableModel modelo){
        try {
            NotaCredito nc = new NotaCredito();
            sumatoria = 0;
            double total = Double.parseDouble(txtTotal.getText());
            total -= Double.parseDouble(tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 3).toString());
            sumatoria = total;
            txtTotal.setText(String.valueOf(sumatoria));
            if(!String.valueOf(tblDetalle.getValueAt(tblDetalle.getSelectedRow(),5)).isEmpty()){
                nc.anular((int) tblDetalle.getValueAt(tblDetalle.getSelectedRow(),5));
            }
            modelo.removeRow(tblDetalle.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void buscarProducto(){
        if(new Producto().buscarProducto(txtCodigo.getText()) != null){
            Producto producto = new Producto().buscarProducto(txtCodigo.getText());
            txtCodigo.setText(producto.getCodigo());
            txtProducto.setText(producto.getNombre());
            txtCantidad.grabFocus();
        }else{
            JOptionPane.showMessageDialog(this, "El código del próducto que desea no se encuentra registrado, por favor verifiquelo de nuevo.","Advertencia",JOptionPane.WARNING_MESSAGE);
            txtCodigo.grabFocus();
        }
    }
    
    private void descuento(double porcentaje, String codigo){
        Producto producto = new Producto().buscarProducto(codigo);
        double subtotal = (double) tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 3);
        double pcostoTotal = ((int) tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 0)) * ((double) producto.getPrecio_compra());
        double nPrecio = subtotal - ((porcentaje/100)* subtotal);
        
        if(nPrecio >= pcostoTotal){
            tblDetalle.setValueAt((porcentaje/100), tblDetalle.getSelectedRow(), 4);
            BigDecimal bd = new BigDecimal(nPrecio);// Almacena el valor resultante dentro de una variable BigDecimal
            bd = bd.setScale(2,RoundingMode.HALF_UP); // Redondea a dos decimales hacia arriba
            System.out.println(bd);
            tblDetalle.setValueAt(bd, tblDetalle.getSelectedRow(), 3); // Coloca el nuevo valor en la tabla de detalle
            int conteoTabla = tblDetalle.getRowCount();
            double suma = 0;
            sumatoria = 0;
            for(int i = 0; i <= (conteoTabla - 1); i++){
                suma = Double.parseDouble(String.valueOf(tblDetalle.getValueAt(i, 3)));
                sumatoria += suma;
            }
            txtTotal.setText(String.valueOf(sumatoria));
        }else{
            JOptionPane.showMessageDialog(this, "El precio costo total no puede ser mayor que el precio venta total.");
            // aqui va el campo donde se ingresa el descuento a realizar
        }
    }
    
    private void descuento_dos(double porcentaje, String codigo){
        Producto producto = new Producto().buscarProducto(codigo);// Instancia un objeto de la clase producto.
        int cant = (int) tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 0); // almacena la cantidad del producto ingresada
        double precio_unidad = (double) producto.getPrecio_venta(); // almacena el precio por unidad del producto deseado
        double precio_costo = (double) producto.getPrecio_compra(); // almacena el precio costo del producto elegido

        double nprecio_unidad = (double) precio_unidad - (precio_unidad * (porcentaje/100)); // almacena el nuevo precio con descuento ya aplicado.
        double nprecio_total = cant * nprecio_unidad; // almacena el subtotal del nuevo precio de venta con descuento ya aplicado
        
        if(nprecio_unidad >= precio_costo){
            tblDetalle.setValueAt((porcentaje/100), tblDetalle.getSelectedRow(), 4);
            BigDecimal bd = new BigDecimal(nprecio_total);
            String original = String.valueOf(bd);
            
            System.out.println(nprecio_total);
            
            String[] partes = original.split(Pattern.quote("."));
            String entero = partes[0];
            String decimal = partes[1];
            
            int valor1 = Integer.parseInt(entero);  // variable que almacena la parte entera de nuestro valor decimal.
            int valor2 = Integer.parseInt(String.valueOf(decimal.charAt(0))); // variable que almacena el primer digíto de la parte decimal.
            int valor3 = Integer.parseInt(String.valueOf(decimal.charAt(1))); // variable que almacena el segundo digíto de la parte decimal.
            int valor4 = Integer.parseInt(String.valueOf(decimal.charAt(2))); // variable que almacena el tercer digíto de la parte decimal.
            
            
            if(valor4 >= 5){
                bd = bd.setScale(2,RoundingMode.HALF_UP);
            }else if(valor4 < 5){
                bd = bd.setScale(2,RoundingMode.DOWN);
            }

            tblDetalle.setValueAt(bd, tblDetalle.getSelectedRow(), 3);
            int conteoTabla = tblDetalle.getRowCount();
            double suma = 0;
            sumatoria = 0;
            for(int i = 0; i <= (conteoTabla - 1); i++){
                suma = Double.parseDouble(String.valueOf(tblDetalle.getValueAt(i, 3)));
                sumatoria += suma;
            }
            txtTotal.setText(String.valueOf(sumatoria));
        }else{
            JOptionPane.showMessageDialog(this, "El precio costo total no puede ser mayor que el precio venta total.");
        }
        
    }
    
    // Método utilizado para limpiar los campos ingresados.
    private void limpiarDetalle(){
        tblDetalle.removeAll();
        modelo = new DefaultTableModel();
        sumatoria = 0;
        modelo = new DefaultTableModel(null,titulos);
        tblDetalle.setModel(modelo);
        txtTotal.setText("0.00");
        configurarTabla(tblDetalle);
    }
    
    // Método encargado de generar la nota de crédito pertinente para los productos cuyas existencias
    // no fueron suficientes para complacer la demanda de la factura generada.    
    private void crearNotaCredito(int nCantidad){
        NotaCredito nc = new NotaCredito();
        Producto producto = new Producto();
        String codigo = txtCodigo.getText();
        producto = producto.buscarProducto(codigo);
        double saldo_total = 0;
        Timestamp time = new Timestamp(new Date().getTime());
        int cantidad = nCantidad - producto.getExistencia_tienda();
        
        saldo_total = (cantidad * producto.getPrecio_venta());
        
        nc.setCod_producto(codigo);
        nc.setSaldo_pendiente(saldo_total);
        nc.setFecha_creacion(time);
        nc.setEstado("PENDIENTE");
        
        if(nc.crear(nc) > 0){
            JOptionPane.showMessageDialog(this, "Nota de Crédito para el producto " + codigo + " generada con éxito.");
            txtCodigo.setText("");
            txtProducto.setText("");
            txtCantidad.setText("");
            txtCodigo.grabFocus();
            configurarTabla(tblDetalle);
        }else{
            JOptionPane.showMessageDialog(this, "No se logro generar la nota de crédtio.","Error",JOptionPane.ERROR_MESSAGE);
            txtCantidad.grabFocus();
        }
    }
    
    private void configurarTabla(JTable table){
        // Configuración del tamaño que ocuparán las columnas que muestran la información
        // del pago a realizar
        table.getColumn("Cantidad").setPreferredWidth(20);
        table.getColumn("Codigo").setPreferredWidth(50);
        table.getColumn("Producto").setPreferredWidth(200);
        table.getColumn("Sub-total").setPreferredWidth(75);
        table.getColumn("Descuento").setPreferredWidth(75);
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(tcr);
        table.getColumnModel().getColumn(1).setCellRenderer(tcr);
        table.getColumnModel().getColumn(2).setCellRenderer(tcr);
        table.getColumnModel().getColumn(3).setCellRenderer(tcr);
        table.getColumnModel().getColumn(4).setCellRenderer(tcr);
    }
}
