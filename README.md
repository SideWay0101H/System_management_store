# System_management_store
Java Swing+ MySQL  (Model MVC) 


Using JDBC MySQL 
java swing 
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Database : sanpham,ctsanpham,hoadon,nhanvien

CREATE TABLE tblsanpham
(ID int PRIMARY KEY AUTO_INCREMENT,
MaSP varchar(30) not null,
TenSP varchar(60) not null,
Loai varchar(30) not null,
Soluong not null,
Gia int not mull
)

CREATE TABLE tblhoadon
(ID int PRIMARY KEY AUTO_INCREMENT,
Ngaydat varchar(50) not null,
Thanhtien int not null
)

CREATE TABLE tblctsanpham
(ID int PRIMARY KEY AUTO_INCREMENT,
MaSP varcharr(20) not null,
Soluong int not null,
Gia int not null
)

CREATE TABLE tblnhanvien
(ID int PRIMARY KEY AUTO_INCREMENT,
MaNV varchar(11) not null,
Name varchar(30) not null,
GoiiTinh varchar(5) not null,
ChucVu varchar(20) not null,
NgaySinh varchar(20) not null,
DiaChi varchar(50) not null,
SDT varchar(10) not null,
Email varchar(50) not null,
Luong int not null
)
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
