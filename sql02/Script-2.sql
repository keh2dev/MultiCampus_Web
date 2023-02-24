INSERT INTO MEMBER VALUES ('100','100','park','011')

INSERT INTO MEMBER VALUES ('200','200','park','011')

INSERT INTO MEMBER VALUES ('300','300','park','011')

SELECT * FROM MEMBER

SELECT * FROM MEMBER WHERE id = '100' --id가 100인 모든 컬럼


SELECT id FROM MEMBER WHERE id = '100' --id가 100인 id 컬럼

SELECT id, name FROM MEMBER WHERE id = '100' --id가 100인 id,name 컬럼

SELECT name, id FROM MEMBER WHERE id = '100' --id가 100인 id,name 컬럼

SELECT id as 아이디, name FROM MEMBER WHERE id = '100' --id가 100인 id,name 컬럼

SELECT tel FROM MEMBER WHERE name = 'park'

UPDATE MEMBER SET name = 'kim' WHERE id = '100'

UPDATE MEMBER SET name = 'yang' WHERE id = '200'

UPDATE MEMBER SET name = 'lee' WHERE id = '300'
   
SELECT * FROM MEMBER   

UPDATE MEMBER SET pw = '8888', tel = '9999' WHERE id = 'ice'
   
DELETE FROM MEMBER WHERE id = '100'

DELETE FROM MEMBER WHERE tel = '011'

SELECT * FROM MEMBER WHERE id = '200' AND tel = '011'

SELECT * FROM MEMBER WHERE id = '200' or tel = '011'

-- id,name,content,price,company,img

CREATE TABLE product (
	id varchar2(200), 
	name varchar2(200), 
	content varchar2(200), 
	price varchar2(200), 
	company varchar2(200), 
	img varchar2(200)
)

SELECT * FROM MEMBER ORDER BY id -- 오름차순

SELECT * FROM MEMBER ORDER BY id DESC -- 내림차순