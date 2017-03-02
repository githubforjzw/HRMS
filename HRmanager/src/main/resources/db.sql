create table person(
	pid int primary key auto_increment,
	pname varchar(50)
)engine=MYISAM character set utf8;

drop table person;

insert into person(pname) values('张三');
insert into person(pname) values('李四');
commit;

select * from person;


create table category(
	cid int primary key auto_increment,
	cname varchar(50)
)engine=MYISAM character set utf8;

create table bookpdf(
	bid int primary key auto_increment,
	bname varchar(50),
	cid int,
	isbn varchar(50),
	author varchar(50),
	price numeric(8,2),
	pdfs  varchar(5000),
	discription  varchar(5000)
)engine=MYISAM character set utf8;

create table bookrank(
	rid int primary key auto_increment,
	ip varchar(500),
	bid int,
	scores numeric(8,2)
)engine=MYISAM character set utf8;

drop table bookrank;

alter table bookpdf
      add constraint fk_book_id
          foreign key(cid) references category(cid);
          
alter table bookrank
      add constraint fk_bookrank_bid
          foreign key(bid) references book(bid);
          

insert into category(cname) values('java');
insert into category(cname) values('html');
insert into category(cname) values('other');
insert into category(cname) values('小说');
insert into category(cname) values('散文');
insert into category(cname) values('诗歌');
insert into category(cname) values('经典');
insert into category(cname) values('言情');
insert into category(cname) values('青春');
insert into category(cname) values('推理');
insert into category(cname) values('科幻');
commit;

insert into bookrank(ip,bid,scores) values('192.168.20.20',1,9.0);
insert into bookrank(ip,bid,scores) values('192.168.20.20',2,9.2);

commit;


select
bid,b.bname,b.cid,b.isbn,b.author,b.price,c.cid,c.cname
from book b
inner join category c
on b.cid=c.cid
		
select * from book;
delete from book where bid>4;
		
