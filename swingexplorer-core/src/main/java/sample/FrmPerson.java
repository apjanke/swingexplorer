/*
 * Copyright 2007, Maxim Zakharenkov
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 *  $Header: /zpool01/javanet/scm/svn/tmp/cvs2svn/swingexplorer/src/sample/FRMPerson.java,v 1.6 2008-04-09 10:39:57 maxz1 Exp $
 */
package sample;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  Maxim Zakharenkov
 */
public class FrmPerson extends javax.swing.JFrame {
    
    /** Creates new form FrmPerson */
    private FrmPerson() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpGender = new javax.swing.ButtonGroup();
        btnCheckEDT = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSurname = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        pnlGender = new javax.swing.JPanel();
        rbnMale = new javax.swing.JRadioButton();
        rbnFemale = new javax.swing.JRadioButton();
        lblCountry = new javax.swing.JLabel();
        cmbCountry = new javax.swing.JComboBox();
        lblDescription = new javax.swing.JLabel();
        btnModalDialog = new javax.swing.JButton();
        btnOwnerlessModalDialog = new javax.swing.JButton();
        btnModelessDialog = new javax.swing.JButton();
        btnOwnerlessModelessDialog = new javax.swing.JButton();
        btnThreadViolation = new javax.swing.JButton();
        btnEdtHang = new javax.swing.JButton();
        btnThreadViolation2 = new javax.swing.JButton();
        btnThreadViolation3 = new javax.swing.JButton();
        btnExceptionInEDT = new javax.swing.JButton();

        btnCheckEDT.setText("jButton1");
        btnCheckEDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckEDTActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Data");

        lblName.setText("Name:");

        lblSurname.setText("Surname:");

        pnlGender.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Gender"));
        pnlGender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGenderMouseClicked(evt);
            }
        });

        grpGender.add(rbnMale);
        rbnMale.setMnemonic('e');
        rbnMale.setSelected(true);
        rbnMale.setText("Male");
        rbnMale.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbnMale.setMargin(new java.awt.Insets(0, 0, 0, 0));

        grpGender.add(rbnFemale);
        rbnFemale.setMnemonic('e');
        rbnFemale.setText("Female");
        rbnFemale.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbnFemale.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout pnlGenderLayout = new org.jdesktop.layout.GroupLayout(pnlGender);
        pnlGender.setLayout(pnlGenderLayout);
        pnlGenderLayout.setHorizontalGroup(
            pnlGenderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlGenderLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlGenderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rbnMale)
                    .add(rbnFemale))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        pnlGenderLayout.setVerticalGroup(
            pnlGenderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlGenderLayout.createSequentialGroup()
                .add(rbnMale)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbnFemale)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCountry.setText("Country:");

        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "England", "Belgium", "France", "Spain", "Italy", "Germany" }));

        lblDescription.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblDescription.setText("This is sample Swing application to demonstrate Swing Explorer");

        btnModalDialog.setText("Modal Dialog");
        btnModalDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModalDialogActionPerformed(evt);
            }
        });

        btnOwnerlessModalDialog.setText("Ownerless Modal Dialog");
        btnOwnerlessModalDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOwnerlessModalDialogActionPerformed(evt);
            }
        });

        btnModelessDialog.setText("Modeless Dialog");
        btnModelessDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelessDialogActionPerformed(evt);
            }
        });

        btnOwnerlessModelessDialog.setText("Ownerless Modeless Dialog");
        btnOwnerlessModelessDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOwnerlessModelessDialogActionPerformed(evt);
            }
        });

        btnThreadViolation.setText("Thread Violation");
        btnThreadViolation.setToolTipText("<html>\nPress this button to simulate<br>\nthread violation.<br> \nCalls method of swing component<br> \nfrom non AWT Dispatch Thread.\n</html>\n");
        btnThreadViolation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreadViolationActionPerformed(evt);
            }
        });

        btnEdtHang.setText("EDT Hang");
        btnEdtHang.setToolTipText("<html>\nSimulate long operation in<br>\nAWT dispatch thread causing<br>\nhanging for 2 seconds\n</html>");
        btnEdtHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdtHangActionPerformed(evt);
            }
        });

        btnThreadViolation2.setText("Thread Violation 2");
        btnThreadViolation2.setToolTipText("<html>Calls \"repaint()\" method in a separate thread.<br>\nThe method is considered as thread safe and should<br>\nnot be caught by violation monitor\n</html>");
        btnThreadViolation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreadViolation2ActionPerformed(evt);
            }
        });

        btnThreadViolation3.setText("Thread Violation 3");
        btnThreadViolation3.setToolTipText("<html>imageUpdate method is called <br>\ninside Swing in a separate thread and should<br>\nnot be caught by violation monitor\n</html>");
        btnThreadViolation3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreadViolation3ActionPerformed(evt);
            }
        });

        btnExceptionInEDT.setText("Exception in EDT");
        btnExceptionInEDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExceptionInEDTActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlGender, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblSurname)
                            .add(lblName))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .add(txtSurname, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(lblCountry)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cmbCountry, 0, 391, Short.MAX_VALUE))
                    .add(lblDescription)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btnModalDialog, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnModelessDialog, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(0, 0, 0)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btnOwnerlessModalDialog, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnOwnerlessModelessDialog, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btnThreadViolation2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .add(btnThreadViolation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .add(btnThreadViolation3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .add(btnEdtHang, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .add(btnExceptionInEDT, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(lblDescription)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblName)
                    .add(txtName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblSurname)
                    .add(txtSurname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlGender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCountry)
                    .add(cmbCountry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnModalDialog)
                    .add(btnOwnerlessModalDialog)
                    .add(btnThreadViolation))
                .add(0, 0, 0)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnModelessDialog)
                    .add(btnOwnerlessModelessDialog)
                    .add(btnThreadViolation2))
                .add(0, 0, 0)
                .add(btnThreadViolation3)
                .add(0, 0, 0)
                .add(btnEdtHang)
                .add(0, 0, 0)
                .add(btnExceptionInEDT)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlGenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGenderMouseClicked
        System.out.println("Sample: Mouse clicked on pnlGender");
    }//GEN-LAST:event_pnlGenderMouseClicked

    private void btnModalDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModalDialogActionPerformed
        JOptionPane.showMessageDialog(this, "Just simple modal dialog", "Sample dialog", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_btnModalDialogActionPerformed

    private void btnOwnerlessModalDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOwnerlessModalDialogActionPerformed
        JOptionPane.showMessageDialog(null, "Just simple ownerless modal dialog", "Sample dialog", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnOwnerlessModalDialogActionPerformed

    private void btnModelessDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelessDialogActionPerformed
        JDialog dlg = new JDialog(this);
        dlg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dlg.setTitle("Sample modeless dialog");
        dlg.setBounds(100, 100, 200, 50);
        dlg.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnModelessDialogActionPerformed

    private void btnOwnerlessModelessDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOwnerlessModelessDialogActionPerformed
        JDialog dlg = new JDialog();
        dlg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dlg.setTitle("Sample ownerless dialog");
        dlg.setBounds(100, 100, 200, 50);
        dlg.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnOwnerlessModelessDialogActionPerformed

    private void btnCheckEDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckEDTActionPerformed
        
    }//GEN-LAST:event_btnCheckEDTActionPerformed

    private void btnThreadViolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreadViolationActionPerformed
        new Thread() {
            public void run() {
                rbnFemale.setToolTipText("Sample");
//                rbnFemale.scrollRectToVisible(null);
            }
        }.start();
}//GEN-LAST:event_btnThreadViolationActionPerformed

    private void btnEdtHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdtHangActionPerformed
        try {
            Thread.sleep(2000);//GEN-LAST:event_btnEdtHangActionPerformed
        } catch (InterruptedException ex) {
            
        }
    }
    
    private void btnThreadViolation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreadViolation2ActionPerformed
        new Thread() {
            public void run() {
                rbnFemale.repaint();
            }
        }.start();
    }//GEN-LAST:event_btnThreadViolation2ActionPerformed

    private void btnThreadViolation3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreadViolation3ActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JEditorPane editor = new JEditorPane();
        frame.setContentPane(editor);
        editor.setContentType("text/html");
        //it works with no valid image as well 
        editor.setText("<html><img src=\"http://inter-pol.info/uploads/posts/1157989094_png.jpg\"></html>");
        frame.setSize(300, 200);
        frame.setVisible(true);
    }//GEN-LAST:event_btnThreadViolation3ActionPerformed

    private void btnExceptionInEDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExceptionInEDTActionPerformed
        int i = 20;
        int zero = 0;
        int j = i/zero;
    }//GEN-LAST:event_btnExceptionInEDTActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPerson frmPerson = new FrmPerson();
                frmPerson.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckEDT;
    private javax.swing.JButton btnEdtHang;
    private javax.swing.JButton btnExceptionInEDT;
    private javax.swing.JButton btnModalDialog;
    private javax.swing.JButton btnModelessDialog;
    private javax.swing.JButton btnOwnerlessModalDialog;
    private javax.swing.JButton btnOwnerlessModelessDialog;
    private javax.swing.JButton btnThreadViolation;
    private javax.swing.JButton btnThreadViolation2;
    private javax.swing.JButton btnThreadViolation3;
    private javax.swing.JComboBox cmbCountry;
    private javax.swing.ButtonGroup grpGender;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JPanel pnlGender;
    private javax.swing.JRadioButton rbnFemale;
    private javax.swing.JRadioButton rbnMale;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
    
}

