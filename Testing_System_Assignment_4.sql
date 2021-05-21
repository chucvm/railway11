-- testing_assignment_4

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT 		A.Email, A.Username	, A.FullName, A.PositionID, A.CreateDate, A.DepartmentID, D.DepartmentName
FROM 		`Account` A 
INNER JOIN 	Department D	ON 	A.DepartmentID = D.DepartmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/03/2020
SELECT		*
FROM		`Account`
WHERE		CreateDate < '2020-03-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer
SELECT		*
FROM		`Account` A 
INNER JOIN 	Position P ON A.PositionID = P.PositionID
WHERE		P.PositionName = 'Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >2 nhân viên
SELECT * , COUNT(AccountID)
FROM department		 
JOIN `account` USING(DepartmentID)
GROUP BY DepartmentID
HAVING COUNT(AccountID) >=2; 

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT * 
FROM Examquestion;
-- câu hỏi được sử dụng trong đê thi nhiều nhất là 3
-- lấy ra danh sách câu hỏi được sử dụng trong đề thi 3 lần
-- ghép câu lệnh truy vấn con (tìm ra câu hỏi đupwjc sử dụng trong đề thi nhhieefu nhất là 3)
SELECT  *, COUNT(eq.QuestionID)
FROM   ExamQuestion eq
JOIN   Question Q ON   Q.QuestionID =eq.QuestionID
GROUP BY  eq.QuestionID
HAVING  COUNT(eq.QuestionID) = ( SELECT  COUNT(QuestionID)
 FROM   ExamQuestion
 GROUP BY  QuestionID 
                                            ORDER BY COUNT(QuestionID) DESC
 LIMIT  1); 
 
 -- Question 6: Thống kê mỗi category Question được sử dụng trong bao nhiêu Question
 SELECT *,COUNT(CategoryID)
 FROM Question
 JOIN CategoryQuestion USING (CategoryID)
 GROUP BY CategoryID;
 
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất 
SELECT  *, COUNT(eq.QuestionID)
FROM   answer eq
JOIN   Question Q ON   Q.QuestionID =eq.QuestionID
GROUP BY  eq.QuestionID
HAVING  COUNT(eq.QuestionID) = ( SELECT  COUNT(QuestionID)
 FROM   answer
 GROUP BY  QuestionID 
                                            ORDER BY COUNT(QuestionID) DESC
 LIMIT  1); 
 
 -- Question 10: Tìm chức vụ có ít người nhất
 SELECT *,COUNT(1)
 FROM `account`
 GROUP BY PositionID
 HAVING COUNT(1) = ( SELECT COUNT(1)
	                 FROM `account`
                     GROUP BY PositionID
                     ORDER BY COUNT(1)
                     LIMIT 1
                     );
                     
-- Question 11: thống kê mỗi phòng ban có bao nhiêu 
-- có chức vụ thuộc dev, test, scrum master, PM      
SELECT  PositionID,AccountID,DepartmentID,
		GROUP_CONCAT(PositionName), COUNT(DepartmentID) AS SoLuongNhanVien
FROM `account`
JOIN position USING (PositionID)
WHERE PositionName IN ('dev', 'test', 'scrum master', 'PM') 
GROUP BY DepartmentID; 

-- Question 13: lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT*, COUNT(TypeID)
FROM question
JOIN typequestion USING (TypeID)
GROUP BY TypeID;

-- Question 14: lấy ra group không có account nào
-- cách 1:
SELECT *
FROM groupaccount
RIGHT JOIN `group` USING(GroupID)
WHERE AccountID IS NULL;

-- cách 2
SELECT *
FROM `group`
LEFT JOIN groupaccount USING(GroupID)
WHERE AccountID IS NULL;

-- Question 16: lấy ra question không có answer nào 
SELECT *
FROM question
LEFT JOIN answer USING(QuestionID)
WHERE answerID IS NULL;




-- LESSION 6
USE testingsystem;
DROP PROCEDURE IF EXISTS getquestionOfAccount;
DELIMITER $$
-- những in,out được truyền vào PROCEDURE sedduowjc gọi la tham số || parameter
CREATE PROCEDURE getInfoAccount(IN  user_name VARCHAR(50),IN email  VARCHAR(50))
BEGIN
     SELECT *
     FROM question q
     JOIN `account` acc ON acc.AccountID = q.CreatorID
     WHERE acc.Email = email || acc.Username= user_name;
END $$
DELIMITER ;
CALL getquestionOfAccount ('quanganh','dapphatchetngay@gmail.com'); 

SELECT concat(Email," ", User_name) As test1
FROM `account`;

-- Example 5
DROP PROCEDURE IF EXISTS getInfoAccount2;
DELIMITER $$
-- những in,out được truyền vào PROCEDURE sedduowjc gọi la tham số || parameter
CREATE PROCEDURE getInfoAccount2(IN  user_name VARCHAR(50))
BEGIN
-- khai báo biến cục bộ
     DECLARE full_name VARCHAR(100);
     SELECT acc1.FullName INTO full_name
     FROM `account` acc1
     WHERE acc1.Username = username;
     SELECT full_name;
END $$
DELIMITER ;
CALL getInfoAccount2 ('dangblack'); 



SET GLOBAL log_bin_trust_function_creators = 1;
DROP PROCEDURE IF EXISTS tinhtong;
DELIMITER $$

CREATE FUNCTION tinhtong(so_thu_1 INT,so_thu_2 INT)RETURNS INT
BEGIN
     -- DECLARE tong INT;
     -- SET tong = so_thu_1 + so_thu_2;
     RETURN (so_thu_1 + so_thu_2);
END $$
DELIMITER ;

SELECT tinhtong(3,2);


-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó

DROP PROCEDURE IF EXISTS AccountOfDepartment;
DELIMITER $$
CREATE PROCEDURE AccountOfDepartment(IN in_department_name NVARCHAR(50))
BEGIN

	SELECT 		* 
    FROM		`account` 
	 JOIN 	Department USING (DepartmentID)
    WHERE		DepartmentName = in_department_name;
	
END $$
DELIMITER ;

Call AccountOfDepartment('sale');



	 


              
 
 





