/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Huy
 */
import Model.CTSanPham;
import Model.Hoadon;
import Model.sanpham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class DAOhd {
    private Connection conn;
    
    public  DAOhd(){
        try {
            String url="jdbc:mysql://localhost:3306/hoadon";
            String user ="root";
            String password= "";
            conn=DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Hoadon> getListHD(){
        ArrayList<Hoadon> list= new ArrayList<>();
        try{
        String sql = "SELECT * FROM tblhoadon";
        PreparedStatement ps =conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Hoadon hd = new Hoadon();
            hd.setMaHD(rs.getInt("ID"));
            hd.setDateOrder(rs.getString("Ngaydat"));
            hd.setThanhtien(rs.getInt("Thanhtien"));
            list.add(hd);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public void AddHD(Hoadon hd){
        String sql="INSERT INTO tblhoadon(Ngaydat,Thanhtien) VALUES (?,?)";
        try{
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, hd.getDateOrder());
            ps.setInt(2, hd.getThanhtien());
            ps.executeUpdate();
        } catch (Exception e){
           e.printStackTrace();
        }
    }
     public void deleteHD(int id){
        String sql ="DELETE FROM `tblhoadon` where ID=?";
        try{
            PreparedStatement ps =conn.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
     
      public ArrayList<Hoadon> findbyDate(String Date){
         ArrayList<Hoadon> List = new ArrayList<>();
        String sql ="SELECT * FROM `tblhoadon`WHERE Ngaydat like ?";
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, "%"+Date+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Hoadon hd =new Hoadon();
                hd.setMaHD(rs.getInt("ID"));
                hd.setDateOrder(rs.getString("Ngaydat"));
                hd.setThanhtien(rs.getInt("Thanhtien"));
                List.add(hd);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return List;
     }
    public static void main(String[] args){
        new DAOhd();
    }
}
