/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.cs305;

import org.cs305.api.ExcelProcessor;
import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JFileChooser;
import org.cs305.api.StatusListener;

/**
 *
 * @author someuser
 */
public class MainScreen extends javax.swing.JFrame implements StatusListener {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        txtFirstFile = new javax.swing.JTextField();
        btnFirstFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSecondFile = new javax.swing.JTextField();
        btnSecondFile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtColInFirst = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColInSecond = new javax.swing.JTextField();
        btnProcess = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStatusLogs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First file:");

        btnFirstFile.setText("Browse");
        btnFirstFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstFileActionPerformed(evt);
            }
        });

        jLabel2.setText("Second file:");

        btnSecondFile.setText("Browse");
        btnSecondFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondFileActionPerformed(evt);
            }
        });

        jLabel3.setText("Col to check in first file:");

        jLabel4.setText("Col. to check in 2nd file:");

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Status logs:"));

        txtStatusLogs.setEditable(false);
        txtStatusLogs.setBackground(new java.awt.Color(0, 0, 0));
        txtStatusLogs.setColumns(20);
        txtStatusLogs.setForeground(new java.awt.Color(0, 255, 0));
        txtStatusLogs.setRows(5);
        jScrollPane1.setViewportView(txtStatusLogs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtColInFirst, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColInSecond, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addComponent(txtFirstFile)
                            .addComponent(txtSecondFile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFirstFile)
                            .addComponent(btnSecondFile)))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirstFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSecondFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSecondFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtColInFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtColInSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnFirstFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstFileActionPerformed
        
        File f = showFileChooser();
        if (f != null) txtFirstFile.setText(f.getAbsolutePath());
        
    }//GEN-LAST:event_btnFirstFileActionPerformed

    protected File showFileChooser() throws HeadlessException {
        // TODO add your handling code here:
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            return jFileChooser1.getSelectedFile();
        }
        return null;
    }

    private void btnSecondFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondFileActionPerformed
        // TODO add your handling code here:
        File f = showFileChooser();
        if (f != null) txtSecondFile.setText(f.getAbsolutePath());
    }//GEN-LAST:event_btnSecondFileActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        try {
            ExcelProcessor.OpPrams opp = new ExcelProcessor.OpPrams();
            opp.firstFilePath = txtFirstFile.getText();
            opp.secondFilePath = txtSecondFile.getText();
            opp.locationColInFirst = Integer.parseInt(txtColInFirst.getText());
            opp.locationColInSecond = Integer.parseInt(txtColInSecond.getText());

            ExcelProcessor ep = new ExcelProcessor(opp, this);
            
            
//            ep.compareFiles(new StatusListener() {
//                @Override
//                public void logMessage(String message) {
//                    logInfo(message);
//                }
//            });

            ep.compareFiles();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
            logInfo("Error occurred: "+ex);
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtFirstFile.setText("");
        txtSecondFile.setText("");
        txtColInFirst.setText("");
        txtColInSecond.setText("");
        txtStatusLogs.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    void logInfo(String msg) {
        String old = txtStatusLogs.getText();
        txtStatusLogs.setText(old + "\n" + msg);
    }
    
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirstFile;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSecondFile;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtColInFirst;
    private javax.swing.JTextField txtColInSecond;
    private javax.swing.JTextField txtFirstFile;
    private javax.swing.JTextField txtSecondFile;
    private javax.swing.JTextArea txtStatusLogs;
    // End of variables declaration//GEN-END:variables

    @Override
    public void logMessage(String message) {
        logInfo(message);
    }
}
