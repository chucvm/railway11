-- +++++++++++++ QUESTION 1--++++++++

DROP DATABASE IF EXISTS ThucTap;
CREATE TABLE ThucTap;
USE ThucTap;

DROP TABLE IF EXISTS Country;
CREATE TABLE Country (
		CountryID	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        `Name`		NVARCHAR(50) NOT NULL
        );
        
DROP TABLE IF EXISTS Location;        
CREATE TABLE Location (
		LocationID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        street_address	VARCHAR(50) NOT NULL,
        postal_code		TINYINT UNSIGNED NOT NULL,
        CountryID		TINYINT UNSIGNED NOT NULL,
        FOREIGN KEY	(CountryID)	REFERENCES	CountryID(Country)
        );
        
DROP TABLE IF EXISTS Employee;           
CREATE TABLE Employee ( 
		EmployeeID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        full_name		NVARCHAR(50) NOT NULL,
        Email			VARCHAR(50) NOT NULL,
        LocationID		TINYINT UNSIGNED NOT NULL,
        FOREIGN KEY	(LocationID)	REFERENCES	Location(LocationID)
        );
        
-- INSERT DATA

 INSERT INTO Country ( 	 `Name`   )
 VALUE				 (	'Viet Nam'),
					 (	'JaPan'   ),
					 (	'England' );
                     
INSERT INTO Location    ( street_address,  postal_code, CountryID)
VALUE					( 'Quan Nhan'   ,      11     	,	'1' ),
						( 'Tokyo'   ,          12  		,   '2' ),
                        ( 'manchester'   ,      13     	,   '3' );
                        
INSERT INTO Employee    (EmployeeID ,  full_name ,     Email ,  LocationID) 
VALUE					('1'        , 'Vu Manh Chuc'  ,'chuc@gmail.com' ,'1'),
						('2'        , 'Pham Thi Hue'  ,'Hue@gmail.com' ,'2'),
                        ('3'        , 'Do Thai Son'  ,'nn03@gmail.com' ,'3');
                        
-- QUESTION 3:Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa
-- 10 employee

DROP TRIGGER IF EXISTS question3;
DELIMITER $$
			CREATE TRIGGER question3
            BEFORE INSERT ON Employee
            FOR EACH ROW
            BEGIN
            
               DECLARE so_nhan_vien INT;
			   SET so_nhan_vien = 0;
               SELECT COUNT(1) INTO so_nhan_vien
               FROM Location
               WHERE LocationID = NEW .LocationID
               GROUP BY Employee;
               IF ds_nhan_vien >=10 THEN
					SIGNAL SQLSTATE '12345' 
                    SET MESSAGE_TEXT = "ban khong the them nhan vien ";
			END IF;
             END $$  
             
-- Question 1
-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT		*
FROM		Location L
INNER JOIN 	Location L ON L.CountryID = C.CountryID
WHERE		E.Employee = 'nn03@gmail.com';

-- c)Thống kê mỗi country, mỗi location có bao nhiêu employee đang
-- làm việc.

SELECT EmployeeID, COUNT(LocationID) AS "So luong"
  FROM Employee
  INNER JOIN 	Location L ON L.CountryID = C.CountryID
  GROUP BY EmployeeID;



             

                       
                       
                        
                    
        
        
        
        
        
        
        

