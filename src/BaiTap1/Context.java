/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author DELL
 */
public class Context 
{
    private ITinh tinhtoan;
    public void setTinhToan(ITinh tinhToan)
    {
        this.tinhtoan = tinhToan;
    }
    public float tinh(float a, float b)
    {
        return tinhtoan.tinh(a, b);
                
    }
}
