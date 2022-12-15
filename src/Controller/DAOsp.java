/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Nhanvien;
import Model.sanpham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Huy
 */
public class DAOsp {
    private Connection conn;
    public DAOsp(){
            try {
                String url="jdbc:mysql://localhost:3306/sanpham";
                String user ="root";
                String password= "";
                conn=DriverManager.getConnection(url,user,password);
            } catch (Exception e) {
                e.printStackTrace();
            }
          }
    
     public  ArrayList<sanpham> getListSP(){
        ArrayList<sanpham> list= new ArrayList<>();
        String sql ="SELECT * FROM `tblsanpham`";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sanpham s = new sanpham();
                s.setID(rs.getInt("ID"));
                s.setMaSP(rs.getString("MaSP"));
                s.setTenSP(rs.getString("TenSP"));
                s.setLoai(rs.getString("Loai"));
                s.setSoluong(rs.getInt("Soluong"));
                s.setGia(rs.getInt("Gia"));
                list.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
     
     public void addSP(sanpham sp){
      String  sql = "INSERT INTO `tblsanpham`(`MaSP`, `TenSP`, `Loai`, `Soluong`, `Gia`) VALUES (?,?,?,?,?)"; 
      try{
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1,sp.getMaSP());
          ps.setString(2,sp.getTenSP());
          ps.setString(3,sp.getLoai());
          ps.setInt(4, sp.getSoluong());
          ps.setInt(5, sp.getGia());
          ps.executeUpdate();
          conn.close();
      }catch (Exception e){
          
      }
    }
     
     public void deleteSP(int id){
        String sql ="DELETE FROM `tblsanpham` where ID=?";
        try{
            PreparedStatement ps =conn.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
     
     public ArrayList<sanpham> findbyName(String Name){
         ArrayList<sanpham> List = new ArrayList<>();
        String sql ="SELECT * FROM `tblsanpham`WHERE TenSP like ?";
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, "%"+Name+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                sanpham sp =new sanpham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setLoai(rs.getString("Loai"));
                sp.setSoluong(rs.getInt("Soluong"));
                sp.setGia(rs.getInt("Gia"));
                List.add(sp);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return List;
     }
     public static void main(String[] args){
         new DAOsp();
     }
 }    