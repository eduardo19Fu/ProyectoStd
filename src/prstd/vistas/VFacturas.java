package prstd.vistas;

import com.fel.firma.emisor.FirmaEmisor;
import com.fel.firma.emisor.RespuestaServicioFirma;
import com.fel.validaciones.documento.AnulacionFel;
import com.fel.validaciones.documento.ConexionServicioFel;
import com.fel.validaciones.documento.GenerarXml;
import com.fel.validaciones.documento.Respuesta;
import com.fel.validaciones.documento.RespuestaServicioFel;
import com.fel.validaciones.documento.ServicioFel;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import prstd.modelos.Cliente;
import prstd.modelos.Documento;
import prstd.modelos.Emisor;
import prstd.modelos.Usuario;
import prstd.modelos.UsuarioCorrelativo;

public class VFacturas extends javax.swing.JDialog {

    int x,y;
    String vendedor;
    
    
    public VFacturas(java.awt.Frame parent, boolean modal, String vendedor) {
        super(parent,modal);
        initComponents();
        cargarFacturas();
        this.setLocationRelativeTo(null);
        this.vendedor = vendedor;
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
        tableFacturas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dateFin = new org.jdesktop.swingx.JXDatePicker();
        dateIni = new org.jdesktop.swingx.JXDatePicker();
        btnFiltro = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAnular = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Multiply_32px.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimiza la Pantalla Principal");
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        tableFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transacción", "No. Factura", "Serie", "Vendedor", "Fecha Emisión", "Estado"
            }
        ));
        tableFacturas.setFillsViewportHeight(true);
        tableFacturas.setFocusTraversalPolicyProvider(true);
        tableFacturas.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tableFacturas.setShowHorizontalLines(false);
        tableFacturas.setShowVerticalLines(false);
        tableFacturas.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tableFacturas);

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Filtros");

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel12.setText("Al:");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("Del:");

        btnFiltro.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnFiltro.setForeground(new java.awt.Color(0, 0, 0));
        btnFiltro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Filter_30px.png"))); // NOI18N
        btnFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFiltroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFiltroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCobrosLayout = new javax.swing.GroupLayout(panelCobros);
        panelCobros.setLayout(panelCobrosLayout);
        panelCobrosLayout.setHorizontalGroup(
            panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCobrosLayout.createSequentialGroup()
                .addGroup(panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCobrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
                    .addGroup(panelCobrosLayout.createSequentialGroup()
                        .addGroup(panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCobrosLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel11))
                            .addGroup(panelCobrosLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(dateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addGroup(panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(panelCobrosLayout.createSequentialGroup()
                                        .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCobrosLayout.setVerticalGroup(
            panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCobrosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCobrosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCobrosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jPanel2.add(panelCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 600));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 780));

        panelOpciones.setBackground(new java.awt.Color(0, 153, 153));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas");
        panelOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 50));
        panelOpciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, 170, 10));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 25));

        btnNuevo.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jLabel2.setText("Nueva Factura");
        btnNuevo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_New_Copy_50px.png"))); // NOI18N
        btnNuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnNuevo);

        btnImprimir.setBackground(new java.awt.Color(0, 153, 153));
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImprimir.setPreferredSize(new java.awt.Dimension(250, 50));
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
        btnImprimir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Re Imprimir");
        btnImprimir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Print_50px.png"))); // NOI18N
        btnImprimir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnImprimir);

        btnAnular.setBackground(new java.awt.Color(0, 153, 153));
        btnAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnular.setPreferredSize(new java.awt.Dimension(250, 50));
        btnAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnularMouseExited(evt);
            }
        });
        btnAnular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Anular Factura");
        jLabel9.setToolTipText("");
        btnAnular.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_File_Delete_50px.png"))); // NOI18N
        btnAnular.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnAnular);

        panelOpciones.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 610));

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
        UsuarioCorrelativo uc = new UsuarioCorrelativo();
        Usuario usuario = new Usuario();
        if(uc.verificarUsuario(usuario.consultarUsuario(this.vendedor))){
            VCrearFactura vcf = new VCrearFactura(null,false,vendedor,0); // Instancia de un objeto de la Clase VCrearFactura.
            vcf.setVisible(true); // Visualización de la ventana que sirve para crear facturas.
        }else{
            JOptionPane.showMessageDialog(this, "Este usuario no cuenta con un correlativo asignado");
        }
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        setColor(btnNuevo);
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        resetColor(btnNuevo);
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        setColor(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        resetColor(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnAnularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularMouseEntered
        setColor(btnAnular);
    }//GEN-LAST:event_btnAnularMouseEntered

    private void btnAnularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularMouseExited
        resetColor(btnAnular);
    }//GEN-LAST:event_btnAnularMouseExited

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        busquedaFactura(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseClicked
        buscarFacturas(dateIni.getDate(), dateFin.getDate());
    }//GEN-LAST:event_btnFiltroMouseClicked

    private void btnFiltroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseEntered
        setBorde(btnFiltro);
    }//GEN-LAST:event_btnFiltroMouseEntered

    private void btnFiltroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseExited
        resetBorde(btnFiltro);
    }//GEN-LAST:event_btnFiltroMouseExited

    private void btnAnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularMouseClicked
        try{
            Documento documento = new Documento();
            int idtransaccion = (int) tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 0);
            int no_factura = (int) tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 1);
            String serie = String.valueOf(tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 2));
            String estado = String.valueOf(tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 5));
            documento = documento.buscarFactura(idtransaccion);

            if(!estado.equals("ANULADA")){
                int op = JOptionPane.showOptionDialog(this, "¿Desa anular la factura seleccionada?", "Anular", 
                                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{"Aceptar","Cancelar"}, "Cancelar");
                if(op != -1){
                    if((op + 1) == 1){
                        // METODO DE ANULACION FEL
                        this.anulacionFel(documento);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "La factura seleccionada ya se encuentra anulada");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro para poder proceder con la anulación.","Advertencia",JOptionPane.WARNING_MESSAGE);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnularMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        try {
            Documento dc = new Documento();
            int transaccion = (int) tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 0);
            int no_factura = (int) tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 1);
            String serie = tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 2).toString();
            
            dc = dc.buscarFactura(transaccion);
            if(!tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 5).toString().equals("ANULADA")){
//                if(serie.equals("CA")){
//                    dc.imprimir2(transaccion, no_factura, serie, dc.totalDocumento(transaccion));
//                }else{
//                    dc.imprimir(transaccion, no_factura, serie, dc.totalDocumento(transaccion));
//                }

                // AQUI VA EL CODIGO QUE ABRE EL ENLACE CON LA FACTURA
                if(java.awt.Desktop.isDesktopSupported()){
                    java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

                    if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                        java.net.URI uri = new java.net.URI("https://report.feel.com.gt/ingfacereport/ingfacereport_documento?uuid=" + dc.getCertificacion_sat());
                        desktop.browse(uri);
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "No se puede reimprimir una factura ya anulada.");
            }
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun registro.");
        } catch (IOException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

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
            java.util.logging.Logger.getLogger(VFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            VFacturas dialog = new VFacturas(new javax.swing.JFrame(), true, null);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windoClosing(java.awt.event.WindowEvent e){
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAnular;
    private javax.swing.JLabel btnFiltro;
    private javax.swing.JPanel btnImprimir;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JPanel btnNuevo;
    private org.jdesktop.swingx.JXDatePicker dateFin;
    private org.jdesktop.swingx.JXDatePicker dateIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTable tableFacturas;
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
    
    private void setBorde(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,120,116),2));
    }
    
    private void resetBorde(JLabel label){
        label.setBorder(null);
    }
    
    private void cargarFacturas(){
        Documento documento = new Documento();
        Usuario usuario;
        String[] titulos = {"ID Transaccion","No. Factura","Serie","Vendedor","Fecha Emision","Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        Object[] datos = new Object[6];
        List<Documento> lista = documento.consultarTransacciones();
        
        for(int i = 0; i < lista.size(); i++){
            usuario = new Usuario();
            datos[0] = lista.get(i).getIdtransaccion();
            datos[1] = lista.get(i).getNo_documento();
            datos[2] = lista.get(i).getSerie();
            datos[3] = usuario.cargarUsuario(lista.get(i).getIdvendedor()).getUsuario();
            datos[4] = lista.get(i).getFecha_emision();
            datos[5] = lista.get(i).getEstado();
            modelo.addRow(datos);
        }
        tableFacturas.setModel(modelo);
        configurarTabla(tableFacturas);
    }
    
    private void buscarFacturas(Date fechaIni, Date fechaFin){
        Documento documento = new Documento();
        Usuario usuario;
        String[] titulos = {"ID Transaccion","No. Factura","Serie","Vendedor","Fecha Emision","Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        Object[] datos = new Object[6];
        List<Documento> lista = documento.consultarTransacciones(fechaIni,fechaFin);
        
        for(int i = 0; i < lista.size(); i++){
            usuario = new Usuario();
            datos[0] = lista.get(i).getIdtransaccion();
            datos[1] = lista.get(i).getNo_documento();
            datos[2] = lista.get(i).getSerie();
            datos[3] = usuario.cargarUsuario(lista.get(i).getIdvendedor()).getUsuario();
            datos[4] = lista.get(i).getFecha_emision();
            datos[5] = lista.get(i).getEstado();
            modelo.addRow(datos);
        }
        tableFacturas.setModel(modelo);
        configurarTabla(tableFacturas);
    }
    
    private void configurarTabla(JTable table){
        // Configuración del tamaño que ocuparán las columnas que muestran la información
        // de las cuentas disponibles bajo el nombre ingresado.
        table.getColumn("ID Transaccion").setPreferredWidth(70);
        table.getColumn("No. Factura").setPreferredWidth(60);
        table.getColumn("Serie").setPreferredWidth(50);
        table.getColumn("Vendedor").setPreferredWidth(100);
        table.getColumn("Fecha Emision").setPreferredWidth(200);
        table.getColumn("Estado").setPreferredWidth(70);
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        // Indicamos la alineación que tendrán las columnas.
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    private void busquedaFactura(String factura) {
        Documento documento = new Documento();
        Usuario usuario;
        String[] titulos = {"ID Transaccion","No. Factura","Serie","Vendedor","Fecha Emision","Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        Object[] datos = new Object[6];
        List<Documento> lista = documento.consultarTransacciones(factura);
        
        for(int i = 0; i < lista.size(); i++){
            usuario = new Usuario();
            datos[0] = lista.get(i).getIdtransaccion();
            datos[1] = lista.get(i).getNo_documento();
            datos[2] = lista.get(i).getSerie();
            datos[3] = usuario.cargarUsuario(lista.get(i).getIdvendedor()).getUsuario();
            datos[4] = lista.get(i).getFecha_emision();
            datos[5] = lista.get(i).getEstado();
            modelo.addRow(datos);
        }
        tableFacturas.setModel(modelo);
        configurarTabla(tableFacturas);
    }
    
    /********* ANULACION FEL **********/
    
    private void anulacionFel(Documento documento)throws ParserConfigurationException, SAXException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ParseException{
        
        Cliente cliente = new Cliente();
        cliente = cliente.consultarCliente(documento.getIdcliente());
        
        Emisor emisor = new Emisor();
        emisor = emisor.datosEmisor();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-06:00'", Locale.getDefault());
        sdf.setTimeZone(TimeZone.getTimeZone("America/Guatemala"));
        
        // CAPTURAR FECHA DE EMISIÓN DE CERTIFICACION DE LA BASE DE DATOS
        String fechaCertificacion = "";
        fechaCertificacion = documento.getFecha_certificacion_sat().replace("T", "'T'").replace("-06:00", "'-06:00'");
        
        SimpleDateFormat sdf_anulacion = new SimpleDateFormat(fechaCertificacion);
        sdf_anulacion.setTimeZone(TimeZone.getTimeZone("America/Guatemala"));
        
        AnulacionFel anulacion_fel = new AnulacionFel();
        
        anulacion_fel.setFechaEmisionDocumentoAnular(sdf_anulacion.format(new Date()));
        anulacion_fel.setFechaHoraAnulacion(sdf.format(new Date()));
        
        if(cliente.getNit().equals("C/F"))
            anulacion_fel.setIDReceptor(cliente.getNit().replace("/", ""));
        else
            anulacion_fel.setIDReceptor(cliente.getNit().replace("-", ""));
        
        anulacion_fel.setNITEmisor(emisor.getNit());
        anulacion_fel.setMotivoAnulacion("Prueba");
        anulacion_fel.setNumeroDocumentoAAnular(documento.getCertificacion_sat());
        
        Respuesta respuesta;

        // Objeto para enviar los datos para generacion del XML
        GenerarXml generar_xml = new GenerarXml();
        respuesta = generar_xml.ToXml(anulacion_fel);
        System.out.println(respuesta.getXml());
        
        // Comprobacion de Datos.
        if (respuesta.getResultado()) {

            try {
                System.out.println("--> FIRMA POR PARTE DEL EMISOR ");
                
                FirmaEmisor firma_emisor = new FirmaEmisor();
                RespuestaServicioFirma respuesta_firma_emisor = new RespuestaServicioFirma();
                
                System.out.println("--> Enviando Documento al Servicio de Firma del Emisor...");
                
                respuesta_firma_emisor = firma_emisor.Firmar(respuesta.getXml(), "45146276", "a3c079b60c23f5a105e61f56ceb2dd43");
                
                System.out.println("--> Resultado: " + respuesta_firma_emisor.isResultado());
                System.out.println("--> Descripcion: " + respuesta_firma_emisor.getDescripcion());
                
                if (respuesta_firma_emisor.isResultado()) {
                    
                    System.out.println("--> ENVIO AL API DE INFILE");
                    
                    ConexionServicioFel conexion = new ConexionServicioFel();
                    conexion.setUrl("");
                    conexion.setMetodo("POST");
                    conexion.setContent_type("application/json");
                    conexion.setUsuario("45146276");
                    conexion.setLlave("ECB7BEBC7DD0145F94B3F01F859E5C3F");
                    conexion.setIdentificador("ANULACION_" + documento.getNo_documento());
                    
                    System.out.println("--> Enviando Documento al Servicio FEL...");
                    
                    ServicioFel servicio = new ServicioFel();
                    
                    RespuestaServicioFel respuesta_servicio = servicio.Certificar(conexion, respuesta_firma_emisor.getArchivo(), emisor.getNit(), "N/A", "ANULACION");
                    
                    if (respuesta_servicio.getResultado()) {
                        
                        System.out.println("--> Resultado: " + respuesta_servicio.getResultado());
                        System.out.println("--> Origen: " + respuesta_servicio.getOrigen());
                        System.out.println("--> Descripcion: " + respuesta_servicio.getDescripcion());
                        System.out.println("--> Cantidad Errores: " + respuesta_servicio.getCantidad_errores());
                        System.out.println("--> INFO: " + respuesta_servicio.getInfo());
                        
                        System.out.println("UUID: " + respuesta_servicio.getUuid());
                        System.out.println("Serie: " + respuesta_servicio.getSerie());
                        System.out.println("Numero: " + respuesta_servicio.getNumero());
                        
                        if(documento.anular(documento.getIdtransaccion(), documento.getNo_documento(), documento.getSerie()) > 0){
                            documento.restaurarExistencias(documento.getIdtransaccion(), documento.getNo_documento(), documento.getSerie());
                            JOptionPane.showMessageDialog(this, "**** Factura anulada con éxito ****");
                            cargarFacturas();
                        }else{
                            JOptionPane.showMessageDialog(this, "La factura no pudo ser anulada","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } else {
                        
                        System.out.println("--> Resultado: " + respuesta_servicio.getResultado());
                        System.out.println("--> Origen: " + respuesta_servicio.getOrigen());
                        System.out.println("--> Descripcion: " + respuesta_servicio.getDescripcion());
                        System.out.println("--> Cantidad Errores: " + respuesta_servicio.getCantidad_errores());
                        System.out.println("--> INFO: " + respuesta_servicio.getInfo());
                        
                        String errores = "";
                        for (int i = 0; i < respuesta_servicio.getCantidad_errores(); i++) {
                            System.out.println(respuesta_servicio.getDescripcion_errores().get(i).getMensaje_error());
                            errores += respuesta_servicio.getDescripcion_errores().get(i).getMensaje_error() + "\n";
                        }
                        
                        JOptionPane.showMessageDialog(this, errores, "Error -> Cantidad de Errores" + respuesta_servicio.getCantidad_errores(), JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                }
            } catch (KeyManagementException ex) {
                Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(VFacturas.class.getName()).log(Level.SEVERE, null, ex);
            }

           
        } else {
           
            //System.out.println(respuesta.getDescripcion());
            //System.out.println(respuesta.getCantidad_errores());
            // Ciclo para recorrer los errores.    
            respuesta.getErrores().forEach((error) -> {
                System.out.println(error);
            });

        }

        // Luego de obtener el resultado entonces se procede a enviar el xml al servicio de FEL de INFILE
        if (respuesta.getResultado()) {

        }
    }
}
