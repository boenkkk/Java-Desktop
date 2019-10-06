use java_db;

create table java_db.T_PERSON (
 id integer auto_increment primary key,
 `name` varchar(100) unique not null,
 password varchar(200) not null
) engine=InnoDB;

select * from java_db.t_person;

select count(*) from T_PERSON where name ='a' and password='a';

DELETE FROM java_db.t_person where id=4;

#Proc;

create procedure get_person() select * from java_db.t_person;

call get_person();

create procedure get_person_by_id(in userid int) select * from java_db.t_person where id = userid;

call get_person_by_id(18);

create procedure update_person_by_id(in userid int, in nama varchar(100), in pass varchar(100)) UPDATE java_db.t_person SET name=nama, password=pass WHERE id=userid;

call update_person_by_id(5,'aa','aa');

create procedure delete_person_by_id(in userid int, in nama varchar(100), in pass varchar(100)) UPDATE java_db.t_person SET name=nama, password=pass WHERE id=userid;