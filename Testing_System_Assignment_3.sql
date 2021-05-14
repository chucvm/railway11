USE testingsystem;

SELECT * FROM	department;

INSERT	INTO Department(Department_name)
VALUE	(N'baove'),
		(N'marketing'),
		(N'sale'),
		(N'ketoan'),
		(N'nhansu');
        
SELECT * FROM	position;

INSERT	INTO	Position (position_Name)
VALUE	('Dev'),
		('Test'),
        ('Scrum Master'),
        ('PM');
        
SELECT * FROM	`account`;

INSERT INTO `account` (Email, Ueraname, FullName, Department_id, position_id, create_date)
VALUE	('AA@gmail.com', 'Aa', 'Nguyễn văn A', 1, 2, '2021-01-01'),
		('BB@gmail.com', 'Bb', 'Nguyễn văn B', 2, 3, '2021-01-02'),
        ('CC@gmail.com', 'Cc', 'Nguyễn văn C', 3, 4, '2021-01-03'),
        ('DD@gmail.com', 'Dd', 'Nguyễn văn D', 4, 5, '2021-01-04'),
        ('EE@gmail.com', 'Ee', 'Nguyễn văn E', 5, 6, '2021-01-05');
        
SELECT * FROM `group`;

INSERT INTO `group` ( GroupName			, CreatorID		, CreateDate)
VALUE				('railway',				1			,'2021-02-01'),
					('railway 01',			2			,'2021-02-02'),
					('railway 02',			3			,'2021-03-03'),
					('railway 03',			4			,'2021-04-04'),
					('railway 04',			5			,'2021-05-05');
                        
SELECT * FROM GroupAccount;

INSERT INTO GroupAccount (  GroupID	, AccountID	, JoinDate	 )
VALUE					 (     1,		1		,'2021-02-01'),
						(	   1,		2		,'2021-02-02'),
                        (	   2,		3		,'2021-03-03'),
                        (	   2,		4		,'2021-04-04'),
                        (	   3,		5		,'2021-05-05');
                        
SELECT * FROM TypeQuestion;

INSERT INTO	TypeQuestion  ( TypeName)
VALUE					  ("ESSAY"),
						  ("MULTIPLE-CHOICE");
                          
SELECT * FROM	CategoryQuestion;	
INSERT INTO 	CategoryQuestion	(CategoryName)
VALUE								('code01'),
									('code02'),
                                    ('code03'),
                                    ('code04'),
                                    ('code05');
                                    
SELECT * FROM Question;
INSERT INTO Question (Content			, CategoryID, 		TypeID		, CreatorID	, CreateDate )    
VALUE				 ('câu hỏi 1'		,    11     ,		111			,	1		,'2021-05-05'),
					 ('câu hỏi 2'		,    22     ,		222			,	2		,'2021-05-05'),
                     ('câu hỏi 3'		,    33     ,		333			,	3		,'2021-06-06'),
                     ('câu hỏi 4'		,    44     ,		444			,	4		,'2021-06-06'),
                     ('câu hỏi 5'		,    55     ,		555			,	5		,'2021-05-06');
                     
SELECT * FROM Answer;
INSERT INTO Answer (  Content		, QuestionID	, isCorrect	)
VALUE		       ('Trả lời 01'	,   1			,	0		),
				   ('Trả lời 02'	,   1			,	1		),
				   ('Trả lời 03'	,   1			,	0		),
				   ('Trả lời 04'	,   1			,	1		),
				   ('Trả lời 05'	,   2			,	1		);
                   
SELECT * FROM Exam;
INSERT INTO Exam	(`Code`, Title, CategoryID, Duration, CreatorID	, CreateDate )
VALUES 				('V111','Q',11,60,1),
					('V222','W',22,70,2),
                    ('V333','E',33,80,3),
                    ('V444','R',44,90,4),
                    ('V555','T',55,120,5);
                    
SELECT * FROM ExamQuestion;
INSERT INTO ExamQuestion (ExamID	, QuestionID)
VALUE					 (  1		,		11  ),	
						 (  2		,		12  ),
                         (  3		,		13  ),
                         (  4		,		14  ),
                         (  5		,		15  );
                         
-- Question 2: Lấy tất cả các phòng ban
SELECT 		* 
FROM 		Department;

-- Question 3: Lấy ra id của phòng ban "Sale"
SELECT 		DepartmentID 
FROM 		Department 
WHERE 		DepartmentName = N'Sale';

-- Question 11: lấy ra tên nhân viên bắt đầu bằng chữ 'D' và kết thức bằng chữ 'o'
SELECT	*
FROM	`account`
WHERE	Full_Name LIKE 'D%o';	

-- Question 6: lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 		GroupName 
FROM 		`Group` 
WHERE 		CreateDate < '2019-12-20';

-- Question 14 : UPDATE thông tin account có id=4 thành tên 'Nguyễn Văn F' và email thành 'FFF@gmail.com'
UPDATE 		`Account` 
SET 		Fullname 	= 	'Nguyễn Văn F', 
			Email 		= 	'FFF@gmail.com'
WHERE 		AccountID = 4;





                         
                         
                         
                    
                    
                    
                    
                   


