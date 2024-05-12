
package simulation;

public class Demux_1_4 extends javax.swing.JFrame {

    public Demux_1_4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        d = new javax.swing.JToggleButton();
        s1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        y0 = new javax.swing.JButton();
        y3 = new javax.swing.JButton();
        y1 = new javax.swing.JButton();
        y2 = new javax.swing.JButton();
        s0 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Created By : Vaibhavi Kale, Prijeksha Khairnar, Mayuri Khandagale, Mrunal Pote");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 228, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 8));

        d.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        d.setText("0");
        d.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1 4 dmux.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("1 : 4 DEMULTIPLEXER");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1 4 demux- Truth-Table - .png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        y0.setBackground(new java.awt.Color(0, 0, 0));
        y0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        y0.setForeground(new java.awt.Color(255, 51, 51));
        y0.setText("0");
        y0.setBorder(null);
        y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y0ActionPerformed(evt);
            }
        });

        y3.setBackground(new java.awt.Color(0, 0, 0));
        y3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        y3.setForeground(new java.awt.Color(255, 51, 51));
        y3.setText("0");
        y3.setBorder(null);
        y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y3ActionPerformed(evt);
            }
        });

        y1.setBackground(new java.awt.Color(0, 0, 0));
        y1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        y1.setForeground(new java.awt.Color(255, 51, 51));
        y1.setText("0");
        y1.setBorder(null);
        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });

        y2.setBackground(new java.awt.Color(0, 0, 0));
        y2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        y2.setForeground(new java.awt.Color(255, 51, 51));
        y2.setText("0");
        y2.setBorder(null);
        y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(421, 421, 421))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(d)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(s1)
                .addGap(42, 42, 42)
                .addComponent(s0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(d))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(y0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s0)
                            .addComponent(s1))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton3)
                .addGap(23, 23, 23))
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

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
       if(d.isSelected())
       {
           d.setText("1");
       }
       else
       {
            d.setText("0");
       }
       simulate();
        
    }//GEN-LAST:event_dActionPerformed

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

    public void simulate()
    {
        String input1 = s1.getText();
        String input2 = s0.getText();
        String input3 = d.getText();
        //1
        if((input1.equals("0"))&& (input2.equals("0")) && (input3.equals("0")))
            {
                y0.setText("0");
                y1.setText("0");
                y2.setText("0");
                y3.setText("0");
            }
        //2
        else 
        if((input1.equals("0"))&& (input2.equals("0")) && (input3.equals("1")))
            {
                y0.setText("1");
                y1.setText("0");
                y2.setText("0");
                y3.setText("0");
            }
        //3
        else 
        if((input1.equals("0"))&& (input2.equals("1")) && (input3.equals("0")))
            {
                y0.setText("0");
                y1.setText("0");
                y2.setText("0");
                y3.setText("0");
            }
        //4
        else 
        if((input1.equals("0"))&& (input2.equals("1")) && (input3.equals("1")))
            {
                y0.setText("0");
                y1.setText("1");
                y2.setText("0");
                y3.setText("0");
            }
       //5
        else 
        if((input1.equals("1"))&& (input2.equals("0")) && (input3.equals("0")))
            {
                y0.setText("0");
                y1.setText("0");
                y2.setText("0");
                y3.setText("0");
            }
       //6
        else 
        if((input1.equals("1"))&& (input2.equals("0")) && (input3.equals("1")))
            {
                y0.setText("0");
                y1.setText("0");
                y2.setText("1");
                y3.setText("0");
            }       
       //7
        else 
        if((input1.equals("1"))&& (input2.equals("1")) && (input3.equals("0")))
            {
                y0.setText("0");
                y1.setText("0");
                y2.setText("0");
                y3.setText("0");
            }        
       //8
        else 
        if((input1.equals("1"))&& (input2.equals("1")) && (input3.equals("1")))
            {
                y0.setText("0");
                y1.setText("0");
                y2.setText("0");
                y3.setText("1");
            }        
       
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Dashboard dashboard = new Dashboard();
       dashboard.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y0ActionPerformed

    private void y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y3ActionPerformed

    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y1ActionPerformed

    private void y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y2ActionPerformed

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


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demux_1_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton d;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton s0;
    private javax.swing.JToggleButton s1;
    private javax.swing.JButton y0;
    private javax.swing.JButton y1;
    private javax.swing.JButton y2;
    private javax.swing.JButton y3;
    // End of variables declaration//GEN-END:variables
}
