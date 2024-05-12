
package simulation;

import javax.swing.ImageIcon;

public class SevenSegmentDisplay extends javax.swing.JFrame {

    public SevenSegmentDisplay() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dashboard = new javax.swing.JButton();
        a = new javax.swing.JToggleButton();
        b = new javax.swing.JToggleButton();
        c = new javax.swing.JToggleButton();
        d = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Created By : Vaibhavi Kale, Prijeksha Khairnar, Mayuri Khandagale, Mrunal Pote");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 228, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 8));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7447a.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("BCD TO SEVEN SEGMENT DECODER");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sd.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N

        dashboard.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        dashboard.setText("Dashboard");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

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

        c.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        c.setText("0");
        c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        d.setText("0");
        d.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a)
                            .addComponent(b)
                            .addComponent(c)
                            .addComponent(d))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dashboard)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(dashboard)
                .addGap(21, 21, 21))
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
public void simulate()
{
    String input1 = a.getText();
    String input2 = b.getText();
    String input3 = c.getText();
    String input4 = d.getText();
        if((input1.equals("1"))&& (input2.equals("0"))&& (input3.equals("0"))&& (input4.equals("0")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\1.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("0"))&& (input2.equals("1"))&& (input3.equals("0"))&& (input4.equals("0")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\2.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("1"))&& (input2.equals("1"))&& (input3.equals("0"))&& (input4.equals("0")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\3.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("0"))&& (input2.equals("0"))&& (input3.equals("1"))&& (input4.equals("0")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\4.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("1"))&& (input2.equals("0"))&& (input3.equals("1"))&& (input4.equals("0")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\5.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("0"))&& (input2.equals("1"))&& (input3.equals("1"))&& (input4.equals("0")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\6.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("1"))&& (input2.equals("1"))&& (input3.equals("1"))&& (input4.equals("0")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\7.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("0"))&& (input2.equals("0"))&& (input3.equals("0"))&& (input4.equals("1")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\8.png");
                jLabel4.setIcon(ic);
            }
        else if((input1.equals("1"))&& (input2.equals("0"))&& (input3.equals("0"))&& (input4.equals("1")))
            {
                ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\9.png");
                jLabel4.setIcon(ic);
            }
        else
        {
            ImageIcon ic = new ImageIcon("C:\\Users\\vaibhavi\\Documents\\NetBeansProjects\\simulation\\src\\images\\0.png");
                jLabel4.setIcon(ic);        }
}
    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dashboardActionPerformed

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

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        if(d.isSelected())
        {
            d.setText("1");
        }
        else
        {
            d.setText("0");
        }
        simulate();    }//GEN-LAST:event_dActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SevenSegmentDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton a;
    private javax.swing.JToggleButton b;
    private javax.swing.JToggleButton c;
    private javax.swing.JToggleButton d;
    private javax.swing.JButton dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
