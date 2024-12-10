
package Model;

/**
 *
 * @author Dinh Canh
 */
import java.time.LocalDateTime;
import java.util.Date;

public class DonHang {
    private String maDonHang;
    private String maNhanVien;
    private Date thoiGianDatHang;
    private int tongTien;

    public DonHang(){}

    public DonHang(String maDonHang, String maNhanVien, Date thoiGianDatHang, int tongTien){
        this.maDonHang = maDonHang;
        this.maNhanVien = maNhanVien;
        this.thoiGianDatHang = thoiGianDatHang;
        this.tongTien = tongTien;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getThoiGianDatHang() {
        return thoiGianDatHang;
    }

    public void setThoiGianDatHang(Date thoiGianDatHang) {
        this.thoiGianDatHang = thoiGianDatHang;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
}

