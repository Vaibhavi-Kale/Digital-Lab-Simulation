
package simulation;

public class JK_FlipFlop extends javax.swing.JFrame {

    public JK_FlipFlop() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        j = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        q = new javax.swing.JButton();
        k = new javax.swing.JToggleButton();
        qb = new javax.swing.JButton();
        clk = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Created By : Vaibhavi Kale, Prijeksha Khairnar, Mayuri Khandagale, Mrunal Pote");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 228, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 8));

        j.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        j.setText("0");
        j.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JK flip flop.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("JK FLIP FLOP");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JK flip flop- Truth-Table.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        q.setBackground(new java.awt.Color(0, 0, 0));
        q.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q.setForeground(new java.awt.Color(255, 51, 51));
        q.setText("0");
        q.setBorder(null);
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });

        k.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        k.setText("0");
        k.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });

        qb.setBackground(new java.awt.Color(0, 0, 0));
        qb.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        qb.setForeground(new java.awt.Color(255, 51, 51));
        qb.setText("0");
        qb.setBorder(null);
        qb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qbActionPerformed(evt);
            }
        });

        clk.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        clk.setText("0");
        clk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(267, 267, 267)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(k, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(clk, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(j))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qb, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(507, 507, 507))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(j)
                                    .addGap(54, 54, 54)
                                    .addComponent(clk)
                                    .addGap(79, 79, 79)
                                    .addComponent(k))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(qb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
       if(j.isSelected())
       {
           j.setText("1");
       }
       else
       {
            j.setText("0");
       }
       simulate();
        
    }//GEN-LAST:event_jActionPerformed

    public void simulate()
    {
        String clock = clk.getText();
        String input1 = j.getText();
        String input2 = k.getText();
        String input3 = q.getText();
        String input4 = qb.getText();
        //1
        if((clock.equals("1"))&&(input1.equals("0"))&& (input2.equals("0")))
            {
                q.setText(input3);
                qb.setText(input4);
            }
        //2
        else 
       if((clock.equals("1"))&&(input1.equals("0"))&& (input2.equals("1")))
            {
                q.setText("0");
                qb.setText("1");
            }
        //3
        else 
       if((clock.equals("1"))&&(input1.equals("1"))&& (input2.equals("0")))
            {
                q.setText("1");
                qb.setText("0");
            }
        //4
        else  
       if((clock.equals("1"))&&(input1.equals("1"))&& (input2.equals("1")))
            {
                q.setText(input4);
                qb.setText(input3);
            }
       else 
       if(clock.equals("0"))
            {
                q.setText("0");
                qb.setText("0");
            }
       
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Dashboard dashboard = new Dashboard();
       dashboard.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        if(k.isSelected())
       {
           k.setText("1");
       }
       else
        {
            k.setText("0");
        }
        simulate();
    }//GEN-LAST:event_kActionPerformed

    private void qbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qbActionPerformed

    private void clkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkActionPerformed
       if(clk.isSelected())
       {
           clk.setText("1");
       }
       else
        {
            clk.setText("0");
        }
        simulate();
    }//GEN-LAST:event_clkActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JK_FlipFlop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton clk;
    private javax.swing.JToggleButton j;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton k;
    private javax.swing.JButton q;
    private javax.swing.JButton qb;
    // End of variables declaration//GEN-END:variables
}
