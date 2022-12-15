/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Huy
 */
public class sanpham {

    private int ID;
    private String MaSP,TenSP,Loai;
    private int Soluong,Gia;
    
     public sanpham() {
        
    }
    public sanpham(String MaSP, String TenSP, String Loai, int Soluong, int Gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Loai = Loai;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public sanpham(int ID, String MaSP, String TenSP, String Loai, int Soluong, int Gia) {
        this.ID = ID;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Loai = Loai;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

   

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    
}
