/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesKelompok6IF3809.View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author A_CITRA
 */
public class KelolaRuangan_Pinjam extends javax.swing.JFrame implements View {

    /**
     * Creates new form KelolaRuangan_Pinjam
     */
    public KelolaRuangan_Pinjam() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_ruangan = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        btn_kembali = new javax.swing.JButton();
        btn_pinjam = new javax.swing.JButton();
        cb_tanggalpinjam = new javax.swing.JComboBox<>();
        cb_bulanpinjam = new javax.swing.JComboBox<>();
        cb_tahunpinjam = new javax.swing.JComboBox<>();
        cb_tanggalpengembalian = new javax.swing.JComboBox<>();
        cb_bulanpengembalian = new javax.swing.JComboBox<>();
        cb_tahunpengembalian = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Pinjam Ruangan");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Cari berdasarkan nomor");

        btn_cari.setBackground(new java.awt.Color(255, 102, 102));
        btn_cari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_cari.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari.setText("Cari");

        list_ruangan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        list_ruangan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_ruangan);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Nama Peminjam");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Tanggal Pinjam");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Tanggal Pengembalian");

        btn_kembali.setBackground(new java.awt.Color(255, 102, 102));
        btn_kembali.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_kembali.setForeground(new java.awt.Color(255, 255, 255));
        btn_kembali.setText("Kembali");

        btn_pinjam.setBackground(new java.awt.Color(255, 102, 102));
        btn_pinjam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_pinjam.setForeground(new java.awt.Color(255, 255, 255));
        btn_pinjam.setText("Pinjam");

        cb_tanggalpinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_bulanpinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_tahunpinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_tanggalpengembalian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_bulanpengembalian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_tahunpengembalian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_kembali)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addComponent(tf_cari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cari))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_tanggalpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cb_tanggalpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_bulanpengembalian, 0, 132, Short.MAX_VALUE)
                                            .addComponent(cb_bulanpinjam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(100, 100, 100)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_tahunpengembalian, 0, 142, Short.MAX_VALUE)
                                            .addComponent(cb_tahunpinjam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(tf_nama))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 220, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(330, 330, 330))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(200, 200, 200))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_cari)
                    .addComponent(tf_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_tanggalpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_bulanpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tahunpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_tanggalpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_bulanpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_tahunpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_kembali)
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_pinjam;
    private javax.swing.JComboBox<String> cb_bulanpengembalian;
    private javax.swing.JComboBox<String> cb_bulanpinjam;
    private javax.swing.JComboBox<String> cb_tahunpengembalian;
    private javax.swing.JComboBox<String> cb_tahunpinjam;
    private javax.swing.JComboBox<String> cb_tanggalpengembalian;
    private javax.swing.JComboBox<String> cb_tanggalpinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_ruangan;
    private javax.swing.JTextField tf_cari;
    private javax.swing.JTextField tf_nama;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showMessage(String m) {
        JOptionPane.showMessageDialog(this, m);
    }

    @Override
    public void setListener(ActionListener a) {
        btn_cari.addActionListener(a);
        btn_kembali.addActionListener(a);
        btn_pinjam.addActionListener(a);
    }

    public JButton getBtn_cari() {
        return btn_cari;
    }

    public void setBtn_cari(JButton btn_cari) {
        this.btn_cari = btn_cari;
    }

    public JButton getBtn_kembali() {
        return btn_kembali;
    }

    public void setBtn_kembali(JButton btn_kembali) {
        this.btn_kembali = btn_kembali;
    }

    public JButton getBtn_pinjam() {
        return btn_pinjam;
    }

    public void setBtn_pinjam(JButton btn_pinjam) {
        this.btn_pinjam = btn_pinjam;
    }

    public JList<String> getList_ruangan() {
        return list_ruangan;
    }

    public void setList_ruangan(JList<String> list_ruangan) {
        this.list_ruangan = list_ruangan;
    }

    public JTextField getTf_cari() {
        return tf_cari;
    }

    public void setTf_cari(JTextField tf_cari) {
        this.tf_cari = tf_cari;
    }

    public JTextField getTf_nama() {
        return tf_nama;
    }

    public void setTf_nama(JTextField tf_nama) {
        this.tf_nama = tf_nama;
    }

    public JComboBox<String> getCb_bulanpengembalian() {
        return cb_bulanpengembalian;
    }

    public void setCb_bulanpengembalian(JComboBox<String> cb_bulanpengembalian) {
        this.cb_bulanpengembalian = cb_bulanpengembalian;
    }

    public JComboBox<String> getCb_bulanpinjam() {
        return cb_bulanpinjam;
    }

    public void setCb_bulanpinjam(JComboBox<String> cb_bulanpinjam) {
        this.cb_bulanpinjam = cb_bulanpinjam;
    }

    public JComboBox<String> getCb_tahunpengembalian() {
        return cb_tahunpengembalian;
    }

    public void setCb_tahunpengembalian(JComboBox<String> cb_tahunpengembalian) {
        this.cb_tahunpengembalian = cb_tahunpengembalian;
    }

    public JComboBox<String> getCb_tahunpinjam() {
        return cb_tahunpinjam;
    }

    public void setCb_tahunpinjam(JComboBox<String> cb_tahunpinjam) {
        this.cb_tahunpinjam = cb_tahunpinjam;
    }

    public JComboBox<String> getCb_tanggalpengembalian() {
        return cb_tanggalpengembalian;
    }

    public void setCb_tanggalpengembalian(JComboBox<String> cb_tanggalpengembalian) {
        this.cb_tanggalpengembalian = cb_tanggalpengembalian;
    }

    public JComboBox<String> getCb_tanggalpinjam() {
        return cb_tanggalpinjam;
    }

    public void setCb_tanggalpinjam(JComboBox<String> cb_tanggalpinjam) {
        this.cb_tanggalpinjam = cb_tanggalpinjam;
    }

    
    
    
}
