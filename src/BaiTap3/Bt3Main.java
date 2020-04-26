/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author DELL
 */
public class Bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        QLSV qlsv = new QLSV();
        qlsv.dssv.add(new SinhVien("NGUYỄN A", "30/9/1999", 10));
        qlsv.dssv.add(new SinhVien("NGUYỄN B", "13/1/1999", 9));
        qlsv.dssv.add(new SinhVien("NGUYỄN C", "14/12/1999", 8));
        
        System.out.println("=============Sắp Xếp Theo Tên Sinh Viên=============");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.Sapxep();
        qlsv.inDS();
        
        System.out.println("=============Sắp Xếp Theo Điểm TB Sinh Viên=============");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.Sapxep();
        qlsv.inDS();
    }
    
}
