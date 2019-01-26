package prstd.vistas;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.NotaCredito;

public class VNotasCredito extends javax.swing.JDialog {

    int x,y;
    String vendedor;
    
    public VNotasCredito(java.awt.Frame parent, boolean modal, String vendedor) {
        super(parent,modal);
        initComponents();
        //tableNotas.setModel(modelo);
        this.setLocationRelativeTo(null);
        cargarNotas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelCobros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotas = new javax.swing.JTable();
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
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, 120));

        panelCobros.setOpaque(false);

        tableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Nota", "Producto", "Cliente", "Transacción", "Fecha", "Estado"
            }
        ));
        tableNotas.setFillsViewportHeight(true);
        tableNotas.setFocusTraversalPolicyProvider(true);
        tableNotas.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tableNotas.setShowHorizontalLines(false);
        tableNotas.setShowVerticalLines(false);
        tableNotas.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tableNotas);

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
        btnFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel1.setText("Notas Crédito");
        panelOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 50));
        panelOpciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, 170, 10));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 25));

        btnImprimir.setBackground(new java.awt.Color(0, 153, 153));
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setPreferredSize(new java.awt.Dimension(250, 50));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jLabel4.setText("Imprimir");
        btnImprimir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Print_50px.png"))); // NOI18N
        btnImprimir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(btnImprimir);

        btnAnular.setBackground(new java.awt.Color(0, 153, 153));
        btnAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel9.setText("Anular");
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

    private void btnFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseClicked
        filtrarNotas();
    }//GEN-LAST:event_btnFiltroMouseClicked

    private void btnFiltroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseEntered
        setBorde(btnFiltro);
    }//GEN-LAST:event_btnFiltroMouseEntered

    private void btnFiltroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseExited
        resetBorde(btnFiltro);
    }//GEN-LAST:event_btnFiltroMouseExited

    private void btnAnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularMouseClicked
        
    }//GEN-LAST:event_btnAnularMouseClicked

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
            java.util.logging.Logger.getLogger(VNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            VNotasCredito dialog = new VNotasCredito(new javax.swing.JFrame(), true, null);
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
    private org.jdesktop.swingx.JXDatePicker dateFin;
    private org.jdesktop.swingx.JXDatePicker dateIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel panelCobros;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTable tableNotas;
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
    
    private void cargarNotas(){
        String[] titulos = {"ID Nota", "Producto","Cliente","Transacción","Fecha","Estado"};
        Object[] datos;
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        NotaCredito nc = new NotaCredito();
        List<Object> lista = nc.consultar();
        
        for(int i = 0; i < lista.size(); i++){
           datos = (Object[]) lista.get(i);
           modelo.addRow(datos);
        }
        tableNotas.setModel(modelo);
        configurarTabla(tableNotas);
    }
    
    private void filtrarNotas(){
        String[] titulos = {"ID Nota", "Producto","Cliente","Transacción","Fecha","Estado"};
        Object[] datos;
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        NotaCredito nc = new NotaCredito();
        Date fecha1, fecha2;
        fecha1 = dateIni.getDate();
        fecha2 = dateFin.getDate();
        List<Object> lista = nc.consultar(fecha1, fecha2);
        
        for(int i = 0; i < lista.size(); i++){
           datos = (Object[]) lista.get(i);
           modelo.addRow(datos);
        }
        tableNotas.setModel(modelo);
        configurarTabla(tableNotas);
    }
    
    
    private void configurarTabla(JTable table){
        // Configuración del tamaño que ocuparán las columnas que muestran la información
        // de las cuentas disponibles bajo el nombre ingresado.
        table.getColumn("ID Nota").setPreferredWidth(40);
        table.getColumn("Producto").setPreferredWidth(60);
        table.getColumn("Cliente").setPreferredWidth(100);
        table.getColumn("Transacción").setPreferredWidth(80);
        table.getColumn("Fecha").setPreferredWidth(180);
        table.getColumn("Estado").setPreferredWidth(50);
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        // Indicamos la alineación que tendrán las columnas.
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(4).setCellRenderer(tcr);
        table.getColumnModel().getColumn(5).setCellRenderer(tcr);
    }
}
