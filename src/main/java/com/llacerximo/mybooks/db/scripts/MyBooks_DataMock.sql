use mybooks;

insert into author(id, name, country) values('a1', 'author1', 'Spain');
insert into author(id, name, country) values('a2', 'author2', 'Spain');
insert into author(id, name, country) values('a3', 'author3', 'Ireland');

insert into saga(id, name, publishStart) values ('s1', 'saga1', '2023-05-14');
insert into saga(id, name, publishStart) values ('s2', 'saga2', '2023-05-14');
insert into saga(id, name, publishStart) values ('s3', 'saga3', '2023-05-14');

insert into book(id, title, pages, startDate, finishDate, authorId, sagaId)
    values('b1', 'book1', 2, '2023-05-14', '2023-05-14', 'a1', 's1');
insert into book(id, title, pages, startDate, finishDate, authorId, sagaId)
    values('b2', 'book2', 2, '2023-05-14', '2023-05-14', 'a1', 's1');
insert into book(id, title, pages, startDate, finishDate, authorId, sagaId)
    values('b3', 'book3', 2, '2023-05-14', '2023-05-14', 'a1', 's1');