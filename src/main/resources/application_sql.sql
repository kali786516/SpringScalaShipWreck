drop table if exists test_db.book;

use test_db;CREATE TABLE test_db.book (pk_id INT PRIMARY KEY IDENTITY (1, 1),book_id INT,book_name VARCHAR (50) NOT NULL);

insert into test_db.book(book_name) values (1,"XNXX");
insert into test_db.book(book_name) values (2,"pornhub");
insert into test_db.book(book_name) values (3,"youporn");
insert into test_db.book(book_name) values (4,"XHAMSTER");