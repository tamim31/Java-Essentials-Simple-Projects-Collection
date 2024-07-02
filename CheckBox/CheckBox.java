
package CheckBox;

import javax.swing.JOptionPane;

public class CheckBox extends javax.swing.JFrame {

    public CheckBox() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        b1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l1.setText("Shopping");

        c1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1.setForeground(new java.awt.Color(51, 0, 153));
        c1.setText("Mango");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c2.setForeground(new java.awt.Color(51, 0, 153));
        c2.setText("Jackfruit");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        c3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c3.setForeground(new java.awt.Color(51, 0, 153));
        c3.setText("Pizza");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c4.setForeground(new java.awt.Color(51, 0, 153));
        c4.setText("Pasta");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setText("Select food");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c2)
                                    .addComponent(c1)
                                    .addComponent(c3)
                                    .addComponent(c4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(b1)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(l1)
                .addGap(38, 38, 38)
                .addComponent(c1)
                .addGap(18, 18, 18)
                .addComponent(c2)
                .addGap(18, 18, 18)
                .addComponent(c3)
                .addGap(18, 18, 18)
                .addComponent(c4)
                .addGap(18, 18, 18)
                .addComponent(b1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
       if(c1.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c1.getText());
       }
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
        if(c2.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c2.getText());
       }
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
        if(c3.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c3.getText());
       }
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
        if(c4.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c4.getText());
       }
    }//GEN-LAST:event_c4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(c1.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c1.getText());
       }
        
        if(c2.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c2.getText());
       }
         if(c3.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c3.getText());
       }
        if(c4.isSelected())
       {
           JOptionPane.showMessageDialog(CheckBox.this,c4.getText());
       }
       
    }//GEN-LAST:event_b1ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
