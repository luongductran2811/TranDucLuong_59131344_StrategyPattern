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
public class ThanhToanCOD implements IThanhToan
{

    @Override
    public double thanhToan(int tienHang) 
    {
        return tienHang > 2000000? tienHang *0.98: tienHang;
    }
    
}
