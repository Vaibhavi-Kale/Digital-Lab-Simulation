
package simulation;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        not = new javax.swing.JButton();
        and = new javax.swing.JButton();
        or = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nand = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        xnor = new javax.swing.JButton();
        xor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        mux_2_1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mux_8_1 = new javax.swing.JButton();
        mux_4_1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bcdtosevensegmentdisplay = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        demux_1_2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        demux_1_8 = new javax.swing.JButton();
        demux_1_4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        srlatch = new javax.swing.JButton();
        srff = new javax.swing.JButton();
        dff = new javax.swing.JButton();
        jkff = new javax.swing.JButton();
        tff = new javax.swing.JButton();
        msjkff = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        halfadder = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        fulladder = new javax.swing.JButton();
        halfsubtractor = new javax.swing.JButton();
        fullsubtractor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Created By : Vaibhavi Kale, Prijeksha Khairnar, Mayuri Khandagale, Mrunal Pote");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 228, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 8));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/l.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("G. V. ACHARYA INSTITUTE OF ENGINEERING AND TECHNOLOGY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Shelu,Tal - Karjat, Dist - Raigad, Maharashtra.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("DIGITAL LAB SIMULATION");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Basic Gates");

        not.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        not.setForeground(new java.awt.Color(0, 51, 153));
        not.setText("NOT");
        not.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notActionPerformed(evt);
            }
        });

        and.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        and.setForeground(new java.awt.Color(0, 51, 153));
        and.setText("AND");
        and.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        and.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andActionPerformed(evt);
            }
        });

        or.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        or.setForeground(new java.awt.Color(0, 51, 153));
        or.setText("OR");
        or.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        or.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 253, 196));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nand.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nand.setForeground(new java.awt.Color(0, 51, 153));
        nand.setText("NAND");
        nand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nandActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Universal Gates");

        nor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nor.setForeground(new java.awt.Color(0, 51, 153));
        nor.setText("NOR");
        nor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(nand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(nand, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Derived Gates");

        xnor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        xnor.setForeground(new java.awt.Color(0, 51, 153));
        xnor.setText("XNOR");
        xnor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xnor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xnorActionPerformed(evt);
            }
        });

        xor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        xor.setForeground(new java.awt.Color(0, 51, 153));
        xor.setText("XOR");
        xor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(xor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xnor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(xnor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 253, 196));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        mux_2_1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mux_2_1.setForeground(new java.awt.Color(0, 51, 153));
        mux_2_1.setText("2 : 1 Mux");
        mux_2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mux_2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mux_2_1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Multiplexers");

        mux_8_1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mux_8_1.setForeground(new java.awt.Color(0, 51, 153));
        mux_8_1.setText("8 : 1 Mux");
        mux_8_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mux_8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mux_8_1ActionPerformed(evt);
            }
        });

        mux_4_1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mux_4_1.setForeground(new java.awt.Color(0, 51, 153));
        mux_4_1.setText("4 : 1 Mux");
        mux_4_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mux_4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mux_4_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mux_2_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mux_8_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mux_4_1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(16, 16, 16)
                .addComponent(mux_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mux_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mux_8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Decoder");

        bcdtosevensegmentdisplay.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bcdtosevensegmentdisplay.setForeground(new java.awt.Color(0, 51, 153));
        bcdtosevensegmentdisplay.setText("BCD to SEVEN SEGMENT DISPLAY");
        bcdtosevensegmentdisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bcdtosevensegmentdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcdtosevensegmentdisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(bcdtosevensegmentdisplay)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bcdtosevensegmentdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(153, 253, 196));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        demux_1_2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        demux_1_2.setForeground(new java.awt.Color(0, 51, 153));
        demux_1_2.setText("1 : 2 Demux");
        demux_1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        demux_1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demux_1_2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("De-Multiplexers");

        demux_1_8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        demux_1_8.setForeground(new java.awt.Color(0, 51, 153));
        demux_1_8.setText("1 : 8 Demux");
        demux_1_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        demux_1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demux_1_8ActionPerformed(evt);
            }
        });

        demux_1_4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        demux_1_4.setForeground(new java.awt.Color(0, 51, 153));
        demux_1_4.setText("1 : 4 Demux");
        demux_1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        demux_1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demux_1_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(demux_1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(demux_1_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(demux_1_4))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(70, 70, 70))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(demux_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demux_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(demux_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel8.setBackground(new java.awt.Color(102, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Sequenticial Circuits");

        srlatch.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        srlatch.setForeground(new java.awt.Color(0, 51, 153));
        srlatch.setText("SR LATCH");
        srlatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srlatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srlatchActionPerformed(evt);
            }
        });

        srff.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        srff.setForeground(new java.awt.Color(0, 51, 153));
        srff.setText("SR FLIP-FLOP");
        srff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srffActionPerformed(evt);
            }
        });

        dff.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        dff.setForeground(new java.awt.Color(0, 51, 153));
        dff.setText("D FLIP-FLOP");
        dff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dffActionPerformed(evt);
            }
        });

        jkff.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jkff.setForeground(new java.awt.Color(0, 51, 153));
        jkff.setText("  JK FLIP-FLOP");
        jkff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jkff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkffActionPerformed(evt);
            }
        });

        tff.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        tff.setForeground(new java.awt.Color(0, 51, 153));
        tff.setText("T FLIP-FLOP");
        tff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffActionPerformed(evt);
            }
        });

        msjkff.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        msjkff.setForeground(new java.awt.Color(0, 51, 153));
        msjkff.setText("MASTER SLAVE");
        msjkff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        msjkff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msjkffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjkff)
                .addGap(200, 200, 200))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(srlatch)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jkff)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(dff))
                            .addComponent(srff)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(tff)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srlatch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dff, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jkff, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tff, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msjkff, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(153, 253, 196));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        halfadder.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        halfadder.setForeground(new java.awt.Color(0, 51, 153));
        halfadder.setText("HALF ADDER");
        halfadder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        halfadder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfadderActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Combinational Circuits");

        fulladder.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        fulladder.setForeground(new java.awt.Color(0, 51, 153));
        fulladder.setText("FULL ADDER");
        fulladder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fulladder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fulladderActionPerformed(evt);
            }
        });

        halfsubtractor.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        halfsubtractor.setForeground(new java.awt.Color(0, 51, 153));
        halfsubtractor.setText("HALF SUBSTRACTOR");
        halfsubtractor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        halfsubtractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfsubtractorActionPerformed(evt);
            }
        });

        fullsubtractor.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        fullsubtractor.setForeground(new java.awt.Color(0, 51, 153));
        fullsubtractor.setText("FULL SUBSTRACTOR");
        fullsubtractor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fullsubtractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullsubtractorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel12))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(halfadder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fulladder, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(halfsubtractor)
                            .addComponent(fullsubtractor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(halfadder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fulladder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(halfsubtractor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullsubtractor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel13.setText("Project Created By : ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel14.setText("Vaibhavi Kale");

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel15.setText("Mayuri Khandagale");

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel16.setText("Mrunal Pote");

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel17.setText("Prijeksha Khairnar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(233, 233, 233)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)))
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notActionPerformed
        NOT not = new NOT();
        not.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_notActionPerformed

    private void nandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nandActionPerformed
        NAND nand = new NAND();
        nand.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nandActionPerformed

    private void andActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andActionPerformed
        AND and = new AND();
        and.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_andActionPerformed

    private void orActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orActionPerformed
        OR or = new OR();
        or.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_orActionPerformed

    private void norActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norActionPerformed
        NOR nor = new NOR();
        nor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_norActionPerformed

    private void xnorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xnorActionPerformed
        XNOR xnor = new XNOR();
        xnor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_xnorActionPerformed

    private void xorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xorActionPerformed
        XOR xor = new XOR();
        xor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_xorActionPerformed

    private void mux_2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mux_2_1ActionPerformed
        Mux_2_1 mux_2_1 = new Mux_2_1();
        mux_2_1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mux_2_1ActionPerformed

    private void mux_8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mux_8_1ActionPerformed
        Mux_8_1 mux_8_1 = new Mux_8_1();
        mux_8_1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mux_8_1ActionPerformed

    private void mux_4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mux_4_1ActionPerformed
        Mux_4_1 mux_4_1 = new Mux_4_1();
        mux_4_1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mux_4_1ActionPerformed

    private void bcdtosevensegmentdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcdtosevensegmentdisplayActionPerformed
        SevenSegmentDisplay ssd = new SevenSegmentDisplay();
        ssd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bcdtosevensegmentdisplayActionPerformed

    private void demux_1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demux_1_2ActionPerformed
        Demux_1_2 demux_1_2 = new Demux_1_2();
        demux_1_2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_demux_1_2ActionPerformed

    private void demux_1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demux_1_8ActionPerformed
        Demux_1_8 demux_1_8 = new Demux_1_8();
        demux_1_8.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_demux_1_8ActionPerformed

    private void demux_1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demux_1_4ActionPerformed
        Demux_1_4 demux_1_4 = new Demux_1_4();
        demux_1_4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_demux_1_4ActionPerformed

    private void srlatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srlatchActionPerformed
        SR_Latch srlatch = new SR_Latch();
        srlatch.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_srlatchActionPerformed

    private void srffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srffActionPerformed
        SR_FlipFlop srff = new SR_FlipFlop();
        srff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_srffActionPerformed

    private void dffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dffActionPerformed
        D_FlipFlop dff = new D_FlipFlop();
        dff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dffActionPerformed

    private void jkffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkffActionPerformed
        JK_FlipFlop jkff = new JK_FlipFlop();
        jkff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jkffActionPerformed

    private void tffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffActionPerformed
        T_FlipFlop tff = new T_FlipFlop();
        tff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tffActionPerformed

    private void msjkffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msjkffActionPerformed
        MasterSlave_FlipFlop msjkff = new MasterSlave_FlipFlop();
        msjkff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_msjkffActionPerformed

    private void halfadderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfadderActionPerformed
        HalfAdder halfadder = new HalfAdder();
        halfadder.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_halfadderActionPerformed

    private void fulladderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fulladderActionPerformed
        FullAdder1 fulladder = new FullAdder1();
        fulladder.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fulladderActionPerformed

    private void halfsubtractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfsubtractorActionPerformed
        HalfSubtractor halfsubtractor = new HalfSubtractor();
        halfsubtractor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_halfsubtractorActionPerformed

    private void fullsubtractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullsubtractorActionPerformed
        FullSubtractor fullsubtractor = new FullSubtractor();
        fullsubtractor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fullsubtractorActionPerformed
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton and;
    private javax.swing.JButton bcdtosevensegmentdisplay;
    private javax.swing.JButton demux_1_2;
    private javax.swing.JButton demux_1_4;
    private javax.swing.JButton demux_1_8;
    private javax.swing.JButton dff;
    private javax.swing.JButton fulladder;
    private javax.swing.JButton fullsubtractor;
    private javax.swing.JButton halfadder;
    private javax.swing.JButton halfsubtractor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jkff;
    private javax.swing.JButton msjkff;
    private javax.swing.JButton mux_2_1;
    private javax.swing.JButton mux_4_1;
    private javax.swing.JButton mux_8_1;
    private javax.swing.JButton nand;
    private javax.swing.JButton nor;
    private javax.swing.JButton not;
    private javax.swing.JButton or;
    private javax.swing.JButton srff;
    private javax.swing.JButton srlatch;
    private javax.swing.JButton tff;
    private javax.swing.JButton xnor;
    private javax.swing.JButton xor;
    // End of variables declaration//GEN-END:variables
}
