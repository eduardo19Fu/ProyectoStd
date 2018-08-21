package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Cliente;
import prstd.modelos.Documento;
import prstd.modelos.Producto;
import prstd.modelos.Usuario;
import prstd.modelos.UsuarioCorrelativo;
import static prstd.vistas.VCrearFactura.lblFactura;
import static prstd.vistas.VCrearFactura.lblTransac;
import static prstd.vistas.VCrearFactura.txtCantidad;
import static prstd.vistas.VCrearFactura.txtCodigo;
import static prstd.vistas.VCrearFactura.txtProducto;

public class VCreacionProforma extends javax.swing.JDialog {
    
    private int x,y;
    private String vendedor;
    private Usuario usuario;
    private double sumatoria;
    private String[] titulos = {"Cantidad","Codigo","Producto","Sub-total",};
    private DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    private Object[] datos = new Object[4];

    public VCreacionProforma(java.awt.Frame parent, boolean modal, String vendedor) {
        super(parent, modal);
        initComponents();
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
        panelOpciones = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nit:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtNombre))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 93, -1, 195));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Codigo", "Producto", "Sub-total"
            }
        ));
        tblDetalle.setFillsViewportHeight(true);
        tblDetalle.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDetalle.setShowHorizontalLines(false);
        tblDetalle.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblDetalle);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 787, 181));

        txtTotal.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0.00");
        txtTotal.setFocusable(false);
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 270, 133, 43));

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

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

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 25, 860, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 321, 872, 350));

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

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 409, 144, 262));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                agregarDetalle(txtCodigo.getText());
                txtCodigo.setText("");
                txtProducto.setText("");
                txtCantidad.setText("");
                txtCodigo.grabFocus();
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
        agregarDetalle(txtCodigo.getText());
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
                                //JOptionPane.showMessageDialog(this, "FacturaCreada");
                            Documento dc = new Documento();
                            dc.imprimirProforma(documento.getMaxTransaccion(), no_proforma, serie, total);
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
        limpiar();
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
    private javax.swing.JLabel btnBuscarCodigo;
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
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblProforma;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JRadioButton radioNormal;
    private javax.swing.JRadioButton radioSimple;
    public static javax.swing.JTable tblDetalle;
    public static javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtCodigo;
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
    }
    
    private void buscarNit(){
        Cliente cliente = new Cliente();
        List<Cliente> lista = new ArrayList<>();
        if(!txtNit.getText().isEmpty())
            lista = cliente.buscarNit(txtNit.getText());
        else
            lista = cliente.buscarNit("C/F");
        if(lista != null){
            for(int i = 0; i < lista.size(); i++){
                txtNit.setText(lista.get(i).getNit());
                txtNombre.setText(lista.get(i).getNombre());
                txtDireccion.setText(lista.get(i).getDireccion());
            }
            txtCodigo.grabFocus();
        }else{
            VRegistroClientes rc = new VRegistroClientes(null, true, txtNit.getText());
            rc.setVisible(true);
        }
    }
    
    private void agregarDetalle(String codigo){
        boolean bandera = false;
        Producto producto = new Producto().buscarProducto(codigo);
        //int existencia = producto.getExistencia_tienda();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        
        datos[0] = cantidad;
        datos[1] = producto.getCodigo();
        datos[2] = producto.getNombre();
        datos[3] = Double.parseDouble(producto.redondearPrecio((producto.getPrecio_venta() * cantidad)));
        
        // Evitar datos duplicados en el detalle de la proforma
        for(int i = 0; i < tblDetalle.getRowCount(); i++){
            if(tblDetalle.getValueAt(i, 1).toString().trim().equals(codigo)){
                int nCantidad = cantidad + (int) tblDetalle.getValueAt(i, 0);
                
                // A diferencia de la factura no es necesario validar las existencias disponibles.
                double nPrecio = Double.parseDouble(producto.redondearPrecio(nCantidad * (double) producto.getPrecio_venta()));
                tblDetalle.setValueAt(nCantidad, i, 0);
                tblDetalle.setValueAt(nPrecio, i, 3);
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
            suma = Double.parseDouble(String.valueOf(tblDetalle.getValueAt(i, 3)));
            sumatoria += suma;
        }
        txtTotal.setText(String.valueOf(producto.redondearPrecio(sumatoria)));
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
            sumatoria = 0;
            double total = Double.parseDouble(txtTotal.getText());
            total -= Double.parseDouble(tblDetalle.getValueAt(tblDetalle.getSelectedRow(), 3).toString());
            sumatoria = total;
            txtTotal.setText(String.valueOf(sumatoria));
            modelo.removeRow(tblDetalle.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
