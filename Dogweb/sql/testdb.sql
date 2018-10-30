drop database if exists testdb_akiyama;
create database testdb_akiyama;
use testdb_akiyama;

create table users(
login_id int primary key auto_increment,
user_name varchar(255),
login_pass varchar(255),
img varchar(255),
insert_date datetime,
updated_date datetime
);

create table human(
human_id int primary key auto_increment,
human_name varchar(255),
human_pass varchar(255)
);

insert into users values(1,"taro","123","",now(),"0001-01-01 00:00:00");
insert into users values(2,"jiro","456","",now(),"0001-01-01 00:00:00");
insert into users values(3,"hanako","789","",now(),"0001-01-01 00:00:00");

insert into human values(1,"taro","123");


