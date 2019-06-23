package prstd.vistas;

import java.awt.Color;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import prstd.modelos.Cliente;
import prstd.modelos.NotaCredito;

public class VReporteNotas extends javax.swing.JDialog {

    
    public VReporteNotas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        init();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        radioCliente = new javax.swing.JRadioButton();
        radioFecha = new javax.swing.JRadioButton();
        panelCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        btnImprimir = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JLabel();
        panelFechas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateIni = new org.jdesktop.swingx.JXDatePicker();
        dateFin = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 116), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Opciones de Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelOpciones.setOpaque(false);
        panelOpciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        buttonGroup1.add(radioCliente);
        radioCliente.setForeground(new java.awt.Color(0, 0, 0));
        radioCliente.setText("Cliente");
        radioCliente.setOpaque(false);
        radioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioClienteActionPerformed(evt);
            }
        });
        panelOpciones.add(radioCliente);

        buttonGroup1.add(radioFecha);
        radioFecha.setForeground(new java.awt.Color(0, 0, 0));
        radioFecha.setText("Fecha");
        radioFecha.setOpaque(false);
        radioFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFechaActionPerformed(evt);
            }
        });
        panelOpciones.add(radioFecha);

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 31, 419, -1));

        panelCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        panelCliente.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Introduzca un NIT:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estado:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVA", "DESPACHADA" }));

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNit)
                    .addComponent(comboEstado, 0, 174, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 112, -1, -1));

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
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 240, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(230, 162, 78));
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prstd/images/icons8_Cancel_30px.png"))); // NOI18N
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
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 240, -1, -1));

        panelFechas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        panelFechas.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha Inicial:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Final:");

        javax.swing.GroupLayout panelFechasLayout = new javax.swing.GroupLayout(panelFechas);
        panelFechas.setLayout(panelFechasLayout);
        panelFechasLayout.setHorizontalGroup(
            panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panelFechasLayout.setVerticalGroup(
            panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(panelFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 112, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        generar();
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        setFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        resetFormato(btnImprimir);
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        setFormato(btnAceptar);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        resetFormato(btnAceptar);
    }//GEN-LAST:event_btnAceptarMouseExited

    private void radioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioClienteActionPerformed
        if(radioCliente.isSelected()){
            panelFechas.setVisible(false);
            panelCliente.setVisible(true);
        }
    }//GEN-LAST:event_radioClienteActionPerformed

    private void radioFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFechaActionPerformed
        if(radioFecha.isSelected()){
            panelFechas.setVisible(true);
            panelCliente.setVisible(false);
        }
    }//GEN-LAST:event_radioFechaActionPerformed

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
            java.util.logging.Logger.getLogger(VReporteNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VReporteNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VReporteNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VReporteNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            VReporteNotas dialog = new VReporteNotas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnImprimir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboEstado;
    private org.jdesktop.swingx.JXDatePicker dateFin;
    private org.jdesktop.swingx.JXDatePicker dateIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelFechas;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JRadioButton radioCliente;
    private javax.swing.JRadioButton radioFecha;
    private javax.swing.JTextField txtNit;
    // End of variables declaration//GEN-END:variables

    private void setFormato(JLabel label){
        label.setBorder(BorderFactory.createLineBorder(new Color(0,153,153),2));
        label.setBackground(new Color(255,204,102));
    }
    
    private void resetFormato(JLabel label){
        label.setBorder(null);
        label.setBackground(new Color(230,162,78));
    }
    
    private void init(){
        panelCliente.setVisible(false);
        panelFechas.setVisible(false);
        
        Date fechaAct = new Date();
        dateIni.setDate(fechaAct);
        dateFin.setDate(fechaAct);
    }
    
    private void generar(){
        NotaCredito nc = new NotaCredito();
        if(radioCliente.isSelected()){
            String nit = txtNit.getText();
            String estado = comboEstado.getSelectedItem().toString();
            Cliente cliente = new Cliente().buscarNit(nit);
            
            nc.imprimirPendientes(cliente.getIdcliente(), estado);
            this.dispose();
        }else if(radioFecha.isSelected()){
            Date fechaIni = dateIni.getDate();
            Date fechaFin = dateFin.getDate();
            
            nc.imprimirDespachadas(fechaIni, fechaFin);
            this.dispose();
        }
    }
}
