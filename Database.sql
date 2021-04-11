CREATE DATABASE QLNH
GO
USE QLNH
GO
-- tạo bảng cho các thực thể
CREATE TABLE Account
(
	accountNumber INT,
	accountName NVARCHAR(50),
	amount INT,
	isActived TINYINT,
	CONSTRAINT PK_Account PRIMARY KEY(accountNumber)
)
-- ALTER TABLE Account DROP PK_Account (hủy khóa nếu cần)

CREATE TABLE AccountLogin
(
	userName	VARCHAR(50),
	[password]	VARCHAR(50),
	CONSTRAINT	PK_AccountLogin	PRIMARY KEY(userName)
)

CREATE TABLE Customers
(
	CMND INT,
	accountNumber INT,
	fullName NVARCHAR(50),
	phoneNumber INT,
	birthday DATE DEFAULT '2000-01-01',
	[address] NVARCHAR(50),
	userName	VARCHAR(50),
	[password]	VARCHAR(50),
	CONSTRAINT PK_Customers PRIMARY KEY(CMND),
	CONSTRAINT FK_Customers_Account FOREIGN KEY(accountNumber) REFERENCES Account(accountNumber),
	CONSTRAINT FK_Customers_AccountLogin FOREIGN KEY(userName) REFERENCES AccountLogin(userName)
)

CREATE TABLE Trading
(
	tradeId BIGINT IDENTITY,
	accountNumber INT,
	tradeDate DATETIME DEFAULT GETDATE(),
	typeTrade VARCHAR(20),
	amount INT,
	CONSTRAINT PK_Trading PRIMARY KEY(tradeId),
	CONSTRAINT FK_Trading FOREIGN KEY(accountNumber) REFERENCES Account(accountNumber)
)
GO


CREATE PROC Trade
	@accountNumber int,
	@amount int,
	@typeTrade nvarchar(20)
AS
	INSERT INTO dbo.Trading(accountNumber,amount,typeTrade)
	VALUES(@accountNumber,@amount,@typeTrade);
	SELECT @@ROWCOUNT AS result;

CREATE PROC getBalance
	@userID INT
AS
	SELECT (SUM(CASE WHEN typeTrade = 'loaded' THEN amount ELSE 0 END) + SUM(CASE WHEN typeTrade = 'receive' THEN amount ELSE 0 END) - SUM(CASE WHEN typeTrade = 'withdraw' THEN amount ELSE 0 END) - SUM(CASE WHEN typeTrade = 'transfer' THEN amount ELSE 0 END)) AS balance
	FROM dbo.Trading
	WHERE accountNumber = @userID

CREATE PROC getHistory
	@userID int
AS
SELECT 
	tradeDate,
	CASE
	WHEN typeTrade = 'loaded' THEN N'Nạp Tiền'
	WHEN typeTrade = 'withdraw' THEN N'Rút Tiền'
	WHEN typeTrade = 'transfer' THEN N'Chuyển Khoản'
	WHEN typeTrade = 'receive' THEN N'Nhận Chuyển Khoản'
	END AS typeTrade,
	amount
FROM Trading
WHERE accountNumber = @userID