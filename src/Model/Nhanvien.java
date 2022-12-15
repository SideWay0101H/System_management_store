/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Huy
 */
public class Nhanvien {
    private int id;
    private String Manv,Tennv,Chucvu,Gioitinh,Ngaysinh,Diachi,SDT,Email;
    private int Luong;

    public Nhanvien() {
    }

    public Nhanvien(String Manv, String Tennv, String Chucvu, String Gioitinh, String Ngaysinh, String Diachi, String SDT, String Email, int Luong) {
        this.Manv = Manv;
        this.Tennv = Tennv;
        this.Chucvu = Chucvu;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.SDT = SDT;
        this.Email = Email;
        this.Luong = Luong;
    }
    
    
    public Nhanvien(int id, String Manv, String Tennv, String Chucvu, String Gioitinh, String Ngaysinh, String Diachi, String SDT, String Email, int Luong) {
        this.id = id;
        this.Manv = Manv;
        this.Tennv = Tennv;
        this.Chucvu = Chucvu;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.SDT = SDT;
        this.Email = Email;
        this.Luong = Luong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String Tennv) {
        this.Tennv = Tennv;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }
    
    
  
    
}

