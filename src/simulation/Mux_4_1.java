
package simulation;

public class Mux_4_1 extends javax.swing.JFrame {

    public Mux_4_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        d1 = new javax.swing.JToggleButton();
        s0 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        y = new javax.swing.JButton();
        d0 = new javax.swing.JToggleButton();
        d2 = new javax.swing.JToggleButton();
        d3 = new javax.swing.JToggleButton();
        s1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Created By : Vaibhavi Kale, Yojana Killedar, Yugant Nikumbh");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 228, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 8));

        d1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        d1.setText("0");
        d1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        s0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        s0.setText("0");
        s0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s0ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4 1 mux .png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("4 : 1 MULTIPLEXER");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4 1 mux- Truth-Table - .png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        y.setBackground(new java.awt.Color(0, 0, 0));
        y.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        y.setForeground(new java.awt.Color(255, 51, 51));
        y.setText("0");
        y.setBorder(null);
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });

        d0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        d0.setText("0");
        d0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d0ActionPerformed(evt);
            }
        });

        d2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        d2.setText("0");
        d2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });

        d3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        d3.setText("0");
        d3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        s1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        s1.setText("0");
        s1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(d2)
                                    .addComponent(d0)
                                    .addComponent(d3)
                                    .addComponent(d1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(s1)
                                .addGap(53, 53, 53)
                                .addComponent(s0)
                                .addGap(182, 182, 182)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(421, 421, 421))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(d3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d0))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s0)
                    .addComponent(s1))
                .addGap(34, 34, 34)
                .addComponent(jButton3)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
       if(d1.isSelected())
       {
           d1.setText("1");
       }
       else
       {
            d1.setText("0");
       }
       simulate();
        
    }//GEN-LAST:event_d1ActionPerformed

    private void s0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s0ActionPerformed
        if(s0.isSelected())
       {
           s0.setText("1");
       }
       else
        {
            s0.setText("0");
        }
        simulate();
    }//GEN-LAST:event_s0ActionPerformed

    public void simulate()
    {
        String input1 = s1.getText();
        String input2 = s0.getText();
        String input3 = d3.getText();
        String input4 = d2.getText();       
        String input5 = d1.getText();
        String input6 = d0.getText();
        
        //1
        if((input1.equals("0"))&& (input2.equals("0")) && (input6.equals("0")))
            {
                y.setText("0");
            }
        //2
        else 
        if((input1.equals("0"))&& (input2.equals("0")) && (input6.equals("1")))
            {
                y.setText("1");
            }
        //3
        else 
        if((input1.equals("0"))&& (input2.equals("1")) && (input5.equals("0")))
            {
                y.setText("0");
            }
        //4
        else 
        if((input1.equals("0"))&& (input2.equals("1")) && (input5.equals("1")))
            {
                y.setText("1");
            }
       //5
        else 
        if((input1.equals("1"))&& (input2.equals("0")) && (input4.equals("0")))
            {
                y.setText("0");
            }
       //6
        else 
        if((input1.equals("1"))&& (input2.equals("0")) && (input4.equals("1")))
            {
                y.setText("1");
            }
       //7
        else 
        if((input1.equals("1"))&& (input2.equals("1")) && (input3.equals("0")))
            {
                y.setText("0");
            }
       //8
        else 
        if((input1.equals("1"))&& (input2.equals("1")) && (input3.equals("1")))
            {
                y.setText("1");
            }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Dashboard dashboard = new Dashboard();
       dashboard.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yActionPerformed

    private void d0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d0ActionPerformed
        if(d0.isSelected())
       {
           d0.setText("1");
       }
       else
        {
            d0.setText("0");
        }
        simulate();
    }//GEN-LAST:event_d0ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        if(d2.isSelected())
       {
           d2.setText("1");
       }
       else
        {
            d2.setText("0");
        }
        simulate();
    }//GEN-LAST:event_d2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        if(d3.isSelected())
       {
           d3.setText("1");
       }
       else
        {
            d3.setText("0");
        }
        simulate();
    }//GEN-LAST:event_d3ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        if(s1.isSelected())
       {
           s1.setText("1");
       }
       else
        {
            s1.setText("0");
        }
        simulate();
    }//GEN-LAST:event_s1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mux_4_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton d0;
    private javax.swing.JToggleButton d1;
    private javax.swing.JToggleButton d2;
    private javax.swing.JToggleButton d3;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton s0;
    private javax.swing.JToggleButton s1;
    private javax.swing.JButton y;
    // End of variables declaration//GEN-END:variables
}
