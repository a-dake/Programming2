/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1Package;

/**
 *
 * @author Anna
 */
public class String1JFrame extends javax.swing.JFrame {
    String string1;
    String string2;

    /**
     * Creates new form String1JFrame
     */
    public String1JFrame() {
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

        String1 = new javax.swing.JLabel();
        length1 = new javax.swing.JLabel();
        String2 = new javax.swing.JLabel();
        length2 = new javax.swing.JLabel();
        compareTo = new javax.swing.JButton();
        ednsWith = new javax.swing.JButton();
        toLowerCase = new javax.swing.JButton();
        toUpperCase = new javax.swing.JButton();
        trim = new javax.swing.JButton();
        result1 = new javax.swing.JLabel();
        result2 = new javax.swing.JLabel();
        string1TextFeild = new javax.swing.JTextField();
        string2TextFeild = new javax.swing.JTextField();
        string1Length = new javax.swing.JLabel();
        string2Length = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        String1.setText("string1:");

        length1.setText("length:");

        String2.setText("jLabel3");

        length2.setText("jLabel4");

        compareTo.setText("compareTo");
        compareTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareToActionPerformed(evt);
            }
        });

        ednsWith.setText("endsWith");
        ednsWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ednsWithActionPerformed(evt);
            }
        });

        toLowerCase.setText("toLowerCase");
        toLowerCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLowerCaseActionPerformed(evt);
            }
        });

        toUpperCase.setText("toUpperCase");
        toUpperCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUpperCaseActionPerformed(evt);
            }
        });

        trim.setText("trim");
        trim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trimActionPerformed(evt);
            }
        });

        result2.setText("jLabel6");

        string1TextFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                string1TextFeildActionPerformed(evt);
            }
        });

        string2TextFeild.setText("jTextField2");
        string2TextFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                string2TextFeildActionPerformed(evt);
            }
        });

        string2Length.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(String1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(string1TextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(String2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(string2TextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(length2)
                                .addGap(18, 18, 18)
                                .addComponent(string2Length))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(compareTo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ednsWith)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toLowerCase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toUpperCase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trim, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(result1)
                        .addGap(65, 65, 65)
                        .addComponent(result2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(length1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(string1Length)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(String1)
                    .addComponent(string1TextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(length1)
                    .addComponent(string1Length))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(String2)
                    .addComponent(string2TextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(length2)
                    .addComponent(string2Length))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compareTo)
                    .addComponent(ednsWith)
                    .addComponent(toLowerCase)
                    .addComponent(toUpperCase)
                    .addComponent(trim))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result1)
                    .addComponent(result2))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void string1TextFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_string1TextFeildActionPerformed

        string1 = string1TextFeild.getText();
        string1Length.setText("" + string1.length());
    }//GEN-LAST:event_string1TextFeildActionPerformed

    private void string2TextFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_string2TextFeildActionPerformed
       string2 = string2TextFeild.getText();
       string2Length.setText("" + string2.length());
    }//GEN-LAST:event_string2TextFeildActionPerformed

    private void compareToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareToActionPerformed
        int result = string1.compareTo(string2);
        if (result < 0) 
            result1.setText("str1 > str2");
        else if (result == 0)
            result1.setText("str1 == str2");
        else if (result > 0)
            result1.setText("str1 < str2");
       
    }//GEN-LAST:event_compareToActionPerformed

    private void ednsWithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ednsWithActionPerformed
        boolean si = string1.endsWith(string2);
        if (si = true)
            result1.setText("yes");
        else
            result1.setText("no");
        
    }//GEN-LAST:event_ednsWithActionPerformed

    private void toLowerCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLowerCaseActionPerformed
      string1TextFeild.setText(string1.toLowerCase());
      string2TextFeild.setText(string2.toLowerCase());
      
    }//GEN-LAST:event_toLowerCaseActionPerformed

    private void toUpperCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUpperCaseActionPerformed
      string1TextFeild.setText(string1.toUpperCase());
      string2TextFeild.setText(string2.toUpperCase());
    }//GEN-LAST:event_toUpperCaseActionPerformed

    private void trimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trimActionPerformed
       string1TextFeild.setText(string1.trim());
       string2TextFeild.setText(string2.trim());
    }//GEN-LAST:event_trimActionPerformed

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
            java.util.logging.Logger.getLogger(String1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(String1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(String1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(String1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new String1JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel String1;
    private javax.swing.JLabel String2;
    private javax.swing.JButton compareTo;
    private javax.swing.JButton ednsWith;
    private javax.swing.JLabel length1;
    private javax.swing.JLabel length2;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel result2;
    private javax.swing.JLabel string1Length;
    private javax.swing.JTextField string1TextFeild;
    private javax.swing.JLabel string2Length;
    private javax.swing.JTextField string2TextFeild;
    private javax.swing.JButton toLowerCase;
    private javax.swing.JButton toUpperCase;
    private javax.swing.JButton trim;
    // End of variables declaration//GEN-END:variables
}