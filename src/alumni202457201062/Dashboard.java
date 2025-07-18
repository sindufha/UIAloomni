package alumni202457201062;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        
        dashbor.setIconTextGap(16);
        bJurusan.setIconTextGap(16);
        bKelas.setIconTextGap(16);
        bGuru.setIconTextGap(16);
        bSiswa.setIconTextGap(16);
        bAbout.setIconTextGap(16);
        bLogout.setIconTextGap(16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Sidebar = new javax.swing.JPanel();
        dashbor = new javax.swing.JButton();
        bJurusan = new javax.swing.JButton();
        bGuru = new javax.swing.JButton();
        bKelas = new javax.swing.JButton();
        bSiswa = new javax.swing.JButton();
        bAbout = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Sidebar.setBackground(new java.awt.Color(0, 153, 204));

        dashbor.setBackground(new java.awt.Color(0, 153, 204));
        dashbor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dashbor.setForeground(new java.awt.Color(255, 255, 255));
        dashbor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-dashboard-20.png"))); // NOI18N
        dashbor.setText("Dasbor");
        dashbor.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 5));
        dashbor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashbor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashborActionPerformed(evt);
            }
        });

        bJurusan.setBackground(new java.awt.Color(0, 153, 204));
        bJurusan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bJurusan.setForeground(new java.awt.Color(255, 255, 255));
        bJurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-college-20.png"))); // NOI18N
        bJurusan.setText("Jurusan");
        bJurusan.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 1));
        bJurusan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJurusanActionPerformed(evt);
            }
        });

        bGuru.setBackground(new java.awt.Color(0, 153, 204));
        bGuru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bGuru.setForeground(new java.awt.Color(255, 255, 255));
        bGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-teacher-20.png"))); // NOI18N
        bGuru.setText("Guru");
        bGuru.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 1));
        bGuru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuruActionPerformed(evt);
            }
        });

        bKelas.setBackground(new java.awt.Color(0, 153, 204));
        bKelas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bKelas.setForeground(new java.awt.Color(255, 255, 255));
        bKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-class-20.png"))); // NOI18N
        bKelas.setText("Kelas");
        bKelas.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 1));
        bKelas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKelasActionPerformed(evt);
            }
        });

        bSiswa.setBackground(new java.awt.Color(0, 153, 204));
        bSiswa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSiswa.setForeground(new java.awt.Color(255, 255, 255));
        bSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-person-20.png"))); // NOI18N
        bSiswa.setText("Siswa");
        bSiswa.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 1));
        bSiswa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiswaActionPerformed(evt);
            }
        });

        bAbout.setBackground(new java.awt.Color(0, 153, 204));
        bAbout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bAbout.setForeground(new java.awt.Color(255, 255, 255));
        bAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-about-20.png"))); // NOI18N
        bAbout.setText("About");
        bAbout.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 1));
        bAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAboutActionPerformed(evt);
            }
        });

        bLogout.setBackground(new java.awt.Color(0, 153, 204));
        bLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bLogout.setForeground(new java.awt.Color(255, 255, 255));
        bLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-logout-20.png"))); // NOI18N
        bLogout.setText("Logout");
        bLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 1));
        bLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-student-50.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aloomni");

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashbor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bJurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addComponent(dashbor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Content.setBackground(new java.awt.Color(255, 255, 255));
        Content.setLayout(new java.awt.CardLayout());

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-close-20 (1).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
               
    private void dashborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashborActionPerformed
        // TODO add your handling code here:
        Content.removeAll();
        Content.add(new PanelDashbor());
        Content.repaint();
        Content.revalidate();
    }//GEN-LAST:event_dashborActionPerformed
              
    private void bJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJurusanActionPerformed
        // TODO add your handling code here:
        Content.removeAll();
        Content.add(new PanelJurusan());
        Content.repaint();
        Content.revalidate();
    }//GEN-LAST:event_bJurusanActionPerformed

    private void bGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuruActionPerformed
        // TODO add your handling code here:
        Content.removeAll();
        Content.add(new PanelGuru());
        Content.repaint();
        Content.revalidate();
    }//GEN-LAST:event_bGuruActionPerformed

    private void bSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiswaActionPerformed
        // TODO add your handling code here:
        Content.removeAll();
        Content.add(new Panelsiswanew());
        Content.repaint();
        Content.revalidate();
    }//GEN-LAST:event_bSiswaActionPerformed

    private void bKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKelasActionPerformed
        // TODO add your handling code here:
        Content.removeAll();
        Content.add(new PanelKelas());
        Content.repaint();
        Content.revalidate();
    }//GEN-LAST:event_bKelasActionPerformed

    private void bAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAboutActionPerformed
        // TODO add your handling code here:
        Content.removeAll();
        Content.add(new PanelAbout());
        Content.repaint();
        Content.revalidate();
    }//GEN-LAST:event_bAboutActionPerformed
  
    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        // TODO add your handling code here:
        new Logout().setVisible(true);
        
    }//GEN-LAST:event_bLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton bAbout;
    private javax.swing.JButton bGuru;
    private javax.swing.JButton bJurusan;
    private javax.swing.JButton bKelas;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bSiswa;
    private javax.swing.JButton dashbor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
