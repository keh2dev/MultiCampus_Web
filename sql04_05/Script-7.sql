select UPPER(ENAME) from HR.EMP; //WILL

select LENGTH(ENAME) from HR.EMP; //5

select SUBSTR(ENAME, 2) from HR.EMP;  //ILL(2번째 글자부터 끝까지)
select SUBSTR(ENAME, 1, 2) from HR.EMP; //WI(1번째 글자부터 2개)
select SUBSTR(ENAME, -2) from HR.EMP; //LL(-2번째 글자부터 끝까지)

select REPLACE(ENAME, 'L', 'N') from HR.EMP; //WINN

select LPAD(ENAME, 6,'#') from HR.EMP; //##WILL(6개의 나머지 앞자리를 #으로 채우기,채울 문자를 넣지 않은 경우 공백으로 채워짐)

select CONCAT(ENPNO, ENAME) from HR.EMP; //78WILL
select CONCAT(ENPNO, ':', ENAME) from HR.EMP; //78:WILL

select TRIM('W' from ENAME) from HR.EMP; //ILL
select TRIM('hong') from HR.EMP; //hongfhwl

SELECT Length(ename) FROM hr.emp;
SELECT length(trim(ename)) FROM hr.emp;


SELECT TRIM(BOTH 'A' from ename) FROM emp 
SELECT TRIM(LEADING 'A' from ename) FROM emp
SELECT TRIM(TRAILING 'A' from ename) FROM emp