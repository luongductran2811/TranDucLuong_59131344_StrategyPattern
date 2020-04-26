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
public class Bt2Main 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        GioHang gh1 = new GioHang();
        gh1.danhsachHH.add(new HangHoa("Nước khoáng nhạt", 10000, "Không đường"));
        gh1.setHinhThucTT(new ThanhToanOnline());
        System.out.println("Thanh toán bằng hình thức online \n");
        System.out.println(gh1.danhsachHH.toString()+ "Tổng số tiền phải trả: " + gh1.thanhToan() + "\n");
        
        GioHang gh2 = new GioHang();
        gh2.danhsachHH.add(new HangHoa("Nước khoáng ngọt", 20000, "Có đường"));
        gh2.setHinhThucTT(new ThanhToanCOD());
        System.out.println("Thanh toán bằng hình thức COD \n");
        System.out.println(gh2.danhsachHH.toString() + "Tổng số tiền phải trả: " + gh2.thanhToan() + "\n");
    }
}
