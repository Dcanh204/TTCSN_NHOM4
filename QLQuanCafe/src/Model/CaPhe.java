
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author Dinh Canh
 */
public class CaPhe {
    private String maCaPhe;
    private String maDanhMuc;
    private String tenCaPhe;
    private byte[] anhMinhHoa;
    private int donGia;

    public CaPhe() {
    }

    public CaPhe(String maCaPhe, String tenCaPhe, byte[] anhMinhHoa, int donGia) {
        this.maCaPhe = maCaPhe;
        this.tenCaPhe = tenCaPhe;
        this.anhMinhHoa = anhMinhHoa;
        this.donGia = donGia;
    }
    
    public CaPhe(String maCaPhe, String maDanhMuc, String tenCaPhe, byte[] anhMinhHoa, int donGia) {
        this.maCaPhe = maCaPhe;
        this.maDanhMuc = maDanhMuc;
        this.tenCaPhe = tenCaPhe;
        this.anhMinhHoa = anhMinhHoa;
        this.donGia = donGia;
    }

    public String getMaCaPhe() {
        return maCaPhe;
    }

    public void setMaCaPhe(String maCaPhe) {
        this.maCaPhe = maCaPhe;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenCaPhe() {
        return tenCaPhe;
    }

    public void setTenCaPhe(String tenCaPhe) {
        this.tenCaPhe = tenCaPhe;
    }

    public byte[] getAnhMinhHoa() {
        return anhMinhHoa;
    }

    public void setAnhMinhHoa(byte[] anhMinhHoa) {
        this.anhMinhHoa = anhMinhHoa;
    }
    
    public ImageIcon getImage(){
        return new ImageIcon( new ImageIcon(anhMinhHoa).getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH ));
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    

    
}
