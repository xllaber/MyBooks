drop database if exists MyBooks;
create database MyBooks character set utf8mb4;
use MyBooks;

CREATE table author (
    id varchar(5) primary key,
    name varchar(100) not null,
    country varchar(50) not null
);

create table  book (
    id varchar(5) primary key,
    title varchar(100) not null,
    pages int not null,
    opinion varchar(1000),
    fave boolean,
    sagaNum int,
    publishDate date,
    startDate date not null,
    finishDate date not null,
    authorId varchar(5) not null,
    sagaId varchar(5),
    foreign key (authorId) references author(id),
    foreign key (sagaId) references saga(id)
);

create table saga (
    id varchar(5) primary key,
    name varchar(50) not null,
    publishStart date not null,
    publishEnd date
);