package com.mycompany.clinica.gui;

import com.mycompany.clinica.model.Consulta;

import com.mycompany.clinica.model.SignosVitales;
import javax.swing.JOptionPane;

/**
 *
 * @author jacob
 */
public class SignosFrame extends javax.swing.JDialog {

    private SignosVitales signosVitales;
    
    public SignosFrame(java.awt.Frame parent, boolean modal, SignosVitales signosVitales) {
        super(parent, modal);
        this.signosVitales = signosVitales;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textArterial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCardiaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textRespiratoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTemperatura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTalla = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textDescripcion = new javax.swing.JTextField();
        btnGuardarSignos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Presion Arterial:");

        textArterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textArterialActionPerformed(evt);
            }
        });

        jLabel2.setText("Frecuencia Cardiaca: ");

        jLabel3.setText("Frecuencia Respiratoria:");

        jLabel4.setText("Temperatura:");

        jLabel5.setText("Peso:");

        textPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPesoActionPerformed(evt);
            }
        });

        jLabel6.setText("Talla:");

        jLabel7.setText("Descripcion:");

        btnGuardarSignos.setText("Guardar");
        btnGuardarSignos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSignosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnGuardarSignos, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(textTalla)
                                .addComponent(textPeso))
                            .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 169, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textTalla)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnGuardarSignos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textArterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textArterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textArterialActionPerformed

    private void textPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPesoActionPerformed

    private void btnGuardarSignosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSignosActionPerformed
        //boolean islibras = false; 
        String textoPeso = textPeso.getText();
        double peso = Double.parseDouble(textoPeso);
        String textoTalla = textTalla.getText();
        double talla = Double.parseDouble(textoTalla);
        
        
        String imc = calcularImc(peso, talla);
        JOptionPane.showMessageDialog(null, "Almacenado!\nIMC: " + imc, "Información", JOptionPane.INFORMATION_MESSAGE);
        
        //consulta.setSignosVitales(new SignosVitales(textArterial.getText(), textCardiaca.getText(), textRespiratoria.getText(), textTemperatura.getText(), peso, talla, textDescripcion.getText(), imc));
        JOptionPane.showMessageDialog(null, "Almacenado!", "Información", JOptionPane.INFORMATION_MESSAGE);
        signosVitales.setPresionArterial(textArterial.getText());
        signosVitales.setPresionArterial(textCardiaca.getText());
        signosVitales.setFrecuenciaCardiaca(textRespiratoria.getText());
        signosVitales.setTemperatura(textTemperatura.getText());
        signosVitales.setDescripcion(textDescripcion.getText());
        signosVitales.setPeso(peso);
        signosVitales.setTalla(talla);
        signosVitales.setImc(imc);
    }//GEN-LAST:event_btnGuardarSignosActionPerformed
    
    private String calcularImc(double peso, double talla) {
        double imcValue = peso / (talla * talla);

        if (imcValue < 18.5) {
            return "Peso bajo";
        } else if (imcValue >= 18.5 && imcValue < 25) {
            return "Normal";
        } else if (imcValue >= 25 && imcValue < 30) {
            return "Sobrepeso";
        }
        return "Obesidad";
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarSignos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textArterial;
    private javax.swing.JTextField textCardiaca;
    private javax.swing.JTextField textDescripcion;
    private javax.swing.JTextField textPeso;
    private javax.swing.JTextField textRespiratoria;
    private javax.swing.JTextField textTalla;
    private javax.swing.JTextField textTemperatura;
    // End of variables declaration//GEN-END:variables
}
