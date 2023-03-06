CREATE TABLE company (
	id varchar2(200) primary key,
	name varchar2(200),
	addr varchar2(200),
	tel varchar2(200)
)

INSERT INTO company VALUES ('c100', 'good', 'seoul', '011')

INSERT INTO company VALUES ('c200', 'joa', 'busan', '012')

INSERT INTO company VALUES ('c300', 'maria', 'ulsan', '013')

INSERT INTO company VALUES ('c400', 'my', 'kwangju', '014')

SELECT * FROM company


-- inner join
SELECT *
FROM PRODUCT p, COMPANY c 
WHERE p.COMPANY = c.ID 

-- left outer join
SELECT *
FROM PRODUCT p
LEFT OUTER JOIN COMPANY c
ON (p.COMPANY = c.ID) 

-- right outer join
SELECT *
FROM PRODUCT p
Right OUTER JOIN COMPANY c
ON (p.COMPANY = c.ID )

