package View;

import DAO.CaPheDAO;
import DAO.FileTypeFiler;
import Model.CaPhe;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

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

        JDialogThemVaoDon3 = new javax.swing.JDialog();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        JDialogThemVaoDon2 = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
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
        JDialogThemVaoDon1 = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jlbAnhDoUong3 = new javax.swing.JLabel();
        ThucDon = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnThemThucDon = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDanhSachThucDon = new javax.swing.JTable();
        DonHang = new javax.swing.JPanel();
        JbnDonHang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        JDialogThemVaoDon3.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CaPheNong.png"))); // NOI18N

        jLabel32.setText("Tên:");

        jLabel33.setText("Đơn giá:");

        jLabel34.setText("Số lượng:");

        jLabel35.setText("Yều cầu đặn biệt:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jButton20.setBackground(new java.awt.Color(204, 204, 255));
        jButton20.setText("Thêm vào đơn");

        jButton21.setBackground(new java.awt.Color(204, 204, 255));
        jButton21.setText("Quay lại");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel36.setText("Cà phê Kiwi");

        jLabel37.setText("25.000 đ");

        javax.swing.GroupLayout JDialogThemVaoDon3Layout = new javax.swing.GroupLayout(JDialogThemVaoDon3.getContentPane());
        JDialogThemVaoDon3.getContentPane().setLayout(JDialogThemVaoDon3Layout);
        JDialogThemVaoDon3Layout.setHorizontalGroup(
            JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemVaoDon3Layout.createSequentialGroup()
                .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemVaoDon3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jLabel35)
                            .addGroup(JDialogThemVaoDon3Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JDialogThemVaoDon3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton20)
                        .addGap(39, 39, 39)
                        .addComponent(jButton21)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        JDialogThemVaoDon3Layout.setVerticalGroup(
            JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemVaoDon3Layout.createSequentialGroup()
                .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemVaoDon3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel31))
                    .addGroup(JDialogThemVaoDon3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDialogThemVaoDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        JDialogThemVaoDon2.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CaPheSua.png"))); // NOI18N

        jLabel25.setText("Tên:");

        jLabel28.setText("Đơn giá:");

        jLabel29.setText("Số lượng:");

        jLabel30.setText("Yều cầu đặn biệt:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jButton16.setBackground(new java.awt.Color(204, 204, 255));
        jButton16.setText("Thêm vào đơn");

        jButton17.setBackground(new java.awt.Color(204, 204, 255));
        jButton17.setText("Quay lại");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel40.setText("Cà phê sữa");

        jLabel41.setText("35.000 đ");

        javax.swing.GroupLayout JDialogThemVaoDon2Layout = new javax.swing.GroupLayout(JDialogThemVaoDon2.getContentPane());
        JDialogThemVaoDon2.getContentPane().setLayout(JDialogThemVaoDon2Layout);
        JDialogThemVaoDon2Layout.setHorizontalGroup(
            JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel30)
                            .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDialogThemVaoDon2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton16)
                        .addGap(39, 39, 39)
                        .addComponent(jButton17)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        JDialogThemVaoDon2Layout.setVerticalGroup(
            JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel24))
                    .addGroup(JDialogThemVaoDon2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDialogThemVaoDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addContainerGap(17, Short.MAX_VALUE))
        );

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
                    .addComponent(jButton6))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(JDialogThemCaPheMoiLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jlbHinhAnhCaPheMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChonAnh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JDialogThemVaoDon1.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cafe3.png"))); // NOI18N

        jLabel11.setText("Tên:");

        jLabel12.setText("Đơn giá:");

        jLabel13.setText("Số lượng:");

        jLabel14.setText("Yều cầu đặn biệt:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Thêm vào đơn");

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setText("Quay lại");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel38.setText("Cà phê đen");

        jLabel39.setText("30.000 đ");

        javax.swing.GroupLayout JDialogThemVaoDon1Layout = new javax.swing.GroupLayout(JDialogThemVaoDon1.getContentPane());
        JDialogThemVaoDon1.getContentPane().setLayout(JDialogThemVaoDon1Layout);
        JDialogThemVaoDon1Layout.setHorizontalGroup(
            JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemVaoDon1Layout.createSequentialGroup()
                .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemVaoDon1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel14)
                            .addGroup(JDialogThemVaoDon1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JDialogThemVaoDon1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jButton7)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        JDialogThemVaoDon1Layout.setVerticalGroup(
            JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogThemVaoDon1Layout.createSequentialGroup()
                .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDialogThemVaoDon1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10))
                    .addGroup(JDialogThemVaoDon1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDialogThemVaoDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addContainerGap(17, Short.MAX_VALUE))
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

        ThucDon.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(215, 208, 208));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("   Thực Đơn");

        jLabel2.setText("Bộ lọc:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Cà phê thường", "Cà phê lạnh", "Cà phê đặc biệt", "Cà phê theo mùa" }));

        btnThemThucDon.setBackground(new java.awt.Color(204, 204, 255));
        btnThemThucDon.setText("Thêm");
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
                .addContainerGap(12, Short.MAX_VALUE))
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
        tblDanhSachThucDon.setRowHeight(120);
        jScrollPane5.setViewportView(tblDanhSachThucDon);

        javax.swing.GroupLayout ThucDonLayout = new javax.swing.GroupLayout(ThucDon);
        ThucDon.setLayout(ThucDonLayout);
        ThucDonLayout.setHorizontalGroup(
            ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ThucDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );
        ThucDonLayout.setVerticalGroup(
            ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThucDonLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JDialogThemVaoDon1.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JDialogThemCaPheMoi.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        JFileChooser jfileChooser = new JFileChooser();
        jfileChooser.setMultiSelectionEnabled(false);
        int result = jfileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
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
    
    public class ImageRender extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ){
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
            if(CaPheDAO.insert(cp)){
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Thêm không thành công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        

        

    }//GEN-LAST:event_btnThemVaoThucDonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DonHang;
    private javax.swing.JDialog JDialogThemCaPheMoi;
    private javax.swing.JDialog JDialogThemVaoDon1;
    private javax.swing.JDialog JDialogThemVaoDon2;
    private javax.swing.JDialog JDialogThemVaoDon3;
    private javax.swing.JPanel JbnDonHang;
    private javax.swing.JPanel ThucDon;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnThemThucDon;
    private javax.swing.JButton btnThemVaoThucDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel jlbAnhDoUong3;
    private javax.swing.JLabel jlbHinhAnhCaPheMoi;
    private javax.swing.JLabel jlbMa;
    private javax.swing.JTextField jtfDonGia;
    private javax.swing.JTextField jtfMa;
    private javax.swing.JTextField jtfTenCaPhe;
    private javax.swing.JTable tblDanhSachThucDon;
    // End of variables declaration//GEN-END:variables
}
