SELECT *
FROM "MEMBER" m , BBS b 
WHERE m.ID = b.WRITER 

SELECT b."no", title, NAME 
FROM "MEMBER" m , BBS b 
WHERE m.ID = b.WRITER 

----inner join : 테이블간 공통된 값만 추출
----emp테이블과 dept테이블을 조인하세요.
----하나의 컬럼이상이 동일한게 있어야 됨.
---empno, ename, job, deptno, loc 컬럼검색
----조인조건 :deptno

SELECT  EMPNO, ENAME ,JOB ,e.DEPTNO , LOC
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO 

SELECT *
FROM "MEMBER" m 
LEFT OUTER JOIN BBS b 
on (m.ID = b.WRITER)

SELECT *
FROM "MEMBER" m 
RIGHT OUTER JOIN BBS b 
on (m.ID = b.WRITER)

--1. emp 테이블의 정보는 다 보이게 하고 싶음. dept는 맞는 것 만 오른쪽에 붙여주고 싶음.
SELECT *
FROM EMP e 
LEFT OUTER JOIN DEPT d 
ON (e.DEPTNO = d.DEPTNO)

--2.dept 테이블의 정보는 다 보이게 하고 싶음. emp는 맞는 것만 오른쪽에 붙여주고 싶음.
SELECT *
FROM DEPT d
RIGHT OUTER JOIN EMP e  
ON (e.DEPTNO = d.DEPTNO)


--member table과 bbs table의 inner join하시오.(조인 조건 bbs의 writer, member의 id)
SELECT *
FROM "MEMBER" m , BBS b 
WHERE b.WRITER = m.ID 

--member table과 bbs table의 left outer join하시오.(조인 조건 bbs의 writer, member의 id)
SELECT *
FROM "MEMBER" m 
LEFT OUTER JOIN BBS b 
ON (m.id = b.WRITER)

--member table과 bbs table의 right outer join하시오.(조인 조건 bbs의 writer, member의 id)
SELECT *
FROM "MEMBER" m 
RIGHT OUTER JOIN BBS b 
ON (m.ID  = b.WRITER)

