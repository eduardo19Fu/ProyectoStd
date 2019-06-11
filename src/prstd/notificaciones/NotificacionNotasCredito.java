package prstd.notificaciones;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Cliente;
import prstd.modelos.NotaCredito;
import prstd.vistas.VDespachoNotas;


public class NotificacionNotasCredito extends javax.swing.JDialog {

    private int x,y;
    private Cliente cliente;
    public NotificacionNotasCredito(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        cargarNotasPendientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotas = new javax.swing.JTable();
        panelControles = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JLabel();
        btnDespachar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 212, 186));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 116), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/sign-info-icon-64.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 79));

        lblCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 59, 570, 79));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Notas de Crédito pendientes de despachar");
        jLabel5.setOpaque(true);
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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 794, 50));

        jScrollPane1.setBorder(null);

        tableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Saldo Pendiente", "No. Factura", "Fecha Creacion"
            }
        ));
        tableNotas.setFillsViewportHeight(true);
        tableNotas.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tableNotas.setShowHorizontalLines(false);
        tableNotas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tableNotas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 740, 330));

        panelControles.setBackground(new java.awt.Color(0, 153, 153));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 45, 10);
        flowLayout1.setAlignOnBaseline(true);
        panelControles.setLayout(flowLayout1);

        btnAceptar.setBackground(new java.awt.Color(230, 162, 78));
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/sign-check-icon-32.png"))); // NOI18N
        btnAceptar.setToolTipText("Confirmación de Información");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setOpaque(true);
        btnAceptar.setPreferredSize(new java.awt.Dimension(78, 54));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        panelControles.add(btnAceptar);

        btnImprimir.setBackground(new java.awt.Color(230, 162, 78));
        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Print_32px.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir un informe detallado sobre las notas de crédito.");
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
        panelControles.add(btnImprimir);

        btnDespachar.setBackground(new java.awt.Color(230, 162, 78));
        btnDespachar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDespachar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Small_Business_32px.png"))); // NOI18N
        btnDespachar.setToolTipText("Despachar las notas de crédito de este cliente.");
        btnDespachar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDespachar.setOpaque(true);
        btnDespachar.setPreferredSize(new java.awt.Dimension(78, 54));
        btnDespachar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDespacharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDespacharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDespacharMouseExited(evt);
            }
        });
        panelControles.add(btnDespachar);

        jPanel1.add(panelControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 500, 794, 78));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        setFormato(btnAceptar);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        resetFormato(btnAceptar);
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        NotaCredito nc = new NotaCredito();
        System.out.println(cliente.getIdcliente());
        nc.imprimirPendientes(cliente.getIdcliente());
        this.dispose();
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        setFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        resetFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnDespacharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespacharMouseClicked
        VDespachoNotas vn = new VDespachoNotas(null, true, cliente.getIdcliente());
        this.dispose();
        vn.setVisible(true);
    }//GEN-LAST:event_btnDespacharMouseClicked

    private void btnDespacharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespacharMouseEntered
        setFormato(btnDespachar);
    }//GEN-LAST:event_btnDespacharMouseEntered

    private void btnDespacharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespacharMouseExited
        resetFormato(btnDespachar);
    }//GEN-LAST:event_btnDespacharMouseExited

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
            java.util.logging.Logger.getLogger(NotificacionNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificacionNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificacionNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificacionNotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotificacionNotasCredito dialog = new NotificacionNotasCredito(new javax.swing.JFrame(), true,null);
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
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnDespachar;
    private javax.swing.JLabel btnImprimir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JPanel panelControles;
    private javax.swing.JTable tableNotas;
    // End of variables declaration//GEN-END:variables

    private void setFormato(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,153,153),2));
        label.setBackground(new Color(255,204,102));
    }
    
    private void resetFormato(JLabel label){
        label.setBorder(null);
        label.setBackground(new Color(230,162,78));
    }
    
    private void cargarNotasPendientes(){
        NotaCredito nc = new NotaCredito();
        if(nc.notasPendientes(cliente.getIdcliente()) != null){
            DefaultTableModel model = nc.notasPendientes(cliente.getIdcliente());
            tableNotas.setModel(model);
            lblCliente.setText(cliente.getNombre().toUpperCase());
        }else{
            this.dispose();
        }
    }

}
