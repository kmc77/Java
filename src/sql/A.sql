-- 실행 방법
-- 1. 한 문장 실행의 경우는 커서를 문장위에 놓고 마우스 우클릭 -> Execute Current Text(Alt + s)
drop table goodsinfo purge;

-- 2. 여러 문장 실행의 경우
--	  영역 설정 후 마우스 우클릭 -> Execute Selected Text (Alt + X)
--								또는
-- 								Execute Selected Text As One Statement(Alt + C)
create table goodsinfo(
	code varchar2(5) primary key,
	name varchar2(30) not null,
	price number(8) not null,
	maker varchar2(20)
	);
	
insert into goodsinfo 
 VALUES(10001, '디지털 TV', 350000, 'LG');
 
 insert into goodsinfo 
 VALUES(10002, 'DVD 플레이어', 250000, 'LG');
 
 insert into goodsinfo 
 VALUES(10003, '디지털 카메라', 210000, '삼성');
	
 insert into goodsinfo 
 VALUES(10004, '전자사전', 180000, '아이리버');
 
 insert into goodsinfo 
 VALUES(10005, '벽걸이 에어컨', 400000, '삼성');
 
 select * from goodsinfo;
 
 select * from dept;
 
	