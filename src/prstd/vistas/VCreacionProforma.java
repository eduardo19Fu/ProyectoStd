package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Cliente;
import prstd.modelos.Documento;
import prstd.modelos.Producto;
import prstd.modelos.Usuario;
import prstd.modelos.UsuarioCorrelativo;

public class VCreacionProforma extends javax.swing.JDialog {
    
    private int x,y;
    private String vendedor;
    private Usuario usuario;
    private double sumatoria;
    private String[] titulos = {"Cantidad","Codigo","Producto","Precio Unitario","Sub-total","Descuento"};
    private DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    private Object[] datos = new Object[6];

    public VCreacionProforma(java.awt.Frame parent, boolean modal, String vendedor) {
        super(parent, modal);
        initComponents();
        btnBuscar_2.setMnemonic(KeyEvent.VK_F3);
        btnBuscar_3.setMnemonic(KeyEvent.VK_F5);
        this.setLocationRelativeTo(null);
        this.vendedor = vendedor;
        usuario = new Usuario();
        usuario.setUsuario(this.vendedor);
        sumatoria = 0;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProforma = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        panel_busqueda_cliente = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JLabel();
        btnBuscar_2 = new javax.swing.JButton();
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
        btnBuscar_3 = new javax.swing.JButton();
        txtDescuento = new javax.swing.JTextField();
        lblDescuento = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        btnDescuento = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        radioNormal = new javax.swing.JRadioButton();
        radioSimple = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Proforma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panelDatos.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Proforma No.");

        lblProforma.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblProforma.setForeground(new java.awt.Color(0, 0, 0));
        lblProforma.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Serie:");

        lblSerie.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(0, 0, 0));
        lblSerie.setText("jLabel2");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("jLabel2");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProforma)
                    .addComponent(lblSerie)
                    .addComponent(lblFecha))
                .addGap(29, 29, 29))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblProforma))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerie)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblFecha))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 93, -1, 195));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nit:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 45, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });
        jPanel3.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 40, 130, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 93, 310, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 149, -1, -1));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 144, 310, -1));

        panel_busqueda_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Search_32px_1.png"))); // NOI18N
        btnBuscarCliente.setText("F3");
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.setOpaque(true);
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
        panel_busqueda_cliente.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        btnBuscar_2.setBackground(java.awt.SystemColor.control);
        btnBuscar_2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_2ActionPerformed(evt);
            }
        });
        panel_busqueda_cliente.add(btnBuscar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 0, 0));

        jPanel3.add(panel_busqueda_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 35, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 93, 455, 195));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Codigo", "Producto", "Precio Unitario", "Sub-total", "Descuento"
            }
        ));
        tblDetalle.setFillsViewportHeight(true);
        tblDetalle.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDetalle.setShowHorizontalLines(false);
        tblDetalle.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblDetalle);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 850, 181));

        txtTotal.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0.00");
        txtTotal.setFocusable(false);
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 270, 133, 43));

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

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

        btnBuscar_3.setBackground(java.awt.SystemColor.control);
        btnBuscar_3.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 0, 0));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 25, 860, 40));

        txtDescuento.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuento.setText("0.00");
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });
        jPanel4.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 133, 43));

        lblDescuento.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(0, 0, 0));
        lblDescuento.setText("Descuento:");
        jPanel4.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 321, 872, 370));

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panelOpciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 10));

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
        panelOpciones.add(btnImprimir);

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
        panelOpciones.add(btnEliminar);

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
        panelOpciones.add(btnLimpiar);

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
        panelOpciones.add(btnDescuento);

        btnEditar.setBackground(new java.awt.Color(230, 162, 78));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Edit_32px.png"))); // NOI18N
        btnEditar.setToolTipText("Editar producto seleccionado.");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setOpaque(true);
        btnEditar.setPreferredSize(new java.awt.Dimension(78, 54));
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
        panelOpciones.add(btnEditar);

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 331, 144, 360));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 153));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Creación de Proforma");
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
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1054, 52));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Proforma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setOpaque(false);

        buttonGroup1.add(radioNormal);
        radioNormal.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        radioNormal.setForeground(new java.awt.Color(0, 102, 102));
        radioNormal.setSelected(true);
        radioNormal.setText("Normal");
        radioNormal.setOpaque(false);

        buttonGroup1.add(radioSimple);
        radioSimple.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        radioSimple.setForeground(new java.awt.Color(0, 102, 102));
        radioSimple.setText("Simple");
        radioSimple.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSimple)
                    .addComponent(radioNormal))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(radioNormal)
                .addGap(18, 18, 18)
                .addComponent(radioSimple)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 93, 144, 197));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            buscarNit();
        }
    }//GEN-LAST:event_txtNitKeyTyped

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation(); // Obtiene el punto donde esta el puntero del mouse en ese momento.
        setLocation(point.x - x, point.y - y); //Configura la locación de la ventana segun vamos moviendo el mouse.
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        this.x = evt.getX(); // Obtenemos la posición de X de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
        this.y = evt.getY(); // Obtenemos la posición de Y de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
    }//GEN-LAST:event_jLabel5MousePressed

    private void btnBuscarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCodigoMouseClicked
        VBusquedaProductos bp = new VBusquedaProductos(null,true,2);
        bp.setVisible(true);
    }//GEN-LAST:event_btnBuscarCodigoMouseClicked

    private void btnBuscarCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCodigoMouseEntered
        setBorde(btnBuscarCodigo);
    }//GEN-LAST:event_btnBuscarCodigoMouseEntered

    private void btnBuscarCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCodigoMouseExited
        resetBorde(btnBuscarCodigo);
    }//GEN-LAST:event_btnBuscarCodigoMouseExited

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            if(!txtNit.getText().isEmpty()){
                int cantidad = Integer.parseInt(txtCantidad.getText());
                agregarDetalle(txtCodigo.getText(),cantidad);
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

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        try{
            int cantidad = Integer.parseInt(txtCantidad.getText());
            agregarDetalle(txtCodigo.getText(),cantidad);
            txtCantidad.setText("");
            txtCodigo.setText("");
            txtProducto.setText("");
            txtCodigo.grabFocus();
            configurarTabla(tblDetalle);
        }catch(NumberFormatException ex){
             JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida","Advertencia",JOptionPane.WARNING_MESSAGE);
             txtCantidad.grabFocus();
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        setBorde(btnAdd);
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        resetBorde(btnAdd);
    }//GEN-LAST:event_btnAddMouseExited

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        Cliente cl= new Cliente();
        UsuarioCorrelativo ucorr;
        Documento documento = new Documento();
        int transaccion;
        if(documento.getMaxTransaccion() == 0)
            transaccion = 1;
        else
        transaccion = documento.getMaxTransaccion() + 1;
        int no_proforma = Integer.parseInt(lblProforma.getText());
        Timestamp time = new Timestamp(new Date().getTime());
        double total = Double.parseDouble(txtTotal.getText());
        int idusuario = usuario.consultarUsuario(vendedor);
        ucorr = new UsuarioCorrelativo().getProformaActual(idusuario);
        String serie = lblSerie.getText().replaceAll("\"", "");
        int cliente = cl.consultarCliente(txtNit.getText());
        int actual = ucorr.getCorrelativo_act();

        if(!(no_proforma == 0)){
            if(!(no_proforma > actual)){
                documento.setIdtransaccion(transaccion);
                documento.setNo_documento(no_proforma);
                documento.setFecha_emision(time);
                documento.setTotal(total);
                documento.setIdcliente(cliente);
                documento.setIdvendedor(idusuario);
                documento.setEstado("ACTIVA");
                documento.setTipo_documento(2);
                documento.setSerie(serie);

                if(documento.insert(documento) > 0){
                    if(documento.insertDetalle((DefaultTableModel) tblDetalle.getModel(), transaccion, serie) > 0){
                        if(ucorr.avanzaCorrelativo(idusuario, no_proforma, 2) > 0){
                            Documento dc = new Documento();
                            if(radioNormal.isSelected()){
                                dc.imprimirProforma(documento.getMaxTransaccion(), no_proforma, serie, total);
                            }
                            else if(radioSimple.isSelected()){
                                dc.imprimirSimple(documento.getMaxTransaccion(), no_proforma, serie, total);
                            }
                            init();
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

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        setFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        resetFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminarProducto((DefaultTableModel) tblDetalle.getModel());
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        setFormato(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        resetFormato(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarDetalle();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        setFormato(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        resetFormato(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.dispose();// Cierra la ventana de VProductos.
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBorder(BorderFactory.createLineBorder(new Color(153, 138, 147),2)); // Coloca un borde griseaceo para el botón de minimizar a manera de remarcarlo.
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBorder(null); // Restablece el boton de minimizar.
    }//GEN-LAST:event_btnMinimizarMouseExited

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

    private void btnDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentoMouseClicked
        if(txtDescuento.isVisible()){
            txtDescuento.setVisible(false);
            txtDescuento.setText("0.00");
            lblDescuento.setVisible(false);
        }else{
            txtDescuento.setVisible(true);
            txtDescuento.setText("0.00");
            lblDescuento.setVisible(true);
        }
    }//GEN-LAST:event_btnDescuentoMouseClicked

    private void btnDescuentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentoMouseEntered
        setFormato(btnDescuento);
    }//GEN-LAST:event_btnDescuentoMouseEntered

    private void btnDescuentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentoMouseExited
        resetFormato(btnDescuento);
    }//GEN-LAST:event_btnDescuentoMouseExited

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
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
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked
        VBusquedaClientes vb = new VBusquedaClientes(null, true, 2);
        vb.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        setBorde(btnBuscarCliente);
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        resetBorde(btnBuscarCliente);
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    private void btnBuscar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_2ActionPerformed
        VBusquedaClientes vb = new VBusquedaClientes(null, true, 2);
        vb.setVisible(true);
    }//GEN-LAST:event_btnBuscar_2ActionPerformed

    private void btnBuscar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_3ActionPerformed
        VBusquedaProductos bp = new VBusquedaProductos(null,true,2);
        bp.setVisible(true);
    }//GEN-LAST:event_btnBuscar_3ActionPerformed

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        try {
            String codigo;
            codigo = tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 1).toString();
            VRegistroProducto vrp = new VRegistroProducto(null, true, codigo);
            vrp.setVisible(true);
            if(!vrp.isVisible()){
                agregarDetalle(codigo, 0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para proceder con la edición","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        setFormato(btnEditar);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        resetFormato(btnEditar);
    }//GEN-LAST:event_btnEditarMouseExited

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
            java.util.logging.Logger.getLogger(VCreacionProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCreacionProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCreacionProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCreacionProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            VCreacionProforma dialog = new VCreacionProforma(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnBuscarCliente;
    private javax.swing.JLabel btnBuscarCodigo;
    private javax.swing.JButton btnBuscar_2;
    private javax.swing.JButton btnBuscar_3;
    private javax.swing.JLabel btnDescuento;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnImprimir;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblProforma;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panel_busqueda_cliente;
    private javax.swing.JRadioButton radioNormal;
    private javax.swing.JRadioButton radioSimple;
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

    private void setBorde(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,120,116),2));
    }
    
    private void resetBorde(JLabel label){
        label.setBorder(null);
    }
    
    private void setFormato(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,153,153),2));
        label.setBackground(new Color(255,204,102));
    }
    
    private void resetFormato(JLabel label){
        label.setBorder(null);
        label.setBackground(new Color(230,162,78));
    }
    
    private void init(){
        limpiar();
        Date fechaAct = new Date();
        UsuarioCorrelativo ucorr = new UsuarioCorrelativo();
        ucorr = ucorr.getProformaActual(usuario.consultarUsuario(this.vendedor));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblFecha.setText("" + formato.format(fechaAct));
        lblProforma.setText(String.valueOf(ucorr.getCorrelativo_act()));
        lblSerie.setText("\"" + ucorr.getSerie() + "\"");
        modelo = new DefaultTableModel(null,titulos);
        tblDetalle.removeAll();
        tblDetalle.setModel(modelo);
        configurarTabla(tblDetalle);
    }
    
    private void buscarNit(){
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
            VRegistroClientes rc = new VRegistroClientes(null, true, txtNit.getText(),1);
            rc.setVisible(true);
        }
    }
    
    private void agregarDetalle(String codigo, int cant){
        boolean bandera = false;
        Producto producto = new Producto().buscarProducto(codigo);
        //int existencia = producto.getExistencia_tienda();
        int cantidad = cant;
        
        int renglones = tblDetalle.getRowCount();
        
        datos[0] = cantidad;
        datos[1] = producto.getCodigo();
        datos[2] = producto.getNombre();
        datos[3] = producto.getPrecio_venta();
        datos[4] = Double.parseDouble(producto.redondearPrecio((producto.getPrecio_venta() * cantidad)));
        datos[5] = 0.00;
        // Evitar datos duplicados en el detalle de la proforma
        for(int i = 0; i < tblDetalle.getRowCount(); i++){
            if(tblDetalle.getValueAt(i, 1).toString().trim().equals(codigo)){
                int nCantidad = cantidad + (int) tblDetalle.getValueAt(i, 0);
                
                // A diferencia de la factura no es necesario validar las existencias disponibles.
                double nPrecio = Double.parseDouble(producto.redondearPrecio(nCantidad * (double) producto.getPrecio_venta()));
                tblDetalle.setValueAt(nCantidad, i, 0);
                tblDetalle.setValueAt(producto.getPrecio_venta(), i, 3);
                tblDetalle.setValueAt(nPrecio, i, 4);
                tblDetalle.setValueAt(0.0, i, 5);
                bandera = true;
            }
        }
        if(!bandera){
            modelo.addRow(datos);
            tblDetalle.setModel(modelo);
        }
        int conteoTabla = tblDetalle.getRowCount();
        double suma = 0;
        sumatoria = 0;
        for(int i = 0; i < conteoTabla; i++){
            suma = Double.parseDouble(String.valueOf(tblDetalle.getValueAt(i, 4)));
            sumatoria += suma;
        }
        DecimalFormat formato = new DecimalFormat("####.##");
        txtTotal.setText(String.valueOf(formato.format(sumatoria)));
    }
    
    private void descuento_dos(double porcentaje, String codigo){
        // Instancia un objeto de la clase producto.
        Producto producto = new Producto().buscarProducto(codigo);
        // almacena la cantidad del producto ingresada.
        int cant = (int) tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 0); 
        // almacena el precio por unidad del producto deseado.
        double precio_unidad = (double) producto.getPrecio_venta(); 
        // almacena el precio costo del producto elegido.
        double precio_costo = (double) producto.getPrecio_compra();
        // Almacena el calculo del precio costo total del producto elegido para realizar el descuento.
        double pcosto_total = (cant * precio_costo);
        // almacena el nuevo precio con descuento ya aplicado.
        double nprecio_unidad = (double) precio_unidad - (precio_unidad * (porcentaje/100));
        // almacena el subtotal del nuevo precio de venta con descuento ya aplicado
        double nprecio_total = cant * nprecio_unidad;
        // Variable que almacena el precio una vez redondeado a 5 o 10.
        double precio_nuevo = 0;
        DecimalFormat formato = new DecimalFormat("####.##");
        String existe = tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 5).toString();
        
        // Validación del nuevo precio vs el precio costo total.
        if(nprecio_total >= pcosto_total){
            tblDetalle.setValueAt((porcentaje/100), tblDetalle.getSelectedRow(), 5);
            BigDecimal bd = new BigDecimal(nprecio_unidad);
            // Se utiliza el metodo de redondeo bancario para aproximación más precisa.
            bd = bd.setScale(2,BigDecimal.ROUND_HALF_EVEN);
            // Almacenamos el nuevo valor obtenido después del calculo de redondeo a 5 o 10.
            precio_nuevo = Double.parseDouble(producto.calcularDescuento(String.valueOf(bd)));
            tblDetalle.setValueAt(formato.format(precio_nuevo), tblDetalle.getSelectedRow(), 3);
            tblDetalle.setValueAt(formato.format((precio_nuevo * cant)), tblDetalle.getSelectedRow(), 4);
            int conteoTabla = tblDetalle.getRowCount();
            double suma = 0;
            sumatoria = 0;
            for(int i = 0; i <= (conteoTabla - 1); i++){
                suma = Double.parseDouble(String.valueOf(tblDetalle.getValueAt(i, 4)));
                sumatoria += suma;
            }
            txtTotal.setText(String.valueOf(formato.format(sumatoria)));
        }else{
            JOptionPane.showMessageDialog(this, "El precio costo total no puede ser mayor que el precio venta total.");
            // aqui va el campo donde se ingresa el descuento a realizar
        }
    }
    
    private void limpiar(){
        txtNit.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtCodigo.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtTotal.setText("0.00");
        txtNit.grabFocus();
        txtDescuento.setText("0.00");
        txtDescuento.setVisible(false);
        lblDescuento.setVisible(false);
    }
    
    private void limpiarDetalle(){
        tblDetalle.removeAll();
        modelo = new DefaultTableModel();
        sumatoria = 0;
        modelo = new DefaultTableModel(null, titulos);
        tblDetalle.setModel(modelo);
        txtTotal.setText("0.00");
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
    
    private void eliminarProducto(DefaultTableModel modelo){
        try {
            DecimalFormat formato = new DecimalFormat("####.##");
            sumatoria = 0;
            double total = Double.parseDouble(txtTotal.getText());
            total -= Double.parseDouble(tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 4).toString());
            sumatoria = total;
            txtTotal.setText(formato.format(sumatoria));
            modelo.removeRow(tblDetalle.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void configurarTabla(JTable table){
        // Configuración del tamaño que ocuparán las columnas que muestran la información
        // del pago a realizar
        table.getColumn("Cantidad").setPreferredWidth(20);
        table.getColumn("Codigo").setPreferredWidth(50);
        table.getColumn("Producto").setPreferredWidth(300);
        table.getColumn("Precio Unitario").setPreferredWidth(30);
        table.getColumn("Sub-total").setPreferredWidth(30);
        table.getColumn("Descuento").setPreferredWidth(30);
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        //table.getColumnModel().getColumn(0).setCellRenderer(tcr);
        //table.getColumnModel().getColumn(1).setCellRenderer(tcr);
        //table.getColumnModel().getColumn(2).setCellRenderer(tcr);
        table.getColumnModel().getColumn(3).setCellRenderer(tcr);
        table.getColumnModel().getColumn(4).setCellRenderer(tcr);
        table.getColumnModel().getColumn(5).setCellRenderer(tcr);
    }
}
