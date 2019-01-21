package prstd.notificaciones;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Cliente;
import prstd.modelos.Documento;
import prstd.modelos.NotaCliente;
import prstd.modelos.NotaCredito;
import prstd.modelos.NotaTransaccion;
import prstd.modelos.UsuarioCorrelativo;
import prstd.vistas.VCrearFactura;
import static prstd.vistas.VCrearFactura.tblDetalle;


public class NotificacionFactura extends javax.swing.JDialog {

    
    private int x,y;
    private Documento documento;
    private Cliente cl;
    private UsuarioCorrelativo ucorr;
    private DefaultTableModel modelo;
    
    public NotificacionFactura( java.awt.Frame parent, 
                                boolean modal, 
                                Documento documento, 
                                Cliente cl, 
                                UsuarioCorrelativo ucorr,
                                DefaultTableModel modelo)
    {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.documento = documento;
        this.cl = cl;
        this.ucorr = ucorr;
        this.modelo = modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(238, 236, 173));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/sign-info-icon-64.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 79));

        lblTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("Ingrese número de factura que desea imprimir:");
        lblTexto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 59, 380, 40));

        jLabel5.setBackground(new java.awt.Color(0, 212, 186));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese Número de Factura");
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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 502, 50));

        btnPrint.setBackground(new java.awt.Color(0, 153, 153));
        btnPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Print_32px.png"))); // NOI18N
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.setOpaque(true);
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
        });
        jPanel1.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 165, 70, 50));

        btnCancel.setBackground(new java.awt.Color(0, 153, 153));
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/cancel-32.png"))); // NOI18N
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setOpaque(true);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 165, 70, 50));

        txtNumero.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
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

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        int no_factura = Integer.parseInt(txtNumero.getText());
        this.documento.setNo_documento(no_factura);
        imprimir(this.modelo,this.documento,this.ucorr);
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        setFormato(btnPrint);
    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
        resetFormato(btnPrint);
    }//GEN-LAST:event_btnPrintMouseExited

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        setFormato(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        resetFormato(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

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
            java.util.logging.Logger.getLogger(NotificacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            NotificacionFactura dialog = new NotificacionFactura(new javax.swing.JFrame(), true, null, null, null, null);
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
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnPrint;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTexto;
    public static javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
    
    private void setFormato(JLabel label){
        label.setBackground(new Color(0,204,204));
    }
    
    private void resetFormato(JLabel label){
        label.setBackground(new Color(0,153,153));
    }
    
    private void imprimir(DefaultTableModel modelo, Documento documento, UsuarioCorrelativo ucorr){
        if(documento.crearFactura(documento) > 0){
            if(documento.detalleFactura(modelo, documento.getIdtransaccion(), documento.getSerie()) > 0){
                if(documento.actualizarExistencias(modelo) > 0){
                    if(ucorr.avanzaCorrelativo(documento.getIdvendedor(), documento.getNo_documento(), 1) > 0){
                        //JOptionPane.showMessageDialog(this, "FacturaCreada");
                        Documento dc = new Documento();
                        NotaCredito nc = new NotaCredito();
                        NotaTransaccion nt = new NotaTransaccion();
                        NotaCliente ncl = new NotaCliente();

                        nc.update(modelo);
                        nt.crear(modelo, documento.getIdtransaccion());
                        ncl.crear(modelo, documento.getIdcliente());
                        try {
                            dc.imprimir2(documento.getMaxTransaccion(), documento.getNo_documento(), documento.getSerie(), documento.getTotal());
                        } catch (SQLException ex) {
                            Logger.getLogger(VCrearFactura.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        this.dispose();
                    }
                }
            }
        }
    
    }
}
