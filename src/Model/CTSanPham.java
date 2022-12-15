/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Huy
 */
public class CTSanPham {
    private int ID;
    private String MaSP;
    private int Soluong,Gia;

    public CTSanPham() {
    }

    public CTSanPham(String MaSP, int Soluong, int Gia) {
        this.MaSP = MaSP;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public CTSanPham(int ID, String MaSP, int Soluong, int Gia) {
        this.ID = ID;
        this.MaSP = MaSP;
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
