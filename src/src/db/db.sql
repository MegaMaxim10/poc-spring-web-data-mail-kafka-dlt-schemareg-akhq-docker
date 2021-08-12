/*
** @author Ndadji Maxime
*/

create database if not exists db_pockafka;

use db_pockafka;


/* Creation de la table Mail */
create table mail (
	mail_id int(10) not null primary key auto_increment,
	mail_to varchar(255),
	mail_subject varchar(255),
	mail_content text,
    mail_status int(2) not null default 0
);