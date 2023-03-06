


















SELECT c.아이디, a.이름, c.웹툰제목, b.장르
FROM 찜한작품 c
INNER JOIN 회원정보 a ON a.아이디 = c.아이디
INNER JOIN 웹툰정보 b ON b.웹툰제목 = c.웹툰제목