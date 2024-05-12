
package simulation;

public class FullSubtractor extends javax.swing.JFrame {

    public FullSubtractor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a = new javax.swing.JToggleButton();
        b = new javax.swing.JToggleButton();
        borrow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        c = new javax.swing.JToggleButton();
        diff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Created By : Vaibhavi Kale, Prijeksha Khairnar, Mayuri Khandagale, Mrunal Pote");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 228, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 8));

        a.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        a.setText("0");
        a.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        b.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b.setText("0");
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        borrow.setBackground(new java.awt.Color(0, 0, 0));
        borrow.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        borrow.setForeground(new java.awt.Color(255, 51, 51));
        borrow.setText("0");
        borrow.setBorder(null);
        borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full subt.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("FULL SUBTRACTOR");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full sub- Truth-Table.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        c.setText("0");
        c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        diff.setBackground(new java.awt.Color(0, 0, 0));
        diff.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        diff.setForeground(new java.awt.Color(255, 51, 51));
        diff.setText("0");
        diff.setBorder(null);
        diff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diff, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(454, 454, 454))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(523, 523, 523)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(diff, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b)
                        .addGap(169, 169, 169)
                        .addComponent(c)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
       if(a.isSelected())
       {
           a.setText("1");
       }
       else
       {
            a.setText("0");
       }
       simulate();
        
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        if(b.isSelected())
       {
           b.setText("1");
       }
       else
        {
            b.setText("0");
        }
        simulate();
    }//GEN-LAST:event_bActionPerformed

    private void borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowActionPerformed
        
        
    }//GEN-LAST:event_borrowActionPerformed

    public void simulate()
    {
        String input1 = a.getText();
        String input2 = b.getText();
        String input3 = c.getText();
        //1
        if((input1.equals("0"))&& (input2.equals("0")) && (input3.equals("0")))
            {
                diff.setText("0");
                borrow.setText("0");
            }
        //2
        else 
            if((input1.equals("0"))&& (input2.equals("0")) && (input3.equals("1")))
            {
                diff.setText("1");
                borrow.setText("1");
            }
        //3
        else 
            if((input1.equals("0"))&& (input2.equals("1")) && (input3.equals("0")))
            {
                diff.setText("1");
                borrow.setText("1");
            }
        //4
        else 
            if((input1.equals("0"))&& (input2.equals("1")) && (input3.equals("1")))
            {
                diff.setText("0");
                borrow.setText("1");
            }
        //5
        else 
            if((input1.equals("1"))&& (input2.equals("0")) && (input3.equals("0")))
            {
                diff.setText("1");
                borrow.setText("0");
            }
        //6
        else 
            if((input1.equals("1"))&& (input2.equals("0")) && (input3.equals("1")))
            {
                diff.setText("0");
                borrow.setText("0");
            }    
        //7
        else 
            if((input1.equals("1"))&& (input2.equals("1")) && (input3.equals("0")))
            {
                diff.setText("0");
                borrow.setText("0");
            }
        //8    
        else 
            if((input1.equals("1"))&& (input2.equals("1")) && (input3.equals("1")))
            {
                diff.setText("1");
                borrow.setText("1");
            }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Dashboard dashboard = new Dashboard();
       dashboard.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
       if(c.isSelected())
       {
           c.setText("1");
       }
       else
       {
            c.setText("0");
       }
       simulate();
    }//GEN-LAST:event_cActionPerformed

    private void diffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diffActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FullSubtractor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton a;
    private javax.swing.JToggleButton b;
    private javax.swing.JButton borrow;
    private javax.swing.JToggleButton c;
    private javax.swing.JButton diff;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
