/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class GioHang 
{
    IThanhToan hinhthucTT;
    ArrayList<HangHoa> danhsachHH = new ArrayList<>();
    
    public IThanhToan getHinhThucTT()
    {
        return hinhthucTT;
    }
    public void setHinhThucTT(IThanhToan hinhThucTT)
    {
        this.hinhthucTT = hinhThucTT;
    }
    
    public ArrayList<HangHoa> getDanhsachHH()
    {
        return danhsachHH;
    }
    
    public void setDanhsachHH(ArrayList<HangHoa> danhsachHH) {
        this.danhsachHH = danhsachHH;
    }
    
    public double thanhToan()
    {
        int tongtien=0;
        for (int i=0;i < danhsachHH.size(); i++)
        {
            tongtien += danhsachHH.get(i).getGia();
        }
        return hinhthucTT.thanhToan(tongtien);
    }
}
