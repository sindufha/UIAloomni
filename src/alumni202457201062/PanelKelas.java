package alumni202457201062;
import java.awt.HeadlessException;
import javax.swing.JComboBox;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelKelas extends javax.swing.JPanel {

    /**
     * Creates new form PanelJurusan
     */
    public PanelKelas() {
        initComponents();
        loadDatakelas();
        loadGuruToComboBox();
        loadtingkatanToComboBox();
        loadjurusanToComboBox();
        
        
    }
    void comboWali(){
        String sql = "SELECT * FROM guru";
    }
    String KodeJurusan(String NamaJurusan){
        try{
            String sql= "SELECT * FROM jurusan WHERE nama_jurusan =?";
            Connection conn = koneksi.konek();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,NamaJurusan);
            ResultSet resultSet =ps.executeQuery();
            while (resultSet.next()){
                return resultSet.getString("kode_jur");
            }
                   
        }catch(SQLException e){
            return "";
        }return "";
    }
    String NIP(String NamaGuru){
        try{
            String sql = "SELECT * FROM guru WHERE nama_guru=?";
            Connection conn = koneksi.konek();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,NamaGuru);
            ResultSet resultSet =ps.executeQuery();
            while (resultSet.next()){
                return resultSet.getString("kode_jur");
        }
    }catch(SQLException e){
        return"";
        
    }return"";
    }
    private void loadDatakelas(){
        DefaultTableModel model = (DefaultTableModel) tabelKelas.getModel();
    model.setRowCount(0); // hapus semua data lama di tabel

    try {
        Connection con = koneksi.konek();
        String sql = "SELECT * FROM kelas";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            String id_kelas = rs.getString("id_kelas");
            String nama_kelas = rs.getString("nama_kelas");
            String tingkatan = rs.getString("tingkatan");
            String kode_jur = rs.getString("kode_jur");
            String nip_wali_kelas = rs.getString("nip_wali_kelas");
            model.addRow(new Object[]{id_kelas,nama_kelas,tingkatan,kode_jur,nip_wali_kelas});
        }

        rs.close();
        st.close();
        con.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data: " + e.getMessage());
    }}
    
 public void loadGuruToComboBox() {
    cWali.removeAllItems(); // Kosongkan dulu
        
    try {
        Connection con = koneksi.konek(); // Panggil koneksi ke DB
        String sql = "SELECT nama_guru FROM guru"; // Ambil nama guru
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String namaGuru = rs.getString("nama_guru");
            cWali.addItem(namaGuru); // Tambahkan ke combo box
        }

        rs.close();
        ps.close();
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data guru: " + e.getMessage());
    }
}
 public void loadtingkatanToComboBox() {
    cTingkatan.removeAllItems(); // Kosongkan dulu

    try {
        Connection con = koneksi.konek(); // Panggil koneksi ke DB
        String sql = "SELECT tingkatan FROM kelas"; // Ambil nama guru
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String tingkatan = rs.getString("tingkatan");
            cTingkatan.addItem(tingkatan); 
        }

        rs.close();
        ps.close();
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data guru: " + e.getMessage());
    }
}
 public void loadjurusanToComboBox() {
    cJurusan.removeAllItems();

    try {
        Connection con = koneksi.konek(); 
        String sql = "SELECT kode_jur FROM kelas"; 
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String jurusan = rs.getString("kode_jur");
            cJurusan.addItem(jurusan); 
        }

        rs.close();
        ps.close();
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data guru: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        tKodeKelas = new javax.swing.JTextField();
        tNamaKelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cWali = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKelas = new javax.swing.JTable();
        cTingkatan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cJurusan = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setPreferredSize(new java.awt.Dimension(1107, 500));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-close-32 (2).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Kelas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Kode Kelas");

        bTambah.setBackground(new java.awt.Color(0, 153, 102));
        bTambah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bTambah.setForeground(new java.awt.Color(255, 255, 255));
        bTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-add-20.png"))); // NOI18N
        bTambah.setText("Tambah");
        bTambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Nama Kelas");

        bUbah.setBackground(new java.awt.Color(255, 153, 51));
        bUbah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bUbah.setForeground(new java.awt.Color(255, 255, 255));
        bUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-edit-20.png"))); // NOI18N
        bUbah.setText("Ubah");
        bUbah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bHapus.setBackground(new java.awt.Color(204, 51, 0));
        bHapus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bHapus.setForeground(new java.awt.Color(255, 255, 255));
        bHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-delete-20.png"))); // NOI18N
        bHapus.setText("Hapus");
        bHapus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bReset.setBackground(new java.awt.Color(0, 153, 255));
        bReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bReset.setForeground(new java.awt.Color(255, 255, 255));
        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201062/Gambar/icons8-reset-20 (1).png"))); // NOI18N
        bReset.setText("Reset");
        bReset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Tingkatan");

        cWali.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cWali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wali Kelas" }));
        cWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cWaliActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Wali Kelas");

        tabelKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode kelas", "Nama Kelas", "Tingkatan", "Jurusan", "Wali Kelas"
            }
        ));
        jScrollPane1.setViewportView(tabelKelas);

        cTingkatan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cTingkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        cTingkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTingkatanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Jurusan");

        cJurusan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TKJ", "TKR" }));
        cJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cJurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cWali, javax.swing.GroupLayout.Alignment.TRAILING, 0, 298, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(tKodeKelas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tNamaKelas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cTingkatan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(cJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tKodeKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cTingkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cWali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cWaliActionPerformed

    private void cJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cJurusanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        var parent = this.getParent();
        if (parent != null) {
        parent.remove(this);        // Hapus panel ini dari parent
        parent.revalidate();        // Perbarui layout
        parent.repaint();  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cTingkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTingkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTingkatanActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        // TODO add your handling code here:
        try {
            String kodeKelas = tKodeKelas.getText();
            String namaKelas = tNamaKelas.getText();
            String tingkatan = cTingkatan.getSelectedItem().toString();
            String jurusan = KodeJurusan(cJurusan.getSelectedItem().toString());
            String waliKelas = NIP(cWali.getSelectedItem().toString());
            String sql = "INSERT INTO kelas(id_kelas,nama_kelas,tingkatan,kode_jur,nip_wali_kelas) values (?,?,?,?,?)";
            Connection conn = koneksi.konek();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, kodeKelas);
            statement.setString(2, namaKelas);
            statement.setString(3, tingkatan);
            statement.setString(4, jurusan);
            statement.setString(5, waliKelas);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan!"); } 
    }//GEN-LAST:event_bTambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cJurusan;
    private javax.swing.JComboBox<String> cTingkatan;
    private javax.swing.JComboBox<String> cWali;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tKodeKelas;
    private javax.swing.JTextField tNamaKelas;
    private javax.swing.JTable tabelKelas;
    // End of variables declaration//GEN-END:variables
}
