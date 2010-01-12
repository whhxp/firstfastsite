
create table user
(
	id			int auto_increment,
	name		varchar(100),
	password	varchar(100),
	nickname	varchar(100),
	purview_id	int,
	primary key(id)
);

insert into user values(1,'admin','admin','系统管理员',2);
insert into user values(2,'test','test','测试',1);
insert into user values(3,'guest1','guest','游客',1);
insert into user values(4,'admin2','admin','系统管理员',2);
insert into user values(5,'test3','test','测试',1);
insert into user values(6,'guest4','guest','游客',1);
insert into user values(7,'14','admin','系统管理员',2);
insert into user values(8,'13','test','测试',1);
insert into user values(9,'12','guest','游客',1);
insert into user values(10,'11','admin','系统管理员',2);
insert into user values(11,'test10','test','测试',1);
insert into user values(12,'guest9','guest','游客',1);


create table purview
(
	id		int ,
	name	varchar(20),
	primary key(id)
);

insert into purview values(1,'普通用户');
insert into purview values(2,'系统管理员');

create table forum
(
	id  int auto_increment,
	name varchar(100),
	description varchar(200),
    primary key(id)		
);

insert into forum values(1,'feeling','心情版');
insert into forum values(2,'love','爱情版');
insert into forum values(3,'game','游戏');
insert into forum values(4,'红警','          ');
insert into forum values(5,'星际','2.0专版');
insert into forum values(6,'feeling1','心情版');
insert into forum values(7,'love2','爱情版');
insert into forum values(8,'game4','游戏');
insert into forum values(9,'红警1','          ');
insert into forum values(10,'星际2','2.0专版');
insert into forum values(11,'星际3','2.0专版');


create table article
(
	guid  varchar(256),
	title varchar(100),
	content varchar(200),
	forum_id int,
	tick_num int,  /*点击数*/
	add_time timestamp,
    primary key(guid)		
);

insert into article values('1','今天心情非常好','good luck',1,1,'2009-1-1 2:2:0');
insert into article values('2','今天心情非常好.','good luck',1,1,'2009-1-1 2:1:0');
insert into article values('3','今天心情非常好.','good luck',1,1,'2009-1-1 2:12:0');
insert into article values('4','今天心情非常好.','good luck',1,1,'2009-1-1 2:2:0');
insert into article values('5','今天心情非常好.','good luck',1,1,'2009-1-1 2:2:0');
insert into article values('6','今天心情非常好.','good luck',1,1,'2009-1-1 2:2:0');


insert into article values('21','今天心情非常好','good luck',2,1,'2009-1-1 2:2:0');
insert into article values('22','今天心情非常好.','good luck',2,1,'2009-1-1 2:2:0');
insert into article values('23','今天心情非常好.','good luck',2,1,'2009-1-1 2:2:0');
insert into article values('224','今天心情非常好.','good luck',2,1,'2009-1-1 2:2:0');
insert into article values('25','今天心情非常好.','good luck',2,1,'2009-1-1 2:2:0');
insert into article values('26','今天心情非常好.','good luck',2,1,'2009-1-1 2:2:0');










