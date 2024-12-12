package View;

import DAO.CaPheDAO;
import Model.CaPhe;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ThucDonJPanel extends javax.swing.JPanel {

    private File file;
    List<CaPhe> cpList = new ArrayList<>();
    DefaultTableModel tableModel;

    public ThucDonJPanel() {
        initComponents();
        tableModel = (DefaultTableModel) tblDanhSachThucDon.getModel();
        getData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialogThemCaPheMoi = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfTenCaPhe = new javax.swing.JTextField();
        jtfDonGia = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnThemVaoThucDon = new javax.swing.JButton();
        jlbHinhAnhCaPheMoi = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jlbMa = new javax.swing.JLabel();
        jtfMa = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jlbAnhDoUong3 = new javax.swing.JLabel();
        JDialogChinhSuaCaPhe = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSuaTen = new javax.swing.JTextField();
        txtSuaGia = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jlbSuaHinhAnh = new javax.swing.JLabel();
        btnChinhAnh = new javax.swing.JButton();
        btnSuaCapNhap = new javax.swing.JButton();
        btnSuaQuayLai = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtSuaMa = new javax.swing.JTextField();
        ThucDon = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnThemThucDon = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDanhSachThucDon = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        DonHang = new javax.swing.JPanel();
        JbnDonHang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        JDialogThemCaPheMoi.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel6.setText("Tên:");

        jLabel7.setText("Đơn giá:");

        jLabel8.setText("Danh mục:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn danh mục", "Cà phê đặc biệt", "Cà phê thường", "Cà phê lạnh", "Cà phê theo mùa" }));

        btnThemVaoThucDon.setBackground(new java.awt.Color(204, 204, 255));
        btnThemVaoThucDon.setText("Thêm vào thực đơn");
        btnThemVaoThucDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoThucDonActionPerformed(evt);
            }
        });

        jlbHinhAnhCaPheMoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHinhAnhCaPheMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cafe3.png"))); // NOI18N
        jlbHinhAnhCaPheMoi.setPreferredSize(new java.awt.Dimension(100, 150));

        btnChonAnh.setBackground(new java.awt.Color(204, 204, 255));
        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setText("Quay lại");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jlbMa.setText("Mã:");

        javax.swing.GroupLayout JDialogThemCaPheMoiLayout = new javax.swing.GroupLayout(JDialogThemCaPheMoi.getContentPane());
        JDialogThemCaPheMoi.getContentPane().setLayout(JDialogThemCaPheMoiLayout);
        JDialogThemCaPheMoiLayout.setHorizontalGroup(
            JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbMa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfTenCaPhe, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jtfDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfMa))
                        .addGap(30, 30, 30)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbHinhAnhCaPheMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnThemVaoThucDon)
                        .addGap(41, 41, 41)
                        .addComponent(jButton6)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        JDialogThemCaPheMoiLayout.setVerticalGroup(
            JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbMa)
                            .addComponent(jtfMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfTenCaPhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(JDialogThemCaPheMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemVaoThucDon)
                            .addComponent(jButton6)))
                    .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jlbHinhAnhCaPheMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChonAnh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Cà phê đen");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("30.000đ");

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit.png"))); // NOI18N

        jButton11.setBackground(new java.awt.Color(204, 204, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Delete.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jlbAnhDoUong3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbAnhDoUong3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cafe3.png"))); // NOI18N
        jlbAnhDoUong3.setPreferredSize(new java.awt.Dimension(100, 150));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(20, 20, 20))
            .addComponent(jlbAnhDoUong3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jlbAnhDoUong3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17))
        );

        jLabel4.setText("Tên:");

        jLabel5.setText("Đơn giá:");

        jLabel9.setText("Danh mục");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cà phê thường", "Cà phê theo mùa", "Cà phê đặc biệt", "Cà phê lạnh" }));

        jlbSuaHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSuaHinhAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cafe3.png"))); // NOI18N

        btnChinhAnh.setBackground(new java.awt.Color(255, 204, 255));
        btnChinhAnh.setText("Chọn ảnh");
        btnChinhAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhAnhActionPerformed(evt);
            }
        });

        btnSuaCapNhap.setBackground(new java.awt.Color(204, 204, 255));
        btnSuaCapNhap.setText("Cập nhập");
        btnSuaCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCapNhapActionPerformed(evt);
            }
        });

        btnSuaQuayLai.setBackground(new java.awt.Color(204, 204, 255));
        btnSuaQuayLai.setText("Quay lại");

        jLabel10.setText("Mã");

        javax.swing.GroupLayout JDialogChinhSuaCaPheLayout = new javax.swing.GroupLayout(JDialogChinhSuaCaPhe.getContentPane());
        JDialogChinhSuaCaPhe.getContentPane().setLayout(JDialogChinhSuaCaPheLayout);
        JDialogChinhSuaCaPheLayout.setHorizontalGroup(
            JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogChinhSuaCaPheLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSuaTen)
                    .addComponent(txtSuaGia)
                    .addComponent(jComboBox3, 0, 135, Short.MAX_VALUE)
                    .addComponent(txtSuaMa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDialogChinhSuaCaPheLayout.createSequentialGroup()
                        .addComponent(jlbSuaHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDialogChinhSuaCaPheLayout.createSequentialGroup()
                        .addComponent(btnChinhAnh)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDialogChinhSuaCaPheLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSuaCapNhap)
                .addGap(38, 38, 38)
                .addComponent(btnSuaQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        JDialogChinhSuaCaPheLayout.setVerticalGroup(
            JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogChinhSuaCaPheLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogChinhSuaCaPheLayout.createSequentialGroup()
                        .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtSuaMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSuaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSuaGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlbSuaHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnChinhAnh)))
                .addGap(44, 44, 44)
                .addGroup(JDialogChinhSuaCaPheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaQuayLai)
                    .addComponent(btnSuaCapNhap))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ThucDon.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(215, 208, 208));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("   Thực Đơn");

        jLabel2.setText("Bộ lọc:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Cà phê thường", "Cà phê lạnh", "Cà phê đặc biệt", "Cà phê theo mùa" }));

        btnThemThucDon.setBackground(new java.awt.Color(204, 204, 255));
        btnThemThucDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/them.png"))); // NOI18N
        btnThemThucDon.setText("Thêm thực đơn");
        btnThemThucDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThucDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemThucDon)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemThucDon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDanhSachThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "Đơn giá", "Hình ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachThucDon.setRowHeight(130);
        jScrollPane5.setViewportView(tblDanhSachThucDon);

        btnSua.setBackground(new java.awt.Color(255, 204, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sua.png"))); // NOI18N
        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 204, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 204, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm theo tên");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 204, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ThucDonLayout = new javax.swing.GroupLayout(ThucDon);
        ThucDon.setLayout(ThucDonLayout);
        ThucDonLayout.setHorizontalGroup(
            ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ThucDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThucDonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(25, 25, 25)
                .addComponent(btnSua)
                .addGap(25, 25, 25)
                .addComponent(btnXoa)
                .addGap(69, 69, 69))
        );
        ThucDonLayout.setVerticalGroup(
            ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThucDonLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );

        DonHang.setBackground(new java.awt.Color(255, 255, 255));

        JbnDonHang.setBackground(new java.awt.Color(215, 208, 208));
        JbnDonHang.setPreferredSize(new java.awt.Dimension(330, 109));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Đơn Hàng");

        javax.swing.GroupLayout JbnDonHangLayout = new javax.swing.GroupLayout(JbnDonHang);
        JbnDonHang.setLayout(JbnDonHangLayout);
        JbnDonHangLayout.setHorizontalGroup(
            JbnDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        JbnDonHangLayout.setVerticalGroup(
            JbnDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JbnDonHangLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "Yêu cầu đặc biệt", "Số lượng", "Đơn giá", "Tạm tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout DonHangLayout = new javax.swing.GroupLayout(DonHang);
        DonHang.setLayout(DonHangLayout);
        DonHangLayout.setHorizontalGroup(
            DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JbnDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(DonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        DonHangLayout.setVerticalGroup(
            DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonHangLayout.createSequentialGroup()
                .addComponent(JbnDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemThucDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThucDonActionPerformed
        JDialogThemCaPheMoi.setVisible(true);
        JDialogThemCaPheMoi.setTitle("Thêm vào thực đơn");
        JDialogThemCaPheMoi.setLocationRelativeTo(null);
        JDialogThemCaPheMoi.setSize(450, 300);
    }//GEN-LAST:event_btnThemThucDonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JDialogThemCaPheMoi.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        JFileChooser jfileChooser = new JFileChooser();
        jfileChooser.setMultiSelectionEnabled(false);
        int result = jfileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.file = jfileChooser.getSelectedFile();
            jlbHinhAnhCaPheMoi.setIcon(new ImageIcon(this.file.getAbsolutePath()));
        }
    }//GEN-LAST:event_btnChonAnhActionPerformed
    public void getData() {
        cpList = CaPheDAO.getAll();
        tableModel.setRowCount(0);
        for (CaPhe cp : cpList) {
            ImageIcon imageIcon = cp.getImage();
            tableModel.addRow(new Object[]{
                cp.getMaCaPhe(),
                cp.getTenCaPhe(),
                cp.getDonGia(),
                cp.getAnhMinhHoa()
            });
        }
        tblDanhSachThucDon.setModel(tableModel);
        tblDanhSachThucDon.getTableHeader().setReorderingAllowed(false);
        tblDanhSachThucDon.getColumnModel().getColumn(3).setCellRenderer(new ImageRender());

    }

    public class ImageRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel();
            if (value instanceof byte[]) {
                byte[] bytes = (byte[]) value;
                ImageIcon imageIcon = new ImageIcon(bytes);
                label.setIcon(imageIcon);
            } else if (value instanceof ImageIcon) {
                label.setIcon((ImageIcon) value); // Nếu value là ImageIcon, chỉ cần dùng nó
            } else {
                label.setText("No Image");
            }

            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            return label;
        }
    }
    private void btnThemVaoThucDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoThucDonActionPerformed
        try {
            String maCp = jtfMa.getText();
            String tenCP = jtfTenCaPhe.getText().trim();
            int Gia = Integer.parseInt(jtfDonGia.getText());
            CaPhe cp = new CaPhe(maCp, tenCP, Files.readAllBytes(this.file.toPath()), Gia);
            if (CaPheDAO.insert(cp)) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                getData();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm không thành công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_btnThemVaoThucDonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = tblDanhSachThucDon.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để chỉnh sửa!");
            return;
        }

        CaPhe cp = cpList.get(row);

        if (cp != null) {
            txtSuaMa.setText(cp.getMaCaPhe());
            txtSuaTen.setText(cp.getTenCaPhe());
            txtSuaGia.setText(String.valueOf(cp.getDonGia()));

            if (cp.getAnhMinhHoa() != null) {
                ImageIcon imageIcon = new ImageIcon(cp.getAnhMinhHoa());

                int labelWidth = jlbSuaHinhAnh.getWidth();
                int labelHeight = jlbSuaHinhAnh.getHeight();

                if (labelWidth == 0 || labelHeight == 0) {
                    labelWidth = 120;
                    labelHeight = 120;
                }
                Image scaledImage = imageIcon.getImage().getScaledInstance(
                        labelWidth, labelHeight, java.awt.Image.SCALE_SMOOTH);
                jlbSuaHinhAnh.setIcon(new ImageIcon(scaledImage));
            } else {
                jlbSuaHinhAnh.setIcon(null);
            }
        }

        JDialogChinhSuaCaPhe.setVisible(true);
        JDialogChinhSuaCaPhe.setTitle("Chỉnh sửa cà phê");
        JDialogChinhSuaCaPhe.setSize(450, 300);
        JDialogChinhSuaCaPhe.setLocationRelativeTo(null);
        txtSuaMa.setEnabled(false);


    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnChinhAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhAnhActionPerformed
        JFileChooser jfileChooser = new JFileChooser();
        jfileChooser.setMultiSelectionEnabled(false);
        int result = jfileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.file = jfileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(this.file.getAbsolutePath());
            jlbSuaHinhAnh.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(
                    jlbSuaHinhAnh.getWidth(), jlbSuaHinhAnh.getHeight(), java.awt.Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_btnChinhAnhActionPerformed

    private void btnSuaCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCapNhapActionPerformed
        String tenCP = txtSuaTen.getText().trim();
        String giaCPText = txtSuaGia.getText().trim();

        if (tenCP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên cà phê không được bỏ trống");
            return;
        }

        int donGia;
        try {
            donGia = Integer.parseInt(giaCPText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Đơn giá phải là một số và không được bỏ trống");
            return;
        }

        int row = tblDanhSachThucDon.getSelectedRow();
        if (row >= 0) {
            CaPhe cp = cpList.get(row);

            cp.setTenCaPhe(tenCP);
            cp.setDonGia(donGia);
            if (this.file != null) {
                try {
                    // Đọc file ảnh thành mảng byte
                    byte[] imageBytes = Files.readAllBytes(this.file.toPath());
                    cp.setAnhMinhHoa(imageBytes);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Lỗi khi đọc file hình ảnh");
                    return;
                }
            }

            if (CaPheDAO.update(cp)) {
                JOptionPane.showMessageDialog(this, "Sửa cà phê thành công");
                getData();
                JDialogChinhSuaCaPhe.setVisible(false);
                txtSuaMa.setText("");
                txtSuaTen.setText("");
                txtSuaGia.setText("");
                getData();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa cà phê thất bại");
            }
        }
    }//GEN-LAST:event_btnSuaCapNhapActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tblDanhSachThucDon.getSelectedRow();
        if (row >= 0) {
            CaPhe cp = cpList.get(row);
            int res = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa cà phê này không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == 0) {
                if(CaPheDAO.delete(cp.getMaCaPhe())){
                    JOptionPane.showMessageDialog(null, "Xóa thành công!");
                    getData();
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Xóa thất bại!");
                    getData();
                    return;
                }
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String tenCP = JOptionPane.showInputDialog(this, "Nhập tên cà phê cần tìm");
        try {
            if(tenCP.equals("") == false){
                cpList = CaPheDAO.findByTenCP(tenCP);
                tableModel.setRowCount(0);
                for(CaPhe cp : cpList){
                    tableModel.addRow(new Object[]{
                        cp.getMaCaPhe(),
                        cp.getTenCaPhe(),
                        cp.getDonGia(),
                        cp.getAnhMinhHoa(),
                    });
                }
            }else{
                getData();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        getData();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblDanhSachThucDonMouseClicked(java.awt.event.MouseEvent evt) {

        int row = tblDanhSachThucDon.getSelectedRow();
        if (row >= 0) {
            CaPhe cp = cpList.get(row);
            txtSuaMa.setText(cp.getMaCaPhe());
            txtSuaTen.setText(cp.getTenCaPhe());
            txtSuaGia.setText(String.valueOf(cp.getDonGia()));

            if (cp.getAnhMinhHoa() != null) {
                ImageIcon imageIcon = new ImageIcon(cp.getAnhMinhHoa());
                jlbSuaHinhAnh.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(
                        jlbSuaHinhAnh.getWidth(), jlbSuaHinhAnh.getHeight(), java.awt.Image.SCALE_SMOOTH)));
            } else {
                jlbSuaHinhAnh.setIcon(null);
            }

            txtSuaMa.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DonHang;
    private javax.swing.JDialog JDialogChinhSuaCaPhe;
    private javax.swing.JDialog JDialogThemCaPheMoi;
    private javax.swing.JPanel JbnDonHang;
    private javax.swing.JPanel ThucDon;
    private javax.swing.JButton btnChinhAnh;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaCapNhap;
    private javax.swing.JButton btnSuaQuayLai;
    private javax.swing.JButton btnThemThucDon;
    private javax.swing.JButton btnThemVaoThucDon;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbAnhDoUong3;
    private javax.swing.JLabel jlbHinhAnhCaPheMoi;
    private javax.swing.JLabel jlbMa;
    private javax.swing.JLabel jlbSuaHinhAnh;
    private javax.swing.JTextField jtfDonGia;
    private javax.swing.JTextField jtfMa;
    private javax.swing.JTextField jtfTenCaPhe;
    private javax.swing.JTable tblDanhSachThucDon;
    private javax.swing.JTextField txtSuaGia;
    private javax.swing.JTextField txtSuaMa;
    private javax.swing.JTextField txtSuaTen;
    // End of variables declaration//GEN-END:variables
}
