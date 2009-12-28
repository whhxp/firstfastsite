/*@charset "UTF-8";*/

drop database if exists firstfastsite;
create database firstfastsite;
use firstfastsite;

create table bbs
(
	id			int auto_increment,
	title		varchar(100),
	gut	varchar(100),
	liuyan	int,
	guankan	int,
	primary key(id)
);             