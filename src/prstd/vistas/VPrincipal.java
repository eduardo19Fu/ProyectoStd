package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import prstd.modelos.Rol;
import prstd.modelos.Usuario;
import prstd.modelos.UsuarioCorrelativo;
import prstd.notificaciones.NotificacionCerrarSesion;
import prstd.notificaciones.NotificacionSalir;

public class VPrincipal extends javax.swing.JFrame {

   
    // Variables que guardarán los enteros de la posición de la ventana.
    int x,y;
    public int sign1;
    private String usuario;
    private Rol rol;
    
    public VPrincipal(String usuario) {
        initComponents();
        this.usuario = usuario;
        initPaneles();
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
        panelReportes = new javax.swing.JPanel();
        btnPolizas = new javax.swing.JLabel();
        btnVentasMensuales = new javax.swing.JLabel();
        btnProductosDisponibles = new javax.swing.JLabel();
        btnReporteNotas = new javax.swing.JLabel();
        panelSistema = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JLabel();
        btnCustomers = new javax.swing.JLabel();
        btnProductos = new javax.swing.JLabel();
        btnNotasCredito = new javax.swing.JLabel();
        btnFamilias = new javax.swing.JLabel();
        btnFabricantes = new javax.swing.JLabel();
        btnCorrelativos = new javax.swing.JLabel();
        panelCobros = new javax.swing.JPanel();
        btnVentas = new javax.swing.JLabel();
        btnProformas = new javax.swing.JLabel();
        btnConsultaProformas = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JLabel();
        panelDespacho = new javax.swing.JPanel();
        btnCrearOrden = new javax.swing.JLabel();
        btnConsultarOrdenes = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnSistema = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCobros = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDespacho = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 116), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Compress_32px.png"))); // NOI18N
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
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 216, 148));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 680, 90));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 810, 180));

        panelReportes.setOpaque(false);
        java.awt.FlowLayout flowLayout4 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 25);
        flowLayout4.setAlignOnBaseline(true);
        panelReportes.setLayout(flowLayout4);

        btnPolizas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPolizas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Cash_in_Hand_72px_1.png"))); // NOI18N
        btnPolizas.setToolTipText("Pólizas de ventas realizadas por rango de fechas.");
        btnPolizas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPolizas.setPreferredSize(new java.awt.Dimension(120, 120));
        btnPolizas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPolizasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPolizasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPolizasMouseExited(evt);
            }
        });
        panelReportes.add(btnPolizas);

        btnVentasMensuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVentasMensuales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Fee_72px.png"))); // NOI18N
        btnVentasMensuales.setToolTipText("Genera el reporte para verificar las ventas mensuales.");
        btnVentasMensuales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentasMensuales.setPreferredSize(new java.awt.Dimension(120, 120));
        btnVentasMensuales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMensualesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMensualesMouseExited(evt);
            }
        });
        panelReportes.add(btnVentasMensuales);

        btnProductosDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProductosDisponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Choice_72px.png"))); // NOI18N
        btnProductosDisponibles.setToolTipText("Genera un reporte de productos disponibles.");
        btnProductosDisponibles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductosDisponibles.setPreferredSize(new java.awt.Dimension(120, 120));
        btnProductosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosDisponiblesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosDisponiblesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosDisponiblesMouseExited(evt);
            }
        });
        panelReportes.add(btnProductosDisponibles);

        btnReporteNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReporteNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_online_payment_with_a_credit_card_72px.png"))); // NOI18N
        btnReporteNotas.setToolTipText("Genera un reporte de todas las Notas de Crédito generadas");
        btnReporteNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteNotas.setPreferredSize(new java.awt.Dimension(120, 120));
        btnReporteNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteNotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporteNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporteNotasMouseExited(evt);
            }
        });
        panelReportes.add(btnReporteNotas);

        jPanel2.add(panelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 740, 440));

        panelSistema.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 25);
        flowLayout1.setAlignOnBaseline(true);
        panelSistema.setLayout(flowLayout1);

        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Team_72px.png"))); // NOI18N
        btnUsuarios.setToolTipText("Administración de Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setPreferredSize(new java.awt.Dimension(120, 120));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });
        panelSistema.add(btnUsuarios);

        btnCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Customer_72px.png"))); // NOI18N
        btnCustomers.setToolTipText("Administración de Clientes");
        btnCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomers.setPreferredSize(new java.awt.Dimension(120, 120));
        btnCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomersMouseExited(evt);
            }
        });
        panelSistema.add(btnCustomers);

        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Trolley_72px.png"))); // NOI18N
        btnProductos.setToolTipText("Administración de Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setPreferredSize(new java.awt.Dimension(120, 120));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        panelSistema.add(btnProductos);

        btnNotasCredito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNotasCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Bank_Cards_72px.png"))); // NOI18N
        btnNotasCredito.setToolTipText("Administración de Notas de Crédito");
        btnNotasCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotasCredito.setPreferredSize(new java.awt.Dimension(120, 120));
        btnNotasCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotasCreditoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNotasCreditoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNotasCreditoMouseExited(evt);
            }
        });
        panelSistema.add(btnNotasCredito);

        btnFamilias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFamilias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Family_72px.png"))); // NOI18N
        btnFamilias.setToolTipText("Administración de Familias de Productos");
        btnFamilias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFamilias.setPreferredSize(new java.awt.Dimension(120, 120));
        btnFamilias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFamiliasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFamiliasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFamiliasMouseExited(evt);
            }
        });
        panelSistema.add(btnFamilias);

        btnFabricantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFabricantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Deployment_72px.png"))); // NOI18N
        btnFabricantes.setToolTipText("Administración de Fabricantes de Productos");
        btnFabricantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFabricantes.setPreferredSize(new java.awt.Dimension(120, 120));
        btnFabricantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFabricantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFabricantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFabricantesMouseExited(evt);
            }
        });
        panelSistema.add(btnFabricantes);

        btnCorrelativos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCorrelativos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Receipt_72px.png"))); // NOI18N
        btnCorrelativos.setToolTipText("Administración de Correlativos");
        btnCorrelativos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorrelativos.setPreferredSize(new java.awt.Dimension(120, 120));
        btnCorrelativos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCorrelativosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCorrelativosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCorrelativosMouseExited(evt);
            }
        });
        panelSistema.add(btnCorrelativos);

        jPanel2.add(panelSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 740, 440));

        panelCobros.setOpaque(false);
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 75);
        flowLayout2.setAlignOnBaseline(true);
        panelCobros.setLayout(flowLayout2);

        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Sell_72px.png"))); // NOI18N
        btnVentas.setToolTipText("Opciones de Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setPreferredSize(new java.awt.Dimension(120, 120));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        panelCobros.add(btnVentas);

        btnProformas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProformas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_New_Resume_Template_72px.png"))); // NOI18N
        btnProformas.setToolTipText("Creación de Proformas para Clientes");
        btnProformas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProformas.setPreferredSize(new java.awt.Dimension(120, 120));
        btnProformas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProformasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProformasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProformasMouseExited(evt);
            }
        });
        panelCobros.add(btnProformas);

        btnConsultaProformas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConsultaProformas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Timesheet_72px.png"))); // NOI18N
        btnConsultaProformas.setToolTipText("Consulta de Proformas");
        btnConsultaProformas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultaProformas.setPreferredSize(new java.awt.Dimension(120, 120));
        btnConsultaProformas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaProformasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultaProformasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultaProformasMouseExited(evt);
            }
        });
        panelCobros.add(btnConsultaProformas);

        jPanel2.add(panelCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 740, 440));

        panelSalir.setOpaque(false);
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 75);
        flowLayout3.setAlignOnBaseline(true);
        panelSalir.setLayout(flowLayout3);

        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Shutdown_72px.png"))); // NOI18N
        btnCerrarSesion.setToolTipText("Brinda al Usuario la opción de Cerrar la Sesión actual");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(120, 120));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        panelSalir.add(btnCerrarSesion);

        btnCerrarSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Close_Window_72px.png"))); // NOI18N
        btnCerrarSistema.setToolTipText("Brinda al Usuario de Cerrar el Sistema de forma definitiva");
        btnCerrarSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSistema.setPreferredSize(new java.awt.Dimension(120, 120));
        btnCerrarSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSistemaMouseExited(evt);
            }
        });
        panelSalir.add(btnCerrarSistema);

        jPanel2.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 740, 440));

        panelDespacho.setOpaque(false);
        java.awt.FlowLayout flowLayout5 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 75);
        flowLayout5.setAlignOnBaseline(true);
        panelDespacho.setLayout(flowLayout5);

        btnCrearOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCrearOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Product_72px.png"))); // NOI18N
        btnCrearOrden.setToolTipText("Opción que permite al usuario crear una nueva orden de despacho.");
        btnCrearOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearOrden.setPreferredSize(new java.awt.Dimension(120, 120));
        btnCrearOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearOrdenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearOrdenMouseExited(evt);
            }
        });
        panelDespacho.add(btnCrearOrden);

        btnConsultarOrdenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConsultarOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Trolley_72px_1.png"))); // NOI18N
        btnConsultarOrdenes.setToolTipText("Opción que permite al usuario realizar una consultar de las ordenes de despacho.");
        btnConsultarOrdenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarOrdenes.setPreferredSize(new java.awt.Dimension(120, 120));
        btnConsultarOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarOrdenesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarOrdenesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarOrdenesMouseExited(evt);
            }
        });
        panelDespacho.add(btnConsultarOrdenes);

        jPanel2.add(panelDespacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 740, 440));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 0, 810, 780));

        panelOpciones.setBackground(new java.awt.Color(0, 153, 153));
        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 216, 148), 2));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventana Principal");
        panelOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 370, 50));
        panelOpciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, 360, 10));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 25));

        btnSistema.setBackground(new java.awt.Color(0, 153, 153));
        btnSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSistema.setPreferredSize(new java.awt.Dimension(393, 50));
        btnSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSistemaMouseExited(evt);
            }
        });
        btnSistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_HIPS_50px.png"))); // NOI18N
        btnSistema.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administración");
        btnSistema.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel3.add(btnSistema);

        btnCobros.setBackground(new java.awt.Color(0, 153, 153));
        btnCobros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobros.setPreferredSize(new java.awt.Dimension(393, 50));
        btnCobros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCobrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCobrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCobrosMouseExited(evt);
            }
        });
        btnCobros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Shopping_Basket_50px.png"))); // NOI18N
        btnCobros.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Opciones de Cobro");
        btnCobros.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jPanel3.add(btnCobros);

        btnDespacho.setBackground(new java.awt.Color(0, 153, 153));
        btnDespacho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDespacho.setPreferredSize(new java.awt.Dimension(393, 50));
        btnDespacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDespachoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDespachoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDespachoMouseExited(evt);
            }
        });
        btnDespacho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_In_Transit_50px.png"))); // NOI18N
        btnDespacho.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ordenes de Despacho");
        btnDespacho.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel3.add(btnDespacho);

        btnReportes.setBackground(new java.awt.Color(0, 153, 153));
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setPreferredSize(new java.awt.Dimension(393, 50));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });
        btnReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Report_Card_50px.png"))); // NOI18N
        btnReportes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opciones de Reportes");
        btnReportes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel3.add(btnReportes);

        btnSalir.setBackground(new java.awt.Color(0, 153, 153));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPreferredSize(new java.awt.Dimension(393, 50));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Shutdown_50px.png"))); // NOI18N
        btnSalir.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Salir");
        btnSalir.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel3.add(btnSalir);

        panelOpciones.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, 393, 480));

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation(); // Obtiene el punto donde esta el puntero del mouse en ese momento.
        setLocation(point.x - x, point.y - y); //Configura la locación de la ventana segun vamos moviendo el mouse.
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        this.x = evt.getX(); // Obtenemos la posición de X de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
        this.y = evt.getY(); // Obtenemos la posición de Y de la ventana y la guardamos en nuestra variable de clase declarada anteriormente.
    }//GEN-LAST:event_jLabel5MousePressed

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBorder(BorderFactory.createLineBorder(new Color(153, 138, 147),2)); // Coloca un borde griseaceo para el botón de minimizar a manera de remarcarlo.
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBorder(null); // Restablece el boton de minimizar.
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaMouseEntered
        setColor(btnSistema); // Invoca al metodo setColor y le pasa como parametro el panel que funciona como boton para la opcion de Sistema.
    }//GEN-LAST:event_btnSistemaMouseEntered

    private void btnSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaMouseExited
        resetColor(btnSistema);// Invoca al metodo resetColor y le pasa como parametro el panel que funciona como boton para la opcion de Sistema.
    }//GEN-LAST:event_btnSistemaMouseExited

    private void btnCobrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrosMouseEntered
        setColor(btnCobros);// Invoca al metodo setColor y le pasa como parametro el panel que funciona como boton para la opcion de Cobros.
    }//GEN-LAST:event_btnCobrosMouseEntered

    private void btnCobrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrosMouseExited
        resetColor(btnCobros);// Invoca al metodo resetColor y le pasa como parametro el panel que funciona como boton para la opcion de Cobros.
    }//GEN-LAST:event_btnCobrosMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        setColor(btnReportes);// Invoca al metodo setColor y le pasa como parametro el panel que funciona como boton para la opcion de Reportes.
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        resetColor(btnReportes);// Invoca al metodo resetColor y le pasa como parametro el panel que funciona como boton para la opcion de Reportes.
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        setColor(btnSalir);// Invoca al metodo setColor y le pasa como parametro el panel que funciona como boton para la opcion de Salir.
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        resetColor(btnSalir);// Invoca al metodo resetColor y le pasa como parametro el panel que funciona como boton para la opcion de Salir.
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);// Minimiza la ventana VPrincipal
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaMouseClicked
        configPanelSistema();// Invoca al método de configuración del Panel de sistema.
    }//GEN-LAST:event_btnSistemaMouseClicked

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        setBorder(btnUsuarios);// Crea un line border alrededor del botón de Administración de VUsuarios.
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        resetBorder(btnUsuarios);// Elimina todo borde creado cuando el cursor sale del rengo
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        setBorder(btnProductos);// Crea un lineBorder alrededor del botón de Administración de VProductos.
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        resetBorder(btnProductos);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnNotasCreditoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotasCreditoMouseEntered
        setBorder(btnNotasCredito);// Crea un lineBorder alrededor del botón de Administración de Notas de Crédito.
    }//GEN-LAST:event_btnNotasCreditoMouseEntered

    private void btnNotasCreditoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotasCreditoMouseExited
        resetBorder(btnNotasCredito);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnNotasCreditoMouseExited

    private void btnFamiliasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFamiliasMouseExited
        resetBorder(btnFamilias);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnFamiliasMouseExited

    private void btnFamiliasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFamiliasMouseEntered
        setBorder(btnFamilias);// Crea un lineBorder alrededor del botón de Administración de Familias de VProductos.
    }//GEN-LAST:event_btnFamiliasMouseEntered

    private void btnFabricantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFabricantesMouseEntered
        setBorder(btnFabricantes);// Crea un lineBorder alrededor del botón de Administración de Fabricantes de VProductos.
    }//GEN-LAST:event_btnFabricantesMouseEntered

    private void btnFabricantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFabricantesMouseExited
        resetBorder(btnFabricantes);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnFabricantesMouseExited

    private void btnCorrelativosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrelativosMouseEntered
        setBorder(btnCorrelativos);// Crea un lineBorder alrededor del botón de Administración de Correlativos.
    }//GEN-LAST:event_btnCorrelativosMouseEntered

    private void btnCorrelativosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrelativosMouseExited
        resetBorder(btnCorrelativos);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnCorrelativosMouseExited

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        setBorder(btnVentas);// Crea un lineBorder alrededor del botón de Ventas.
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        resetBorder(btnVentas);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnProformasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProformasMouseEntered
        setBorder(btnProformas);// Crea un lineBorder alrededor del botón de Creación de Proformas.
    }//GEN-LAST:event_btnProformasMouseEntered

    private void btnProformasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProformasMouseExited
        resetBorder(btnProformas);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnProformasMouseExited

    private void btnConsultaProformasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaProformasMouseEntered
        setBorder(btnConsultaProformas);// Crea un lineBorder alrededor del botón de Consulta Proformas.
    }//GEN-LAST:event_btnConsultaProformasMouseEntered

    private void btnConsultaProformasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaProformasMouseExited
        resetBorder(btnConsultaProformas);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnConsultaProformasMouseExited

    private void btnCobrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrosMouseClicked
        configPanelCobros();// Invoca al metodo encargado de la configuración del Panel de Cobros.
    }//GEN-LAST:event_btnCobrosMouseClicked

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        setBorder(btnCerrarSesion);// Crea un lineBorder alrededor del botón de Cerrar Sesión.
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        resetBorder(btnCerrarSesion);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSistemaMouseEntered
        setBorder(btnCerrarSistema);// Crea un lineBorder alrededor del botón de Cerrar Definitivamente el Sistema.
    }//GEN-LAST:event_btnCerrarSistemaMouseEntered

    private void btnCerrarSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSistemaMouseExited
        resetBorder(btnCerrarSistema);// Elimina todo borde creado cuando el cursor sale del rango.
    }//GEN-LAST:event_btnCerrarSistemaMouseExited

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        NotificacionCerrarSesion cs = new NotificacionCerrarSesion(this, true, this);// Instacia un Objeto de la Clase de Opciones Para cerrar sesion actual;
        cs.setVisible(true);// Hacemos visible la ventana de opciones.
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnCerrarSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSistemaMouseClicked
        NotificacionSalir ns = new NotificacionSalir(this,true);
        ns.setVisible(true);
    }//GEN-LAST:event_btnCerrarSistemaMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        configPanelSalir();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        VUsuarios usuario = new VUsuarios(this,true); // Instancia un Objeto de la Clase VUsuarios.
        usuario.setVisible(true); // Invoca la ventana de Administración de Usuarios.
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        VProductos productos = new VProductos(this,true); // Instancia la Clase VProductos.
        productos.setVisible(true); //Invoca la ventana de Administración de Productos
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        VFacturas vf = new VFacturas(this,false,usuario);
        vf.setVisible(true);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnCorrelativosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrelativosMouseClicked
        VCorrelativos vc = new VCorrelativos(this,true,usuario);
        vc.setVisible(true);
    }//GEN-LAST:event_btnCorrelativosMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        configPanelReportes();
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnPolizasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPolizasMouseEntered
        setBorder(btnPolizas);// Crea un lineBorder alrededor del botón de Polizas.
    }//GEN-LAST:event_btnPolizasMouseEntered

    private void btnPolizasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPolizasMouseExited
        resetBorder(btnPolizas);
    }//GEN-LAST:event_btnPolizasMouseExited

    private void btnVentasMensualesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMensualesMouseEntered
        setBorder(btnVentasMensuales);
    }//GEN-LAST:event_btnVentasMensualesMouseEntered

    private void btnVentasMensualesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMensualesMouseExited
        resetBorder(btnVentasMensuales);
    }//GEN-LAST:event_btnVentasMensualesMouseExited

    private void btnProductosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosDisponiblesMouseClicked
        VReporteProducto vrp = new VReporteProducto(this, false);
        vrp.setVisible(true);
    }//GEN-LAST:event_btnProductosDisponiblesMouseClicked

    private void btnProductosDisponiblesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosDisponiblesMouseEntered
        setBorder(btnProductosDisponibles);
    }//GEN-LAST:event_btnProductosDisponiblesMouseEntered

    private void btnProductosDisponiblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosDisponiblesMouseExited
       resetBorder(btnProductosDisponibles);
    }//GEN-LAST:event_btnProductosDisponiblesMouseExited

    private void btnReporteNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteNotasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteNotasMouseClicked

    private void btnReporteNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteNotasMouseEntered
        setBorder(btnReporteNotas);
    }//GEN-LAST:event_btnReporteNotasMouseEntered

    private void btnReporteNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteNotasMouseExited
        resetBorder(btnReporteNotas);
    }//GEN-LAST:event_btnReporteNotasMouseExited

    private void btnNotasCreditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotasCreditoMouseClicked
        VNotasCredito vn = new VNotasCredito(this, true, usuario);
        vn.setVisible(true);
    }//GEN-LAST:event_btnNotasCreditoMouseClicked

    private void btnProformasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProformasMouseClicked
        UsuarioCorrelativo uc = new UsuarioCorrelativo();
        Usuario usuario = new Usuario();
        if(uc.verificarProforma(usuario.consultarUsuario(this.usuario))){
            VCreacionProforma vcp = new VCreacionProforma(null,false,this.usuario); // Instancia de un objeto de la Clase VCrearFactura.
            vcp.setVisible(true); // Visualización de la ventana que sirve para crear facturas.
        }else{
            JOptionPane.showMessageDialog(this, "Este usuario no cuenta con un correlativo asignado");
        }
    }//GEN-LAST:event_btnProformasMouseClicked

    private void btnPolizasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPolizasMouseClicked
        VPolizas poli = new VPolizas(null, false);
        poli.setVisible(true);
    }//GEN-LAST:event_btnPolizasMouseClicked

    private void btnConsultaProformasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaProformasMouseClicked
        VProformas proformas = new VProformas(this,false,usuario);
        proformas.setVisible(true);
    }//GEN-LAST:event_btnConsultaProformasMouseClicked

    private void btnFamiliasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFamiliasMouseClicked
        VFamilias vf = new VFamilias(this,true,usuario);
        vf.setVisible(true);
    }//GEN-LAST:event_btnFamiliasMouseClicked

    private void btnFabricantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFabricantesMouseClicked
        VFabricantes vf = new VFabricantes(this, true, usuario);
        vf.setVisible(true);
    }//GEN-LAST:event_btnFabricantesMouseClicked

    private void btnDespachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespachoMouseClicked
        configPanelDespacho();
    }//GEN-LAST:event_btnDespachoMouseClicked

    private void btnDespachoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespachoMouseEntered
        setColor(btnDespacho);
    }//GEN-LAST:event_btnDespachoMouseEntered

    private void btnDespachoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespachoMouseExited
        resetColor(btnDespacho);
    }//GEN-LAST:event_btnDespachoMouseExited

    private void btnConsultarOrdenesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarOrdenesMouseExited
        resetBorder(btnConsultarOrdenes);
    }//GEN-LAST:event_btnConsultarOrdenesMouseExited

    private void btnConsultarOrdenesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarOrdenesMouseEntered
        setBorder(btnConsultarOrdenes);
    }//GEN-LAST:event_btnConsultarOrdenesMouseEntered

    private void btnConsultarOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarOrdenesMouseClicked
        VOrdenesDespacho vd = new VOrdenesDespacho(this, false, usuario);
        vd.setVisible(true);
    }//GEN-LAST:event_btnConsultarOrdenesMouseClicked

    private void btnCrearOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearOrdenMouseExited
        resetBorder(btnCrearOrden);
    }//GEN-LAST:event_btnCrearOrdenMouseExited

    private void btnCrearOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearOrdenMouseEntered
        setBorder(btnCrearOrden);
    }//GEN-LAST:event_btnCrearOrdenMouseEntered

    private void btnCrearOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearOrdenMouseClicked
        VCrearOrdenes vo = new VCrearOrdenes(this,false,usuario);
        vo.setVisible(true);
    }//GEN-LAST:event_btnCrearOrdenMouseClicked

    private void btnCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseClicked
        VClientes vc = new VClientes(this,true);
        vc.setVisible(true);
    }//GEN-LAST:event_btnCustomersMouseClicked

    private void btnCustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseEntered
        setBorder(btnCustomers);
    }//GEN-LAST:event_btnCustomersMouseEntered

    private void btnCustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseExited
        resetBorder(btnCustomers);
    }//GEN-LAST:event_btnCustomersMouseExited

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VPrincipal(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnCerrarSistema;
    private javax.swing.JPanel btnCobros;
    private javax.swing.JLabel btnConsultaProformas;
    private javax.swing.JLabel btnConsultarOrdenes;
    private javax.swing.JLabel btnCorrelativos;
    private javax.swing.JLabel btnCrearOrden;
    private javax.swing.JLabel btnCustomers;
    private javax.swing.JPanel btnDespacho;
    private javax.swing.JLabel btnFabricantes;
    private javax.swing.JLabel btnFamilias;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnNotasCredito;
    private javax.swing.JLabel btnPolizas;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnProductosDisponibles;
    private javax.swing.JLabel btnProformas;
    private javax.swing.JLabel btnReporteNotas;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnSistema;
    private javax.swing.JLabel btnUsuarios;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JLabel btnVentasMensuales;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCobros;
    private javax.swing.JPanel panelDespacho;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelSistema;
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
    
    // Configura la Visibilidad del panel de opciones de Sistema/Administración.
    private void configPanelSistema(){
        if(!panelSistema.isVisible()){
            initPaneles();
            lblTitulo.setText("Opciones de Administración");
            panelSistema.setVisible(true);
        }else{
            lblTitulo.setText("");
            initPaneles();
        }
    }
    
    // Configura la Visibilidad del panel de opciones de cobros.
    private void configPanelCobros(){
        if(!panelCobros.isVisible()){
            initPaneles();
            lblTitulo.setText("Opciones de Cobros");
            panelCobros.setVisible(true);
        }else{
            lblTitulo.setText("");
            initPaneles();
        }
    }
    
    // Configura la visibilidad del panel de Opciones para Salir.
    private void configPanelSalir(){
        if(!panelSalir.isVisible()){
            initPaneles();
            lblTitulo.setText("Opciones de Salida");
            panelSalir.setVisible(true);
        }else{
            lblTitulo.setText("");
            initPaneles();
        }
    }
    
    // Configura la visibilidad del panel de Opciones para Reportes.
    private void configPanelReportes(){
        if(!panelReportes.isVisible()){
            initPaneles();
            lblTitulo.setText("Módulo de Reportes");
            panelReportes.setVisible(true);
        }else{
            lblTitulo.setText("");
            initPaneles();
        }
    }
    
    // Configura la visibilidad del panel de Ordenes de Despacho
    private void configPanelDespacho(){
        if(!panelDespacho.isVisible()){
            initPaneles();
            lblTitulo.setText("Módulo de Despacho");
            panelDespacho.setVisible(true);
        }else{
            lblTitulo.setText("");
            initPaneles();
        }
    }
    
    // Inicializa los paneles de las opciones disponibles.
    private void initPaneles(){
        Usuario usuario = new Usuario();
        
        panelSistema.setVisible(false);
        panelCobros.setVisible(false);
        panelSalir.setVisible(false);
        panelReportes.setVisible(false);
        panelDespacho.setVisible(false);
        //btnRoles.setVisible(false);
        
        // Decide las opciones visibles dependiendo del nivel de acceso que el usuario tenga.
        switch(usuario.comprobarRol(usuario.consultarUsuario(this.usuario))){
            case 1:
                permisoAdmin();
                break;
            case 2:
                permisoVendedor();
                break;
            case 3:
                permisoBodega();
                break;                
            default:
                break;
        }
    }
    
    private void permisoAdmin(){
        btnSistema.setVisible(true);
        btnCobros.setVisible(true);
        btnReportes.setVisible(true);
        btnSalir.setVisible(true);
        btnDespacho.setVisible(true);
    }
    
    private void permisoVendedor(){
        btnSistema.setVisible(false);
        btnCobros.setVisible(true);
        btnReportes.setVisible(false);
        btnSalir.setVisible(true);
    }
    
    private void permisoBodega(){
        btnSistema.setVisible(true);
        btnCobros.setVisible(false);
        btnReportes.setVisible(true);
        btnSalir.setVisible(true);
        
        // Opciones deshabilitadas para el módulo de Administración
        btnUsuarios.setVisible(false);
        btnNotasCredito.setVisible(false);
        btnCorrelativos.setVisible(false);
        btnCustomers.setVisible(false);
        
        // Opciones deshabilitadas para el módulo de reportes
        btnPolizas.setVisible(false);
        btnReporteNotas.setVisible(false);
    }
}
