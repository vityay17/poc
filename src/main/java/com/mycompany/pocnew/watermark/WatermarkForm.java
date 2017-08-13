package com.mycompany.pocnew.watermark;

import com.mycompany.pocnew.shared.ImageAlgorithms;
import com.mycompany.pocnew.POC;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JSlider;


public class WatermarkForm extends javax.swing.JFrame {

    POC parent = null;
    WatermarkService watermarkService;
    
    public WatermarkForm(POC parent) {
        watermarkService = new WatermarkService(parent.workImage);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.parent = parent;
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jTextFieldWspolczynnik = new javax.swing.JTextField();
        jButtonCompare = new javax.swing.JButton();
        jLabeLCorrelation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonReadWatermark = new javax.swing.JButton();
        jButtonSaveWatermark = new javax.swing.JButton();
        jButtonMark = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Znakowanie wodne");

        okButton.setText("OK");
        okButton.setPreferredSize(new java.awt.Dimension(125, 25));
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        cancelButton.setText("Anuluj");
        cancelButton.setPreferredSize(new java.awt.Dimension(125, 25));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        jTextFieldWspolczynnik.setText("1000");

        jButtonCompare.setText("Porównaj");
        jButtonCompare.setToolTipText("");
        jButtonCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompareActionPerformed(evt);
            }
        });

        jLabel1.setText("Współczynnik [K]:");

        jButtonReadWatermark.setText("Wczytaj");
        jButtonReadWatermark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadWatermarkActionPerformed(evt);
            }
        });

        jButtonSaveWatermark.setText("Zapisz");
        jButtonSaveWatermark.setToolTipText("");
        jButtonSaveWatermark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveWatermarkActionPerformed(evt);
            }
        });

        jButtonMark.setText("Znakowanie");
        jButtonMark.setToolTipText("");
        jButtonMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWspolczynnik, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButtonCompare))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonReadWatermark)
                        .addGap(7, 7, 7)
                        .addComponent(jButtonSaveWatermark)
                        .addGap(7, 7, 7)
                        .addComponent(jButtonMark))
                    .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(jLabeLCorrelation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldWspolczynnik, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCompare)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeLCorrelation, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonReadWatermark, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSaveWatermark, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMark, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        parent.updateImage();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_okButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        parent.revertImage();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void jButtonCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompareActionPerformed
        jLabeLCorrelation.setText(watermarkService.compareWaterMark());
    }//GEN-LAST:event_jButtonCompareActionPerformed

    private void jButtonReadWatermarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadWatermarkActionPerformed
        watermarkService.openWaterMark();
    }//GEN-LAST:event_jButtonReadWatermarkActionPerformed

    private void jButtonSaveWatermarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveWatermarkActionPerformed
        watermarkService.saveWaterMark();
    }//GEN-LAST:event_jButtonSaveWatermarkActionPerformed

    private void jButtonMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarkActionPerformed
        int k = Integer.valueOf(jTextFieldWspolczynnik.getText());
        jLabelImage.setIcon(new ImageIcon(watermarkService.generateWaterMarkImage(k)));
    }//GEN-LAST:event_jButtonMarkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButtonCompare;
    private javax.swing.JButton jButtonMark;
    private javax.swing.JButton jButtonReadWatermark;
    private javax.swing.JButton jButtonSaveWatermark;
    private javax.swing.JLabel jLabeLCorrelation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JTextField jTextFieldWspolczynnik;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}