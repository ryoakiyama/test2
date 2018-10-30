set names utf8;
set foreign_key_checks = 0;
drop database if exists bonstagram;

create database if not exists bonstagram;
use bonstagram;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50)
);

create table kakikomi(
kakikomi varchar(16)
);

insert into login_user_transaction(login_id,login_pass,user_name) VALUES("jiji","jiji","jiji");
insert into kakikomi(kakikomi) VALUES("おはよう");