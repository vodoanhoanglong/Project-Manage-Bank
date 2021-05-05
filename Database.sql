﻿-- chưa thêm getDate và sửa dữ liệu dưới
USE QLNH
GO

CREATE TABLE CHINHANH
(
	MaCN VARCHAR(20),
	TenCN NVARCHAR(50)

	CONSTRAINT PK_CHINHANH PRIMARY KEY (MaCN)
)
GO

CREATE TABLE NHANVIEN
(
    MaNV VARCHAR(10),
	TenNV NVARCHAR(30),
	MaCN VARCHAR(20) NOT NULL,

	CONSTRAINT PK_NHANVIEN PRIMARY KEY(MaNV),
	CONSTRAINT FK_NHANVIEN FOREIGN KEY (MaCN) REFERENCES CHINHANH(MaCN),
)
GO

CREATE TABLE KHACHHANG
(
    CMND VARCHAR(20),
	TenKH NVARCHAR(30),
	NgaySinh DATE,
	GioiTinh BIT, 
	DiaChi NVARCHAR(50),
	SoDienThoai VARCHAR(10), 

	CONSTRAINT PK_KHACHHANG PRIMARY KEY(CMND)
)
GO

CREATE TABLE XULYNHUCAU
(
	CMND VARCHAR(20),
	MaNV VARCHAR(10),
	NgayLamViec DATE,
	LoaiNhuCau NVARCHAR(20),

	CONSTRAINT PK_XULYNHUCAU PRIMARY KEY(CMND, MaNV)
)
GO

CREATE TABLE TAIKHOAN
(
    SoTK VARCHAR(20),
	TenTK NVARCHAR(30) UNIQUE NOT NULL,
	MatKhau VARCHAR(20),
	NgayDangKy DATE,
	SoThe VARCHAR(20),
	SoDu BIGINT,
	CMND VARCHAR(20) NOT NULL,

	CONSTRAINT PK_TAIKHOAN PRIMARY KEY(SoTK),
	CONSTRAINT FK_TAIKHOAN FOREIGN KEY (CMND) REFERENCES dbo.KHACHHANG(CMND)
)
GO

CREATE TABLE QUANLY
(
	MaNV VARCHAR(10),
	SoTK VARCHAR(20),
	NgayKT DATE,
	NoiDungKT NVARCHAR(50),

	CONSTRAINT PK_QUANLY PRIMARY KEY(MaNV, SoTK)
)
GO

CREATE TABLE GIAODICH
(
	MaGD VARCHAR(20),
	SoTien BIGINT,
	LoaiGD NVARCHAR(20),
	SoTKNhan VARCHAR(20),
	SoTK VARCHAR(20) NOT NULL,

	CONSTRAINT PK_GIAODICH PRIMARY KEY(MaGD),
	CONSTRAINT FK_GIAODICH_SoTK FOREIGN KEY (SoTK) REFERENCES TAIKHOAN(SoTK),
	CONSTRAINT FK_GIAODICH_SoTKNhan FOREIGN KEY (SoTKNhan) REFERENCES TAIKHOAN(SoTK)
)
GO

CREATE TABLE CHITIETGD
(
	STT INT IDENTITY,
    MaGD VARCHAR(20),
	SoTK VARCHAR(20),
	NgayGD DATE,
	NoiDungGD NVARCHAR(50)

	CONSTRAINT PK_CHITIETGD PRIMARY KEY(MaGD, SoTK)
)
GO 


ALTER TABLE XULYNHUCAU ADD FOREIGN KEY(CMND) REFERENCES KHACHHANG(CMND)
ALTER TABLE XULYNHUCAU ADD FOREIGN KEY(MaNV) REFERENCES NHANVIEN(MaNV)

ALTER TABLE QUANLY ADD FOREIGN KEY(MaNV) REFERENCES NHANVIEN(MaNV)
ALTER TABLE QUANLY ADD FOREIGN KEY(SoTK) REFERENCES TAIKHOAN(SoTK)

ALTER TABLE CHITIETGD ADD FOREIGN KEY(MaGD) REFERENCES GIAODICH(MaGD)
ALTER TABLE CHITIETGD ADD FOREIGN KEY(SoTK) REFERENCES TAIKHOAN(SoTK)

INSERT INTO CHINHANH(MaCN, TenCN)
VALUES(1, 'LongBank')

INSERT INTO NHANVIEN(MaNV, TenNV, MaCN)
VALUES(001, N'Sơn Tùng', 1)

INSERT  INTO KHACHHANG(CMND, TenKH, NgaySinh, GioiTinh, DiaChi, SoDienThoai)
VALUES(2804, N'Hoàng Long', '2001-03-03', 1, N'Quận 9', 0909)

INSERT INTO XULYNHUCAU(CMND, MaNV, LoaiNhuCau, NgayLamViec)
VALUES(2804, 001, N'Đổi mật khẩu' ,GETDATE())

INSERT INTO TAIKHOAN(SoTK, TenTK, MatKhau, NgayDangKy, SoThe, SoDu, CMND)
VALUES(123, N'hoanglong', 03032001, '2020-05-22', 321, 0, 2804)

INSERT INTO GIAODICH(MaGD, SoTien, LoaiGD, SoTK)
VALUES(1, 100000, N'Nạp Tiền', 123)

INSERT INTO CHITIETGD(MaGD, SoTK, NgayGD, NoiDungGD)
VALUES(1, 123, '2021-05-20', N'Nạp tý cho vui')