SELECT *
FROM `account`
WHERE  EXISTS (SELECT AccountID
					FROM `account`
                    WHERE AccountID =2 && AccountID = 3
                    );
                    
                    CREATE VIEW view1 AS
                    SELECT AccountID,Email,User_name,Full_Name
                    FROM `account` ;
                    
                    SELECT* 
                    FROM view1;
                    DROP VIEW view1;
                    
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale                    
CREATE OR REPLACE VIEW DSNV_Sale
AS
	SELECT		A.*, D.DepartmentName
	FROM 		`Account` A 
	INNER JOIN 	`Department` D ON A.DepartmentID = D.DepartmentID
	WHERE		D.DepartmentName = 'Sale';          
    SELECT *
    FROM  DSNV_Sale;
    
    -- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
SELECT*
FROM groupaccount; 
CREATE  VIEW view2
AS
SELECT 		A.*, COUNT(GA.AccountID) AS 'SO LUONG'
FROM		`Account` A 
INNER JOIN 	GroupAccount GA ON A.AccountID = GA.AccountID
GROUP BY	A.AccountID
HAVING		COUNT(GA.AccountID) = (
									SELECT 		COUNT(GA.AccountID) 
									FROM		`Account` A 
									INNER JOIN 	GroupAccount GA ON A.AccountID = GA.AccountID
									GROUP BY	A.AccountID
									ORDER BY	COUNT(GA.AccountID) DESC
									LIMIT		1
								  );  

    
    
    
    -- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 18 từ
-- được coi là quá dài) và xóa nó đi (De cu la 300 tu nhung do thiet ke db tu dau nen sua lai 18 tu de demo
  
CREATE VIEW cauhoidainhat AS
SELECT* 
FROM question
WHERE length(content) >18; 

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất

CREATE OR REPLACE VIEW view3 AS 
SELECT* ,COUNT(DepartmentID)
FROM `account`
JOIN department USING(DepartmentID)
GROUP BY DepartmentID
HAVING count(DepartmentID) = ( SELECT* ,COUNT(DepartmentID)
								FROM `account`
								JOIN department USING(DepartmentID)
								GROUP BY DepartmentID
								ORDER BY count(DepartmentID) DESC
								LIMIT 1);
                                
							SELECT* 
                            FROM `account`;
                            
-- cách 2:
CREATE OR REPLACE VIEW view1 AS
 SELECT * ,count(DepartmentID)
    FROM `account`
    JOIN department USING(DepartmentID)
    GROUP BY DepartmentID
    HAVING count(DepartmentID) = ( SELECT Max(Count1)
                                   From ( SELECT count(DepartmentID) as Count1
                                        FROM `account`
                                    JOIN department USING(DepartmentID)
                                       GROUP BY DepartmentID) As view3);                            


WITH cte_1  as (
  SELECT*
  FROM `account`
  )
 SELECT*
  FROM cte_1;
-- Question 1: tạo với CTE
WITH     DSNV_Sale
AS  (
	SELECT		A.*, D.DepartmentName
	FROM 		`Account` A 
	INNER JOIN 	`Department` D ON A.DepartmentID = D.DepartmentID
	WHERE		D.DepartmentName = 'Sale' )
    
    SELECT *
    FROM  DSNV_Sale;
    
    -- Question 2: TẠO VỚI cte
    
SELECT*
FROM groupaccount; 
WITH view2
AS (
SELECT 		A.*, COUNT(GA.AccountID) AS 'SO LUONG'
FROM		`Account` A 
INNER JOIN 	GroupAccount GA ON A.AccountID = GA.AccountID
GROUP BY	A.AccountID
HAVING		COUNT(GA.AccountID) = (
									SELECT 		COUNT(GA.AccountID) 
									FROM		`Account` A 
									INNER JOIN 	GroupAccount GA ON A.AccountID = GA.AccountID
									GROUP BY	A.AccountID
									ORDER BY	COUNT(GA.AccountID) DESC
									LIMIT		1
								  );  
                                  
 
 





                    
                    
                    
			
                    