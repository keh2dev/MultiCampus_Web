--price로 내림차순 정렬하여 전체컬럼 검색

SELECT * FROM PRODUCT ORDER BY PRICE

--company로 오름차순 정렬하여 제품의 이름, 내용, 가격 검색

SELECT NAME, CONTENT, PRICE FROM PRODUCT ORDER BY COMPANY DESC

--id가 100인 제품의 이름과 가격 검색

SELECT NAME, PRICE FROM PRODUCT WHERE ID='100'

--price가 5000인 제품명과 회사명

SELECT NAME, COMPANY FROM PRODUCT WHERE PRICE='5000'

--id가 100이고 가격이 1000인 제품명과 이미지 검색

SELECT NAME, IMG FROM PRODUCT WHERE ID='100' AND PRICE='1000'

--회사명이 c100인 회사명과 제품명

SELECT COMPANY, NAME FROM PRODUCT WHERE COMPANY = 'c100'

--회사명이 c100, c200인 제품명과 가격

SELECT NAME, PRICE FROM PRODUCT WHERE COMPANY = 'c100' OR COMPANY = 'c200'

--price가 5000원인 제품의 content를 품절로 수정

UPDATE PRODUCT SET CONTENT = '품절' WHERE PRICE = '5000'

--id가 100, 102번 제품의 img를 o.png로, price를 10000으로 수정

UPDATE PRODUCT SET IMG = 'o.png', PRICE ='10000' WHERE ID = '100' OR ID = '102'

--id가 101번 제품의 company를 apple, name은 appleshoes로 수정

UPDATE PRODUCT SET COMPANY = 'apple', name = 'appleshoes' WHERE ID = '101'

--name이 shoes1이거나 id가 107인 제품 삭제

DELETE FROM PRODUCT WHERE NAME = 'shoes1' OR id = '107'

--회사명이 c100인 경우 모든 정보 삭제

DELETE FROM PRODUCT WHERE NAME = 'c100'

--테이블의 모든 정보 삭제

DROP TABLE PRODUCT