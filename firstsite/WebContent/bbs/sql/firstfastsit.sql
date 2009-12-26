/*@charset "UTF-8";*/

drop database if exists firstsite;
create database firstsite;
use firstsite;

create table bbs
{
   id  int auto_increment,
   title varchar(50),
   gut varchar(400),
   liuyan int,
   guankan int,
   primary key(id)               
}