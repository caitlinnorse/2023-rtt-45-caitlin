insert into user( first_name, last_name, email, password, create_date)
values("Caitlin", "Norse", "cnn@email.com", "password", CURRENT_TIME());

insert into user( first_name, last_name, email, password, create_date)
values("Ryan", "Gress", "rkg@email.com", "pissword", CURRENT_TIME());

insert into user( first_name, last_name, email, password, create_date)
values("Justin", "Vititoe", "jav@email.com", "possword", CURRENT_TIME());

insert into user( first_name, last_name, email, password, create_date)
values("Edward", "Thomas", "ejt@email.com", "pussword", CURRENT_TIME());

insert into movie (name, year_released, rating, rental_price, late_fee)
values("Caitlin Life", 1999, 10, 5.00, 2.25);

insert into movie (name, year_released, rating, rental_price, late_fee)
values("Magic World", 1995, 8, 4.50, 2.25);

insert into movie (name, year_released, rating, rental_price, late_fee)
values("Dog Life", 1980, 7, 7.00, 2.25);

insert into movie (name, year_released, rating, rental_price, late_fee)
values("Cat Life", 1993, 6, 7.25, 2.25);

select * from user;
select * from movie;
select * from movierental;