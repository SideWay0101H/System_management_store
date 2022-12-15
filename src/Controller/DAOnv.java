/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Nhanvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Huy
 */

public class DAOnv {
    private Connection conn;
        
    public DAOnv() {
        
        try{
            String url ="jdbc:mysql://localhost:3306/nhanvien";
            String user="root";
            String password="";
            conn = DriverManager.getConnection(url,user,password);
            
            }catch(Exception e) {
                e.printStackTrace();
            }
    }
    public ArrayList<Nhanvien> getListNV(){
            ArrayList<Nhanvien> list = new ArrayList<>();
            String sql = "SELECT * FROM tblnhanvien";
           
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Nhanvien nv= new Nhanvien();
                nv.setId(rs.getInt("ID"));
                nv.setManv(rs.getString("MaNV"));
                nv.setTennv(rs.getString("Name"));
                nv.setGioitinh(rs.getString("GioiTinh"));
                nv.setNgaysinh(rs.getString("NgaySinh"));
                nv.setChucvu(rs.getString("ChucVu"));
                nv.setDiachi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setLuong(rs.getInt("Luong"));
                list.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOnv.class.getName()).log(Level.SEVERE, null, ex);
        }
                
         return list;       
           
              
    }
//    public void updateNV(Nhanvien nv){
//        String  sql = "UPDATE  tblnhanvien set MaNV=? ,Name=? ,GioiTinh=? ,ChucVu=? ,NgaySinh=? ,DiaChi=? ,SDT=? ,Email=? ,Luong=? where ID=?"; 
//      try{
//          PreparedStatement ps = conn.prepareStatement(sql);
//          ps.setString(1,nv.getManv());
//          ps.setString(2,nv.getTennv());
//          ps.setString(3,nv.getGioitinh());
//          ps.setString(4, nv.getChucvu());
//          ps.setString(5, nv.getNgaysinh());
//          ps.setString(6, nv.getDiachi());
//          ps.setString(7, nv.getSDT());
//          ps.setString(8, nv.getEmail());
//          ps.setInt(9, nv.getLuong());
//          ps.executeUpdate();
//          conn.close();
//      }catch (Exception e){
//          
//      }
//        
//    }
    public void addNV(Nhanvien n){
      String  sql = "INSERT INTO tblnhanvien(MaNV,Name,GioiTinh,ChucVu,NgaySinh,DiaChi,SDT,Email,Luong) VALUES(?,?,?,?,?,?,?,?,?)"; 
      try{
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1,n.getManv());
          ps.setString(2,n.getTennv());
          ps.setString(3,n.getGioitinh());
          ps.setString(4, n.getChucvu());
          ps.setString(5, n.getNgaysinh());
          ps.setString(6, n.getDiachi());
          ps.setString(7, n.getSDT());
          ps.setString(8, n.getEmail());
          ps.setInt(9, n.getLuong());
          ps.executeUpdate();
          conn.close();
      }catch (Exception e){
          
      }
    }
    public ArrayList<Nhanvien> findbyName(String Name){
        ArrayList<Nhanvien> List = new ArrayList<>();
        String sql ="SELECT * FROM `tblnhanvien`WHERE name like ?";
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, "%"+Name+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Nhanvien nv =new Nhanvien();
                nv.setManv(rs.getString("MaNV"));
                nv.setTennv(rs.getString("Name"));
                nv.setGioitinh(rs.getString("GioiTinh"));
                nv.setNgaysinh(rs.getString("NgaySinh"));
                nv.setChucvu(rs.getString("ChucVu"));
                nv.setDiachi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setLuong(rs.getInt("Luong"));
                List.add(nv);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return List;
    }
    public void deleteNV(int id){
        String sql ="DELETE FROM `tblnhanvien` where ID=?";
        try{
            PreparedStatement ps =conn.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args){
        new DAOnv();
    }
    
}
