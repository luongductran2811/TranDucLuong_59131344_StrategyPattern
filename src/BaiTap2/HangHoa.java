/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author DELL
 */
public class HangHoa
{
    private String tenHH;
    private int Gia;
    private String moTa;
    
    public HangHoa(String tenHH, int Gia, String moTa)
    {
        this.tenHH = tenHH;
        this.moTa = moTa;
        this.Gia = Gia;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "TÊN HÀNG HÓA: " + tenHH + "\n"
                + "GÍA HÀNG HOA: " + Gia + "\n"
                + "MÔ TẢ: " + moTa + "\n" ;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
