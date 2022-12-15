/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.CTSanPham;
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
public class DAOctSP {
    private Connection conn;
    public DAOctSP() {
        try {
                String url="jdbc:mysql://localhost:3306/ctsanpham";
                String user ="root";
                String password= "";
                conn=DriverManager.getConnection(url,user,password);
            } catch (Exception e) {
                e.printStackTrace();
            }
       }
    public  ArrayList<CTSanPham> getListCTSP(){
        ArrayList<CTSanPham> list= new ArrayList<>();
        String sql ="SELECT * FROM `tblctsanpham`";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CTSanPham s = new CTSanPham();
                s.setID(rs.getInt("ID"));
                s.setMaSP(rs.getString("MaSP"));
                s.setSoluong(rs.getInt("Soluong"));
                s.setGia(rs.getInt("Gia"));
                list.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public void AddSP(CTSanPham sp){
        String sql="INSERT INTO `tblctsanpham`(`MaSP`, `Soluong`, `Gia`) VALUES (?,?,?)";
        try{
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, sp.getMaSP());
            ps.setInt(2, sp.getSoluong());
            ps.setInt(3, sp.getGia());
            ps.executeUpdate();
        } catch (Exception e){
           e.printStackTrace();
        }
    }
public void deleteSP(int id){
        String sql ="DELETE FROM `tblctsanpham` where ID=?";
        try{
            PreparedStatement ps =conn.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new DAOctSP();
    }
}
