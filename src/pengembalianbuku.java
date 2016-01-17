import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import pbo_koneksi.koneksi;

import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pbo_koneksi.koneksi;



   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class pengembalianbuku extends javax.swing.JFrame {
     public static pengembalianbuku instance;
    
    public static pengembalianbuku getInstance()
    {
        if (instance == null)
        {
            instance = new pengembalianbuku();
        }
        instance.setDefaultCloseOperation(HIDE_ON_CLOSE);
        return instance;
    }

   
    public pengembalianbuku() {
         
        initComponents();
        dtp_tgl_kembali.addPropertyChangeListener(tgl_kembali_change);
        awal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_npm = new javax.swing.JTextField();
        txt_judul = new javax.swing.JTextField();
        txt_pengarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_lama_pinjam = new javax.swing.JTextField();
        txt_denda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dtp_tgl_pinjam = new com.toedter.calendar.JDateChooser();
        dtp_tgl_kembali = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txt_no_peminjaman = new javax.swing.JTextField();
        btn_cari_peminjaman = new javax.swing.JButton();
        txt_no_pengembalian = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setText("Nama         :");

        jLabel2.setText("NPM           :");

        jLabel3.setText("Judul Buku :");

        jLabel4.setText("Pengarang :");

        txt_pengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pengarangActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal peminjaman     : ");

        jLabel6.setText("Tanggal Pengembalian  :");

        jLabel7.setText("Total Lama Pinjam         :");

        jLabel8.setText("Denda                           :");

        txt_denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dendaActionPerformed(evt);
            }
        });

        jLabel9.setText("Cari   :");

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Pengembalian", "Nama", "NPM", "Judul Buku", "Pengarang", "Tanggal Peminjaman", "Tanggal Pengembalian", "Total Lama Pinjam", "Denda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\tugas besar pbo\\gambar pbo\\SAVE.png")); // NOI18N
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\tugas besar pbo\\gambar pbo\\CANCEL.png")); // NOI18N
        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\tugas besar pbo\\gambar pbo\\delete.png")); // NOI18N
        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        dtp_tgl_kembali.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dtp_tgl_kembaliFocusLost(evt);
            }
        });

        jLabel10.setText("No. Peminjaman ");

        btn_cari_peminjaman.setText("Cari");
        btn_cari_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_peminjamanActionPerformed(evt);
            }
        });

        jLabel11.setText("No. Pengembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_pengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txt_judul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txt_npm, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dtp_tgl_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_lama_pinjam)
                                    .addComponent(dtp_tgl_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_denda, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_no_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cari_peminjaman)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_no_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_no_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari_peminjaman)
                    .addComponent(jLabel11)
                    .addComponent(txt_no_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_npm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dtp_tgl_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(dtp_tgl_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_lama_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_denda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String no_pengembalian = txt_no_pengembalian.getText();
        String nama = txt_nama.getText();
        String npm = txt_npm.getText();
        String judulbuku = txt_judul.getText();
        String pengarang = txt_pengarang.getText(); 
        int lamapinjam = Integer.parseInt(txt_lama_pinjam.getText());
        int denda = Integer.parseInt(txt_denda.getText());
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String tgl_pinjam = dateformat.format(dtp_tgl_pinjam.getDate());
        String tgl_kembali = dateformat.format(dtp_tgl_kembali.getDate());
        
         try
        {
            // menjalankan perintah simpan data ke database
            try (Connection conn = koneksi.getConnection())
            { 
               PreparedStatement stmt;
               stmt = conn.prepareStatement("insert into tbl_kembali (no_pengembalian,nama,npm,judulbuku,pengarang,tgl_pinjam,tgl_kembali,lamapinjam,denda) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
               stmt.setString(1, no_pengembalian);
               stmt.setString(2, nama);
               stmt.setString(3, npm);
               stmt.setString(4, judulbuku);
               stmt.setString(5, pengarang);
               stmt.setString(6, tgl_pinjam);
               stmt.setString(7, tgl_kembali);
               stmt.setInt(8, lamapinjam);
               stmt.setInt(9, denda);
               stmt.execute();
               JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
               awal();
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
         
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        awal();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int[] index = jTable1.getSelectedRows();
        String no_pengembalian = jTable1.getModel().getValueAt(index[0], 0).toString();
        try
        {
            try (Connection conn = koneksi.getConnection())
            {
                // query untuk menghapus data data dari tabel tbl_pinjam
                PreparedStatement stmt = conn.prepareStatement("delete from tbl_kembali where no_pengembalian = ?");
                stmt.setString(1, no_pengembalian);
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                awal();
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_pengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pengarangActionPerformed

    private void txt_dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dendaActionPerformed

    private void btn_cari_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_peminjamanActionPerformed
        try
        {
            try (Connection conn = koneksi.getConnection())
            {
                // query untuk memanggil data dari tabel tbl_pinjam berdasarkan kode buku dan judul dan kd_buku
                PreparedStatement stmt = conn.prepareStatement("select * from tbl_pinjam where nopeminjaman = '" + txt_no_peminjaman.getText() + "'");
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) // jika data tbl_pinjam ditemukan
                {
                    txt_nama.setText(rs.getString("nama"));
                    txt_npm.setText(rs.getString("npm"));
                    txt_judul.setText(rs.getString("judul"));
                    txt_pengarang.setText(rs.getString("pengarang"));
                    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date tgl_pinjam = dateformat.parse(rs.getString("tgl_pinjam"));
                    dtp_tgl_pinjam.setDate(tgl_pinjam);
                }
                else // jika tidak ditemukan
                {
                    JOptionPane.showMessageDialog(null, "No. Peminjaman tidak ditemukan");
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_cari_peminjamanActionPerformed

    private void dtp_tgl_kembaliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dtp_tgl_kembaliFocusLost
         
    }//GEN-LAST:event_dtp_tgl_kembaliFocusLost

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // mengambil data dari database untuk di tampilkan ke tabel
        try
        {
            try (Connection conn = koneksi.getConnection())
            {
                // query untuk memanggil data dari tabel tbl_pinjam
                PreparedStatement stmt = conn.prepareStatement("select * from tbl_kembali where no_pengembalian like '%" + jTextField9.getText() + "%' or npm like '%" + jTextField9.getText() + "%' or nama like '%" + jTextField9.getText() + "%'");
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                while (rs.next())
                {
                    Object[] obj = new Object[9];
                    obj[0] = rs.getString("no_pengembalian");
                    obj[1] = rs.getString("nama");
                    obj[2] = rs.getString("npm");
                    obj[3] = rs.getString("judulbuku");
                    obj[4] = rs.getString("pengarang");
                    obj[5] = rs.getString("tgl_pinjam");
                    obj[6] = rs.getString("tgl_kembali");
                    obj[7] = rs.getString("lamapinjam");
                    obj[8] = rs.getString("denda");
                    model.addRow(obj);
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    PropertyChangeListener tgl_kembali_change = new PropertyChangeListener() {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
         try {
              java.util.Date tgl_pinjam = dtp_tgl_pinjam.getDate();
              java.util.Date tgl_kembali = dtp_tgl_kembali.getDate();
              
              long Hari1 = tgl_pinjam.getTime();
              long Hari2 = tgl_kembali.getTime();
              long diff = Hari2-Hari1;
              long lama = diff / (24*60*60*1000);
              txt_lama_pinjam.setText(Long.toString(lama));
              long denda = 0;
              if (lama > 5)
              {
                  denda = (lama - 5) * 5000;
              }
              txt_denda.setText(Long.toString(denda));
              //lamapinjam.setText(Long.toString(diff));
             
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        }
    };
    
    private void awal()             
    {
        // mengkosongkan isian pada form
        txt_nama.setText("");
        txt_npm.setText("");
        txt_judul.setText("");
        txt_pengarang.setText("");
        txt_lama_pinjam.setText("");
        txt_denda.setText("");
        
        // mengambil data dari database untuk di tampilkan ke tabel
        try
        {
            try (Connection conn = koneksi.getConnection())
            {
                // query untuk memanggil data dari tabel tbl_pinjam
                PreparedStatement stmt = conn.prepareStatement("select * from tbl_kembali");
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                while (rs.next())
                {
                    Object[] obj = new Object[9];
                    obj[0] = rs.getString("no_pengembalian");
                    obj[1] = rs.getString("nama");
                    obj[2] = rs.getString("npm");
                    obj[3] = rs.getString("judulbuku");
                    obj[4] = rs.getString("pengarang");
                    obj[5] = rs.getString("tgl_pinjam");
                    obj[6] = rs.getString("tgl_kembali");
                    obj[7] = rs.getString("lamapinjam");
                    obj[8] = rs.getString("denda");
                    model.addRow(obj);
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
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
            java.util.logging.Logger.getLogger(pengembalianbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembalianbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembalianbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalianbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalianbuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari_peminjaman;
    private com.toedter.calendar.JDateChooser dtp_tgl_kembali;
    private com.toedter.calendar.JDateChooser dtp_tgl_pinjam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txt_denda;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_lama_pinjam;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no_peminjaman;
    private javax.swing.JTextField txt_no_pengembalian;
    private javax.swing.JTextField txt_npm;
    private javax.swing.JTextField txt_pengarang;
    // End of variables declaration//GEN-END:variables

}
