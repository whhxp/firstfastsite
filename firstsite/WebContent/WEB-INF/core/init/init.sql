drop database if exists bbs;
create database bbs;
use bbs;

create table user
(
	id			int auto_increment,
	name		varchar(100),
	password	varchar(100),
	nickname	varchar(100),
	cookieid    varchar(40),
	purview_id	int,
	primary key(id)
);

insert into user values(1,'admin','21232f297a57a5a743894a0e4a801fc3','系统管理员','',2);
insert into user values(2,'test','098f6bcd4621d373cade4e832627b4f6','测试','',1);
insert into user values(3,'guest','084e0343a0486ff05530df6c705c8bb4','游客','',1);

create table purview
(
	id		int,
	name	varchar(20),
	primary key(id)
);

insert into purview values(1,'普通用户');
insert into purview values(2,'系统管理员');
